/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorycontrolgui;
import java.sql.*;
/**
 *
 * @author Acer
 */
public class InventoryControlGUI {
    private static final String USERNAME = "Blanc";
    private static final String PASSWORD = "shiro";
    private static final String url =
            "jdbc:mysql://localhost:3306/Inventory";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
            System.out.println("Connection Successful!!!");
            Statement st = (Statement) connection.createStatement();
        }catch(SQLException e){
            System.err.println(e);
        }
        
        
        new Login().setVisible(true);
    }
    
}
