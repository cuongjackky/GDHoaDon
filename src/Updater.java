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
import javax.swing.JButton;

public class Updater extends javax.swing.JFrame {

    public Updater() {
        initComponents();
        
        
    }

    private void retrieve()
    {
     DefaultTableModel dm = new DBUpdater().getData();
     
        jTable1.setModel(dm);
    }
    

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBackground(Color.WHITE);
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        hDTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        ngayLapTxt = new javax.swing.JTextField();
        kHTxt = new javax.swing.JTextField();
        xuatHoaDonBtn = new javax.swing.JButton();
       
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(Color.WHITE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        retrieve();

        jLabel1.setText("Ma HD");

        jLabel2.setText("Ma KH");

        jLabel3.setText("Ngay Lap");

        addBtn.setText("Them");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        xuatHoaDonBtn.setText("Xuat Thong Ke");
        xuatHoaDonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xuatHoaDonBtnActionPerformed(evt);
            }
        });
        
        JLabel lblNewLabel_1 = new JLabel("Tong Tien");
        
        tongTienTxt = new JTextField();
        tongTienTxt.setColumns(10);
        
        JButton updateBtn = new JButton("Sua");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        
        JButton deleteBtn = new JButton("Xoa");
        
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(lblNewLabel_1)
        						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jLabel1)
        							.addComponent(jLabel3)
        							.addComponent(jLabel2)))
        					.addGap(18)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(hDTxt, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        						.addComponent(kHTxt, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        						.addComponent(ngayLapTxt, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        						.addComponent(tongTienTxt))
        					.addGap(53))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(25)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(deleteBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(addBtn, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        					.addGap(6)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(xuatHoaDonBtn, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        						.addComponent(updateBtn, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
        					.addGap(8)))
        			.addGap(39))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(67, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(hDTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1))
        			.addGap(27)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(kHTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(32)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel3)
        				.addComponent(ngayLapTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(27)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tongTienTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel_1))
        			.addGap(33)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(addBtn)
        				.addComponent(updateBtn))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(xuatHoaDonBtn)
        				.addComponent(deleteBtn))
        			.addGap(90))
        		.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        			.addGap(42)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);
        
        JLabel lblNewLabel = new JLabel("Danh Sach Hoa Don");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(289)
        					.addComponent(lblNewLabel))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblNewLabel)
        			.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(5))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        retrieve();
        pack();
    }

    //ADD OR SAVE
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if (new DBUpdater().add(hDTxt.getText(), kHTxt.getText(), ngayLapTxt.getText(),tongTienTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Successfully Inserted");

            //CLEAR TXT
            hDTxt.setText("");
            kHTxt.setText("");
            ngayLapTxt.setText("");
            tongTienTxt.setText("");

            retrieve();
        } else {
            JOptionPane.showMessageDialog(null, "Not Saved");
        }
    }
    
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if (new DBUpdater().update(hDTxt.getText(), kHTxt.getText(), ngayLapTxt.getText(),tongTienTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");

            //CLEAR TXT
            hDTxt.setText("");
            kHTxt.setText("");
            ngayLapTxt.setText("");
            tongTienTxt.setText("");

            retrieve();
        } else {
            JOptionPane.showMessageDialog(null, "Not Saved");
        }
    }
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if (new DBUpdater().delete(hDTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Successfully Deleted");

            //CLEAR TXT
            hDTxt.setText("");
            kHTxt.setText("");
            ngayLapTxt.setText("");
            tongTienTxt.setText("");

            retrieve();
        } else {
            JOptionPane.showMessageDialog(null, "Not Saved");
        }
    }
    //SET SELECTED VALUE TO TEXTFIELDS
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
    	String idHD = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String idKH = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String ngayLap  = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tongTien  = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        hDTxt.setText(idHD);
        kHTxt.setText(idKH);
        ngayLapTxt.setText(ngayLap);
        tongTienTxt.setText(tongTien);

    }

    //UPDATE
    private void xuatHoaDonBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	new Updater_1().setVisible(true);
    	
    	
        
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {

            }
        });
    }
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField hDTxt;
    private javax.swing.JTextField kHTxt;
    private javax.swing.JTextField ngayLapTxt;
    private javax.swing.JButton xuatHoaDonBtn;
    private JTextField tongTienTxt;
}