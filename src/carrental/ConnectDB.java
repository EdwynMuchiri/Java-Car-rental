/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author eddmu
 */
public class ConnectDB {
    public static Connection ConnecrDb(){
        try {
               Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","acs");
                return con;
            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, x);//outer try catch closed
    }
    return null;
    }
}
