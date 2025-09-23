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
            st = conn.prepareStatement("INSERT INTO seller "
                                        + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                                        +"VALUES"
                                        + "(?, ?, ?, ?, ?)",
                                        Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Carl Purple");
            st.setString(2,"Carl@gmail.com");
            st.setDate(3, sqlDate);
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                    
                }
                
            }else{
                System.out.println("No rows affected!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
        
    }
}
