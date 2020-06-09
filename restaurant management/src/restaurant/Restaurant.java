package restaurant;
import javafx.application.Application;
import static javafx.application.Application.STYLESHEET_CASPIAN;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author DELL LAPTOP
 */
public class Restauranttt extends Application {
    
    //Table view
    
    Stage windowE;
    TableView<EmployeeFile> table;
    Stage windowC;
    TableView<Customer> table1;
    
    @Override
    public void start(Stage primaryStage) {
        
        //Table view dec.
        windowE = primaryStage;
        windowE.setTitle("Employee List");
        
        windowC = primaryStage;
        windowC.setTitle("Employee List");
       
        
        //Employee Table Columns
        TableColumn<EmployeeFile, String> idColumn = new TableColumn<>("ID");
        idColumn.setMinWidth(100);
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        
        TableColumn<EmployeeFile, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        TableColumn<EmployeeFile, String> ageColumn = new TableColumn<>("Age");
        ageColumn.setMinWidth(100);
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        
        TableColumn<EmployeeFile, String> workingHoursColumn = new TableColumn<>("WorkingHours");
        workingHoursColumn.setMinWidth(100);
        workingHoursColumn.setCellValueFactory(new PropertyValueFactory<>("workingHours"));
        
        TableColumn<EmployeeFile, String> salaryColumn = new TableColumn<>("Salary");
        salaryColumn.setMinWidth(100);
        salaryColumn.setCellValueFactory(new PropertyValueFactory<>("salary"));
        
        
        //Employee Tableview
        table = new TableView<>();
        
        table.getColumns().addAll(nameColumn, idColumn, ageColumn, workingHoursColumn, salaryColumn);
        
        VBox velBox = new VBox();
        velBox.getChildren().addAll(table);
    
        Scene scel = new Scene(velBox);
        windowE.setScene(scel);
        windowE.show();
        
