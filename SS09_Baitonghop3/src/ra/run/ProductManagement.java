package ra.run;

import ra.entity.Categories;
import ra.entity.Product;

import java.util.Scanner;

public class ProductManagement {
    static Scanner scanner = new Scanner(System.in);
    static Categories[] arrCategories = new Categories[100];
    static Product[] arrProduct = new Product[100];
    static int indexOfCategories = 0;
    static int indexOfProduct = 0;

    public static void main(String[] args) {
        do {
            System.out.println("******************SHOP MENU*******************\n");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductManagement.menuCatalog();
                    break;
                case 2:
                    ProductManagement.menuProduct();
                    break;
                case 3:
                    System.exit(0);
            }


        }
        while (true);
    }

    //Xây dựng 1 phương thức quản lý danh mục
    public static void menuCatalog() {
        do {
            System.out.println("********************CATEGORIES MENU***********");
            System.out.println("1. Nhập thông tin các danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật thông tin danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Cập nhật trạng thái danh mục");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            boolean checkExit = false;
            switch (choice) {
                case 1:
                    ProductManagement.inputDataOfCatalog();
                    break;
                case 2:
                    ProductManagement.displayDataOfCatalog();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    checkExit = true;
                    break;
            }
            if (checkExit) {
                break;
            }

        } while (true);
    }
    public static void inputDataOfCatalog(){
        System.out.println("Số lượng danh mục cần nhập: ");
        int n= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            arrCategories[indexOfCategories] = new Categories();
            //Khai báo khởi tạo đối tượng cho phần từ arrCategories[i]
            arrCategories[indexOfCategories].inputData(scanner,arrCategories, indexOfCategories);
            //Từ phẩn tử đối tượng vừa khởi tạo gọi đến phương thức inputData và truyền vào các đối số tương ứng
            indexOfCategories++;
        }
    }
    public static void displayDataOfCatalog(){
        for (int i = 0; i < indexOfCategories; i++) {
            //Ko cần khởi tạo vì các phần tử đã nhập đã là đối tượng
            arrCategories[i].displayData();

        }
    }
    public static void menuProduct(){
        do {
            System.out.println("********************PRODUCT MANAGEMENT***********");
            System.out.println("1. Nhập thông tin các sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp các sản phẩm theo giá");
            System.out.println("4. Cập nhật thông tin sản phẩm theo mã sản phẩm");
            System.out.println("5. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("6. Tìm kiếm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Tìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn phím)");
            System.out.println("8. Thoát");
            System.out.println("Lựa chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            boolean checkExit = false;
            switch (choice) {

                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    checkExit = true;
                    break;
            }
            if (checkExit) {
                break;
            }

        } while (true);
    }

}
