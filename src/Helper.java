
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 84978
 */
public class Helper {
    public Helper(){
        
    }
    public String generateInvoiceId(){
        String id ="HD";
        Random r = new Random();
        int n = new DBUpdater().CountNumberOfInvoice();
        if(n != -1){
            n++;
            String temp = Integer.toString(n);
            for(int i =0;i<=6-temp.length();i++){
                id+="0";
            }
            id+=temp;
            for(int i =0;i<4;i++){
                int num = r.nextInt(26);
                char c = (char) ('A'+num);
                id+=c;
            }
        }
        
        
        return id;
               
    }
    public String generateUniqueInvoiceId(){
        String id = generateInvoiceId();
        while(new DBUpdater().checkUniqueInvoiceId(id)){
            id =generateInvoiceId();
        }
        return id;
        
    }
    public String generateCustomerId(){ // Tạo một MaKH ngẫu nhiên
        String id ="KH";
        Random r = new Random();
        int n = new DBUpdater().CountNumberOfCustomer();
        if(n != -1){
            n++;
            String temp = Integer.toString(n);
            for(int i =0;i<=6-temp.length();i++){
                id+="0";
            }
            id+=temp;
            for(int i =0;i<4;i++){
                int num = r.nextInt(26);
                char c = (char) ('A'+num);
                id+=c;
            }
        }
        
        
        return id;
               
    }
    public String generateUniqueCustomerId(){ // Tạo một MaKH ngẫu nhiên không bị trùng
        String id = generateCustomerId();
        while(new DBUpdater().checkUniqueCustomerId(id)){ // Khi bị trùng thì tạo mới một cái khác
            id =generateCustomerId();
        }
        return id;
    }
}
