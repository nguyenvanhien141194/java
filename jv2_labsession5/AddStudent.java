package jv2_labsession5;

import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddStudent {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    public  void sumbit(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1904a";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);



        }catch (Exception e){

        }
    }

}
