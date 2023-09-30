package ra.entity;

import java.util.Date;
import java.util.Scanner;

public class Product {
    private String productId;
    private  String productName;
    private float price;
    private String description;
    private Date created;
    private Categories categories;

    private int productStatus;

    public Product(String productId, String productName, float price, String description, Date created, Categories categories, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.categories = categories;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }
    public void inputData(Scanner scanner, Product[] arrProduct, int indexOfProduct, Categories[] arrCategories, int indexOfCategories){
        System.out.println("Nhập thông tin sản phẩm");
        System.out.println("Nhập mã đồ uống");
        do {
            this.productId = scanner.nextLine();
            if (productId.length() == 4) {
                if (productId.startsWith("C") || productId.startsWith("S") || productId.startsWith("A")) {
                //Check ko trùng lặp
                    boolean checkProductId=false;
                  for(int i=0; i<arrProduct.length;i++){
                      if(productName.equals(arrProduct[i].getProductName())){
                          System.out.println("Đã tồn tại mã sản phẩm, vui lòng nhập lại");
                          break;
                      }else {
                          //Đây là khu vực thỏa mãn tất cả các điều kiện của đề bài
                          checkProductId=true;

                      }
                  }
                  if(checkProductId){
                      break;
                  }

                  }
                  else {
                    System.out.println("Vui lòng nhập lại bắt đầu bằng CSA");
                }
            } else {
                System.out.println("Phải có 4 ký tự, yêu cầu nhập lại");
            }
        }while (true);
        System.out.println("Nhập tên sản phẩm");
        this.productName=scanner.nextLine();

        System.out.println("Nhập giá sản phẩm");
        this.price=Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập mô tả sản phẩm");
        this.description=scanner.nextLine();
//        System.out.println("Nhập ngày nhập sản phẩm");
        System.out.println("Nhập mã danh mục và sản phẩm");
        System.out.println("Chọn tên danh mục trong danh sách");
        //Duyệt danh sách tên các danh mục trong mảng Catalog
        for (int i = 0; i < indexOfCategories; i++) {
            System.out.println((i+1)+"."+arrCategories[i].getCatalogName());

        }
        System.out.println("Lựa chọn của bạn");
        int number = Integer.parseInt(scanner.nextLine());
        this.categories=arrCategories[number-1];
        System.out.println("Nhập trạng thái");
        this.productStatus=Integer.parseInt(scanner.nextLine());

    }
    public void displayData(){
        System.out.printf("%s-15s%-20f%-%s-%s-%d-%d\n",
                this.productId,this.productName,this.price,this.description,this.created,
                this.categories.getCatalogName(),this.productStatus);
    }
}
