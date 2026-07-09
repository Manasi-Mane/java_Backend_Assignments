//Write database connectivity program and fetch records from database.
import java.sql.*;

class FetchStudent{
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/college";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create Connection
            Connection con = DriverManager.getConnection(url, user, password);
            String query = "SELECT * FROM student";
            Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query);
             System.out.println("ID\tName\tMarks");
             while(rs.next()) {

                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getInt("marks")
                );
            }

            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}