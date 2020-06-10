package restaurant;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
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
      //search customer        
     GridPane grid5 = new GridPane() ;
        grid5.setAlignment(Pos.CENTER) ;
        grid5.setVgap(10) ;
        grid5.setHgap(10) ;
          
        Label cust_id = new Label("ID : ") ;
        GridPane.setConstraints( cust_id , 2 , 2 ) ;
        cust_id.setFont(Font.font("tahoms", FontWeight.SEMI_BOLD, FontPosture.REGULAR,15 ));
        
        TextField pp = new TextField() ;
        pp.setPromptText("Write an ID Here...");
        GridPane.setConstraints( pp , 3 , 2 ) ;
        TextField ppp = new TextField() ;
        ppp.setEditable(false);
        ppp.setMouseTransparent(true);
        GridPane.setConstraints( ppp , 3 , 3 ) ;
        
        
        Button cust_del = new Button("Delete") ;
        GridPane.setConstraints( cust_del , 4, 3 ) ;
        cust_del.setMinSize(100, 20);
        cust_del.setMaxSize(80, 40);
        cust_del.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  pp.clear();
                  ppp.clear();
            }
        });
        
        
         Button cust_search = new Button("Search") ;
        GridPane.setConstraints( cust_search , 4, 2 ) ;
        cust_search.setMinSize(100, 20);
        cust_search.setMaxSize(80, 40);
        cust_search.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                String s="";
                s=employee.search(Integer.parseInt(pp.getText()));
                ppp.setText(s);
            }
        });
        
        Button exitBtn5 = new Button("Exit");
        GridPane.setConstraints( exitBtn5 , 4 , 5 ) ;
        exitBtn5.setMinSize(100, 20);
        exitBtn5.setMaxSize(80, 40);
        exitBtn5.setTextFill(Color.RED);
        exitBtn5.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  Platform.exit();
            }
        });
       
        grid5.getChildren().addAll(  cust_id , cust_del , exitBtn5 ,pp,cust_search,ppp);
        grid5.setStyle("-fx-background-color:CADETBLUE");
       Scene scene7 = new Scene( grid5 , 400 , 500 ) ;  
 //////////////////////////////////////// 
          Button backbtn3 = new Button();
         backbtn3.setText("Back->") ;
         backbtn3.setMinSize(100, 20);
         backbtn3.setMaxSize(80, 40);
         backbtn3.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
         backbtn3.setOnAction(new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent e) {
         primaryStage.setScene(scene9);
         }
         });
         grid5.add(backbtn3, 4, 4);
         /////////////////////////////////////////
//__________________________________________________________________________________//     
//add customer
        
        addCus_grid.setAlignment(Pos.CENTER) ;
        addCus_grid.setVgap(20) ;
        addCus_grid.setHgap(0) ;

        Label name3 = new Label("Name : ") ;
        GridPane.setConstraints( name3 , 0 , 1 ) ;
        
        TextField txt6 = new TextField() ;
        GridPane.setConstraints( txt6 , 3 , 1 ) ;
        
        Label id0 = new Label("ID : ") ;
        GridPane.setConstraints( id0 , 0 , 2 ) ;
        
        
        TextField id3 = new TextField() ;
        GridPane.setConstraints( id3 , 3 , 2 ) ;   
  
        Button addbtn2 = new Button("Add Customer") ;
        GridPane.setConstraints( addbtn2 , 0 , 4 ) ;
        addbtn2.setMinSize(100, 20);
        addbtn2.setMaxSize(80, 40);
        addbtn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                employee.addCustomer(txt6.getText());
                primaryStage.setScene(scene8);
                primaryStage.show();
            }
        });
        
        
        Button exitBtn4 = new Button("Exit");
        GridPane.setConstraints( exitBtn4 , 4 , 4 ) ;
        exitBtn4.setMinSize(100, 20);
        exitBtn4.setMaxSize(80, 40);
        exitBtn4.setTextFill(Color.RED);
        exitBtn4.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  Platform.exit();
            }
        });
        
        
        addCus_grid.getChildren().addAll( name3 , id0, addbtn2 , txt6 , id3 ,exitBtn4 );
        addCus_grid.setStyle("-fx-background-color:CADETBLUE");
        
        
         //////////////////////////////////////// 
         Button backbtn = new Button();
         backbtn.setText("Back-> ") ;
         backbtn.setMinSize(100, 20);
         backbtn.setMaxSize(80, 40);
         backbtn.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
         backbtn.setOnAction(new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent e) {
         primaryStage.setScene(scene9);
         }
         });
         addCus_grid.add(backbtn, 4, 5);
         /////////////////////////////////////////
  
//__________________________________________________________________________________// 
        //search emp
        GridPane grid3 = new GridPane() ;
        grid3.setAlignment(Pos.CENTER) ;
        grid3.setVgap(10) ;
        grid3.setHgap(10) ;
        
        Label emp_id = new Label("ID : ") ;
        GridPane.setConstraints( emp_id , 2 , 2 ) ;
        emp_id.setFont(Font.font("tahoms", FontWeight.SEMI_BOLD, FontPosture.REGULAR,15 ));
        
        TextField txt0 = new TextField() ;
        GridPane.setConstraints( txt0 , 3 , 2 ) ;
        txt0.setPromptText("Write an ID Here...");
        
        TextField txi = new TextField() ;
        GridPane.setConstraints( txi , 3 , 3 ) ;
        txi.setMinSize(100, 20);
        txi.setEditable(false);
        txi.setMouseTransparent(true);
        
        
        Button delbtn = new Button("Delete") ;
        GridPane.setConstraints( delbtn , 4, 3 ) ;
        delbtn.setMinSize(100, 20);
        delbtn.setMaxSize(80, 40);
        delbtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  txt0.clear();
                  txi.clear();
            }
        });
        Button empsearch = new Button("Search") ;
        GridPane.setConstraints( empsearch , 4 , 2 ) ;
        empsearch.setMinSize(100, 20);
        empsearch.setMaxSize(80, 40);
        empsearch.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                 String s9 = adminn.search(Integer.parseInt(txt0.getText()));
                 txi.setText(s9);
            }
        });
        
        Button exitBtn3 = new Button("Exit");
        GridPane.setConstraints( exitBtn3 , 4 , 5 ) ;
        exitBtn3.setMinSize(100, 20);
        exitBtn3.setMaxSize(80, 40);
        exitBtn3.setTextFill(Color.RED);
        exitBtn3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  Platform.exit();
            }
        });
        
        
       // GridPane.setConstraints( exitBtn3 , 1 , 4 );
        grid3.getChildren().addAll( emp_id , delbtn , exitBtn3 , txt0,empsearch,txi );
        grid3.setStyle("-fx-background-color:CADETBLUE");
        Scene scene5 = new Scene( grid3 , 500 , 500 ) ;
        
         //////////////////////////////////////// 
         Button backbtn4 = new Button();
         backbtn4.setText("Back->") ;
         backbtn4.setMinSize(100, 20);
         backbtn4.setMaxSize(80, 40);
         backbtn4.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
         backbtn4.setOnAction(new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent e) {
         primaryStage.setScene(scene9);
         }
         });
         grid3.add(backbtn4, 4, 4);
         ///////////////////////////////////////// 
//__________________________________________________________________________________//
 //add  emp     
        GridPane grid = new GridPane() ;
        grid.setAlignment(Pos.CENTER) ;
        grid.setVgap(20) ;
        grid.setHgap(0) ;
        Label name = new Label("Name : ") ;
        GridPane.setConstraints( name , 0 , 1 ) ;
        
        TextField txt = new TextField() ;
        GridPane.setConstraints( txt , 3 , 1 ) ;
        
        
        Label id2 = new Label("UserName : ") ;
        GridPane.setConstraints( id2 , 0 , 2 ) ;
        
        TextField txt1 = new TextField() ;
        GridPane.setConstraints( txt1 , 3 , 2 ) ;
        adminn.username=txt1.getText();
        
        
        Label age = new Label("Age : ") ;
        GridPane.setConstraints( age , 0 , 3 ) ;
        
        TextField txt3 = new TextField() ;
        GridPane.setConstraints( txt3 , 3 , 3 ) ;
        
        Label salary = new Label("Salary : ") ;
        GridPane.setConstraints( salary , 0 , 4 ) ;
        
        TextField salary2 = new TextField() ;
        GridPane.setConstraints( salary2 , 3 , 4 ) ;
        
        
        
        Label work = new Label("WorkingHours : ") ;
        GridPane.setConstraints( work , 0 , 5 ) ;
        
        TextField txt4 = new TextField() ;
        GridPane.setConstraints( txt4 , 3 , 5 ) ;
        
        
        Button btn = new Button("Add Employee") ;
        GridPane.setConstraints( btn , 0 , 7 ) ;
        btn.setMinSize(100, 20);
        btn.setMaxSize(80, 40);
        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  adminn.addEmployee(txt.getText(), Integer.parseInt(txt3.getText()), Integer.parseInt(txt4.getText()) , Double.parseDouble(txt4.getText()));
                  Text tx= new Text("SAVED SUCCESSFUL");
                  grid.add(tx, 0, 8);
                 ;
            }
        });
        grid.getChildren().addAll( name , id2 , age , salary , btn , txt , txt1 , txt3 , txt4, work,salary2 );
        
       Scene scene3 = new Scene( grid , 500 , 500  ) ;
        Button exitBtn2 = new Button("Exit");
        exitBtn2.setMinSize(100, 20);
        exitBtn2.setMaxSize(80, 40);
        exitBtn2.setText("Exit") ;
        exitBtn2.setFont(Font.font("tahoms", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
        exitBtn2.setTextFill(Color.RED);
        exitBtn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  Platform.exit();
            }
        });
         grid.add(exitBtn2,4, 7);
         grid.setStyle("-fx-background-color:CADETBLUE");
         
           //////////////////////////////////////// 
         Button backbtn2 = new Button();
         backbtn2.setText("Back-> ") ;
         backbtn2.setMinSize(100, 20);
         backbtn2.setMaxSize(80, 40);
         backbtn2.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
         backbtn2.setOnAction(new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent e) {
         primaryStage.setScene(scene2);
         }
         });
         grid.add(backbtn2, 4, 8);
         /////////////////////////////////////////   
//__________________________________________________________________________________//     
        //buttons

        grid2.setAlignment(Pos.CENTER) ;
        grid2.setVgap(15) ;
        grid2.setHgap(10) ;
        
        
        Button btn1 = new Button("Add Employee") ;
        GridPane.setConstraints( btn1 , 0 , 1 ) ;
        btn1.setMinSize(150, 20);
        btn1.setMaxSize(80, 40);
        btn1.setFont(Font.font("tahoms", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene3) ;
                primaryStage.show();
            }
        });
        
        Button btn2 = new Button("Search Employee");
        GridPane.setConstraints(btn2, 0, 2);
        btn2.setMinSize(150, 20);
        btn2.setMaxSize(80, 40);
        btn2.setFont(Font.font("tahoms", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene5) ;
                primaryStage.show();
            }
        });
        
        Button btn3 = new Button("Add Customer") ;
        GridPane.setConstraints( btn3 , 0 , 3 ) ;
        btn3.setMinSize(150, 20);
        btn3.setMaxSize(80, 40);
        btn3.setFont(Font.font("tahoms", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(addCus_scene) ;
                primaryStage.show();
            }
        });
        
        Button btn4 = new Button("Search Customer");
        GridPane.setConstraints(btn4, 0, 4);
        btn4.setMinSize(150, 20);
        btn4.setMaxSize(80, 40);
        btn4.setFont(Font.font("tahoms", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene7) ;
                primaryStage.show();
            }
        });
        
        
        
        Button btn5 = new Button("Menu");
        GridPane.setConstraints(btn5, 0, 5);
        btn5.setMinSize(150, 20);
        btn5.setMaxSize(80, 40);
        btn5.setFont(Font.font("tahoms", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
         btn5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene8) ;
                primaryStage.show();
            }
        });
         
         
         Button btn6 = new Button("Employee List");
        GridPane.setConstraints(btn6, 0, 6);
        btn6.setMinSize(150, 20);
        btn6.setMaxSize(80, 40);
        btn6.setFont(Font.font("tahoms", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
        grid2.add(btn6, 0,6);
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               primaryStage.setScene(scel) ;
               primaryStage.show();
            }
        });
        
        
          Button btn7 = new Button("Customer List");
        GridPane.setConstraints(btn7, 0, 7);
        btn7.setMinSize(150, 20);
        btn7.setMaxSize(80, 40);
        btn7.setFont(Font.font("tahoms", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
        grid2.add(btn7, 0,7);
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               primaryStage.setScene(sce2) ;
               primaryStage.show();
            }
        });

        Button logout = new Button("Logout");
        logout.setText("Logout") ;
        logout.setMinSize(150, 20);
        logout.setMaxSize(80, 40);
        GridPane.setConstraints(logout, 0, 8);
        logout.setFont(Font.font("tahoms", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
        logout.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  primaryStage.setScene(scene0);
            }
        });
        
        Button exitBtn1 = new Button("Exit");
        exitBtn1.setText("Exit") ;
        exitBtn1.setMinSize(150, 20);
        exitBtn1.setMaxSize(80, 40);
        GridPane.setConstraints(exitBtn1, 0, 10);
        exitBtn1.setFont(Font.font("tahoms", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
        exitBtn1.setTextFill(Color.RED);
        exitBtn1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                  Platform.exit();
            }
        });
        
        grid2.getChildren().addAll( btn1 , btn2 , btn3 , btn4 , btn5,exitBtn1 ,logout);
        grid2.setStyle("-fx-background-color:CADETBLUE");
        
            //////////////////////////////////////// 
         Button backbtn6 = new Button();
         backbtn6.setText("Back->") ;
         backbtn6.setMinSize(150, 20);
         backbtn6.setMaxSize(80, 40);
         backbtn6.setFont(Font.font("tahoms", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15 ));
         backbtn6.setOnAction(new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent e) {
         primaryStage.setScene(scene);
         }
         });
         grid2.add(backbtn6, 0,9);
         /////////////////////////////////////////
        
        //__________________________________________________________________________________// 
