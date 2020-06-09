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
        
               
        //Customers Table Columns
        TableColumn<Customer, String> id2Column = new TableColumn<>("ID");
        id2Column.setMinWidth(100);
        id2Column.setCellValueFactory(new PropertyValueFactory<>("id"));
        
        TableColumn<Customer, String> name2Column = new TableColumn<>("Name");
        name2Column.setMinWidth(200);
        name2Column.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        //Customers Tableview
        table1 = new TableView<>();
        
        table1.getColumns().addAll(name2Column, id2Column);
        
      
        VBox vcBox = new VBox();
        vcBox.getChildren().addAll(table1);
    
        Scene sce2 = new Scene(vcBox);
        windowC.setScene(sce2);
        windowC.show();
   
        
         GridPane grid1 = new GridPane();
         GridPane root0 = new GridPane();
         Scene scene0 = new Scene(root0,500,500);
         
         GridPane addCus_grid = new GridPane() ;
         Scene addCus_scene = new Scene( addCus_grid , 400 , 500 ) ;
         
          GridPane grid2 = new GridPane() ;
        Scene scene2 = new Scene( grid2 , 400 , 500 ) ;
        
         GridPane grid22 = new GridPane() ;
         Scene scene9 = new Scene( grid22 , 400 , 500 ) ;
         
         GridPane root= new GridPane();
        Scene scene = new Scene(root, 500, 500);  
 //___________________________________________________________________________________________________
        
         //bill
 
         Billing bill = new Billing();
         Employee employee = new Employee();
       // Customer c =new Customer();
         Admin adminn = new Admin();
         Order order =new Order();
         Item item  ;
         User user = new User("a","a") {
             @Override
             void delete(int id) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

             @Override
             String search(int id) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

             @Override
             String list() {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
         };   
           
       
        root0.setAlignment(Pos.CENTER) ;
        root0.setVgap(20) ;
        root0.setHgap(0) ;

        StackPane holder = new StackPane();
        Canvas canvas = new Canvas(2000, 2000);

        holder.getChildren().add(canvas);
        root0.getChildren().add(holder);

        holder.setStyle("-fx-background-color: CADETBLUE");
      
        
        
        
        GridPane root2 = new GridPane();
        root2.setAlignment(Pos.CENTER) ;
        root2.setVgap(10) ;
        root2.setHgap(10) ;
        
        
        Text tex =new Text("**BILL**");
        tex.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 60));
        root2.add(tex, 4, 0);
        TextField numm1 = new TextField();
        root2.add(numm1,4,1);
       
        
        
        TextField numm2 = new TextField();
        root2.add(numm2,4,2);
         numm2.setEditable(false);
        numm2.setMouseTransparent(true);
        
        TextField numm3 = new TextField();
        root2.add(numm3,4,3);
        numm3.setEditable(false);
        numm3.setMouseTransparent(true);
       
        TextField numm4 = new TextField();
        root2.add(numm4,4,4);
        numm4.setEditable(false);
        numm4.setMouseTransparent(true);
       
     
        Label labelCost = new Label("MealCost :");
        labelCost.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, FontPosture.REGULAR, 15));
        root2.add(labelCost,2,1);
         Label labeltax = new Label("Tax :");
        labeltax.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, FontPosture.REGULAR, 15));
        root2.add(labeltax,2,2);
         Label labeltip = new Label("Tip :");
        labeltip.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, FontPosture.REGULAR, 15));
        root2.add(labeltip,2,3);
         Label labeltotal = new Label("TOTAL Bill :");
        labeltotal.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, FontPosture.REGULAR, 15));
        root2.add(labeltotal,2,4);
         
        
        
        Button addBtnn = new Button();
        Button exitBtn8 = new Button();
        addBtnn.setText("Calculate");
        exitBtn8.setText("Exit");
        addBtnn.setMinSize(80, 20);
        addBtnn.setMaxSize(80, 40);
        exitBtn8.setMinSize(80,20);
        exitBtn8.setMaxSize(80, 40);
        root2.add(addBtnn,5,1);
        root2.add(exitBtn8,4,6);
        // String s;
        addBtnn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               //DecimalFormat df = new DecimalFormat("0.0");
              double mealCost;
              double tax;
              double tip;
              double totalCost;
              double totalBill;
              mealCost = Double.parseDouble(numm1.getText());
              bill.setMealCost(mealCost);
              tax=bill.tax();
              numm2.setText(Double.toString(tax)+"$");
              tip=bill.tip();
              numm3.setText(Double.toString(tip)+"$");
              totalBill=bill.totalBill();
              numm4.setText(Double.toString(totalBill)+"$");
               
                }
        });
        
     
      exitBtn8.setTextFill(Color.RED);
        exitBtn8.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  Platform.exit();
            }
        });
         
          
        root2.setStyle("-fx-background-color:CADETBLUE");
        Scene scene11 = new Scene(root2, 500, 500);
        
