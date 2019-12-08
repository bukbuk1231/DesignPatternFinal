package part4_utilizing_design_patterns;

import part4_utilizing_design_patterns.behavioral.ChocolateBar;
import part4_utilizing_design_patterns.creational.DBConnection;
import part4_utilizing_design_patterns.creational.MongoDBConnection;
import part4_utilizing_design_patterns.creational.MySQLConnection;
import part4_utilizing_design_patterns.structural.FixSizeHashMap;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//        DBConnection dbConnection1 = new MySQLConnection();
//        dbConnection1.connect("mywebserver.com");
//        DBConnection dbConnection2 = new MongoDBConnection();
//        dbConnection2.connect("mywebserver.com");

//        FixSizeHashMap<Integer, Integer> map = new FixSizeHashMap<Integer, Integer>(3);
//        map.put(1, 1);
//        map.put(2, 1);
//        map.put(3, 1);
//        map.put(4, 1);

        ChocolateBar chocolateBar = new ChocolateBar();
        Iterator<Integer> barIterator = chocolateBar.iterator();
        while (barIterator.hasNext()) {
            System.out.println("Bar: " + barIterator.next());
        }

    }
}
