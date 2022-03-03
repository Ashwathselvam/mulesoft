import java.sql.*;

class FirstExample {

   static final String DB_URL = "jdbc:mysql://localhost/movies";

   static final String USER = "ash";

   static final String PASS = "1234";

   static final String QUERY = "SELECT * from movies";

   public static void main(String[] args) {

      // Open a connection

      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

         Statement stmt = conn.createStatement();

         ResultSet rs = stmt.executeQuery(QUERY);) {

         // Extract data from result set

         while (rs.next()) {

            // Retrieve by column name

            System.out.println(rs.getString("actor")+rs.getString("actress")+rs.getString("director")+rs.getString("title")+rs.getString("year"));



         }

      } catch (SQLException e) {

         e.printStackTrace();

      } 

   }

}
