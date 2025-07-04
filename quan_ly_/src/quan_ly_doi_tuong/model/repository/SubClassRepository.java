package quan_ly_doi_tuong.model.repository;

import quan_ly_doi_tuong.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class SubClassRepository {
    private final String OFFICIAL_STUDENT_PATH_FILE = "case_study/student_management/data/official_student.csv";
    private final String TRIAL_STUDENT_PATH_FILE = "case_study/student_management/data/trial_student.csv";
    private final boolean APPEND = true;

    private ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
//    @Override
//    public void addStudent(Student student) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add(student.getInfoToCSV());
//        if (student instanceof OfficialStudent) {
//            readAndWriteFile.writeListToCSV(OFFICIAL_STUDENT_PATH_FILE, stringList, APPEND);
//        } else if (student instanceof TrialStudent) {
//            readAndWriteFile.writeListToCSV(TRIAL_STUDENT_PATH_FILE, stringList, APPEND);
//        }
//    }

//    @Override
//    public List<OfficialStudent> findAllOfficialStudents() {
//        List<String> stringList = readAndWriteFile.readListFromCSV(OFFICIAL_STUDENT_PATH_FILE);
//        List<OfficialStudent> officialStudents = new ArrayList<>();
//        String[] array = null;
//        for (String line : stringList) {
//            array = line.split(",");
//            OfficialStudent officialStudent = new OfficialStudent(array[1], array[2], array[3], array[4], array[5], array[6], Double.parseDouble(array[7]));
//            officialStudents.add(officialStudent);
//        }
//        return officialStudents;
//    }

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
