import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {


    public Database(String text) {
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql.//localhost:3307/Guj";
        String username = "root";
        String pasword = "root";
        String query = "select *from Guj";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,pasword);
        System.out.println("Connection Established");
        String qu = "insert into users(name)value('')";
        Statement smt = con.createStatement();
        smt.execute(qu);
        con.close();
        System.out.println("Connection closed");

    }
}
