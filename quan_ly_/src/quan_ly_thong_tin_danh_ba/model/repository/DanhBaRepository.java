package quan_ly_thong_tin_danh_ba.model.repository;

import quan_ly_thong_tin_danh_ba.model.entity.DanhBa;
import quan_ly_thong_tin_danh_ba.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class DanhBaRepository implements IDanhBaRepository {
    private final String DANH_BA_PATH_FILE = "D:\\Code_Gym_Workspace\\thi_ket_thuc_module_2\\quan_ly_\\src\\quan_ly_thong_tin_danh_ba\\data\\contacts.csv";
    private final boolean APPEND = true;
    private ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    private List<DanhBa> danhBaList = new ArrayList<>();

    @Override
    public void addDanhBa(DanhBa danhBa) {
        List<String> stringList = new ArrayList<>();
        stringList.add(danhBa.getInfoToCSV());
        readAndWriteFile.writeListToCSV(DANH_BA_PATH_FILE, stringList, APPEND);
    }

    @Override
    public List<DanhBa> findAllDanhBa() {
        List<String> stringList = readAndWriteFile.readListFromCSV(DANH_BA_PATH_FILE);
        List<DanhBa> danhBaList = new ArrayList<>();
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            DanhBa danhBa = new DanhBa(array[0], array[1], array[2], array[3], array[4], array[5], array[6]);
            danhBaList.add(danhBa);
        }
        return danhBaList;
    }

    @Override
    public boolean updateDanhBa(String soDienThoai, DanhBa danhBa) {
        boolean isUpdated = false;
        List<DanhBa> danhBaList = findAllDanhBa();
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getSoDienThoai().equals(soDienThoai)) {
                danhBaList.set(i, danhBa);
                isUpdated = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (DanhBa danhBa1 : danhBaList) {
            stringList.add(danhBa1.getInfoToCSV());
        }
        readAndWriteFile.writeListToCSV(DANH_BA_PATH_FILE, stringList, !APPEND);
        return isUpdated;
    }

    @Override
    public boolean deleteDanhBa(String soDienThoai) {
        boolean isDeleted = false;
        List<DanhBa> danhBaList = findAllDanhBa();
        for (DanhBa danhBa : danhBaList) {
            if (danhBa.getSoDienThoai().equals(soDienThoai)) {
                danhBaList.remove(danhBa);
                isDeleted = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (DanhBa danhBa : danhBaList) {
            stringList.add(danhBa.getInfoToCSV());
        }
        readAndWriteFile.writeListToCSV(DANH_BA_PATH_FILE, stringList, !APPEND);
        return isDeleted;
    }

    @Override
    public boolean docDanhBa() {
        return danhBaList.addAll(findAllDanhBa());
    }

    @Override
    public boolean ghiDanBa() {
        boolean ghiDanBa = false;
        List<String> stringList = new ArrayList<>();
        for (DanhBa danhBa : danhBaList) {
            stringList.add(danhBa.getInfoToCSV());
            ghiDanBa = true;
        }
        readAndWriteFile.writeListToCSV(DANH_BA_PATH_FILE, stringList, APPEND);
        return ghiDanBa;
    }


//    @Override
//    public boolean deleteOfficialStudent(String officialStudentId) {
//        boolean isDeleted = false;
//        List<OfficialStudent> officialStudents = findAllOfficialStudents();
//        for (OfficialStudent officialStudent : officialStudents) {
//            if (officialStudent.getStudentId().equals(officialStudentId)) {
//                officialStudents.remove(officialStudent);
//                isDeleted = true;
//                break;
//            }
//        }
//        List<String> stringList = new ArrayList<>();
//        for (OfficialStudent officialStudent : officialStudents) {
//            stringList.add(officialStudent.getInfoToCSV());
//        }
//        readAndWriteFile.writeListToCSV(OFFICIAL_STUDENT_PATH_FILE, stringList, !APPEND);
//        return isDeleted;
//    }

//    @Override
//    public boolean updateOfficialStudent(String officialStudentId, OfficialStudent updateStudent) {
//        boolean isUpdated = false;
//        List<OfficialStudent> officialStudents = findAllOfficialStudents();
//        for (int i = 0; i < officialStudents.size(); i++) {
//            if (officialStudents.get(i).getStudentId().equals(officialStudentId)) {
//                officialStudents.set(i, updateStudent);
//                isUpdated = true;
//                break;
//            }
//        }
//        List<String> stringList = new ArrayList<>();
//        for (OfficialStudent officialStudent : officialStudents) {
//            stringList.add(officialStudent.getInfoToCSV());
//        }
//        readAndWriteFile.writeListToCSV(OFFICIAL_STUDENT_PATH_FILE, stringList, !APPEND);
//        return isUpdated;
//    }


}
