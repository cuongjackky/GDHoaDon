
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DBUpdater {

    String conString = "jdbc:sqlserver://localhost:1433;databaseName=QLSP";
    String username = "sa";
    String password = "123456";

    //INSERT INTO DB
    public Boolean add(String HD, String KH, String ngayLap,String tongTien) {
        //SQL STATEMENT
        String sql = "INSERT INTO HOADON VALUES('" + HD + "','" + KH + "','" + ngayLap + "','"+tongTien+"')";

        try {
            //GET COONECTION
        	
        	
        	
        	Connection con = DriverManager.getConnection(conString, username, password);
            

            // PREPARED STMT
        	Statement s = con.createStatement();

            s.execute(sql);

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    //RETRIEVE DATA
    @SuppressWarnings("deprecation")
	public DefaultTableModel getData() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Ma Hoa Don");
        dm.addColumn("Ma Khach Hang");
        dm.addColumn("Ngay Lap");
        dm.addColumn("Tong Tien");

        //SQL STATEMENT
        String sql = "SELECT * FROM HOADON";

        try {
        
            Connection con = DriverManager.getConnection(conString, username, password);
            
           

            //PREPARED STMT
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                String idHD = rs.getString(1);
                String idKH = rs.getString(2);
                String ngayLap = rs.getString(3);
                String TongTien = rs.getString(4);

                dm.addRow(new String[]{idHD, idKH, ngayLap, TongTien});
            }
            

            return dm;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

      

    }

    
    public DefaultTableModel xuatThongKe() {
        
    	
    	
    	DefaultTableModel dm = new DefaultTableModel();
    	dm.addColumn("Thang");
    	dm.addColumn("Nam");
    	dm.addColumn("Tong Tien");
    	
        String sql = "select Month(NgayLap) ,Year(NgayLap), sum(tongTien)\r\n"
        		+ "from HOADON\r\n"
        		+ "group by Month(NgayLap),Year(NgayLap)\r\n"
        		+ "order by Year(NgayLap),Month(NgayLap) ASC";

        try {
            //GET COONECTION
            Connection con = DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s = con.createStatement();

            //EXECUTE
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                //GET VALUES
                String thang = rs.getString(1);
                String  nam = rs.getString(2);
                String tongTien = rs.getString(3);
                
               

                dm.addRow(new String[]{thang,nam, tongTien});
            }
            

            return dm;

            

        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        return null;
    }
    
public DefaultTableModel xuatTheoThang(String month,String year) {
        
    	
    	
    	DefaultTableModel dm = new DefaultTableModel();
    	dm.addColumn("STT");
    	dm.addColumn("Ma Hoa Don");
    	dm.addColumn("Ma Khach Hang");
    	dm.addColumn("Ngay Lap");
    	dm.addColumn("Tong Tien");
    	
        String sql = "SELECT * FROM HOADON WHERE MONTH(NgayLap)="+month+" AND YEAR(NgayLap) = "+year;

        try {
            //GET COONECTION
            Connection con = DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s = con.createStatement();

            //EXECUTE
            ResultSet rs = s.executeQuery(sql);
            int i =1;
            double sum =0;
            while (rs.next()) {
                //GET VALUES
                String HD = rs.getString(1);
                String  KH = rs.getString(2);
                String ngayLap = rs.getString(3);
                String tongTien = rs.getString(4);
                sum +=Double.parseDouble(tongTien);
               

                dm.addRow(new String[]{Integer.toString(i),HD,KH,ngayLap, tongTien});
                i++;
            }
            
            String tongCong = "Tong Cong ";
            dm.addRow(new String[] {"","","",tongCong,Double.toString(sum)});
            return dm;

            

        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        return null;
    }


    //DELETE DATA
    public Boolean delete(String id)
    {
        //SQL STMT
        String sql="DELETE FROM HOADON WHERE MaHD ='"+id+"'";

        try
        {
            //GET CONNECTION
            Connection con=DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s = con.createStatement();

            //EXECUTE
            s.execute(sql);

            return true;

        }catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    public Boolean update(String HD, String KH, String ngayLap,String tongTien) {
        //SQL STATEMENT
        String sql = "UPDATE  HOADON SET MaKH = '" + KH + "',NgayLap ='"+ngayLap+"',TongTien = '"+tongTien+"'WHERE MaHD ='"+HD+"'";

        try {
            //GET COONECTION
        	
        	
        	
        	Connection con = DriverManager.getConnection(conString, username, password);
            

            // PREPARED STMT
        	Statement s = con.createStatement();

            s.execute(sql);

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

}