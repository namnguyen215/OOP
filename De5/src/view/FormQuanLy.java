/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.HeSoEx;
import controller.IOFile;
import controller.Sodtex;
import controller.TrongEx;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import model.PhongBan;
import model.QuanLy;

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
    String path = "src/controller/QL.dat";
    List<PhongBan> listpb = new ArrayList<>();
    String pathpb = "src/controller/PB.dat";
    List<NhanVien> listnv = new ArrayList<>();
    String pathnv = "src/controller/NV.dat";

    public FormQuanLy() {
        initComponents();
        String[] col = {"Ma NV", "Ten NV", "Ma Phong", "Ten Phong", "So ngay lam viec"};
        tm = new DefaultTableModel(col, 0);
        jTable1.setModel(tm);
        loadData();
    }

    private void loadData() {
        File f = new File(path);
        if (f.exists()) {
            list = IOFile.doc(path);
        }
        File fnv = new File(pathnv);
        if (fnv.exists()) {
            listnv = IOFile.doc(pathnv);
        }
        File fpb = new File(pathpb);
        if (fpb.exists()) {
            listpb = IOFile.doc(pathpb);
        }
        for (QuanLy i : list) {
            tm.addRow(i.toObjects());
        }
        for (NhanVien i : listnv) {
            jComboBox1.addItem(i.getMa() + "");
        }
        for (PhongBan i : listpb) {
            jComboBox2.addItem(i.getMa() + "");
        }
    }

    private void showContent(int i) {
        jComboBox1.setSelectedItem(jTable1.getValueAt(i, 0) + "");
        jComboBox2.setSelectedItem(jTable1.getValueAt(i, 2) + "");
        jTextField3.setText(jTable1.getValueAt(i, 4) + "");
    }

    private NhanVien getNVbyMa(String ma) {
        for (NhanVien i : listnv) {
            if ((i.getMa() + "").equals(ma)) {
                return i;
            }
        }
        return null;
    }

    private PhongBan getPBbyMa(String ma) {
        for (PhongBan i : listpb) {
            if ((i.getMa() + "").equals(ma)) {
                return i;
            }
        }
        return null;
    }

    private boolean checkTonTai(String manv, String mapb) {
        for (QuanLy i : list) {
            if ((i.getManv() + "").equals(manv) && (i.getMapb() + "").equals(mapb)) {
                JOptionPane.showMessageDialog(this, "Da Ton Tai");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();

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

        jLabel2.setText("Ma Phong");

        jLabel3.setText("So ngay");

        jLabel5.setText("Ma NV");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btLuu.setText("Luu");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btLuu))
                .addGap(96, 96, 96))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0 || row > jTable1.getRowCount()) {
            JOptionPane.showMessageDialog(this, "Chon mot dong");
        } else {
            showContent(row);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        String manv;
        String tennv;
        String mapb;
        String tenpb;
        int songay;
        manv = jComboBox1.getSelectedItem().toString();
        mapb = jComboBox2.getSelectedItem().toString();
        tennv = getNVbyMa(manv).getTen();
        tenpb = getPBbyMa(mapb).getTen();
        songay = Integer.parseInt(jTextField3.getText());
        if(checkTonTai(manv, mapb)){
            QuanLy tmp = new QuanLy(manv, tennv, mapb, tenpb, songay);
            list.add(tmp);
            tm.addRow(tmp.toObjects());            
        }

    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0 || row > jTable1.getRowCount()) {
            JOptionPane.showMessageDialog(this, "Chon mot dong");
        } else {
            String manv;
            String tennv;
            String mapb;
            String tenpb;
            int songay;
            manv = jComboBox1.getSelectedItem().toString();
            mapb = jComboBox2.getSelectedItem().toString();
            tennv = getNVbyMa(manv).getTen();
            tenpb = getPBbyMa(mapb).getTen();
            songay = Integer.parseInt(jTextField3.getText());
            if(checkTonTai(manv, mapb)){
                QuanLy tmp = new QuanLy(manv, tennv, mapb, tenpb, songay);
                list.set(row, tmp);
                tm.removeRow(row);
                tm.insertRow(row, tmp.toObjects());                
            }

        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        IOFile.ghi(path, list);
    }//GEN-LAST:event_btLuuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
