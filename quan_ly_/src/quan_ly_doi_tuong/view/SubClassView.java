package quan_ly_doi_tuong.view;

import quan_ly_doi_tuong.model.entity.SubClass1;

import java.util.List;
import java.util.Scanner;

public class SubClassView {
    public int displayMenuAddSubClass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Chọn loại subclass muốn thêm mới: ");
        System.out.println("1. Thêm subclass1");
        System.out.println("2. Thêm subclass2");
        System.out.println("3. Quay lại menu chính");
        System.out.print("Mời bạn nhập lựa chọn: ");
        return Integer.parseInt(sc.nextLine());
    }

    public int displayMenuDisplaySubclass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Chọn loại subclass muốn hiển thị: ");
        System.out.println("1. Hiển thị subclass1");
        System.out.println("2. Hiển thị subclass2");
        System.out.println("3. Hiển thị tất cả subclass");
        System.out.println("4. Quay lại menu chính");
        System.out.print("Mời bạn nhập lựa chọn: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số!");
            return -1;
        }
    }

//    public DiagnosticDevice inputDiagnosticDevice() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("========================================");
//        System.out.println("Nhập mã thiết bị: ");
//        String deviceId = sc.nextLine();
//        System.out.println("Nhập tên thiết bị: ");
//        String deviceName = sc.nextLine();
//        System.out.println("Nhập tên hãng sản xuất: ");
//        String manufacturer = sc.nextLine();
//        System.out.println("Nhập năm sản xuất: ");
//        int yearOfManufacture = Integer.parseInt(sc.nextLine());
//        System.out.println("Tên người quản lý: ");
//        String supervisor  = sc.nextLine();
//        System.out.println("Nhập loại chẩn đoán: ");
//        String diagnosisType = sc.nextLine();
//        return new DiagnosticDevice(deviceId, deviceName, manufacturer, yearOfManufacture, supervisor, diagnosisType);
//    }

//    public void displayDiagnosticDevice(List<DiagnosticDevice> diagnosticDeviceList) {
//        System.out.println("Danh sách thiết bị chẩn đoán: ");
//        for (DiagnosticDevice diagnosticDevice : diagnosticDeviceList) {
//            System.out.println(diagnosticDevice);
//        }
//    }

//    do {
//        String deviceId;
//        System.out.println("Nhập mã thiết bị: MD-XXXX");
//        deviceId = sc.nextLine();
//        if (Validate.isEmpty(deviceId)) {
//            System.out.println("Mã thiết bị không được để trống!");
//            continue;
//        } else if (!Validate.isValidDeviceId(deviceId)) {
//            System.out.println("Mã thiết bị phải theo đúng định dạng MD-XXXX");
//        } else {
//            break;
//        }
//    }while (true);

//    public DiagnosticDevice inputDiagnosticDevice() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("========================================");
//        String deviceId;
//        do {
//            System.out.println("Nhập mã thiết bị: MD-XXXX");
//            deviceId = sc.nextLine();
//            if (Validate.isEmpty(deviceId)) {
//                System.out.println("Mã thiết bị không được để trống!");
//                continue;
//            } else if (!Validate.isValidDeviceId(deviceId)) {
//                System.out.println("Mã thiết bị phải theo đúng định dạng MD-XXXX");
//            } else {
//                break;
//            }
//        }while (true);
//
//        String deviceName;
//        do {
//            System.out.println("Nhập tên thiết bị: ");
//            deviceName = sc.nextLine();
//            if (Validate.isEmpty(deviceName)) {
//                System.out.println("Tên thiết bị không được để trống!");
//                continue;
//            } else {
//                break;
//            }
//        } while (true);
//
//        String manufacturer;
//        do {
//            System.out.println("Nhập tên hãng sản xuất: ");
//            manufacturer = sc.nextLine();
//            if (Validate.isEmpty(manufacturer)) {
//                System.out.println("Tên hãng sản xuất thiết bị không được để trống!");
//                continue;
//            } else {
//                break;
//            }
//        } while (true);
//
//        int yearOfManufacture;
//        String yearInput;
//        do {
//            System.out.println("Nhập năm sản xuất: ");
//            yearInput = sc.nextLine();
//            if (Validate.isEmpty(yearInput)) {
//                System.out.println("Năm sản xuất không được để trống!");
//                continue;
//            } else if (!Validate.isInteger(yearInput)) {
//                System.out.println("Năm sản xuất phải là số nguyên!");
//                continue;
//            } else if (!Validate.isValidNamSanXuat(Integer.parseInt(yearInput))) {
//                System.out.println(Integer.parseInt(yearInput));
//                System.out.println("Năm sản xuất phải từ 1990 đến nay");
//                continue;
//            } else {
//                yearOfManufacture = Integer.parseInt(yearInput);
//                break;
//            }
//        } while (true);
//
//        String supervisor;
//        do {
//            System.out.println("Tên người quản lý: ");
//            supervisor = sc.nextLine();
//            if (Validate.isEmpty(supervisor)) {
//                System.out.println("Tên người quản lý không được để trống!");
//                continue;
//            } else {
//                break;
//            }
//        } while (true);
//
//        String diagnosisType;
//        do {
//            System.out.println("Nhập loại chẩn đoán: ");
//            diagnosisType = sc.nextLine();
//            if (Validate.isEmpty(diagnosisType)) {
//                System.out.println("Loại chẩn đoán không được để trống!");
//                continue;
//            } else {
//                break;
//            }
//        } while (true);
//        return new DiagnosticDevice(deviceId, deviceName, manufacturer, yearOfManufacture, supervisor, diagnosisType);
//    }
}
