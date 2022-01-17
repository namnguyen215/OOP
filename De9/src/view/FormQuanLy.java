/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.IOFile;
import controller.Trongex;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.GiangVien;
import model.MonHoc;
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
    String path = "src/controller/QLGV.dat";

    List<GiangVien> listgv = new ArrayList<>();
    String pathgv = "src/controller/GV.dat";

    List<MonHoc> listmh = new ArrayList<>();
    String pathmh = "src/controller/MH.dat";

    public FormQuanLy() {
        initComponents();
        String[] cot = {"Ma GV", "Ten GV", "Ma Mon", "Ten Mon", "So Lop"};
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

        File fgv = new File(pathgv);
        if (fgv.exists()) {
            listgv = IOFile.doc(pathgv);
        }
        for (GiangVien i : listgv) {
            jComboBox2.addItem(i.getMa() + "");
        }

        File fmh = new File(pathmh);
        if (fmh.exists()) {
            listmh = IOFile.doc(pathmh);
        }
        for (MonHoc i : listmh) {
            jComboBox3.addItem(i.getMa() + "");
        }
    }

    private void showContent(int row) {
        //Ma GV","Ten GV","Ma Mon","Ten Mon","So Lop
        jComboBox2.setSelectedItem(jTable1.getValueAt(row, 0) + "");
        jComboBox3.setSelectedItem(jTable1.getValueAt(row, 2) + "");
        jTextField4.setText(jTable1.getValueAt(row, 4) + "");
    }

    private boolean isTonTai(int magv, int mamon) {
        for (QuanLy i : list) {
            if (i.getMagv() == magv && i.getMamon() == mamon) {
                JOptionPane.showMessageDialog(this, "Da ton tai!");
                return false;
            }

        }
        return true;
    }

    private boolean isOK(int solop, int magv) {
        //Số lớp cho mỗi môn là số nguyên dương và không lớn hơn 3. Tổng số tiết giảng dạy của một giảng viên không được lớn hơn 200. 
        if (solop < 0 || solop > 3) {
            JOptionPane.showMessageDialog(this, "Số lớp cho mỗi môn là số nguyên dương và không lớn hơn 3!");
            return false;
        }
        int sumtiet = 0;
        for (QuanLy i : list) {
            if (i.getMagv() == magv) {
                for (MonHoc j : listmh) {
                    sumtiet += j.getTongsotiet();
                }
            }
            if (sumtiet > 200) {
                JOptionPane.showMessageDialog(this, "So tiet nho hon 200!");
                return false;
            }
        }
        return true;
    }

    private GiangVien getgvbyma(int magv) {
        for (GiangVien i : listgv) {
            if (i.getMa() == magv) {
                return i;
            }
        }
        return null;
    }

    private MonHoc getmonbyma(int mamon) {
        for (MonHoc i : listmh) {
            if (i.getMa() == mamon) {
                return i;
            }
        }
        return null;
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
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
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

        jLabel1.setText("Ma GV");

        jLabel2.setText("Ma Mon");

        jLabel3.setText("So Lop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, 0, 225, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(333, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btThem)
                .addGap(26, 26, 26)
                .addComponent(btSua)
                .addGap(28, 28, 28)
                .addComponent(btXoa)
                .addGap(30, 30, 30)
                .addComponent(btLuu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btLuu))
                .addGap(0, 86, Short.MAX_VALUE))
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
        int magv, mamon;
        String tengv, tenmon;
        int solop;
        magv = Integer.parseInt(jComboBox2.getSelectedItem().toString());
        mamon = Integer.parseInt(jComboBox3.getSelectedItem().toString());
        tengv = getgvbyma(magv).getTen();
        tenmon = getmonbyma(mamon).getTen();
        
        try {
            solop = Integer.parseInt(jTextField4.getText());
            if (isTonTai(magv, mamon) && isOK(solop, magv)) {
                QuanLy tmp = new QuanLy(magv, tengv, mamon, tenmon, solop);
                list.add(tmp);
                tm.addRow(tmp.toObjects());
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Kiem tra lai so!");
        } 

    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0 || row > jTable1.getRowCount()) {
            JOptionPane.showMessageDialog(this, "Chon mot dong!");

        } else {
            int magv, mamon;
            String tengv, tenmon;
            int solop;
            try {
                magv = Integer.parseInt(jComboBox2.getSelectedItem().toString());
                mamon = Integer.parseInt(jComboBox3.getSelectedItem().toString());
                tengv = getgvbyma(magv).getTen();
                tenmon = getmonbyma(mamon).getTen();
                solop = Integer.parseInt(jTextField4.getText());
                if (isTonTai(magv, mamon) && isOK(solop, magv)) {
                    QuanLy tmp = new QuanLy(magv, tengv, mamon, tenmon, solop);
                    list.set(row, tmp);
                    tm.removeRow(row);
                    tm.insertRow(row, tmp.toObjects());
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Kiem tra lai so!");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}