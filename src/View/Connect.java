/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Maid
 */
public class Connect {
    public Connection getConnection(){
      Connection conn =null;
      try{
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=sa;database=QLPhongMach");
          if(conn != null){
              System.out.println("Ket noi thanh cong");
          }
      }catch(Exception ex){
          System.out.println(ex.toString());
      }
      return conn;
    }
    
}
