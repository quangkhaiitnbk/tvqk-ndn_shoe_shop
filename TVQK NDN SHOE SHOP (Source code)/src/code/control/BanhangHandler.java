package code.control;

import code.lop.SanPham;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BanhangHandler extends DefaultHandler {

    List<SanPham> banhangList = new ArrayList<>();
    SanPham currentSanPham = null;
    boolean isMaSp = false, isTenSp = false, isNgayBan = false, isLoaiSp = false, isSoluongban = false, isGiaBan = false, isGia = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("sanpham")) {
            currentSanPham = new SanPham();
        } else if (qName.equalsIgnoreCase("maSp")) {
            isMaSp = true;
        } else if (qName.equalsIgnoreCase("tenSp")) {
            isTenSp = true;
        } else if (qName.equalsIgnoreCase("ngayban")) {
            isNgayBan = true;
        } else if (qName.equalsIgnoreCase("loaiSp")) {
            isLoaiSp = true;
        } else if (qName.equalsIgnoreCase("soluongban")) {
            isSoluongban = true;
        } else if (qName.equalsIgnoreCase("giaban")) {
            isGiaBan = true;
        } else if (qName.equalsIgnoreCase("gia")) {
            isGia = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("sanpham")) {
            banhangList.add(currentSanPham);
            currentSanPham = null;
        } else if (qName.equalsIgnoreCase("maSp")) {
            isMaSp = false;
        } else if (qName.equalsIgnoreCase("tenSp")) {
            isTenSp = false;
        } else if (qName.equalsIgnoreCase("ngayban")) {
            isNgayBan = false;
        } else if (qName.equalsIgnoreCase("loaiSp")) {
            isLoaiSp = false;
        } else if (qName.equalsIgnoreCase("soluongban")) {
            isSoluongban = false;
        } else if (qName.equalsIgnoreCase("giaban")) {
            isGiaBan = false;
        } else if (qName.equalsIgnoreCase("gia")) {
            isGia = false;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        if (isMaSp) {
            currentSanPham.setMaSp(value);
        } else if (isTenSp) {
            currentSanPham.setTenSp(value);
        } else if (isNgayBan) {
            currentSanPham.setNgayban(value);
        } else if (isLoaiSp) {
            currentSanPham.setLoaisp(value);
        } else if (isSoluongban) {
            currentSanPham.setSoluongban(Integer.parseInt(value));
        } else if (isGiaBan) {
            currentSanPham.setGiaban(Integer.parseInt(value));
        } else if (isGiaBan) {
            currentSanPham.setGiaban(Integer.parseInt(value));
        } else if (isGia) {
            currentSanPham.setGia(Integer.parseInt(value));
        }

    }

    public List<SanPham> getBanhanglist() {
        return banhangList;
    }

}
