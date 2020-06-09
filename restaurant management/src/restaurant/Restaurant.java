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
        
        //__________________________________________________________________________________//     
//menu
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER) ;
        gp.setVgap(5) ;
        gp.setHgap(5) ;
         
        
        Text menu = new Text("MENU");
        menu.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 60));
     // menu.setFontSmoothingType(FontSmoothingType.LCD);
      menu.setFill(Color.CRIMSON);
        gp.add(menu, 0, 0);
        
        Label label1 = new Label("FOOD:") ;
        label1.setFont(Font.font(24));
        label1.setStyle("-fx-text-fill: BEIGE;");
        gp.add(label1,0,2);
        
        
        Label lel3 = new Label("PRICES$$") ;
        lel3.setFont(Font.font(24));
         lel3.setStyle("-fx-text-fill: BEIGE;");
        gp.add(lel3,3,0);
        
        
        TextField field = new TextField();
        gp.add(field,02,11);
        field.setPrefSize(300, 100);
        field.setMinSize(20, 20);
        field.setEditable(false);  //ده بيخلينا منكتبش جوا التيكشت فيلد
        field.setMouseTransparent(true);  // ده بيخلينا نعمل كوبي و المؤشر يجي ع الكلام اللي جوا التيكست فيلد لكن منقدرش نكتب
        
        Button b1 = new Button();
        b1.setText("Grilled Salmon With Sauce");
         b1.setMinSize(200, 20);
        b1.setMaxSize(80, 40);
        gp.add(b1,2,2);
         Label l1 = new Label("80") ;
        l1.setFont(Font.font(24));
        gp.add(l1,3,2);
        b1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                double po;
                po=Double.parseDouble(l1.getText());
               //item =new Item(b1.getText(),label1.getText(),po);
                 //  order.addOrder(item);
                   order.names+="  "+"\r\n"+ b1.getText()  ;
                   field.setText(order.names);
            }});
       
        
        
        Button b2 = new Button();
        b2.setText("Roast Beef With Vegetables");
         b2.setMinSize(200, 20);
        b2.setMaxSize(80, 40);
        gp.add(b2,2,3);
        b2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                    order.names+="  "+"\r\n"+ b2.getText()  ;
                   field.setText(order.names);
            }});
        Label l2 = new Label("100") ;
        l2.setFont(Font.font(24));
        gp.add(l2,3,3);
        
        
        
        
        Button b3 = new Button();
        b3.setText("Chiken And Mushroom Pie");
         b3.setMinSize(200, 20);
        b3.setMaxSize(80, 40);
        gp.add(b3,2,4);
         b3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                   order.names+="  "+"\r\n"+ b3.getText()  ;
                   field.setText(order.names);
            }});
         Label l3 = new Label("50") ;
        l3.setFont(Font.font(24));
        gp.add(l3,3,4);
        
        Button b4 = new Button();
        b4.setText("Marrakesh Vegetarian Curry");
         b4.setMinSize(200, 20);
        b4.setMaxSize(80, 40);
        gp.add(b4,2,5);
         b4.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                   order.names+="  "+"\r\n"+ b4.getText()  ;
                   field.setText(order.names);
            }});
        Label l4 = new Label("150") ;
        l4.setFont(Font.font(24));
        gp.add(l4,3,5);
        
        
        
        Label label2 = new Label("DRINK:") ;
        label2.setFont(Font.font(24));
        label2.setStyle("-fx-text-fill: BEIGE;");
        
        gp.add(label2,0,6);
        
        Button b5 = new Button();
        b5.setText("Pepsi");
         b5.setMinSize(200, 20);
        b5.setMaxSize(80, 40);
        gp.add(b5,2,7);
        b5.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                   order.names+="  "+"\r\n"+ b5.getText()  ;
                   field.setText(order.names);
            }});
        Label l5 = new Label("6") ;
        l5.setFont(Font.font(24));
        gp.add(l5,3,7);
        
        Button b6 = new Button();
        b6.setText("Juice");
         b6.setMinSize(200, 20);
        b6.setMaxSize(80, 40);
        gp.add(b6,2,8);
        b6.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                   order.names+="  "+  "\r\n"+ b6.getText()  ;
                   field.setText(order.names);
            }});
        Label l6 = new Label("20") ;
        l6.setFont(Font.font(24));
        gp.add(l6,3,8);
        
        Button b7 = new Button();
        b7.setText("Tea");
         b7.setMinSize(200, 20);
        b7.setMaxSize(80, 40);
        gp.add(b7,2,9);
        b7.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                   order.names+="  "+"\r\n"+ b7.getText();
                   field.setText(order.names);
            }});
        Label l7 = new Label("10") ;
        l7.setFont(Font.font(24));
        gp.add(l7,3,9);
        
        Button b8 = new Button();
        b8.setText("Coffee");
         b8.setMinSize(200, 20);
        b8.setMaxSize(80, 40);
        gp.add(b8,2,10);
        b8.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                   order.names+="  "+"\r\n"+ b8.getText()  ;
                   field.setText(order.names);
            }});
        Label l8 = new Label("15") ;
        l8.setFont(Font.font(24));
        gp.add(l8,3,10);
        
            
        Button check = new Button("Make Order") ;
        GridPane.setConstraints( check , 0 , 20 ) ;
        check.setMinSize(100, 20);
        check.setMaxSize(80, 40);
        check.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  if(field.getText()!= null){
                  primaryStage.setScene(scene11);
                  primaryStage.show();
                  }else
                  {
                      field.setText("PLEASE ENTER THE RDER");
                  }
                  field.setText("");
            }
        });
        
               
        Button cancel = new Button("Cancel Order") ;
        GridPane.setConstraints( cancel , 2, 20 ) ;
        cancel.setMinSize(100, 20);
        cancel.setMaxSize(80, 40);
        cancel.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                 field.setText("");
                  primaryStage.setScene(addCus_scene);
                  primaryStage.show();
            }
        });
        
        
        
        Button exitBtn99 = new Button("Exit");
        GridPane.setConstraints( exitBtn99 , 3 , 20 ) ;
        exitBtn99.setMinSize(100, 20);
        exitBtn99.setMaxSize(80, 40);
       // exitBtn99.setStyle(STYLESHEET_MODENA);
       exitBtn99.setTextFill(Color.RED);
        exitBtn99.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  Platform.exit();
            }
        });
            
            
           
            //layout.setTop(menubar) ;
           gp.getChildren().add(exitBtn99);
           gp.getChildren().add(check);
           gp.getChildren().add(cancel);
           gp.setStyle("-fx-background-color:CADETBLUE");
            Scene scene8 = new Scene( gp , 650 , 650 ) ;
            
         //////////////////////////////////////// 
         Button backbtn5 = new Button();
           backbtn5.setText("Back->") ;
         backbtn5.setMinSize(100, 20);
         backbtn5.setMaxSize(80, 40);
         backbtn5.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
         backbtn5.setOnAction(new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent e) {
         primaryStage.setScene(scene0);
         }
         });
         gp.add(backbtn5, 3, 21);
         /////////////////////////////////////////
