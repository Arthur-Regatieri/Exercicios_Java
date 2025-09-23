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
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                "DELETE FROM department "
                + "WHERE "
                + "Id = ?");
                st.setInt(1, 2);
                
            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
        
    }
}
