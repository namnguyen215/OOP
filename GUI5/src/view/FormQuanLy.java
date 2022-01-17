/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ObjectIO;
import controller.SoLuong;
import controller.TrongException;
import controller.soDTexception;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BanDoc;
import model.QuanLyMuon;
import model.Sach;

/**
 *
 * @author NamNguyen
 */
public class FormQuanLy extends javax.swing.JPanel {

    DefaultTableModel tm;
    private String fbandoc = "src/controller/bandoc.dat";
    List<BanDoc> listBD = new ArrayList<>();
    private String fsach = "src/controller/sach.txt";
    List<Sach> listSach = new ArrayList<>();
    private String fql = "src/controller/QLMS.dat";
    List<QuanLyMuon> listQL = new ArrayList<>();
    private boolean them, sua;

    public FormQuanLy() {
        initComponents();
        setSize(950, 900);
        String[] cols = {"Ma ban doc", "Ho ten", "Ma sach", "Ten sach","So Luong","Tinh trang"};
        tm = new DefaultTableModel(cols, 0);
        jTable1.setModel(tm);
        buttonStatus(false);
        loadData();
        for (QuanLyMuon i : listQL) {
            tm.addRow(i.toObject());
        }
    }
    private Sach getSachbyMa(String ma){
        for(Sach i:listSach){
            if((i.getMa()+"").equals(ma))
                return i;
        }
        return null;
    }
    private BanDoc getBanDocbyMa(String ma){
        for(BanDoc i:listBD){
            if((i.getMa()+"").equals(ma))
                return i;
        }
        return null;
    }
    private void buttonStatus(boolean st) {
        btCapNhat.setEnabled(st);
        btBoQua.setEnabled(st);
    }

    private void resetText() {
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTextField3.setText("");
        jTextField5.setText("");

    }

    private void loadData() {
        File f = new File(fql);
        if (f.exists()) {
            listQL = ObjectIO.docra(fql);
        }
        jComboBox1.removeAllItems();
        File f1 = new File(fbandoc);
        if (f1.exists()) {
            listBD = ObjectIO.docra(fbandoc);
            for (BanDoc i : listBD) {
                jComboBox1.addItem(i.getMa() + "");
            }
        } else {
            jComboBox1.addItem("Chua co du lieu");
        }
        jComboBox2.removeAllItems();
        File f2 = new File(fsach);
        if (f2.exists()) {
            listSach = ObjectIO.docra(fsach);
            for (Sach i : listSach) {
                jComboBox2.addItem(i.getMa() + "");
            }
        } else {
            jComboBox2.addItem("Chua co du lieu");
        }

    }

    private void removeRow(int i) {
        tm.removeRow(i);
        listQL.remove(i);
    }

    private boolean checkSoDauSach(String maBD, String maSach) {
        int tongSach = 0;
        for (QuanLyMuon i : listQL) {
            //Check dau sach
            if (i.getMaSach().equals(maSach) && i.getMaBD().equals(maBD)) {
                JOptionPane.showMessageDialog(btCapNhat, "Da muon sach nay!");
                return false;
            }
            if (i.getMaBD().equals(maBD)) {
                tongSach++;
            }
        }
        if (tongSach <= 4) {
            System.out.println("So Dau Sach OK");
            return true;
        }else{
            JOptionPane.showMessageDialog(btCapNhat, "Kiem tra lai so luong dau sach da muon");
        }

        return false;
    }

    private boolean checkSoLuong(String maBD, String maSach, int soLuong) {
        for (Sach i : listSach) {
            if ((i.getMa()+"").equals(maSach) ) {
                if (i.getSl() - soLuong >= 0) {
                    System.out.println("So Luong OK");
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(btCapNhat, "Kiem tra lai so luong");
                }
            }
        }
        return false;
    }
    private void updateSach(String ma,int soLuong){
        getSachbyMa(ma).setSl(getSachbyMa(ma).getSl()-soLuong);
        ObjectIO.ghivao(fsach, listSach);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        btCapNhat = new javax.swing.JButton();
        btBoQua = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        btHienThi = new javax.swing.JButton();
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

        jLabel1.setText("Ma ban doc");

        jLabel2.setText("Ma sach");

        jLabel3.setText("Tinh trang");

        jLabel5.setText("So Luong");

        btCapNhat.setText("Cap nhat");
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });

        btBoQua.setText("Bo qua");
        btBoQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBoQuaActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCapNhat)
                                .addGap(54, 54, 54)
                                .addComponent(btBoQua, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCapNhat)
                    .addComponent(btBoQua))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        btThem.setText("Them moi");
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

        btLuu.setText("Luu vao file");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        btHienThi.setText("Hien thi");
        btHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHienThiActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Lua chon sap xep---", "Theo Ho Ten", "Theo So Luong" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btThem)
                                .addGap(18, 18, 18)
                                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btHienThi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btLuu)
                    .addComponent(btXoa)
                    .addComponent(btHienThi))
                .addGap(18, 18, 18)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:

        int row_idx = jTable1.getSelectedRow();
        if (row_idx < 0 || row_idx >= listQL.size()) {
            JOptionPane.showMessageDialog(this, "Chon mot dong tren bang");
            btSua.setEnabled(true);
        } else {
            sua = true;
            btSua.setEnabled(false);
            buttonStatus(true);
            jTextField5.setEditable(false);

        }
//        jTextField1.setText(fsach);
    }//GEN-LAST:event_btSuaActionPerformed
    private void addContent(int i) {
        //ten, tacgia, jComboBox1.getSelectedItem().toString(),Sach.getSma(), sl
        jComboBox1.setSelectedItem(listQL.get(i).getMaBD());
        jComboBox2.setSelectedItem(listQL.get(i).getMaSach());
        jTextField3.setText(listQL.get(i).getStatus());
        jTextField5.setText(listQL.get(i).getSoLuong() + "");
    }
    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        int row_idx = jTable1.getSelectedRow();
        if (row_idx < 0 || row_idx >= listQL.size()) {
            JOptionPane.showMessageDialog(this, "Chon mot dong tren bang");
        } else {
            removeRow(row_idx);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        them = true;
        btThem.setEnabled(false);
        buttonStatus(true);
    }//GEN-LAST:event_btThemActionPerformed

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        // TODO add your handling code here:
        if (them) {
            boolean passEx = true;
            String maBD, maSach, status,hoten,tensach;
            int soLuong;
            try {
                maBD = jComboBox1.getSelectedItem().toString();
                maSach = jComboBox2.getSelectedItem().toString();
                status = jTextField3.getText();
                soLuong = Integer.parseInt(jTextField5.getText());
                hoten=getBanDocbyMa(maBD).getHoten();
                tensach=getSachbyMa(maSach).getTen();
                QuanLyMuon tmp = new QuanLyMuon(maBD, maSach,hoten,tensach,soLuong, status);
                if (checkSoDauSach(maBD, maSach) && checkSoLuong(maBD, maSach, soLuong)) {
                    updateSach(maSach,soLuong);
                    listQL.add(tmp);
                    tm.addRow(tmp.toObject());
                    
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Nhap vao mot so");
                return;
            }
//            if (passEx) {
            them = false;
            btThem.setEnabled(true);
            resetText();
            buttonStatus(false);
//            }

        }
        if (sua) {
            String maBD, maSach, status,hoten,tensach;
            int soLuong;
            try {
                maBD = jComboBox1.getSelectedItem().toString();
                maSach = jComboBox2.getSelectedItem().toString();
                status = jTextField3.getText();
                soLuong = Integer.parseInt(jTextField5.getText());
                hoten=getBanDocbyMa(maBD).getHoten();
                tensach=getSachbyMa(maSach).getTen();
                QuanLyMuon tmp = new QuanLyMuon(maBD, maSach,hoten,tensach,soLuong, status);
                int row_idx = jTable1.getSelectedRow();
                if (checkSoLuong(maBD, maSach, soLuong)) {
                    
                    listQL.set(row_idx, tmp);
                    tm.removeRow(row_idx);
                    tm.insertRow(row_idx, tmp.toObject());
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Nhap vao mot so");
                return;
            }
//            if (passEx) {
            sua = false;
            btSua.setEnabled(true);
            jTextField5.setEditable(true);
            resetText();
            buttonStatus(false);
//            }

        }
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void btBoQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBoQuaActionPerformed
        // TODO add your handling code here:
        them = false;
        sua = false;
        btThem.setEnabled(true);
        btSua.setEnabled(true);
        jTextField5.setEditable(true);
        buttonStatus(false);
        resetText();
    }//GEN-LAST:event_btBoQuaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row_idx = jTable1.getSelectedRow();
        if (row_idx < 0 || row_idx >= listQL.size()) {
            JOptionPane.showMessageDialog(this, "Chon mot dong tren bang");
            resetText();
        } else {
            addContent(row_idx);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        ObjectIO.ghivao(fql, listQL);
    }//GEN-LAST:event_btLuuActionPerformed

    private void btHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHienThiActionPerformed
        // TODO add your handling code here:
        loadData();
        tm.setRowCount(0);
        for (QuanLyMuon i : listQL)
            tm.addRow(i.toObject());
    }//GEN-LAST:event_btHienThiActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        // TODO add your handling code here:
        if(jComboBox3.getSelectedIndex()==1){
            //sap xep theo ten
            listQL.sort(new Comparator<QuanLyMuon>(){
                @Override
                public int compare(QuanLyMuon o1, QuanLyMuon o2) {
                    String[] ten1=getBanDocbyMa(o1.getMaBD()).getHoten().split("\\s+");
                    String[] ten2=getBanDocbyMa(o2.getMaBD()).getHoten().split("\\s+");
                    if(ten1[ten1.length-1].equalsIgnoreCase(ten2[ten2.length-1])){
                        return getBanDocbyMa(o1.getMaBD()).getHoten().compareToIgnoreCase(getBanDocbyMa(o2.getMaBD()).getHoten());
                    }
                    return ten1[ten1.length-1].compareToIgnoreCase(ten2[ten2.length-1]);
                }
            
            });
        }
        if(jComboBox3.getSelectedIndex()==2){
            //sap xep theo so luong
            listQL.sort(new Comparator<QuanLyMuon>(){
                @Override
                public int compare(QuanLyMuon o1, QuanLyMuon o2) {
                    return Integer.compare(o1.getSoLuong(), o2.getSoLuong());
                }
                
            });
        }
        tm.setRowCount(0);
        for(QuanLyMuon i:listQL){
            tm.addRow(i.toObject());
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBoQua;
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btHienThi;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
