import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        Statement statement = null;
        String sql = "SELECT * FROM employees ";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);// Database ile sql bağlantısı kuruldu.
            statement = connect.createStatement();
            //PrepardesStatament ile insert işlemiyle sayı ekleme
            PreparedStatement preparedStatement = connect.prepareStatement("INSERT INTO employees (name,position,salary) VALUES(?,?,?)");
            preparedStatement.setString(1, "coni");
            preparedStatement.setString(2, "bombacı");
            preparedStatement.setInt(3, 56785);
            preparedStatement.executeUpdate();// sırası ile kolonlara atanacak değerler verildikten sonra update işlemi ile güncellme yapıldı.
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {// bir sonraki değer oldukça tablodaki değerleri yazdıracak
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Positon: " + resultSet.getString("position"));
                System.out.println("Salary: " + resultSet.getInt("salary"));
                System.out.println("====================================================");
            }


        } catch (SQLException e) {// Hata vermesi durumunda ekran hatayı yazdırma
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SqlState: " + e.getSQLState());

        }
    }
}