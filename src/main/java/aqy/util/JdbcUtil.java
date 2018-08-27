package aqy.util;

import java.sql.*;

public class JdbcUtil {
   public static String driver="com.mysql.jdbc.Driver";
   public static String url="jdbc:mysql://localhost:3306/aqy";
   public static String username="root";
   public static String password="13866950037";
   static {
       try {
           Class.forName(driver);
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }
   public static Connection getConn(){
       Connection conn=null;
       try {
           conn= DriverManager.getConnection(url,username,password);
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return conn;
   }
   public static void closeAll(ResultSet re, PreparedStatement pstm,Connection conn){
       if(re!=null){
           try {
               re.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       if(pstm!=null){
           try {
               pstm.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       if (conn!=null){
           try {
               conn.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }
}
