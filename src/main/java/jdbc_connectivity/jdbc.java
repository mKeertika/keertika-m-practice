package jdbc_connectivity;

import java.sql.*;

public class jdbc {
    public static void main(String[] args) throws SQLException {
        String dburl = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
        String user = "root";
        String password = "Keertika@123";
        Connection connection=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dburl, user, password);
//            String SelectSQL = "Select * FROM employees";
//            Statement stmt = connection.createStatement();
           String SelectSQL = "Select * FROM employees where employeeNumber =?";//slide page 26
            PreparedStatement mystmt = connection.prepareStatement(SelectSQL);
            mystmt.setInt(1,1143);


            ResultSet result = mystmt.executeQuery();
            while (result.next()) {
                String firstName = result.getString("firstName");
                String lastName = result.getString("lastName");
                String email = result.getString("email");
                System.out.println(firstName + " " + lastName + " | "+ email);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
    }
}
