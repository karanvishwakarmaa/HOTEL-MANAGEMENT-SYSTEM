package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {

    Connection connection ;
    Statement statement;
    public Database() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelMS", "root", "Karan@12345");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
