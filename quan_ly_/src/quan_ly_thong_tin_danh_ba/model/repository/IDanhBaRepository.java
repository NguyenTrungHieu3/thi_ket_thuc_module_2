package quan_ly_thong_tin_danh_ba.model.repository;

import quan_ly_thong_tin_danh_ba.model.entity.DanhBa;

import java.util.List;

public interface IDanhBaRepository {
    void addDanhBa(DanhBa danhBa);
    List<DanhBa> findAllDanhBa();
    public boolean updateDanhBa(String soDienThoai, DanhBa danhBa);
    boolean deleteDanhBa(String soDienThoai);
    boolean docDanhBa();
    boolean ghiDanBa();
}
