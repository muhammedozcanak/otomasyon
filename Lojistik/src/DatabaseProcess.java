import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseProcess {
    
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    public ArrayList<Personel> personelgetir(){
        
        ArrayList<Personel> cikti = new ArrayList<Personel>();
        
        try {
            statement = connection.createStatement();
            String sorgu = "Select *From personeller";
            
            ResultSet rs = statement.executeQuery(sorgu); /*sorgudan dönen değeri resultset e aktardık.
                                                           ve statement üzerinden sorgumuzu çalıştırdık*/
            
            while(rs.next()){
                
                int  id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("mail");
                String tc = rs.getString("tc");
                
                cikti.add(new Personel(id, ad, soyad, email, tc));
            }
            
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseProcess.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
         
    }
    
    public void personelSil(int id){
        
        String sorgu_silme = "Delete from personeller where id = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu_silme);
            
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
    public void personelleriGuncelle(int id, String ad, String soyad, String mail, String tc){
        
        String sorgu_guncelleme = "Update personeller set ad = ? ,soyad = ? , mail = ? , tc = ? where id = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu_guncelleme);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, mail);
            preparedStatement.setString(4, tc);
            preparedStatement.setInt(5, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void personelEkle(String Ad, String Soyad, String Mail, String Tc){
        
        String sorgu = "Insert Into personeller (ad, soyad, mail, tc) VALUES (?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, Ad);
            preparedStatement.setString(2, Soyad);
            preparedStatement.setString(3, Mail);
            preparedStatement.setString(4, Tc);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // buraya kullanıcı adı şifre göndereceğiz true ya da false
    public boolean giris_yapildimi(String kullanici_adi, String sifre){
        
        String sorgu = "Select *From admin where User = ? and Pass = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi); //1. ? yerine kullanıcı adı
            preparedStatement.setString(2, sifre);   //2. ? yerine sifre gönderdik
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next(); //True ya da False Dönecek
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseProcess.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public DatabaseProcess(){

        String url = "jdbc:mysql://" + Database.localhost + ":" + Database.port_no + "/" + Database.db_name + "?useUnicode=true&characterEncoding=utf8";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException ex){
            System.out.println("Driver Bulunamadı");
        }

        try {

            connection = DriverManager.getConnection(url, Database.user_name, Database.pass);
        }
        catch (SQLException ex){
            System.out.println("Bağlantı Yapılamadı");
        }
    }
    public static void main(String args[]){
        DatabaseProcess databaseProcess = new DatabaseProcess();

    }
    
    void personelGuncelle(String id, String ad, String soyad, String mail, String tc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void personelGuncelle(int id, String ad, String soyad, String mail, String tc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
