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

                    String query1 = "Select * FROM Oseba";
                    ResultSet rs = st.executeQuery(query1);

                    while (rs.next()) {
                        System.out.println("IdOseba:\t"
                                + rs.getInt("idoseba"));
                        System.out.println("Priimek:\t" + rs.getString("priimek"));
                        System.out.println("stevilka:\t" + rs.getString("stevilka"));
                        System.out.println("posta:\t" + rs.getInt("posta"));
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
