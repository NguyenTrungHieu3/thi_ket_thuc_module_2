package quan_ly_doi_tuong.controller;

import quan_ly_doi_tuong.exception.NotFoundVehicleException;
import quan_ly_doi_tuong.view.MainView;

import java.util.Scanner;

public class MainController {
    private static final int ADD_SUB_CLASS = 1;
    private static final int DISPLAY_SUB_CLASS = 2;
    private static final int REMOVE_SUB_CLASS_BY_ID = 3;
    private static final int UPDATE_SUB_CLASS_ID = 4;
    private static final int SEARCH_SUB_CLASS_BY_ID = 5;
    private static final int EXIT = 6;
    private static final int YES = 1;
    private static final int NO = 2;

    private static final SubClassController subClassController = new SubClassController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = MainView.displayMainMenu();
            switch (choice) {
                case ADD_SUB_CLASS:
                    subClassController.displayMenuAddSubClass();
                    break;
                case DISPLAY_SUB_CLASS:
                    subClassController.displayMenuDisplaySubClass();
                    break;
                case REMOVE_SUB_CLASS_BY_ID:
//                    System.out.println("========================================");
//                    System.out.println("Nhập mã học viên muốn xóa: ");
//                    String studentId = sc.nextLine();
//                    Student student = studentService.findStudentById(studentId);
//                    if (student == null) {
//                        System.out.println("Không tồn tại học viên có mã "+studentId+"!");
//                    } else {
//                        System.out.println("Bạn có chắc muốn xóa học viên có mã " + studentId + " không?");
//                        System.out.println("1. Có");
//                        System.out.println("2. Không");
//                        int subChoice = Integer.parseInt(sc.nextLine());
//                        switch (subChoice) {
//                            case YES:
//                                if (studentService.deleteStudent(student)) {
//                                    System.out.println("Xóa học viên thành công!");
//                                } else {
//                                    System.out.println("Xóa thất bại!");
//                                }
//                                break;
//                            case NO:
//                                System.out.println("Nhấn phím bất kỳ để quay lại menu chính: ");
//                                sc.nextLine();
//                                break;
//                            default:
//                                System.out.println("Lựa chọn không hợp lệ.");
//                                break;
//                        }
//                    }
                    break;
                case UPDATE_SUB_CLASS_ID:
//                    boolean isUpdate = false;
//                    System.out.println("========================================");
//                    System.out.println("Nhập mã học viên muốn cập nhật: ");
//                    String updateStudentId = sc.nextLine();
//                    Student findUpdateStudent = studentService.findStudentById(updateStudentId);
//                    if (findUpdateStudent == null) {
//                        System.out.println("Không tồn tại học viên có mã " + updateStudentId + "!");
//                    } else {
//                        if (findUpdateStudent instanceof OfficialStudent) {
//                            OfficialStudent officialStudent = studentView.inputOfficialStudent();
//                            studentService.updateStudent(updateStudentId, officialStudent);
//                            isUpdate = true;
//                        } else if (findUpdateStudent instanceof TrialStudent) {
//                            TrialStudent trialStudent = studentView.inputTrialStudent();
//                            studentService.updateStudent(updateStudentId, trialStudent);
//                            isUpdate = true;
//                        }
//                    }
//                    if (isUpdate) {
//                        System.out.println("Cập nhật học viên thành công");
//                    } else {
//                        System.out.println("Lỗi cập nhật học viên");
//                    }
                    break;
                case SEARCH_SUB_CLASS_BY_ID:
//                    System.out.println("========================================");
//                    System.out.println("Nhập mã học viên muốn tìm: ");
//                    String searchStudentID = sc.nextLine();
//                    Student searchStudent = studentService.findStudentById(searchStudentID);
//                    if (searchStudent == null) {
//                        System.out.println("Không tìm thấy học viên có mã " + searchStudentID + "!");
//                    } else {
//                        System.out.println("Học viên tìm thấy là: ");
//                        System.out.println(searchStudent);
//                    }
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

    public static void checkVehicle(String soHieuDangKy) throws NotFoundVehicleException {
//        if (phuongTienThamHiemService.findPhuongTienThamHiemBySoHieuDangKyOrTenNguoiDieuPhoi(soHieuDangKy) == null) {
//            throw new NotFoundVehicleException("Số hiệu phương tiện không tồn tại");
//        }
    }
}
