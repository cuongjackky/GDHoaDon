
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DBUpdater {

    String conString = "jdbc:sqlserver://localhost:1433;databaseName=QLSP";
    String username = "sa";
    String password = "123456";

    //INSERT INTO DB
    public Boolean AddNewInvoiceDetail(String MaHD,String MaSP,int SoLuong, double GiaGiam){
        String sql = "Insert INTO CT_HOADON VALUES(?,?,?,0,?,0)";
        PreparedStatement statement;
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            statement.setString(1,MaHD);
            statement.setString(2,MaSP);
            statement.setInt(3,SoLuong);
            statement.setDouble(4,GiaGiam);
            
            statement.execute();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public Boolean AddNewInvoice(String MaHD, String MaKH, String ngayLap) {
        String sql = "Insert INTO HOADON VALUES(?,?,?,0)";
        PreparedStatement statement;
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            statement.setString(1,MaHD);
            statement.setString(2,MaKH);
            statement.setString(3,ngayLap);
            
            statement.execute();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public Boolean AddNewCustomer(String maKH, String ho, String ten,String ngaySinh,String soNha,String duong,String phuong,String quan,String thanhPho,String sdt) {
        
        String sql = "INSERT INTO KHACHHANG VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement;

        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            statement.setString(1,maKH);
            statement.setString(2,ho);
            statement.setString(3,ten);
            statement.setString(4,ngaySinh);
            statement.setString(5,soNha);
            statement.setString(6,duong);
            statement.setString(7,phuong);
            statement.setString(8,quan);
            statement.setString(9,thanhPho);
            statement.setString(10,sdt);
            
            statement.execute();
            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    //RETRIEVE DATA
    @SuppressWarnings("deprecation")
    public ResultSet GetInvoiceList() {
        
        String sql = "SELECT * FROM HOADON ORDER BY NGAYLAP DESC";
        PreparedStatement statement;
        try {
        
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

      

    }
    public ResultSet GetStatsticByMonthAndYear(String month,String year) {
        
        String sql = "SELECT * FROM HOADON WHERE MONTH(NgayLap) = ? AND YEAR(NGAYLAP) = ?";
        PreparedStatement statement;
        try {
        
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            statement.setString(1,month);
            statement.setString(2,year);
            ResultSet rs = statement.executeQuery();
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

      

    }
    public ResultSet getInvoiceDetailByInvoiceId(String InvoiceId) {
        
        String sql = "SELECT * FROM CT_HOADON WHERE MAHD = ?";
        PreparedStatement statement;
        try {
        
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            statement.setString(1,InvoiceId);
            
            ResultSet rs = statement.executeQuery();
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

      

    }

    public String getPriceofID(String ID){
        String sql = "Select * From SanPham WHERE MaSp =?";
        PreparedStatement statement;
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            statement.setString(1,ID);
            ResultSet rs = statement.executeQuery();
            rs.next();
            return rs.getString("GIA");
            
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public ResultSet  getCustomerID(){
        String sql = "Select * FROM KhachHang";
        PreparedStatement statement;
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            return rs;
     
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public ResultSet  getSuppliesID(){
        String sql = "Select * FROM SanPham";
        PreparedStatement statement;
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            return rs;
     
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public String  getSuppliesCount(String MaSP){
        String sql = "Select * FROM SanPham Where MaSp =?";
        PreparedStatement statement;
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            statement.setString(1,MaSP);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                return rs.getString("SOLUONG");
            }
     
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public int CountNumberOfInvoice(){
        /*
        Hàm này dùng để đếm số lượng đơn hàng
        */
        String sql = "SELECT COUNT(*) FROM HOADON";
        try {
        	      	
        	Connection con=DriverManager.getConnection(conString, username, password);

                Statement s = con.createStatement();

                ResultSet rs = s.executeQuery(sql);
                
                rs.next();
                int ans = 0;
                ans = Integer.parseInt(rs.getString(1));
                return ans;
                
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    public int LaySoLuongTonSanPham(String MaSP){
        /*
        Hàm này dùng để đếm số lượng đơn hàng
        */
        PreparedStatement statement;
        String sql = "SELECT SOLUONGTON FROM SANPHAM WHERE MASP = ?";
        try {
        	      	
        	Connection con=DriverManager.getConnection(conString, username, password);
                statement= con.prepareStatement(sql);
                statement.setString(1, MaSP);
                ResultSet rs = statement.executeQuery();
                
                rs.next();
                int ans = 0;
                ans = Integer.parseInt(rs.getString(1));
                return ans;
                
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    public int CountNumberOfCustomer(){
        /*
        Hàm này dùng để đếm số lượng đơn hàng
        */
        String sql = "SELECT COUNT(*) FROM KHACHHANG";
        try {
        	      	
        	Connection con=DriverManager.getConnection(conString, username, password);

                Statement s = con.createStatement();

                ResultSet rs = s.executeQuery(sql);
                
                rs.next();
                int ans = 0;
                ans = Integer.parseInt(rs.getString(1));
                return ans;
                
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    public Boolean checkUniqueCustomerId(String idKH){
        String sql = "Select Count(*) AS DEM FROM KHACHHANG WHERE MaKH =?";
        PreparedStatement statement;
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            statement.setString(1,idKH);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                return false;
            }
            return true;
     
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public Boolean checkUniqueInvoiceId(String MaDH){
        String sql = "Select Count(*) AS DEM FROM HOADON WHERE MAHD=?";
        PreparedStatement statement;
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            statement.setString(1,MaDH);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                return false;
            }
            return true;
     
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public Boolean RemoveAnInvoice(String idHD)
    {
        
        String removeInvoiceDetail = "Delete FROM CT_HOADON WHERE MaHD= ?";
        String removeInvoice="DELETE FROM HOADON WHERE MaHD = ?";
        PreparedStatement statement;
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(removeInvoiceDetail);
            statement.setString(1,idHD);
            statement.execute();
            statement= con.prepareStatement(removeInvoice);
            statement.setString(1, idHD);
            statement.execute();
            return true;
     
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public Boolean updateAnInvoice (String HD, String KH, String ngayLap) {
        
        String sql = "UPDATE  HOADON SET MaKH = ? ,NgayLap =?  WHERE MaHD = ?";
        PreparedStatement statement;
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            statement.setString(1,KH);
            statement.setString(2,ngayLap);
            statement.setString(3,HD);
            statement.execute();
            
            return true;
     
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public Boolean updateAInvoiceDetail (String MaSP, String SoLuong, String GiaGiam,String HD) {
        
        String sql = "UPDATE  CT_HOADON SET MaSP = ? ,SoLuong =?,GiaGiam =?  WHERE MaHD = ?";
        PreparedStatement statement;
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            statement = con.prepareStatement(sql);
            statement.setString(1,MaSP);
            statement.setString(2,SoLuong);
            statement.setString(3,GiaGiam);
            statement.setString(4,HD);
            statement.execute();
            
            return true;
     
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

}