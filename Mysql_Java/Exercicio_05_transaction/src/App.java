import java.sql.Statement;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate localDate = LocalDate.of(2022, 1, 9);
        java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);

        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false);
            st = conn.createStatement();

                
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            // int x = 1;
            // if (x < 2) {
            //     throw new SQLException("Fake error");                
            // }

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit();
            System.out.println("rows1 = " + rows1);
            System.out.println("rows2 = " + rows2);

        } catch (SQLException e) {
            conn.rollback();
            throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
        }
        finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
        
    }
}
