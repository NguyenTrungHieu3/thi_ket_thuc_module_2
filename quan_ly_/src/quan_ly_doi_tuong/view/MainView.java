package quan_ly_doi_tuong.view;

import quan_ly_doi_tuong.exception.NotFoundVehicleException;

import java.util.Scanner;

public class MainView {
    public static int displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================== MENU QUẢN LÝ  ====================");
        System.out.println("Chọn chức năng: ");
        System.out.println("1. Thêm ");
        System.out.println("2. Hiển thị danh sách ");
        System.out.println("3. Xóa ");
        System.out.println("4. Cập nhật ");
        System.out.println("5. Tìm kiếm ");
        System.out.println("6. Thoát");
        System.out.print("Mời bạn nhập lựa chọn: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số!");
            return -1;
        }
    }
}
