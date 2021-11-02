
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Point;

public class LoginFrame extends javax.swing.JFrame {

	private String thang;
	private String nam;
	private JPasswordField passwordField;
	private JTextField textField;
    public LoginFrame() {
    	setResizable(false);
    	setLocation(new Point(500, 250));
    	
    	setTitle("Login");
        initComponents();
        
        
    }

    

    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
      
      
        
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.WHITE);
        
        JLabel lblNewLabel_1 = new JLabel("Tai khoan");
        
        JLabel lblNewLabel_2 = new JLabel("Mat khau");
        
        passwordField = new JPasswordField();
        
        textField = new JTextField();
        textField.setColumns(10);
        
        JButton LoginBtn = new JButton("Dang Nhap");
        GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
        gl_jPanel2.setHorizontalGroup(
        	gl_jPanel2.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, gl_jPanel2.createSequentialGroup()
        			.addContainerGap(116, Short.MAX_VALUE)
        			.addComponent(LoginBtn)
        			.addGap(95))
        		.addGroup(gl_jPanel2.createSequentialGroup()
        			.addGap(64)
        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel_1)
        				.addComponent(lblNewLabel_2))
        			.addGap(18)
        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.TRAILING)
        				.addComponent(passwordField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(48, Short.MAX_VALUE))
        );
        gl_jPanel2.setVerticalGroup(
        	gl_jPanel2.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanel2.createSequentialGroup()
        			.addGap(49)
        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblNewLabel_1)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblNewLabel_2)
        				.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(34)
        			.addComponent(LoginBtn)
        			.addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2.setLayout(gl_jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);
      
        pack();
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
    }
    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String user =  textField.getText();
        @SuppressWarnings("deprecation")
		String pass = passwordField.getText();
        if (user.equalsIgnoreCase("admin")&&pass.equalsIgnoreCase("123456")) {
        	JOptionPane.showMessageDialog(this, "Dang nhap thanh cong!");
        	setVisible(false);
        	new Updater().setVisible(true);
        }
        else {
        	JOptionPane.showMessageDialog(this, "Sai tai khoan hoac mat khau !");
        }
        
    }
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {

            }
        });
    }
}