package jv2_labsession5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ListStudent implements Initializable {

    public TableView<Student> tbView = new TableView<>();
    public TableColumn<Student,Integer> colId = new TableColumn<>();
    public TableColumn<Student,String> colName = new TableColumn<>();
    public TableColumn<Student,Integer> colAge = new TableColumn<>();
    public TableColumn<Student,Integer> colMark = new TableColumn<>();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new  PropertyValueFactory<>("name"));
        colAge.setCellValueFactory(new  PropertyValueFactory<>("age"));
        colMark.setCellValueFactory(new  PropertyValueFactory<>("mark"));

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1904a";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet rs = stm.executeQuery(sql);

            ObservableList<Student> list = FXCollections.observableArrayList();

            while (rs.next()){
//                list.add(new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getInt("mark")));
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                Integer mark = rs.getInt("mark");
                Student s = new Student(id,name,age,mark);

                list.add(s);
            }
            tbView.setItems(list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}