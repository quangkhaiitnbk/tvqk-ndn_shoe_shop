package code.dao;

import code.lop.LoaiSp;
import java.util.List;
import java.util.ArrayList;

public class LoaiSPDAO {

    List<LoaiSp> loaisp = new ArrayList<>();

    public LoaiSPDAO() {
        loaisp.add(new LoaiSp("1", "Sneaker"));
        loaisp.add(new LoaiSp("2", "Oxford"));
        loaisp.add(new LoaiSp("3", "Boot"));
        loaisp.add(new LoaiSp("4", "Derby"));
        loaisp.add(new LoaiSp("5", "Biti's"));
        loaisp.add(new LoaiSp("6", "Balenciaga"));
        loaisp.add(new LoaiSp("7", "Converse"));
    }

    public int add(LoaiSp sp) {
        loaisp.add(sp);
        return 1;
    }

    public List<LoaiSp> getAllLoaiSp() {
        return loaisp;
    }
}
