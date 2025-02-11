import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/login_schema";
        String username = "root";
        String password = "Jeevan@1107";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
         Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to the database!");

            // Perform database operations here
            Statement statement = connection.createStatement();
        //   String str2 = "INSERT INTO usertable (iduserTable, username, password)"+ "VALUES(2,'Rakesh','RK@123')";
           //using prepared statement.
            String str3= "INSERT INTO usertable (iduserTable,username,password)" + "VALUES(?,?,?)";
            PreparedStatement pstmt = connection.prepareStatement(str3);
            pstmt.setString(1,"4");
            pstmt.setString(2,"Bhavesh");
            pstmt.setString(3,"BB@123");

            int rowInsertedAgain =pstmt.executeUpdate();
            if(rowInsertedAgain>0){
                System.out.println("Inserted again row also inserted.");
            }
            String str= "Select * from usertable";

        //    int rowInserted = statement.executeUpdate(str2);
//            if(rowInserted>0){
//                System.out.println("New user stored successfully.");
//            }
            ResultSet rs = statement.executeQuery(str);

            System.out.println("user list below : ");
            while(rs.next()){
            //    int id= rs.getInt("isuserTable");
                String name= rs.getString("username");
                String pass= rs.getString("password");
                System.out.println("The name : "+ name +" :  : "+ "Password " + pass);
            }
            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Connection failed!");
            e.printStackTrace();
        }
    }
}