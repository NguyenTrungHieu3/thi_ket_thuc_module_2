package quan_ly_doi_tuong.controller;

import quan_ly_doi_tuong.view.SubClassView;


public class SubClassController {
    private static final int ADD_SUB_CLASS_1 = 1;
    private static final int ADD_SUB_CLASS_2 = 2;
    private static final int EXIT = 3;

    private static final int DISPLAY_SUB_CLASS_1 = 1;
    private static final int DISPLAY_SUB_CLASS_2 = 2;
    private static final int DISPLAY_ALL_CLASS = 3;
    private static final int EXIT_DISPLAY_MENU = 4;

    private SubClassView subClassView = new SubClassView();
    public void displayMenuAddSubClass() {
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = subClassView.displayMenuAddSubClass();
            switch (choice) {
                case ADD_SUB_CLASS_1:
//                    OfficialStudent officialStudent = studentView.inputOfficialStudent();
//                    studentService.addStudent(officialStudent);
//                    System.out.println("Thêm học viên chính thức thành công!");
                    break;
                case ADD_SUB_CLASS_2:
//                    TrialStudent trialStudent = studentView.inputTrialStudent();
//                    studentService.addStudent(trialStudent);
//                    System.out.println("Thêm ô tô thành công!");
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

    public void displayMenuDisplaySubClass() {
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = subClassView.displayMenuDisplaySubclass();
            switch (choice) {
                case DISPLAY_SUB_CLASS_1:
//                    List<OfficialStudent> officialStudents = studentService.getAllOfficialStudents();
//                    studentView.displayAllOfficialStudent(officialStudents);
                    break;
                case DISPLAY_SUB_CLASS_2:
//                    List<TrialStudent> trialStudents = studentService.getAllTrialStudents();
//                    studentView.displayAllTrialStudent(trialStudents);
                    break;
                case DISPLAY_ALL_CLASS:
//                    List<Student> students = studentService.getAllStudents();
//                    studentView.displayAllStudent(students);
                    break;
                case EXIT_DISPLAY_MENU:
                    exit = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này trong menu! " +
                            "\nVui lòng nhập lại: ");
                    break;
            }
        }
    }

//    Scanner sc = new Scanner(System.in);
//
//// Ví dụ nhập số hiệu
//System.out.print("Nhập số hiệu: ");
//    String soHieu = sc.nextLine();
//if (Validate.isEmpty(soHieu)) {
//        System.out.println("Lỗi: Số hiệu không được để trống");
//    } else if (!(Validate.isValidDroneCode(soHieu) || Validate.isValidXeTTCode(soHieu))) {
//        System.out.println("Lỗi: Số hiệu không đúng định dạng DRN-XXX hoặc XTT-XXX");
    }

//// Hãng chế tạo
//System.out.print("Nhập hãng chế tạo: ");
//    String hang = sc.nextLine();
//if (Validate.isEmpty(hang)) {
//        System.out.println("Lỗi: Hãng không được để trống");
//    } else if (!Validate.isHangCheTaoHopLe(hang)) {
//        System.out.println("Lỗi: Hãng chế tạo không tồn tại trong danh sách");
//    }
//
//// Năm sản xuất
//System.out.print("Nhập năm sản xuất: ");
//    int namSX = sc.nextInt();
//if (!Validate.isValidNamSanXuat(namSX)) {
//        System.out.println("Lỗi: Năm sản xuất không được lớn hơn năm hiện tại");
//    }
//
//// Tầm bay
//System.out.print("Nhập tầm bay: ");
//    double tamBay = sc.nextDouble();
//if (!Validate.isPositive(tamBay)) {
//        System.out.println("Lỗi: Tầm bay phải là số dương");
//    }
//
//// Cấp độ chống bức xạ
//System.out.print("Nhập cấp độ chống bức xạ (1-10): ");
//    int capDo = sc.nextInt();
//if (!Validate.isWithinRange(capDo, 1, 10)) {
//        System.out.println("Lỗi: Cấp độ phải từ 1 đến 10");
//    }
