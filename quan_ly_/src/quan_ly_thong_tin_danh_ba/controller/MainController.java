package quan_ly_thong_tin_danh_ba.controller;

import quan_ly_thong_tin_danh_ba.exception.NotFoundVehicleException;
import quan_ly_thong_tin_danh_ba.model.entity.DanhBa;
import quan_ly_thong_tin_danh_ba.model.service.DanhBaService;
import quan_ly_thong_tin_danh_ba.model.service.IDanhBaService;
import quan_ly_thong_tin_danh_ba.regex.Validate;
import quan_ly_thong_tin_danh_ba.view.DanhBaView;
import quan_ly_thong_tin_danh_ba.view.MainView;

import java.util.List;
import java.util.Scanner;

public class MainController {
    private static final int XEM_DANH_SACH = 1;
    private static final int THEM_MOI = 2;
    private static final int CAP_NHAT = 3;
    private static final int XOA = 4;
    private static final int TIM_KIEM = 5;
    private static final int DOC_TU_FILE = 6;
    private static final int GHI_VAO_FILE = 7;
    private static final int EXIT = 8;

    private static IDanhBaService danhBaService = new DanhBaService();
    private static DanhBaView danhBaView = new DanhBaView();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = MainView.displayMainMenu();
            switch (choice) {
                case XEM_DANH_SACH:
                    List<DanhBa> danhBaList = danhBaService.getAllDanhBa();
                    danhBaView.hienThiDanhSachDanhBa(danhBaList);
                    break;
                case THEM_MOI:
                    DanhBa danhBa = danhBaView.nhapDanhBa();
                    danhBaService.themDanhBa(danhBa);
                    System.out.println("Thêm danh bạ mới thành công!");
                    break;
                case CAP_NHAT:
                    System.out.println("========================================");
                    String soDienThoaiChinhSua;
                    do {
                        System.out.println("Nhập số điện thoại của danh bạ muốn chỉnh sửa: ");
                        soDienThoaiChinhSua = sc.nextLine();
                        if (Validate.isEmpty(soDienThoaiChinhSua)) {
                            System.out.println("Số điện thoại không được để trống!");
                            continue;
                        } else if (!Validate.isValidPhone(soDienThoaiChinhSua)) {
                            System.out.println("sai định dạng số điện thoại");
                            continue;
                        } else {
                            break;
                        }
                    }while (true);
                    if (danhBaService.findDanhBaBySoDienThoai(soDienThoaiChinhSua) == null) {
                        do {
                            System.out.println("Không tìm được danh bạ với số điện thoại trên");
                            System.out.println("Vui lòng nhập lại số điện thoại hoặc nhấn enter để thoát: ");
                            soDienThoaiChinhSua = sc.nextLine();
                            if (soDienThoaiChinhSua.isEmpty()) {
                                break;
                            } else if (danhBaService.findDanhBaBySoDienThoai(soDienThoaiChinhSua) == null) {
                                continue;
                            }
                        } while (true);
                    } else {
                        String nhomCuaDanhBa;
                        do {
                            System.out.println("Nhập nhóm của danh bạ: ");
                            nhomCuaDanhBa = sc.nextLine();
                            if (Validate.isEmpty(nhomCuaDanhBa)) {
                                System.out.println("nhóm của danh bạ không được để trống!");
                                continue;
                            } else {
                                break;
                            }
                        }while (true);

                        String hoTen;
                        do {
                            System.out.println("Nhập họ tên: ");
                            hoTen = sc.nextLine();
                            if (Validate.isEmpty(hoTen)) {
                                System.out.println("họ tên không được để trống!");
                                continue;
                            } else {
                                break;
                            }
                        }while (true);

                        String gioiTinh;
                        do {
                            System.out.println("Nhập giới tính: ");
                            gioiTinh = sc.nextLine();
                            if (Validate.isEmpty(gioiTinh)) {
                                System.out.println("giới tính không được để trống!");
                                continue;
                            } else {
                                break;
                            }
                        }while (true);

                        String diaChi;
                        do {
                            System.out.println("Nhập địa chỉ: ");
                            diaChi = sc.nextLine();
                            if (Validate.isEmpty(diaChi)) {
                                System.out.println("địa chỉ: không được để trống!");
                                continue;
                            } else {
                                break;
                            }
                        }while (true);

                        String ngaySinh;
                        do {
                            System.out.println("Nhập ngày sinh: ");
                            ngaySinh = sc.nextLine();
                            if (Validate.isEmpty(ngaySinh)) {
                                System.out.println("ngày sinh không được để trống!");
                                continue;
                            } else {
                                break;
                            }
                        }while (true);

                        String email;
                        do {
                            System.out.println("Nhập email: ");
                            email = sc.nextLine();
                            if (Validate.isEmpty(email)) {
                                System.out.println("email không được để trống!");
                                continue;
                            } else if (!Validate.isValidEmail(email)) {
                                System.out.println("email sai định dạng");
                                continue;
                            } else {
                                break;
                            }
                        }while (true);
                        DanhBa danhBa1 = new DanhBa(soDienThoaiChinhSua, nhomCuaDanhBa, hoTen, gioiTinh, diaChi, ngaySinh, email);
                        danhBaService.updateDanhBa(soDienThoaiChinhSua, danhBa1);
                        System.out.println("Sửa danh bạ thành công!");
                    }

                    break;
                case XOA:
                    System.out.println("========================================");
                    System.out.println("Nhập số điện thoại của danh bạ muốn xóa: ");
                    String soDienThoaiXoa = sc.nextLine();
                    if (danhBaService.findDanhBaBySoDienThoai(soDienThoaiXoa) == null) {
                        do {
                            System.out.println("Không tìm được danh bạ với số điện thoại trên");
                            System.out.println("Vui lòng nhập lại số điện thoại hoặc nhấn enter để thoát: ");
                            soDienThoaiChinhSua = sc.nextLine();
                            if (soDienThoaiChinhSua.isEmpty()) {
                                break;
                            } else if (danhBaService.findDanhBaBySoDienThoai(soDienThoaiChinhSua) == null) {
                                continue;
                            }
                        } while (true);
                    } else {
                        System.out.println("Nhấn Y để xóa danh bạ: ");
                        String subChoice = sc.nextLine();
                        if (subChoice.equalsIgnoreCase("Y")) {
                            danhBaService.deleteDanhBa(soDienThoaiXoa);
                            System.out.println("Xóa danh bạ thành công!");
                        } else {
                            break;
                        }
                    }
                    break;
                case TIM_KIEM:
                    System.out.println("========================================");
                    System.out.println("Nhập số điện thoại hoặc họ tên muốn tìm: ");
                    String input = sc.nextLine();
                    List<DanhBa> danhBaList1 = danhBaService.searchDanhBa(input);
                    System.out.println("Danh sách danh bạ tìm thấy: ");
                    danhBaView.hienThiDanhSachDanhBa(danhBaList1);
                    break;
                case DOC_TU_FILE:
                    System.out.println("Đọc file sẽ xóa toàn bộ danh bạ đang có trong bộ nhớ");
                    danhBaService.docDanhBa();
                    System.out.println("Đọc file thành công!");
                    break;
                case GHI_VAO_FILE:
                    System.out.println("Ghi file sẽ xóa toàn bộ danh bạ đang có trong bộ nhớ");
                    danhBaService.ghiDanBa();
                    System.out.println("Ghi file thành công!");
                    break;
                case EXIT:
                    exit = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này trong menu! " +
                            "\nVui lòng nhập lại: ");
                    break;
            }
        }
    }
}
