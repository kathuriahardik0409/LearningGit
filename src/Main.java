import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/dvdrental";
            String user = "postgres";
            String password = "Terr1f1c@1";
            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from actor");

            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}