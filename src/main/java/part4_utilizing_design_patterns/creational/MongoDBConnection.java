package part4_utilizing_design_patterns.creational;

public class MongoDBConnection implements DBConnection {

    public void connect(String address) {
        System.out.println("Connected to MongoDB server: " + address + ":27017");
    }

}
