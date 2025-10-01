import java.sql.*;

public class JdbcInsertExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee_db";
        String user = "root";           // your MySQL username
        String password = "amhsirahnimsay"; // your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String query = "INSERT INTO EmployeeDetails (empcode, empname, empage, esalary) VALUES " +
                    "(101, 'Jenny', 25, 10000)," +
                    "(102, 'Jacky', 30, 20000)," +
                    "(103, 'Joe', 20, 40000)," +
                    "(104, 'John', 40, 80000)," +
                    "(105, 'Shameer', 25, 90000);";

            stmt.executeUpdate(query);
            System.out.println("Records Inserted Successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
