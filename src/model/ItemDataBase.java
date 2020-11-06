/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author Konstantinos
 */
public class ItemDataBase {

    String URL = "jdbc:mysql://localhost:3306/mydb?"
            + "useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT ";
    
    

        
        
    
    
    
    public boolean addItem(Item item)throws ClassNotFoundException{
        
        String insert = "INSERT INTO `mydb`.`item` (`Barcode`, `Name`, `Colour`, `Description`) VALUES ( '" 
                +item.getBarcode()+"', '"+item.getName()+"', '"+item.getColour()+"', '"+item.getDescription()+"')";
        
        String select = "SELECT Barcode FROM `mydb`.`item` WHERE Barcode = '"+ item.getBarcode()+"'";
        Class.forName("com.mysql.jdbc.Driver");
        
        try {
            
            Connection conn = DriverManager.getConnection(URL,"root","kostaskostas1999");
            Statement stmt = conn.createStatement();
            
            ResultSet res = stmt.executeQuery(select);
            
            if(res.next()){
                return false;
            }
            else{
                stmt.executeUpdate(insert);
                return true;
            }
            
            
            
        } catch (SQLException e) {

            e.printStackTrace(System.err);
        }
        
        return false;
    }
}
