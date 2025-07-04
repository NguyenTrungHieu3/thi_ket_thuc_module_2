package quan_ly_thong_tin_danh_ba.view;

import quan_ly_thong_tin_danh_ba.model.entity.DanhBa;
import quan_ly_thong_tin_danh_ba.regex.Validate;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DanhBaView {
    public DanhBa nhapDanhBa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        String soDienThoai;
        do {
            System.out.println("Nhập số điện thoại: ");
            soDienThoai = sc.nextLine();
            if (Validate.isEmpty(soDienThoai)) {
                System.out.println("Số điện thoại không được để trống!");
                continue;
            } else if (!Validate.isValidPhone(soDienThoai)) {
                System.out.println("sai định dạng số điện thoại");
                continue;
            } else {
                break;
            }
        }while (true);

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
        return new DanhBa(soDienThoai, nhomCuaDanhBa, hoTen, gioiTinh, diaChi, ngaySinh, email);
    }

    public void hienThiDanhSachDanhBa(List<DanhBa> danhBaList) {
        System.out.println("Danh sách danh bạ: ");
        for (DanhBa danhBa : danhBaList) {
            System.out.println(danhBa);
        }
    }
}
