/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ObjectIO;
import controller.SoLuong;
import controller.TrongException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sach;

/**
 *
 * @author NamNguyen
 */
public class FormSach extends javax.swing.JPanel {

    DefaultTableModel tm;
    private String fsach = "src/controller/sach.txt";
    private boolean them, sua;
    List<Sach> list =new ArrayList<>();

    /**
     * Creates new form Sach
     */
    public FormSach() {
        initComponents();
        setSize(950, 900);
        String[] cols = {"Ma sach", "Ten sach", "Tac gia", "Chuyen nganh", "So luong"};
        tm = new DefaultTableModel(cols, 0);
        jTable1.setModel(tm);
        buttonStatus(false);
        loadData();
        for(Sach i:list)
                tm.addRow(i.toObject());
    }

    private void buttonStatus(boolean st) {
        btCapNhat.setEnabled(st);
        btBoQua.setEnabled(st);
    }

    private void resetText() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jComboBox1.setSelectedIndex(0);

    }

    private void loadData() {
        File f=new File(fsach);
        if(f.exists())
            list = ObjectIO.docra(fsach);
        else
            list=new ArrayList<>();
    }

    private void removeRow(int i) {
        tm.removeRow(i);
        list.remove(i);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btCapNhat = new javax.swing.JButton();
        btBoQua = new javax.swing.JButton();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        btHienThi = new javax.swing.JButton();

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

        jLabel1.setText("Ma sach");

        jLabel2.setText("Ten sach");

        jLabel3.setText("Tac gia");

        jLabel4.setText("Chuyen nganh");

        jLabel5.setText("So luong");

        jTextField1.setEditable(false);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khoa học tự nhiên", "Văn học – Nghệ thuật", "Điện tử", "Viễn thông", "Công nghệ thông tin" }));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField3)
                        .addComponent(jTextField2)
                        .addComponent(jTextField1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextField5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCapNhat)
                        .addGap(44, 44, 44)
                        .addComponent(btBoQua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCapNhat)
                    .addComponent(btBoQua))
                .addContainerGap(143, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(0, 144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:

        int row_idx = jTable1.getSelectedRow();
        if (row_idx < 0 || row_idx >= list.size()) {
            JOptionPane.showMessageDialog(this, "Chon mot dong tren bang");
            btSua.setEnabled(true);
        } else {
            sua = true;
            btSua.setEnabled(false);
            buttonStatus(true);
            jTextField2.requestFocus();
        }
//        jTextField1.setText(fsach);
    }//GEN-LAST:event_btSuaActionPerformed
    private void addContent(int i) {
        //ten, tacgia, jComboBox1.getSelectedItem().toString(),Sach.getSma(), sl
        jTextField1.setText(list.get(i).getMa() + "");
        jTextField2.setText(list.get(i).getTen());
        jTextField3.setText(list.get(i).getTacgia());
        jComboBox1.setSelectedItem(list.get(i).getCn());
        jTextField5.setText(list.get(i).getSl() + "");
    }
    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        int row_idx = jTable1.getSelectedRow();
        if (row_idx < 0 || row_idx >= list.size()) {
            JOptionPane.showMessageDialog(this, "Chon mot dong tren bang");
        } else {
            removeRow(row_idx);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        them = true;
        btThem.setEnabled(false);
        buttonStatus(true);
        if (list != null && list.size() > 0) {
            Sach.setSma(list.get(list.size() - 1).getMa() + 1);
        }
        jTextField1.setText(Sach.getSma() + "");
        jTextField2.requestFocus();
    }//GEN-LAST:event_btThemActionPerformed

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        // TODO add your handling code here:
        if (them) {
            String ten, tacgia;
            int sl;
            boolean passEx = true;
            try {
                ten = jTextField2.getText();
                tacgia = jTextField3.getText();
                sl = Integer.parseInt(jTextField5.getText());
                if (ten.isEmpty() || tacgia.isEmpty()) {
                    throw new TrongException();
                }
                if (sl < 0) {
                    throw new SoLuong();
                }
                Sach tmp = new Sach(ten, tacgia, jComboBox1.getSelectedItem().toString(), Sach.getSma(), sl);
                list.add(tmp);
                tm.addRow(tmp.toObject());
                resetText();
            } catch (TrongException e) {
                passEx = false;
                JOptionPane.showMessageDialog(this, "Khong de trong");
            } catch (NumberFormatException e) {
                passEx = false;
                JOptionPane.showMessageDialog(this, "Nhap vao mot so");
            } catch (SoLuong e) {
                passEx = false;
                JOptionPane.showMessageDialog(this, "Nhap so lon hon 0");
            }
            if(passEx){
                them = false;
                btThem.setEnabled(true);
            }
            
        }
        if (sua) {
            String ten, tacgia;
            int sl,ma;
            boolean passEx = true;
            int row_idx=jTable1.getSelectedRow();
            ma=Integer.parseInt(jTextField1.getText());
            try {
                ten = jTextField2.getText();
                tacgia = jTextField3.getText();
                sl = Integer.parseInt(jTextField5.getText());
                if (ten.isEmpty() || tacgia.isEmpty()) {
                    throw new TrongException();
                }
                if (sl < 0) {
                    throw new SoLuong();
                }
                Sach tmp = new Sach(ten, tacgia, jComboBox1.getSelectedItem().toString(), ma, sl);
                list.set(row_idx, tmp);
                tm.removeRow(row_idx);
                tm.insertRow(row_idx, tmp.toObject());
                resetText();
            } catch (TrongException e) {
                JOptionPane.showMessageDialog(this, "Khong de trong");
                passEx = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Nhap vao mot so");
                passEx = false;
            } catch (SoLuong e) {
                JOptionPane.showMessageDialog(this, "Nhap so lon hon 0");
                passEx = false;
            }
            if(passEx){
                sua = false;
                btSua.setEnabled(true);
            }
            
        }
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void btBoQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBoQuaActionPerformed
        // TODO add your handling code here:
        them=false;
        sua=false;
        jTextField1.setText("");
        btThem.setEnabled(true);
        btSua.setEnabled(true);
        buttonStatus(false);
        resetText();
    }//GEN-LAST:event_btBoQuaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row_idx = jTable1.getSelectedRow();
        if (row_idx < 0 || row_idx >= list.size()){
            JOptionPane.showMessageDialog(this, "Chon mot dong tren bang");
            resetText();
        }
        else {
            addContent(row_idx);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        ObjectIO.ghivao(fsach, list);
    }//GEN-LAST:event_btLuuActionPerformed

    private void btHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHienThiActionPerformed
        // TODO add your handling code here:
        loadData();
        tm.setRowCount(0);
        for(Sach i:list)
                tm.addRow(i.toObject());
    }//GEN-LAST:event_btHienThiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBoQua;
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btHienThi;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
