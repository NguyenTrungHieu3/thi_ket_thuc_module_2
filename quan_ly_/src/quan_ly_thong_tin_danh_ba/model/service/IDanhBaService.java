package quan_ly_thong_tin_danh_ba.model.service;

import quan_ly_thong_tin_danh_ba.model.entity.DanhBa;

import java.util.List;

public interface IDanhBaService {
    void themDanhBa(DanhBa danhBa);
    List<DanhBa> getAllDanhBa();
    DanhBa findDanhBaBySoDienThoai(String soDienThoai);
    boolean updateDanhBa(String soDienThoai, DanhBa danhBa);
    boolean deleteDanhBa(String soDienThoai);
    List<DanhBa> searchDanhBa(String input);
    void addDanhBa(DanhBa danhBa);
    List<DanhBa> lay5DanhBa();
    boolean docDanhBa();
    boolean ghiDanBa();
}
