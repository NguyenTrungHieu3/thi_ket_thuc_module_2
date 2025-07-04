package quan_ly_thong_tin_danh_ba.model.service;

import quan_ly_thong_tin_danh_ba.model.entity.DanhBa;
import quan_ly_thong_tin_danh_ba.model.repository.DanhBaRepository;
import quan_ly_thong_tin_danh_ba.model.repository.IDanhBaRepository;

import java.util.ArrayList;
import java.util.List;

public class DanhBaService implements IDanhBaService{


    private IDanhBaRepository danhBaRepository = new DanhBaRepository();
    @Override
    public void themDanhBa(DanhBa danhBa) {
        danhBaRepository.addDanhBa(danhBa);
    }

    @Override
    public List<DanhBa> getAllDanhBa() {
        return danhBaRepository.findAllDanhBa();
    }

    @Override
    public DanhBa findDanhBaBySoDienThoai(String soDienThoai) {
        List<DanhBa> danhBaList = getAllDanhBa();
        for (DanhBa danhBa : danhBaList) {
            if (danhBa.getSoDienThoai().equals(soDienThoai)) {
                return danhBa;
            }
        }
        return null;
    }

    @Override
    public boolean updateDanhBa(String soDienThoai, DanhBa danhBa) {
        return danhBaRepository.updateDanhBa(soDienThoai, danhBa);
    }

    @Override
    public boolean deleteDanhBa(String soDienThoai) {
        return danhBaRepository.deleteDanhBa(soDienThoai);
    }

    public List<DanhBa> searchDanhBa(String input) {
        List<DanhBa> result = new ArrayList<>();
        List<DanhBa> danhBaList = getAllDanhBa();

        for (DanhBa danhBa : danhBaList) {
            if (danhBa.getSoDienThoai().contains(input) ||
                    danhBa.getHoTen().toLowerCase().contains(input.toLowerCase())) {
                result.add(danhBa);
            }
        }
        return result;
    }

    @Override
    public void addDanhBa(DanhBa danhBa) {

    }

    @Override
    public List<DanhBa> lay5DanhBa() {
        return null;
    }

    @Override
    public boolean docDanhBa() {
        return danhBaRepository.docDanhBa();
    }

    @Override
    public boolean ghiDanBa() {
       return danhBaRepository.ghiDanBa();
    }


//    @Override
//    public void addStudent(Student student) {
//        studentRepository.addStudent(student);
//    }

//    @Override
//    public List<OfficialStudent> getAllOfficialStudents() {
//        return studentRepository.findAllOfficialStudents();
//    }

//    @Override
//    public boolean deleteStudent(Student student) {
//        boolean isDeleted = false;
//        if (student instanceof OfficialStudent) {
//            isDeleted = studentRepository.deleteOfficialStudent(student.getStudentId());
//        } else if (student instanceof TrialStudent) {
//            isDeleted = studentRepository.deleteTrialStudent(student.getStudentId());
//        }
//        return isDeleted;
//    }

//    @Override
//    public Student findStudentById(String studentId) {
//        List<Student> students = getAllStudents();
//        for (Student student : students) {
//            if (student.getStudentId().equals(studentId)) {
//                return student;
//            }
//        }
//        return null;
//    }

//    @Override
//    public boolean updateStudent(String studentId, Student updatedStudent) {
//        boolean isUpdated = false;
//        Student student = findStudentById(studentId);
//        if (student instanceof OfficialStudent) {
//            isUpdated = studentRepository.updateOfficialStudent(studentId, (OfficialStudent) updatedStudent);
//        } else if (student instanceof TrialStudent) {
//            isUpdated = studentRepository.updateTrialStudent(studentId, (TrialStudent) updatedStudent);
//        }
//        return isUpdated;
//    }

//    @Override
//    public List<Student> getAllStudents() {
//        List<Student> students = new ArrayList<>();
//        students.addAll(getAllOfficialStudents());
//        students.addAll(getAllTrialStudents());
//        return students;
//    }
}
