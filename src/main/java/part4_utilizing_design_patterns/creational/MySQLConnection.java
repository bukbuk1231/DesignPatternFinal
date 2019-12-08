package part4_utilizing_design_patterns.creational;

public class MySQLConnection implements DBConnection {

    public void connect(String address) {
        System.out.println("Connected to MySQL server: " + address + ":3306");
    }
}
