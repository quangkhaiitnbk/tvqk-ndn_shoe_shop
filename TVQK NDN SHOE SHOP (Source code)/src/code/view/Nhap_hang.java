// ĐIỀU KHIỂN GIAO DIỆN NHẬP HÀNG
package code.view; 

import code.dao.LoaiSPDAO;
import code.lop.LoaiSp;
import code.lop.SanPham;
import code.dao.SanPhamDAO;
import code.control.SanphamHandler;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;
import javax.imageio.ImageIO;
import javax.swing.table.TableRowSorter;
import javax.xml.parsers.*;
import org.xml.sax.SAXException;

public class Nhap_hang extends javax.swing.JFrame {

    LoaiSPDAO daoLoaiSP = new LoaiSPDAO();
    SanPhamDAO daoSP = new SanPhamDAO();
    DefaultTableModel KhohangModel;

    public Nhap_hang() {
        initComponents();
        setLocationRelativeTo(null);
        getDataCombobox();
        setTitle("TVQK&NDN SHOE SHOP - Thoải mái trong từng bước chân!");

        // Sắp xếp sản phẩm trong bảng kho hàng
        KhohangModel = (DefaultTableModel) tbl_khohang.getModel();
        TableRowSorter<DefaultTableModel> sorter1 = new TableRowSorter<>(KhohangModel);
        KhohangModel.setRowCount(0);
        tbl_khohang.setRowSorter(sorter1);
        sorter1.setComparator(0, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        sorter1.setSortable(0, true);
        sorter1.toggleSortOrder(0);
        ImportKhohang();
    }

    // Lấy dữ liệu từ combobox
    public void getDataCombobox() {
        @SuppressWarnings("unchecked")
        DefaultComboBoxModel<LoaiSp> model = (DefaultComboBoxModel) cboLoaiSp.getModel();
        for (LoaiSp loai : daoLoaiSP.getAllLoaiSp()) {
            model.addElement(loai);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_quanly = new javax.swing.JButton();
        txt_MaSp = new javax.swing.JTextField();
        lbl_logo = new javax.swing.JLabel();
        txt_TenSp = new javax.swing.JTextField();
        cboLoaiSp = new javax.swing.JComboBox<>();
        btn_NhapHang = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        txt_Gia = new javax.swing.JTextField();
        txt_SoLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khohang = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btn_quaylai = new javax.swing.JButton();
        btn_Thoat1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        anh = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_NgayNhap = new com.toedter.calendar.JDateChooser();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Mã sản phẩm");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 118, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Tên sản phẩm");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 162, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("Ngày nhập");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel1.setText("đôi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 70, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setText("Loại sản phẩm");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 252, -1, -1));

        btn_quanly.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        btn_quanly.setForeground(new java.awt.Color(0, 0, 102));
        btn_quanly.setText("TVQK&NDN SHOE SHOP");
        btn_quanly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quanlyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_quanly, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 34, 570, 50));
        jPanel1.add(txt_MaSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 117, 281, -1));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/logo_shop.png"))); // NOI18N
        lbl_logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_logo.setMaximumSize(new java.awt.Dimension(1014, 572));
        lbl_logo.setMinimumSize(new java.awt.Dimension(1014, 572));
        jPanel1.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 62, -1, 296));

        txt_TenSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenSpActionPerformed(evt);
            }
        });
        jPanel1.add(txt_TenSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 161, 281, -1));

        cboLoaiSp.setEditable(true);
        cboLoaiSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSpActionPerformed(evt);
            }
        });
        jPanel1.add(cboLoaiSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 251, 163, -1));

        btn_NhapHang.setBackground(new java.awt.Color(102, 255, 255));
        btn_NhapHang.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_NhapHang.setText("Nhập hàng");
        btn_NhapHang.setMaximumSize(new java.awt.Dimension(108, 30));
        btn_NhapHang.setMinimumSize(new java.awt.Dimension(108, 30));
        btn_NhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhapHangActionPerformed(evt);
            }
        });
        jPanel1.add(btn_NhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, 50));

        btn_sua.setBackground(new java.awt.Color(102, 255, 255));
        btn_sua.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 108, 50));
        jPanel1.add(txt_Gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 160, -1));
        jPanel1.add(txt_SoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 290, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setText("Ảnh minh họa");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setText("Số lượng");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 290, -1, -1));

        btn_refresh.setBackground(new java.awt.Color(102, 255, 255));
        btn_refresh.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_refresh.setText("Làm mới");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 108, 50));

        btn_xoa.setBackground(new java.awt.Color(102, 255, 255));
        btn_xoa.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 108, 50));

        tbl_khohang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Ngày nhập", "Loại sản phẩm", "Số lượng ", "Giá nhập (VNĐ)", "Tổng tiền (nghìn VNĐ)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_khohang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khohangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_khohang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 1060, 200));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("KHO HÀNG");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        btn_quaylai.setBackground(new java.awt.Color(0, 0, 102));
        btn_quaylai.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_quaylai.setForeground(new java.awt.Color(255, 255, 255));
        btn_quaylai.setText("Quay lại");
        btn_quaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quaylaiActionPerformed(evt);
            }
        });
        jPanel1.add(btn_quaylai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, 108, -1));

        btn_Thoat1.setBackground(new java.awt.Color(0, 0, 102));
        btn_Thoat1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_Thoat1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Thoat1.setText("Thoát");
        btn_Thoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Thoat1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Thoat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 750, 108, -1));

        jLabel9.setText("(dd/mm/yyyy)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel10.setText("(dd/mm/yyyy)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel11.setText("VNĐ/đôi");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 90, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel12.setText("Giá nhập");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        anh.setText("              Ảnh minh họa");
        anh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        anh.setName(""); // NOI18N
        jPanel1.add(anh, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 160, 110));
        anh.getAccessibleContext().setAccessibleDescription("");

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Chọn ảnh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, 30));

        txt_NgayNhap.setPreferredSize(new java.awt.Dimension(64, 22));
        txt_NgayNhap.setRequestFocusEnabled(false);
        jPanel1.add(txt_NgayNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 280, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1160, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TenSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenSpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenSpActionPerformed
    public void resetForm() {
        Date now = new Date();
        txt_Gia.setText("");
        txt_MaSp.setText("");
        txt_NgayNhap.setDate(now);
        txt_SoLuong.setText("");
        txt_TenSp.setText("");
        cboLoaiSp.setSelectedIndex(0);
        anh.setIcon(null);
        anh.setText("              Ảnh minh họa");
    }

    // Lấy dữ liệu từ file sanpham.xml
    public void ImportKhohang() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("sanpham.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            SanphamHandler handler = new SanphamHandler();

            parser.parse(fis, handler);

            daoSP.sanphamlist = handler.getSanphamlist();

            KhohangModel.setRowCount(0);

            for (SanPham sp : daoSP.sanphamlist) {
                DecimalFormat decimalFormat = new DecimalFormat("#,###");
                String format = decimalFormat.format(sp.getGia());
                String format2 = decimalFormat.format((long) sp.getGia() * sp.getSoluong());
                String format1 = decimalFormat.format(sp.getSoluong());
                KhohangModel.addRow(new Object[]{
                    sp.getMaSp(), sp.getTenSp(),
                    sp.getNgayNhap(), sp.getLoaisp(),
                    format1, format, format2
                });
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Nhap_hang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Nhap_hang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Nhap_hang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Nhap_hang.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Nhap_hang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    // Xuất dữ liệu ra file sanpham.xml
    public void ExportKhohang() {
        StringBuilder builder = new StringBuilder();
        for (SanPham sp : daoSP.sanphamlist) {
            builder.append(sp.getXMLString());
        }

        String body = builder.toString();
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
                + "<sanphamlist>\n"
                + body
                + "\n</sanphamlist>";

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("sanpham.xml");
            byte[] data = xml.getBytes();

            fos.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Nhap_hang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static boolean isAfterNow(Date textField) throws ParseException {
        Date currentDate = new Date();
        return textField.after(currentDate);
    }

    private void btn_NhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhapHangActionPerformed
        if (!checkValidateForm()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin sản phẩm!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
        } else if (Integer.parseInt(txt_SoLuong.getText().trim()) <= 0) {
            JOptionPane.showMessageDialog(this, "Số lượng nhập phải lớn hơn 0", "Lỗi!", JOptionPane.ERROR_MESSAGE);
        } else if (Integer.parseInt(txt_Gia.getText().trim()) < 0) {
            JOptionPane.showMessageDialog(this, "Giá nhập phải lớn hơn hoặc bằng 0", "Lỗi!", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!check()) {
                JOptionPane.showMessageDialog(this, "Sai thông tin sản phẩm!", "Lỗi!", JOptionPane.ERROR_MESSAGE);

            } else {
                Nhapcungsp();
                Date a = txt_NgayNhap.getDate();
                try {
                    if (isAfterNow(a)) {
                        JOptionPane.showMessageDialog(this, "Ngày nhập vượt quá ngày hiện tại!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
                    } else {
                        
                        boolean isExist = false;
                        for (SanPham sp : daoSP.sanphamlist) {
                            if (sp.getMaSp().equals(txt_MaSp.getText().trim()) && sp.getNgayNhap().equals(a)) {
                                sp.setSoluong(sp.getSoluong());
                                isExist = true;
                                break;
                            }
                        }
                        
                        if (!isExist) {
                            SanPham sanPham;
                            try {
                                sanPham = getModel();
                                daoSP.sanphamlist.add(sanPham);
                                
                            } catch (ParseException ex) {
                                Logger.getLogger(Nhap_hang.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                        
                        // Lưu ảnh vào folder
                        String defaultFileName = txt_MaSp.getText().trim() + ".gif"; // Tên tệp tin mặc định
                        String outputPath = "pic/"; // Đường dẫn thư mục đầu ra mặc định
                        
                        File outputFile = new File(outputPath + defaultFileName);
                        try {
                            ImageIcon imageIcon = (ImageIcon) anh.getIcon();
                            Image image = imageIcon.getImage();
                            BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
                            Graphics2D graphics = bufferedImage.createGraphics();
                            graphics.drawImage(image, 0, 0, null);
                            graphics.dispose();
                            ImageIO.write(bufferedImage, "png", outputFile);
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(this, "Chưa lưu được ảnh!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
                        }
                        
                        resetForm();
                        fillData();
                        ExportKhohang();
                        JOptionPane.showMessageDialog(rootPane, "Nhập hàng thành công");
                    } 
                } catch (ParseException ex) {
                    Logger.getLogger(Nhap_hang.class.getName()).log(Level.SEVERE, null, ex);
                }

                
            }
        }

    }//GEN-LAST:event_btn_NhapHangActionPerformed
    public void setModel(SanPham sp) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss zzz yyyy");
        Date date = dateFormat.parse(sp.getNgayNhap());
        txt_MaSp.setText(sp.getMaSp());
        txt_Gia.setText(sp.getGia() + "");
        txt_NgayNhap.setDate(date);
        txt_TenSp.setText(sp.getTenSp());
        txt_SoLuong.setText(sp.getSoluong() + "");
        cboLoaiSp.setSelectedItem(sp.getLoaisp());

    }

    public void quay_lai() {
        Nhap_hang nh = new Nhap_hang();
        Lua_chon lc = new Lua_chon();

        lc.setVisible(true);
        nh.setVisible(false);
        dispose();
    }

    private void btn_quaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quaylaiActionPerformed
        // TODO add your handling code here:
        quay_lai();
    }//GEN-LAST:event_btn_quaylaiActionPerformed
    public boolean checkValidateForm() {
        if (txt_Gia.getText().isEmpty()
                || txt_MaSp.getText().isEmpty()
                || txt_SoLuong.getText().isEmpty()
                || txt_TenSp.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean check() {
        for (SanPham sp : daoSP.sanphamlist) {
            if (sp.getMaSp().equalsIgnoreCase(txt_MaSp.getText().trim()) && !sp.getTenSp().equalsIgnoreCase(txt_TenSp.getText())) {
                return false;
            }
            if (!sp.getMaSp().equalsIgnoreCase(txt_MaSp.getText().trim()) && sp.getTenSp().equalsIgnoreCase(txt_TenSp.getText())) {
                return false;
            }
        }

        return true;
    }

    public void Nhapcungsp() {
        for (SanPham sp : daoSP.sanphamlist) {
            if (sp.getMaSp().equalsIgnoreCase(txt_MaSp.getText().trim()) && sp.getTenSp().equalsIgnoreCase(txt_TenSp.getText()) ) {

                sp.setSoluong(sp.getSoluong() + Integer.parseInt(txt_SoLuong.getText()));

            }
        }
    }

    public SanPham getModel() throws ParseException {
        SanPham sp = new SanPham();
        sp.setMaSp(txt_MaSp.getText().trim());
        sp.setTenSp(txt_TenSp.getText().trim());
        sp.setGia(Integer.parseInt(txt_Gia.getText().trim()));
        sp.setSoluong(Integer.parseInt(txt_SoLuong.getText().trim()));
        sp.setLoaisp(cboLoaiSp.getSelectedItem().toString());
        DateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss zzz yyyy");
        String dateString = dateFormat.format(txt_NgayNhap.getDate());
        sp.setNgayNhap(dateString);
        return sp;
    }

    public void fillData() {
        KhohangModel.setRowCount(0);
        for (SanPham sp : daoSP.getAllSanPham()) {
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            String format = decimalFormat.format(sp.getGia());
            String format2 = decimalFormat.format((long) sp.getGia() * sp.getSoluong());
            String format1 = decimalFormat.format(sp.getSoluong());
            Object[] rowData = new Object[7];
            rowData[0] = sp.getMaSp();
            rowData[1] = sp.getTenSp();
            rowData[2] = sp.getNgayNhap();
            rowData[3] = sp.getLoaisp();
            rowData[4] = format1;
            rowData[5] = format;
            rowData[6] = format2;
            KhohangModel.addRow(rowData);
        }
    }


    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        try {
            SanPham sp = getModel();
            if(check()){
            // Xóa ảnh cũ
            String duongDanTep = "pic/"+txt_MaSp.getText()+".gif"; // Đường dẫn đến tệp ảnh cần xó
            File fileAnh = new File(duongDanTep);
            fileAnh.delete();
            // Lưu ảnh vào folder
            String defaultFileName = txt_MaSp.getText().trim() + ".gif"; // Tên tệp tin mặc định
            String outputPath = "pic/"; // Đường dẫn thư mục đầu ra mặc định

            File outputFile = new File(outputPath + defaultFileName);
            try {
                ImageIcon imageIcon = (ImageIcon) anh.getIcon();
                Image image = imageIcon.getImage();
                BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
                Graphics2D graphics = bufferedImage.createGraphics();
                graphics.drawImage(image, 0, 0, null);
                graphics.dispose();
                ImageIO.write(bufferedImage, "png", outputFile);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Chưa lưu được ảnh!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
            }
            if (daoSP.edit(sp) > 0) {
                fillData();
            }
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
        } else {
                JOptionPane.showMessageDialog(this, "Sai thông tin sản phẩm!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ParseException ex) {
            System.out.println("Error: " + ex.toString());
        }
        ExportKhohang(); 
    }//GEN-LAST:event_btn_suaActionPerformed

    private void tbl_khohangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khohangMouseClicked
        // TODO add your handling code here:
        
        int rowID = tbl_khohang.convertRowIndexToModel(tbl_khohang.getSelectedRow());

        SanPham sp = daoSP.getSanPhamAtPoint(rowID);
        if (sp == null) {
            return;
        }
        resetForm();
        try {
            setModel(sp);
        } catch (ParseException ex) {
            Logger.getLogger(Nhap_hang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String imagePath = "pic/"+sp.getMaSp()+".gif"; // Đường dẫn tới tệp tin hình ảnh

        // Tạo một biểu tượng hình ảnh từ đường dẫn
        ImageIcon imageIcon = new ImageIcon(imagePath);

        // Đặt biểu tượng hình ảnh cho JLabel
        anh.setIcon(imageIcon);
    }//GEN-LAST:event_tbl_khohangMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void cboLoaiSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboLoaiSpActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:

        Iterator<SanPham> iterator = daoSP.sanphamlist.iterator();
        while (iterator.hasNext()) {
            SanPham sanPham = iterator.next();
            if (sanPham.getMaSp().equalsIgnoreCase(txt_MaSp.getText())) {
                String duongDanTep = "pic/"+sanPham.getMaSp()+".gif"; // Đường dẫn đến tệp ảnh cần xó
                File fileAnh = new File(duongDanTep);
                fileAnh.delete();
                iterator.remove();
                resetForm();
                fillData();
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                break;
            }
        }

        ExportKhohang();

    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_quanlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quanlyActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btn_quanlyActionPerformed

    private void btn_Thoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Thoat1ActionPerformed
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btn_Thoat1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this); // "this" represents the JFrame Form
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());

            // Resize the image to fit the label
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(anh.getWidth(), anh.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
            anh.setIcon(scaledImageIcon);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anh;
    private javax.swing.JButton btn_NhapHang;
    private javax.swing.JButton btn_Thoat1;
    private javax.swing.JButton btn_quanly;
    private javax.swing.JButton btn_quaylai;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cboLoaiSp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JTable tbl_khohang;
    private javax.swing.JTextField txt_Gia;
    private javax.swing.JTextField txt_MaSp;
    private com.toedter.calendar.JDateChooser txt_NgayNhap;
    private javax.swing.JTextField txt_SoLuong;
    private javax.swing.JTextField txt_TenSp;
    // End of variables declaration//GEN-END:variables
}
