package quan_ly_thong_tin_danh_ba.view;

import java.util.Scanner;

public class MainView {
    public static int displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================== CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ  ====================");
        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
        System.out.println("1. Xem danh sách ");
        System.out.println("2. Thêm mới ");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa ");
        System.out.println("5. Tìm kiếm ");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.print("Chọn chức năng: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số!");
            return -1;
        }
    }


}
