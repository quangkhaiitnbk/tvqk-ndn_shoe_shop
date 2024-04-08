package code.dao;

import code.lop.SanPham;
import java.util.List;
import java.util.ArrayList;

public class SanPhamDAO extends SanPham {

    public List<SanPham> sanphamlist = new ArrayList<>();

    public int add(SanPham sp) {

        sanphamlist.add(sp);
        return 1;
    }

    public int count() {
        return sanphamlist.size();
    }

    public List<SanPham> getAllSanPham() {
        return sanphamlist;
    }

    public SanPham findByID(String id) {
        for (SanPham sp : sanphamlist) {
            if (sp.getMaSp().equalsIgnoreCase(id)) {
                return sp;
            }
        }
        return null;
    }

    public int del(String id) {
        SanPham sp = findByID(id);
        if (sp != null) {
            sanphamlist.remove(sp);
            return 1;
        }
        return -1;
    }

    public SanPham getSanPhamAtPoint(int position) {
        return sanphamlist.get(position);

    }

    public int edit(SanPham spNew) {
        for (SanPham sp : sanphamlist) {
            if (sp.getMaSp().equalsIgnoreCase(spNew.getMaSp())) {
                sp.setTenSp(spNew.getTenSp());
                sp.setNgayNhap(spNew.getNgayNhap());
                sp.setGia(spNew.getGia());
                sp.setSoluong(spNew.getSoluong());
                sp.setLoaisp(spNew.getLoaisp());
                return 1;
            }
        }
        return -1;

    }

    public void banhang(int soluongBan, SanPham sp) {
        int soLuongConLai = sp.getSoluong() - soluongBan;
        if (soLuongConLai >= 0) {
            sp.setSoluong(soLuongConLai);

        } else {

        }
    }

    public List<SanPham> getListSanPham() {
        return sanphamlist;
    }
}
