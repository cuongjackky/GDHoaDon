
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 84978
 */
public class MainFrame extends javax.swing.JFrame {
    private TableRowSorter<TableModel> rowSorter;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        LoadInvoiceTable();
        rowSorter= new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(rowSorter);
        this.setLocationRelativeTo(null);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        xtkBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        DetailBtn = new javax.swing.JButton();
        jtfFilter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(330, 110));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 34, 46));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DANH SÁCH HOÁ ĐƠN");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã hoá đơn", "Mã khách hàng", "Ngày lập", "Tổng tiền"
            }
        ));
        jTable1.setRowHeight(24);
        jScrollPane1.setViewportView(jTable1);

        xtkBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xtkBtn.setText("Xuất Thống Kê");
        xtkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtkBtnActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBtn.setText("Thêm Hoá Đơn");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteBtn.setText("Xoá Hoá Đơn");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        DetailBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBtn.setText("Xem chi tiết");
        DetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBtnActionPerformed(evt);
            }
        });

        jtfFilter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfFilter.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(addBtn)
                .addGap(87, 87, 87)
                .addComponent(DetailBtn)
                .addGap(87, 87, 87)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(xtkBtn)
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58)
                        .addComponent(jtfFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(deleteBtn)
                    .addComponent(xtkBtn)
                    .addComponent(DetailBtn))
                .addGap(71, 71, 71))
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        AddNewOrder invoice = new AddNewOrder();
        JPanel jp = new JPanel();
        jp.setPreferredSize(new java.awt.Dimension(500, 40));
        jp.setBackground(new java.awt.Color(31,34,46));
        JButton OKBtn = new JButton("OK");
        OKBtn.setFont(new Font("Tahoma", Font.BOLD,14));
        OKBtn.setPreferredSize(new java.awt.Dimension(97, 25));
        JButton CacelBtn = new JButton("Huỷ");
        CacelBtn.setFont(new Font("Tahoma", Font.BOLD,14));
        CacelBtn.setPreferredSize(new java.awt.Dimension(97, 25));
        
        jp.add(OKBtn);
        jp.add(CacelBtn);
        
        JDialog dialog = new JDialog();
        
        OKBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Boolean flag = invoice.AddNewInvoice();
                if(flag== true){
                    LoadInvoiceTable();
                    rowSorter= new TableRowSorter<>(jTable1.getModel());
                    jTable1.setRowSorter(rowSorter);
                    dialog.dispose();
                }
                
            }
        });
        CacelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                dialog.dispose();
            }
        });
        dialog.getContentPane().setLayout(new BorderLayout());
        dialog.getContentPane( ).add(invoice, BorderLayout.CENTER);
        dialog.getContentPane( ).add(jp, BorderLayout.SOUTH);
        dialog.setModal(true);
        dialog.pack();
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setLocationRelativeTo(null);

        dialog.setVisible(true);
        dialog.addWindowListener(new WindowAdapter()
            {
                public void windowClosing (WindowEvent e)
                {
                    super.windowClosing(e);
                }
            });

        
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        String idHD = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        if( (new DBUpdater().RemoveAnInvoice(idHD))){
            JOptionPane.showMessageDialog(null, "Xoá thành công");
            LoadInvoiceTable();
            rowSorter= new TableRowSorter<>(jTable1.getModel());
                    jTable1.setRowSorter(rowSorter);
            
        }
        
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void xtkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtkBtnActionPerformed
        XuatThongKe statstic = new XuatThongKe();
        JPanel jp = new JPanel();
        jp.setPreferredSize(new java.awt.Dimension(500, 40));
        jp.setBackground(new java.awt.Color(31,34,46));
        JButton OKBtn = new JButton("Quay lại");
        OKBtn.setFont(new Font("Tahoma", Font.BOLD,14));
        OKBtn.setPreferredSize(new java.awt.Dimension(97, 25));
        
        
        jp.add(OKBtn);
        
        
        JDialog dialog = new JDialog();
        
        OKBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                    dialog.dispose();
                
                
            }
        });
        
        dialog.getContentPane().setLayout(new BorderLayout());
        dialog.getContentPane( ).add(statstic, BorderLayout.CENTER);
        dialog.getContentPane( ).add(jp, BorderLayout.SOUTH);
        dialog.setModal(true);
        dialog.pack();
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setLocationRelativeTo(null);

        dialog.setVisible(true);
        dialog.addWindowListener(new WindowAdapter()
            {
                public void windowClosing (WindowEvent e)
                {
                    super.windowClosing(e);
                }
            });
    }//GEN-LAST:event_xtkBtnActionPerformed

    private void DetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBtnActionPerformed
        if(jTable1.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Phải chọn 1 đơn hàng");
            return;
        }
        String MaHD = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        InvoiceDetails id = new InvoiceDetails(MaHD);
        JPanel jp = new JPanel();
        jp.setPreferredSize(new java.awt.Dimension(500, 40));
        jp.setBackground(new java.awt.Color(31,34,46));
        JButton OKBtn = new JButton("OK");
        OKBtn.setFont(new Font("Tahoma", Font.BOLD,14));
        OKBtn.setPreferredSize(new java.awt.Dimension(97, 25));
        
        
        jp.add(OKBtn);
        
        
        JDialog dialog = new JDialog();
        dialog.setTitle("Chi tiết hoá đơn");
        
        OKBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                    dialog.dispose();
                
                
            }
        });
        
        dialog.getContentPane().setLayout(new BorderLayout());
        dialog.getContentPane( ).add(id, BorderLayout.CENTER);
        dialog.getContentPane( ).add(jp, BorderLayout.SOUTH);
        dialog.setModal(true);
        dialog.pack();
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setLocationRelativeTo(null);

        dialog.setVisible(true);
        dialog.addWindowListener(new WindowAdapter()
            {
                public void windowClosing (WindowEvent e)
                {
                    super.windowClosing(e);
                }
            });
    }//GEN-LAST:event_DetailBtnActionPerformed

        public void LoadInvoiceTable(){
        
        DefaultTableModel dm = new  DefaultTableModel();
        dm.addColumn("Mã hoá đơn"); 
        dm.addColumn("Mã khách hàng"); 
        dm.addColumn("Ngày lập");
        dm.addColumn("Tổng tiền");
        
        
        try{
            ResultSet rs  = new DBUpdater().GetInvoiceList();
            while (rs.next()){
                String MaHD = rs.getString(1); // lấy cột thứ 1.
                String MaKH = rs.getString(2);
                String NgayLap = rs.getString(3);
                String TongTien = rs.getString(4);
                
                
                dm.addRow(new String[]{MaHD, MaKH, NgayLap,TongTien});
            }
            jTable1.setModel(dm);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DetailBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfFilter;
    private javax.swing.JButton xtkBtn;
    // End of variables declaration//GEN-END:variables
}
