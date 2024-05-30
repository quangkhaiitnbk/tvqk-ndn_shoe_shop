package code.control;

import code.lop.SanPham;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SanphamHandler extends DefaultHandler {

    List<SanPham> sanphamlist = new ArrayList<>();
    SanPham currentSanPham = null;
    boolean isMaSp = false, isTenSp = false, isNgayNhap = false, isLoaiSp = false, isSoluong = false, isGia = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("sanpham")) {
            currentSanPham = new SanPham();
        } else if (qName.equalsIgnoreCase("maSp")) {
            isMaSp = true;
        } else if (qName.equalsIgnoreCase("tenSp")) {
            isTenSp = true;
        } else if (qName.equalsIgnoreCase("ngaynhap")) {
            isNgayNhap = true;
        } else if (qName.equalsIgnoreCase("loaiSp")) {
            isLoaiSp = true;
        } else if (qName.equalsIgnoreCase("soluong")) {
            isSoluong = true;
        } else if (qName.equalsIgnoreCase("gia")) {
            isGia = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("sanpham")) {
            sanphamlist.add(currentSanPham);
            currentSanPham = null;
        } else if (qName.equalsIgnoreCase("maSp")) {
            isMaSp = false;
        } else if (qName.equalsIgnoreCase("tenSp")) {
            isTenSp = false;
        } else if (qName.equalsIgnoreCase("ngaynhap")) {
            isNgayNhap = false;
        } else if (qName.equalsIgnoreCase("loaiSp")) {
            isLoaiSp = false;
        } else if (qName.equalsIgnoreCase("soluong")) {
            isSoluong = false;
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
        } else if (isNgayNhap) {
            currentSanPham.setNgayNhap(value);
        } else if (isLoaiSp) {
            currentSanPham.setLoaisp(value);
        } else if (isSoluong) {
            currentSanPham.setSoluong(Integer.valueOf(value));
        } else if (isGia) {
            currentSanPham.setGia(Integer.valueOf(value));
        }

    }

    public List<SanPham> getSanphamlist() {
        return sanphamlist;
    }
}
