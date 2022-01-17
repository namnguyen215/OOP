
package gui1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Mine extends JFrame implements ActionListener,DocumentListener{
    private JLabel lbl1,lbl2,lbl3;
    private JTextField txt1;
    private JPasswordField txt2;
    private JButton bt1,bt2;
    public Mine(){
        initGUI();
    }
    private void initGUI(){
        setTitle("Steam Login");
        setSize(800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(null);
        lbl1=new JLabel("Account name");
        lbl2=new JLabel("Password");
        lbl1.setBounds(50, 100, 100, 20);
        lbl2.setBounds(50, 150, 100, 20);
        add(lbl1);
        add(lbl2);
        txt1=new JTextField();
        txt2=new JPasswordField();
        txt1.setBounds(180, 100, 300, 20);
        txt2.setBounds(180, 150, 300, 20);
        txt1.getDocument().addDocumentListener(this);
        txt2.getDocument().addDocumentListener(this);        
        add(txt1);
        add(txt2);
        lbl3=new JLabel("");
        lbl3.setBounds(180,200,350,20);
        add(lbl3);
        bt1=new JButton("LOGIN");
        bt2=new JButton("Cancel");
        bt1.setBounds(180, 250, 100, 20);
        bt2.setBounds(320, 250, 100, 20);     
        add(bt1);
        add(bt2);
        bt1.addActionListener(this);
        bt2.addActionListener(this);  
        bt1.setEnabled(false);
        
    }
    public static void main(String[] args) {
        Mine m=new Mine();
        m.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1){
            lbl3.setText("Login Sucessfully!");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException i){
                System.out.println(i);
            }
            System.exit(0);
        }
        if(e.getSource()==bt2)
            if(JOptionPane.showConfirmDialog(this, "Exit Login?", "Confirm", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                System.exit(0);
    }
    public void checkTypeIn(){
        String intxt1=txt1.getText();
        String intxt2=String.valueOf(txt2.getPassword());
        String reg="[0-9]{6,8}";
        if(!intxt1.isEmpty() && !intxt2.isEmpty()){
            if(intxt2.matches(reg)){
                bt1.setEnabled(true);
                lbl3.setText("Valid password!");
            }else{
                bt1.setEnabled(false);
                lbl3.setText("Password contains only number, from 6 to 8 character!");
            }
        }else{
            bt1.setEnabled(false);
        }
    }
    @Override
    public void insertUpdate(DocumentEvent e) {
        checkTypeIn();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        checkTypeIn();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
