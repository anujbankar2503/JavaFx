/*
 * Author name : Gauri Dagale
 * Description : Contact Us Form
 * Input : Details
 * Output : Saving of details(FeedBack related to Website from User)
 */

 package com.merge.MainPages;

 import java.io.FileInputStream;
 import java.util.HashMap;
 import java.util.Map;
 
 import com.merge.NavigateToHomepage.LoginDetails.DataService;
 
 import javafx.beans.value.ChangeListener;
 import javafx.beans.value.ObservableValue;
 import javafx.event.ActionEvent;
 import javafx.event.EventHandler;
 import javafx.geometry.Insets;
 import javafx.geometry.Pos;
 import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.ScrollPane;
 import javafx.scene.control.TextArea;
 import javafx.scene.control.TextField;
 import javafx.scene.control.ScrollPane.ScrollBarPolicy;
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
 import javafx.scene.layout.BorderPane;
 import javafx.scene.layout.HBox;
 import javafx.scene.layout.StackPane;
 import javafx.scene.layout.VBox;
 import javafx.scene.paint.Color;
 import javafx.scene.text.Font;
 import javafx.scene.text.FontWeight;
 
 public class ContactUs {
 
         private LoginController loginController;
 
         private ScrollPane scroll;
         private DataService dataService;
         private VBox fxd_gr;
         private StackPane fxd_grp;

         String emailRegex;
 
         public ContactUs(LoginController loginController) throws Exception {
 
                 this.loginController = loginController;
 
                 initialize();
         }
 
         public void initialize() throws Exception {
 
                 // Label for heading (Contact Us)
 
                 Label fxd_label = new Label("Contact Us");
                 fxd_label.setFont(Font.font("lucida calligraphy", FontWeight.BOLD, 50));
                 fxd_label.setTextFill(Color.BLACK);
                 fxd_label.setPadding(new Insets(15, 0, 20, 0));
 
                 // label for Email address
 
                 Label fxd_label2 = new Label("Email address : ");
                 fxd_label2.setFont(Font.font("comic sanc", FontWeight.SEMI_BOLD, 20));
                 fxd_label2.setTextFill(Color.BLACK);
                 fxd_label2.setPadding(new Insets(0, 660, 0, 0));
 
                 Label fxd_label3 = new Label("We'll never share your email with anyone else");
                 fxd_label3.setFont(Font.font("comic sanc", 13));
                 fxd_label3.setTextFill(Color.BLACK);
                 fxd_label3.setPadding(new Insets(0, 540, 0, 0));
 
                 // Label for Username
 
                 Label fxd_label4 = new Label("Enter username : ");
                 fxd_label4.setFont(Font.font("comic sanc", FontWeight.SEMI_BOLD, 20));
                 fxd_label4.setTextFill(Color.BLACK);
                 fxd_label4.setPadding(new Insets(0, 640, 0, 0));
 
                 Label fxd_label5 = new Label("We'll require username for unique identity");
                 fxd_label5.setFont(Font.font("comic sanc", 13));
                 fxd_label5.setTextFill(Color.BLACK);
                 fxd_label5.setPadding(new Insets(0, 550, 0, 0));
 
                 // Label for Password
 
                 Label fxd_label6 = new Label("Password : ");
                 fxd_label6.setFont(Font.font("comic sanc", FontWeight.SEMI_BOLD, 20));
                 fxd_label6.setTextFill(Color.BLACK);
                 fxd_label6.setPadding(new Insets(0, 700, 0, 0));
 
                 // Label for State
 
                 Label fxd_label7 = new Label("Enter State : ");
                 fxd_label7.setFont(Font.font("comic sanc", FontWeight.SEMI_BOLD, 20));
                 fxd_label7.setTextFill(Color.BLACK);
                 fxd_label7.setPadding(new Insets(0, 690, 0, 0));
 
                 // Label for City
 
                 Label fxd_label8 = new Label("Enter city : ");
                 fxd_label8.setFont(Font.font("comic sanc", FontWeight.SEMI_BOLD, 20));
                 fxd_label8.setTextFill(Color.BLACK);
                 fxd_label8.setPadding(new Insets(0, 700, 0, 0));
 
                 // Label for Feedback
 
                 Label fxd_label9 = new Label("Feedback : ");
                 fxd_label9.setFont(Font.font("comic sanc", FontWeight.SEMI_BOLD, 20));
                 fxd_label9.setTextFill(Color.BLACK);
                 fxd_label9.setPadding(new Insets(0, 700, 0, 0));
 
                 // emailfield for enter Email address
 
                 TextField fxd_textField = new TextField();
                 fxd_textField.setMaxWidth(800);
                 fxd_textField.setStyle("-fx-background-radius:8");
 
                 // textfield for enter Username
 
                 TextField fxd_username = new TextField();
                 fxd_username.setMaxWidth(800);
                 fxd_username.setStyle("-fx-background-radius:8");
 
                 // textfield for enter Password
 
                 TextField fxd_password = new TextField();
                 fxd_password.setMaxWidth(800);
                 fxd_password.setStyle("-fx-background-radius:8");
 
                 // textfield for enter State
 
                 TextField fxd_state = new TextField();
                 fxd_state.setMaxWidth(800);
                 fxd_state.setStyle("-fx-background-radius:8");
 
                 // textfield for enter City
 
                 TextField fxd_city = new TextField();
                 fxd_city.setMaxWidth(800);
                 fxd_city.setStyle("-fx-background-radius:8");
 
                 // textarea for enter Feedback
 
                 TextArea fxd_feedback = new TextArea();
                 fxd_feedback.setMaxSize(800, 30);
                 fxd_feedback.setStyle("-fx-background-radius:8");
 
                 // label for msg
 
                 Label fxd_Label10 = new Label();
                 //Label for Location
                 Label fxd_label10 = new Label("Location :");
                 fxd_label10.setFont(Font.font("comic sanc", FontWeight.SEMI_BOLD, 20));
                 fxd_label10.setTextFill(Color.BLACK);
                 fxd_label10.setPadding(new Insets(0, 710, 0, 0));
 
                  //Label for Location
                  Label fxd_label11 = new Label("How Did You Hear About Us ? ");
                  fxd_label11.setFont(Font.font("comic sanc", FontWeight.SEMI_BOLD, 20));
                  fxd_label11.setTextFill(Color.BLACK);
                  fxd_label11.setPadding(new Insets(0, 530, 0, 0));
 
                 // textfield for enter Email address
 
                 TextField emailField = new TextField();
                 emailField.setMaxWidth(800);
                 emailField.setPrefHeight(35);
                 emailField.setStyle("-fx-background-radius:8");
 
                 // textfield for enter City
 
                 TextField location = new TextField();
                 location.setMaxWidth(800);
                 location.setPromptText("*Optional");
                 location.setPrefHeight(35);
                 location.setStyle("-fx-background-radius:8");
 
                 // textfield for Inquiry
                 
                 TextField inquirytext = new TextField();
                 inquirytext.setPromptText("eg:friends,familymembers,others..");
                 inquirytext.setPrefHeight(35);
                 inquirytext .setMaxSize(800, 50);
                 inquirytext.setStyle("-fx-background-radius:8");
 
                 // textfield for enter Password
 
                 TextField phonenumber = new TextField();
                 phonenumber.setMaxWidth(800);
                 phonenumber.setStyle("-fx-background-radius:8");
 
                 // Create a Label to show validation message
                 Label validationLabel = new Label();
 
                 // Add a listener to validate email format
                 emailField.textProperty().addListener(new ChangeListener<String>() {
                         @Override
                         public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                             if (isValidEmail(newValue)) {
                                 validationLabel.setText("Valid email");
                                 validationLabel.setStyle("-fx-text-fill: green;");
                             } else {
                                 validationLabel.setText("Invalid email");
                                 validationLabel.setStyle("-fx-text-fill: red;");
                             }
                         }
                     });
 
 
                 // button for submit details
 
                 Button fxd_button = new Button("submit");
                 fxd_button.setMaxHeight(20);
                 fxd_button.setMaxWidth(100);
                 fxd_button.setFont(Font.font("comic sanc", FontWeight.BOLD, 15));
                 fxd_button.setTextFill(Color.rgb(0, 150, 255));
                 fxd_button.setStyle("-fx-padding : 8; -fx-background-radius:20");
                 fxd_button.setAlignment(Pos.CENTER);
                 fxd_button.setPadding(new Insets(50, 0, 70, 0));
 
                 fxd_button.setOnAction(e -> {
 
                         String name = fxd_username.getText();
                         String email = emailField.getText();
                         String phoneNumber = phonenumber.getText();
                         String stateName = fxd_state.getText();
                         String cityName = fxd_city.getText();
                         String FeedBack = fxd_feedback.getText();
                         String locationName = location.getText();
                         String inquiryDetails = inquirytext.getText();
 
                         handleFeedback(name, email, phoneNumber, stateName, cityName, FeedBack, locationName,
                                         inquiryDetails);
 
                         System.out.println(name);
                         System.out.println(emailField);
                         System.out.println(phoneNumber);
                         System.out.println(stateName);
                         System.out.println(cityName);
                         System.out.println(FeedBack);
                         System.out.println(locationName);
                         System.out.println(inquiryDetails);
 
                         fxd_username.clear();
                         emailField.clear();
                         phonenumber.clear();
                         fxd_state.clear();
                         fxd_city.clear();
                         fxd_feedback.clear();
                         location.clear();
                         inquirytext.clear();

                        Alert alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("Information Dialog");
                        alert.setHeaderText(null);
                        alert.setContentText("Thankyou for your Feedback!");
                        alert.showAndWait();

                         emailRegex = null;
                 
});
 
                 // Hbox for navbar
                 HBox fxd_navbar = new HBox();
                 fxd_navbar.setSpacing(40);
                 fxd_navbar.setPrefHeight(70);
                 fxd_navbar.setPadding(new Insets(0, 0, 0, 0));
                 fxd_navbar.setAlignment(Pos.CENTER);
 
                 // image for adding logo
 
                 FileInputStream fxd_FileInputStream2 = new FileInputStream(
                                 "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/logom-removebg-preview.png");
 
                 Image fxd_image = new Image(fxd_FileInputStream2);
                 ImageView fxd_imageView = new ImageView(fxd_image);
                 fxd_imageView.setFitHeight(200);
                 fxd_imageView.setFitWidth(180);
                 fxd_imageView.setPreserveRatio(true);
 
                 // Buttons for navbar
 
                 Button fxd_homeButton = createStyledButton("Home");
 
                 fxd_homeButton.setOnAction(e -> {
                         loginController.NavigateToHomePage();
                 });
 
                 Button fxd_aboutButton = createStyledButton("About");
 
                 fxd_aboutButton.setOnAction(e -> {
 
                         loginController.NavigateToAboutUs();
                 });
 
                 Button fxd_contactButton = createStyledButton("Contact");
 
                 fxd_contactButton.setOnAction(e -> {
 
                         loginController.NavigateToContactUs();
                 });
 
                 Button fxd_donateButton = createStyledButton("Donate");
 
                 fxd_donateButton.setOnAction(e -> {
 
                         loginController.NavigateToDonationPage();
 
                 });
 
                 Button fxd_storiesButton = createStyledButton("Stories");
 
                 fxd_storiesButton.setOnAction(e -> {
                         loginController.NavigateToStories();
                 });
 
                 // add all buttons to HBox
 
                 fxd_navbar.getChildren().addAll(fxd_homeButton, 
                                 fxd_storiesButton, fxd_donateButton,fxd_contactButton,fxd_aboutButton);
 
                 fxd_navbar.setPadding(new Insets(0, 0, 0, 0));
 
                 // hbox for logo
                 HBox fxd_hbox1_nav = new HBox(fxd_imageView);
                 fxd_hbox1_nav.setAlignment(Pos.TOP_LEFT);
                 fxd_hbox1_nav.setPadding(new Insets(0, 0, 0, 100));
 
                 // hbox for navbar+logo
                 HBox fxd_HBox = new HBox(340,fxd_hbox1_nav,fxd_navbar);
 
 
 
                 // VBox to align email address, username, password, state, city, feedback
                 // vertically
 
                 VBox fxd_vbox = new VBox(12, fxd_label,fxd_label4,fxd_username,fxd_label5,fxd_label2,emailField,validationLabel,  
                                 fxd_label6,phonenumber, fxd_label7, fxd_state,
                                 fxd_label8, fxd_city, fxd_label9,fxd_feedback,fxd_label10,location,fxd_label11,inquirytext);
                 fxd_vbox.setAlignment(Pos.CENTER);
                 fxd_vbox.setPadding(new Insets(0, 0, 0, 0));
                 VBox fxd_vb1Button = new VBox(10, fxd_button, fxd_Label10);
                 fxd_vb1Button.setAlignment(Pos.CENTER);
 
                 VBox fxd_BPpass = new VBox(30, fxd_vbox, fxd_vb1Button);
                 fxd_BPpass.setPadding(new Insets(0, 0, 0, 0));
                 fxd_BPpass.setStyle("-fx-border-color:DARKBLUE; -fx-border-width: 2px; -fx-border-radius: 30px;");
                 fxd_BPpass.setMaxWidth(950);
 
                 // Create footer with label and center it at the bottom
 
                //  Label fxd_footerLabel = new Label("© 2024 Feed-N-Joy. All rights reserved.");
                //  fxd_footerLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #FFFFE0;");
                //  HBox fxd_footer = new HBox(fxd_footerLabel);
                //  fxd_footer.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5); -fx-padding: 6px;");
                //  fxd_footer.setAlignment(Pos.CENTER);
                //  fxd_footer.setPadding(new Insets(0,0,0,0));
 
                 // borderpane for alignment of HBox and VBox
 
                 BorderPane fxd_borderPane = new BorderPane();
                 fxd_borderPane.setTop(fxd_HBox);
                 fxd_borderPane.setPadding(new Insets(0, 0, 0, 0));
 
                 //fxd_borderPane.setCenter(fxd_BPpass);
 
                 BorderPane fxd_BorderPane2 = new BorderPane();
                 fxd_BorderPane2.setCenter(fxd_BPpass);
                 fxd_BorderPane2.setPadding(new Insets(10,0,10,0));
                //  fxd_BorderPane2.setBottom(fxd_footer);
                 fxd_BorderPane2.setPadding(new Insets(0, 0, 0, 0));
                 // Group fxd_gp = new Group(fxd_borderPane);
 
                 // stackpane for adding background image
 
                 fxd_gr = new VBox(20, fxd_borderPane, fxd_BorderPane2);
                 fxd_gr.setPadding(new Insets(0, 0, 20, 0));
                 fxd_gr.setPrefWidth(2000);
                 fxd_gr.setAlignment(Pos.CENTER);
                 
                //set Background Image
                 FileInputStream fxd_File = new FileInputStream(
                        "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/AA.png");
                Image fxd_im = new Image(fxd_File);
                ImageView fxd_ima = new ImageView(fxd_im);
                fxd_ima.setFitHeight(1250);
                fxd_ima.setFitWidth(2000);

                StackPane fxd_grp = new StackPane(fxd_ima,fxd_gr);

                scroll = new ScrollPane(fxd_grp);
 
                 scroll.setVbarPolicy(ScrollBarPolicy.ALWAYS);
                 scroll.setHbarPolicy(ScrollBarPolicy.NEVER);
 
         }
 
         // Simple email validation method
         private boolean isValidEmail(String email) {
                 emailRegex = "^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
                 return email.matches(emailRegex);
         }
 
         // for styling buttons
 
         public Button createStyledButton(String text) {
                 Button button = new Button(text);
 
                 button.setPrefHeight(50);
                 button.setPrefWidth(120);
                 button.setStyle("-fx-background-color:transparent; -fx-border-color:black; -fx-text-fill: black; -fx-font-size: 20px; -fx-font-weight: bold; -fx-border-width: 2; -fx-borderstyle:solid; -fx-border-radius: 35;");
                 button.setOnMouseEntered(e -> button.setStyle(
                                 "-fx-background-color:BLACK; -fx-text-fill: white; -fx-font-size: 20px; -fx-font-weight: bold; -fx-background-radius: 20;"));
                 button.setOnMouseExited(e -> button.setStyle(
                                 "-fx-background-color:transparent; -fx-border-color:black; -fx-text-fill: black; -fx-font-size: 20px; -fx-font-weight: bold; -fx-border-width: 2; -fx-borderstyle:solid; -fx-border-radius: 20"));
                 return button;
         }
 
         public ScrollPane getView() {
 
                 return scroll;
         }
 
         public void handleFeedback(String name, String emailField, String phoneNumber, String stateName,
                         String cityName, String FeedBack, String locationName, String inquiryDetails) {
 
                 try {
                         dataService = new DataService();
 
                         Map<String, Object> data = new HashMap<>();
 
                         data.put("Name: ", name);
                         data.put("EmailId: ", emailField);
                         data.put("PhoneNumber: ", phoneNumber);
                         data.put("StateName: ", stateName);
                         data.put("CityName: ", cityName);
                         data.put("Feedback: ", FeedBack);
                         data.put("Location: ", locationName);
                         data.put("Reference: ", inquiryDetails);
 
                         dataService.addContactDetails("ContactInfo",name,data);
                         System.out.println("Feedback added Successfully");
 
                 } catch (Exception e) {
 
                         e.printStackTrace();
                }
 
        }
 
 }