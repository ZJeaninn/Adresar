/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adresar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author zanina
 */
public class Adresar {
// max +1
    // triger after insert
    // 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String data = "jdbc:derby://localhost:1527/Oseba";
        try (
                Connection conn = DriverManager.getConnection(
                        data);
                Statement st = conn.createStatement()) {

                    Class.forName("org.apache.derby.jdbc.ClientDriver");

                    ResultSet rec = st.executeQuery(
                            "select IdOseba, Priimek, Kraj, Stevilka "
                            + "from APP.oseba "
                            + "order by IdOseba");
                    while (rec.next()) {
                        System.out.println("IdOseba:\t"
                                + rec.getString(1));
                        System.out.println("Priimek:\t" + rec.getString(2));
                        System.out.println("Kraj:\t" + rec.getString(3));
                        System.out.println("Stevilka:\t" + rec.getInt(4));
                        System.out.println();
                    }
                    st.close();
                } catch (SQLException s) {
                    System.out.println("SQL Error: " + s.toString() + " "
                            + s.getErrorCode() + " " + s.getSQLState());
                } catch (Exception e) {
                    System.out.println("Error: " + e.toString()
                            + e.getMessage());
                }
    }
}
