package ra.entity;

import java.util.Scanner;

public class Categories {
    private int catalogId;
    private String catalogName;
    private String descriptions;
    private boolean catalogStatus;
    public Categories(){

    }

    public Categories(int catalogId, String catalogName, String descriptions, boolean catologStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catologStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatologStatus() {
        return catalogStatus;
    }

    public void setCatologStatus(boolean catologStatus) {
        this.catalogStatus = catologStatus;
    }
    public void inputData(Scanner scanner, Categories[] arrCategories, int index) {
        System.out.println("Nhập thông tin danh mục:");
        if (index == 0) {
            this.catalogId = 1;// ban dau phai la 1
        } else {
            //lay gia tri id cua phan tu cuoi cung +1

            this.catalogId = arrCategories[index -1].getCatalogId() + 1;
        }

        System.out.println("Nhập Tên danh mục");    //có độ dài tối đa 50 ký tự,không trùng lặp.
        this.catalogName = scanner.nextLine();
//        do {
//            this.catalogName = scanner.nextLine();
//            boolean check = false;
//            if (this.catalogName.length()>0 && this.catalogName.length() <= 50) {
//                //chuyển đổi trạng thái khi thoã mãn đk
//
//                //khong trung lap
//                for (int i = 0; i < index; i++) {
//                    if (this.catalogName.equals(arrCategories[i].getCatalogName())) {
//                        System.err.println("Tên danh mục đã tồn tai, mời nhập lại!");
//                    } else {
//                        //khi vao day thi da thoa man dieu kien do dai<50 va k trung lap
//                        check = true;
//
//                    }
//                }
//            } else {
//                System.err.println("Nhập vào độ dài từ 1=>50 ký tự, mời nhập lại!");
//            }
//            if (check) {
//                break;
//            }
//        } while (true);

        System.out.println("Nhập mô tả danh mục");    //có độ dài tối đa 50 ký tự,không trùng lặp.
        this.descriptions = scanner.nextLine();

        System.out.println("Nhập 1 trong 2 giá trị true hoặc false");
        do{
            String inputStatus = scanner.nextLine();
            if(inputStatus.equals("true")||inputStatus.equals("false")){
                this.catalogStatus=Boolean.parseBoolean(inputStatus);
                break;
            }else{
                System.out.println("Không đúng định dạng, vui lòng nhập lại");
            }
        }
        while (true);
    }
    public void displayData(){
        System.out.printf("%d-15s%-20s%-%b\n",this.catalogId,this.catalogName,this.descriptions,this.catalogStatus);

    }
}
