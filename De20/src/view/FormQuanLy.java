/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DTex;
import controller.IOFile;
import controller.Ngayex;
import controller.Trongex;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import model.KhachHang;
import model.QuanLy;
import model.Phong;

/**
 *
 * @author NamNguyen
 */
public class FormQuanLy extends javax.swing.JPanel {

    /**
     * Creates new form FormQuanLy
     */
    DefaultTableModel tm;
    List<QuanLy> list = new ArrayList<>();
    String path = "src/controller/DSTP.DAT";

    List<KhachHang> listkh = new ArrayList<>();
    String pathkh = "src/controller/KH.DAT";

    List<Phong> listp = new ArrayList<>();
    String pathp = "src/controller/PHONG.DAT";

    public FormQuanLy() {
        initComponents();
        String[] cot = {"Ma Khach", "Ten Khach", "Ma Phong", "Ten Phong", "Ngay dat"};
        tm = new DefaultTableModel(cot, 0);
        jTable1.setModel(tm);
        loadData();
    }

    private void loadData() {
        File f = new File(path);
        if (f.exists()) {
            list = IOFile.doc(path);
        }
        for (QuanLy i : list) {
            tm.addRow(i.toObjects());
        }

        File fkh = new File(pathkh);
        if (fkh.exists()) {
            listkh = IOFile.doc(pathkh);
        }
        for (KhachHang i : listkh) {
            jComboBox1.addItem(i.getMa() + "");
        }

        File fp = new File(pathp);
        if (fp.exists()) {
            listp = IOFile.doc(pathp);
        }
        for (Phong i : listp) {
            jComboBox2.addItem(i.getMa() + "");
        }
    }

    private void showContent(int row) {
        jComboBox1.setSelectedItem(jTable1.getValueAt(row, 0) + "");
        jComboBox1.setSelectedItem(jTable1.getValueAt(row, 2) + "");
        jTextField5.setText(jTable1.getValueAt(row, 4) + "");
    }

    private KhachHang getkh(int ma) {
        for (KhachHang i : listkh) {
            if (i.getMa() == ma) {
                return i;
            }

        }
        return null;
    }

    private Phong getp(int ma) {
        for (Phong i : listp) {
            if (i.getMa() == ma) {
                return i;
            }

        }
        return null;
    }

    private boolean isTonTai(int makh, int map) {
        for (QuanLy i : list) {
            if (i.getKh().getMa() == makh && i.getP().getMa() == map) {
                JOptionPane.showMessageDialog(this, "Da Ton Tai!");
                return false;
            }
        }
        return true;
    }

    private boolean isOK(int makh, String ngay) {
        for (QuanLy i : list) {
            if (i.getKh().getMa() == makh && i.getNgay().equalsIgnoreCase(ngay)) {
                JOptionPane.showMessageDialog(this, "Chi duoc thue 1 phong vao mot thoi diem!");
                return false;
            }
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Ma KH");

        jLabel2.setText("Ma Phong");

        jLabel3.setText("Ngay Dat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5)
                    .addComponent(jComboBox1, 0, 174, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btThem.setText("Them");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sua");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xoa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btLuu.setText("Luu");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Lua chon sap xep---", "Theo Ho Ten ", "Theo Phong" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btThem)
                        .addGap(35, 35, 35)
                        .addComponent(btSua)
                        .addGap(30, 30, 30)
                        .addComponent(btXoa)
                        .addGap(33, 33, 33)
                        .addComponent(btLuu)
                        .addGap(38, 38, 38)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btLuu)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0 || row > jTable1.getRowCount()) {
            JOptionPane.showMessageDialog(this, "Chon mot dong!");
        } else {
            showContent(row);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        //ma,ten,diachi,sdt,loai
        KhachHang kh = getkh(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
        Phong p = getp(Integer.parseInt(jComboBox2.getSelectedItem().toString()));
        try {
            String ngay = jTextField5.getText();
            if (isTonTai(kh.getMa(), p.getMa()) && isOK(kh.getMa(), ngay)) {
                QuanLy tmp = new QuanLy(kh, p, ngay);
                list.add(tmp);
                tm.addRow(tmp.toObjects());
            }

        } catch (Ngayex e) {
            JOptionPane.showMessageDialog(this, "Form ngay dang dd-mm-yy");
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0 || row > jTable1.getRowCount()) {
            JOptionPane.showMessageDialog(this, "Chon mot dong!");
        } else {
            KhachHang kh = getkh(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
            Phong p = getp(Integer.parseInt(jComboBox2.getSelectedItem().toString()));
            try {
                String ngay = jTextField5.getText();
                if (isTonTai(kh.getMa(), p.getMa()) && isOK(kh.getMa(), ngay)) {
                    QuanLy tmp = new QuanLy(kh, p, ngay);
                    list.set(row, tmp);
                    tm.removeRow(row);
                    tm.insertRow(row, tmp.toObjects());
                }

            } catch (Ngayex e) {
                JOptionPane.showMessageDialog(this, "Form ngay dang dd-mm-yy");
            }
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0 || row > jTable1.getRowCount()) {
            JOptionPane.showMessageDialog(this, "Chon mot dong!");
        } else {
            list.remove(row);
            tm.removeRow(row);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        IOFile.ghi(path, list);
    }//GEN-LAST:event_btLuuActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        // TODO add your handling code here:
        if (jComboBox3.getSelectedIndex() == 1) {
            list.sort(new Comparator<QuanLy>() {
                @Override
                public int compare(QuanLy o1, QuanLy o2) {
                    String[] ten1 = o1.getKh().getTen().split("\\s+");
                    String[] ten2 = o2.getKh().getTen().split("\\s+");
                    if (ten1[ten1.length - 1].equalsIgnoreCase(ten2[ten2.length - 1])) {
                        return o1.getKh().getTen().compareToIgnoreCase(o2.getKh().getTen());
                    } else {
                        return ten1[ten1.length - 1].compareToIgnoreCase(ten2[ten2.length - 1]);
                    }
                }

            });
        }
        if (jComboBox3.getSelectedIndex() == 2) {
            list.sort(new Comparator<QuanLy>() {
                @Override
                public int compare(QuanLy o1, QuanLy o2) {
                    String[] ten1 = o1.getP().getTen().split("\\s+");
                    String[] ten2 = o2.getP().getTen().split("\\s+");
                    if (ten1[ten1.length - 1].equalsIgnoreCase(ten2[ten2.length - 1])) {
                        return o1.getKh().getTen().compareToIgnoreCase(o2.getKh().getTen());
                    } else {
                        return ten1[ten1.length - 1].compareToIgnoreCase(ten2[ten2.length - 1]);
                    }
                }

            });
        }
        tm.setRowCount(0);
        for(QuanLy i:list){
            tm.addRow(i.toObjects());
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}