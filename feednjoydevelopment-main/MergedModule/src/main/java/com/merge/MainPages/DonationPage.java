package com.merge.MainPages;

import java.io.FileInputStream;
import java.net.URI;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.google.cloud.firestore.DocumentSnapshot;
import com.merge.NavigateToHomepage.LoginDetails.DataService;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
// import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import java.util.List;


/*AuthorName: Anuj.Bankar
 * Description": Volunteer Donation Form
 * Input: Name of Volunteer , Name of Food , Enter Quantity to Donate , PickUp Address , Cooking Date , FoodType , Submit Button
 * Output: Donation Confirmed
 */
/*
 * Author(EXCEPTION HANDLING):Varun.Deshmukh
 * exception handling regarding , cannot use current location
 */

 class LocationUseException extends Exception {
    public LocationUseException(String message) {
        super(message);
    }
}

public class DonationPage{
   

    // private StackPane fxd_root;

    private LoginController loginController;

    private DataService dataService = new DataService();

    private String NameofVolunteer;
    
    private VBox personDetailsVBox;
   
    private Group gr;

    Label nameLabel , foodLabel , quatityLabel , phoneNumLabel , addressLabel;



    //private ScrollPane fxd_ScrollPane;
    public DonationPage(LoginController loginController)throws Exception{

            this.loginController = loginController;

            initialize();
    }

    public void initialize()throws Exception{

        //  List<Map<String, Object>> messList = dataService.getMessInfo("Foodinformation");

        // for (Map<String, Object> userData : messList) {
            
        //         //System.out.println(userData.get("Statename"));
        // }

        FileInputStream fxd_FileInputStream2 = new FileInputStream(
            "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/logom-removebg-preview.png");

Image fxd_image = new Image(fxd_FileInputStream2);
ImageView fxd_imageView1= new ImageView(fxd_image);
fxd_imageView1.setFitHeight(200);
fxd_imageView1.setFitWidth(200);
fxd_imageView1.setPreserveRatio(true);
HBox fxd_hbox1_nav = new HBox(fxd_imageView1);
fxd_hbox1_nav.setAlignment(Pos.TOP_LEFT);

        // vbox sid
        nameLabel = new Label();
        nameLabel.setFont(Font.font("TimesNewRoman",FontWeight.BOLD,50));
        nameLabel.setAlignment(Pos.CENTER);

        foodLabel = new Label();
        foodLabel.setFont(Font.font("TimesNewRoman",FontWeight.BOLD,50));
        foodLabel.setAlignment(Pos.CENTER);

        quatityLabel = new Label();
        quatityLabel.setFont(Font.font("TimesNewRoman",FontWeight.BOLD,50));
        quatityLabel.setAlignment(Pos.CENTER);

        phoneNumLabel = new Label();
        phoneNumLabel.setFont(Font.font("TimesNewRoman",FontWeight.BOLD,50));
        phoneNumLabel.setAlignment(Pos.CENTER);

        addressLabel = new Label();
        foodLabel.setFont(Font.font("TimesNewRoman",FontWeight.BOLD,50));
        foodLabel.setAlignment(Pos.CENTER);

        quatityLabel = new Label();
        quatityLabel.setFont(Font.font("TimesNewRoman",FontWeight.BOLD,50));
        quatityLabel.setAlignment(Pos.CENTER);

        phoneNumLabel = new Label();
        phoneNumLabel.setFont(Font.font("TimesNewRoman",FontWeight.BOLD,50));
        phoneNumLabel.setAlignment(Pos.CENTER);

        addressLabel = new Label();
        addressLabel.setFont(Font.font("TimesNewRoman",FontWeight.BOLD,50));
        addressLabel.setAlignment(Pos.CENTER);

        personDetailsVBox = new VBox(nameLabel,foodLabel,quatityLabel,phoneNumLabel,addressLabel);
      //  personDetailsVBox.setStyle("-fx-border-width : 2; -fx-border-color : navy");
        personDetailsVBox.setLayoutX(300);
        personDetailsVBox.setLayoutY(500);
        personDetailsVBox.setPadding(new Insets(50));
      //  personDetailsVBox.setStyle("-fx-background-color:transparent; -fx-border-color:NAVY;  -fx-borderstyle:solid; -fx-border-radius: 35; -fx-border-width: 2;");
        personDetailsVBox.setAlignment(Pos.CENTER);
       // personDetailsVBox.setVisible(false);
        // personDetailsVBox.setMinHeight(300);
        // personDetailsVBox.setMinWidth(00);

        
        

        FileInputStream fxd_fileInputStream1 = new FileInputStream("C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/donationImg.jpg");
        Image fxd_Image0 = new Image(fxd_fileInputStream1);
        ImageView fxd_ImageView = new ImageView(fxd_Image0);
        // ImageView.setFitHeight(230);
        fxd_ImageView.setPreserveRatio(true);
        fxd_ImageView.setFitWidth(500);
          
        //Textfield for Name/

        TextField fxd_TextField1 = new TextField();
        fxd_TextField1.setPromptText("Enter Name of Volunteer");
        fxd_TextField1.setFocusTraversable(false);
        fxd_TextField1.setFont(Font.font("Roboto",FontWeight.BOLD,15));
        fxd_TextField1.setPrefWidth(500);
        fxd_TextField1.setStyle("-fx-background-radius:5");
        HBox fxd_HBox1 = new HBox(fxd_TextField1);
        fxd_HBox1.setAlignment(Pos.CENTER);


         //Textfield for Name of Food/

        TextField fxd_TextField2 = new TextField();
        fxd_TextField2.setPromptText("Enter Name of Food");
        fxd_TextField2.setFocusTraversable(false);
        fxd_TextField2.setFont(Font.font("Roboto",FontWeight.BOLD,15));
        fxd_TextField2.setPrefWidth(500);
        fxd_TextField2.setStyle("-fx-background-radius:5");
        HBox fxd_HBox2 = new HBox(fxd_TextField2);
        fxd_HBox2.setAlignment(Pos.CENTER);
        
        //Textfield for Quantity to Donate/

        TextField fxd_TextField3 = new TextField();
        fxd_TextField3.setPromptText("Enter Quantity to Donate(in kgs)");
        fxd_TextField3.setFocusTraversable(false);
        fxd_TextField3.setFont(Font.font("Roboto",FontWeight.BOLD,15));
        fxd_TextField3.setPrefWidth(500);
        fxd_TextField3.setStyle("-fx-background-radius:5");
        HBox fxd_HBox3 = new HBox(fxd_TextField3);
        fxd_HBox3.setAlignment(Pos.CENTER);

        //phone number textfield
        TextField fxd_TextField4 = new TextField();
        fxd_TextField4.setPromptText("Enter your Phone Number");
        fxd_TextField4.setFocusTraversable(false);
        fxd_TextField4.setFont(Font.font("Roboto", FontWeight.BOLD, 15));
        fxd_TextField4.setPrefWidth(500);
        fxd_TextField4.setStyle("-fx-background-radius:5");
        HBox fxd_HBox6 = new HBox(fxd_TextField4);
        fxd_HBox6.setAlignment(Pos.CENTER);


        //TextArea for Address/

        TextArea fxd_TextArea = new TextArea();
        fxd_TextArea.setPromptText("Enter Pick-Up Address(*Optional)");
        fxd_TextArea.setFocusTraversable(false);
        fxd_TextArea.setFont(Font.font("Roboto",FontWeight.BOLD,15));
        fxd_TextArea.setPrefSize(500, 100);
        fxd_TextArea.setWrapText(true);
        HBox fxd_HBox4 = new HBox(fxd_TextArea);
        fxd_HBox4.setAlignment(Pos.CENTER);

         //Cooking Date Info/
        
        DatePicker fxd_DatePicker = new DatePicker();
        fxd_DatePicker.setPromptText("Cooking Date");
        fxd_DatePicker.setFocusTraversable(false);
        VBox fxd_VBox3 = new VBox(fxd_DatePicker);
        fxd_VBox3.setAlignment(Pos.CENTER);
       
         //Label to Select Food Type/

        Label fxd_Label = new Label("Select Food Type");
        fxd_Label.setFont(Font.font("Time New Roman",FontWeight.BOLD,17));

        VBox fxd_VBox5 = new VBox(fxd_Label);
        fxd_VBox5.setAlignment(Pos.CENTER);

        //Choice Box for Veg/Non-Veg Option/

        ChoiceBox<String> fxd_choiceBox = new ChoiceBox();
            
            ObservableList<String> fxd_list  = fxd_choiceBox.getItems();

            fxd_list.addAll("Vegeterian","Non-Vegeterian");
            
        /*VBox for choiceBox */
        VBox fxd_VBox1 = new VBox(fxd_choiceBox);

        /*CheckBox */

        CheckBox fxd_checkBox2 = new CheckBox("Use my current location");
        fxd_checkBox2.setFont(Font.font(15));

        VBox fxd_VBox4 = new VBox(fxd_checkBox2);
        fxd_VBox4.setAlignment(Pos.CENTER);
        fxd_VBox4.setPadding(new Insets(10));

        fxd_VBox1.setAlignment(Pos.CENTER);

        //Submit Button Code/

        Button fxd_button = new Button("Submit");
        fxd_button.setFont(Font.font("Roboto",FontWeight.BOLD,15));
        fxd_button.setPadding(new Insets(9));
        fxd_button.setStyle("-fx-background-color:LIGHTGREY;-fx-background-radius:10");
        VBox fxd_VBox2 = new VBox(fxd_button);
        fxd_VBox2.setAlignment(Pos.CENTER);

        //VBox vbox = new VBox();
        
        // Create a Submit Button
        Button submitButton = new Button("Submit");
        
        // Set action on button click
        submitButton.setOnAction(event -> {

           
            // Add border to VBox
            personDetailsVBox.setVisible(true);
            personDetailsVBox.setStyle("-fx-background-color:transparent; -fx-border-color:NAVY;  -fx-borderstyle:solid; -fx-border-radius: 35; -fx-border-width: 2;");
            personDetailsVBox.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY,  new BorderWidths(2))));

        });

        //Back Button
        Button fxd_back = new Button("Back");
        fxd_back.setFont(Font.font("Roboto", FontWeight.BOLD, 15));
        fxd_back.setPadding(new Insets(9));
        fxd_back.setStyle("-fx-background-color:LIGHTGREY;-fx-background-radius:10");
        fxd_back.setOnAction(b->{

                loginController.NavigateToHomePage();
        });

        VBox backButton = new VBox(fxd_back);
        backButton.setAlignment(Pos.CENTER);

        fxd_button.setOnAction(e->{

            NameofVolunteer =  fxd_TextField1.getText();
            String PhoneNumberofVolunteer = fxd_TextField4.getText();
            String NameofFood  = fxd_TextField2.getText();
            String QunatitytoDonate = fxd_TextField3.getText();
            String PickUpAddress =  fxd_TextArea.getText();
            String DatePicker = fxd_DatePicker.getValue().toString();
            String ChoiceBox =  fxd_choiceBox.getValue().toString();
        // String CheckBox = fxd_checkBox2.getText(); 

        
            handleDonation(NameofVolunteer,PhoneNumberofVolunteer,NameofFood,QunatitytoDonate,PickUpAddress,DatePicker,ChoiceBox);

            System.out.println(NameofVolunteer);
            System.out.println(PhoneNumberofVolunteer);
            System.out.println(NameofFood);
            System.out.println(QunatitytoDonate);
            System.out.println(PickUpAddress);
            System.out.println(DatePicker);
            System.out.println(ChoiceBox);
        //     System.out.println(CheckBox);

            fxd_TextField1.clear();
            fxd_TextField2.clear();
            fxd_TextField3.clear();
            fxd_TextField4.clear();
            fxd_TextArea.clear();
            fxd_DatePicker.setValue(null);
            fxd_choiceBox.setValue(null);


            try {

                DocumentSnapshot dataObject = dataService.getData("FoodInfo",NameofVolunteer);

                Label datePicker = new Label();                
                datePicker.setFont(Font.font(30));

                Label foodType = new Label();
                foodType.setFont(Font.font(30));
                
                this.nameLabel = nameLabel;
                nameLabel.setFont(Font.font(30));

                this.phoneNumLabel = phoneNumLabel;
                phoneNumLabel.setFont(Font.font(30));

                this.foodLabel = foodLabel;
                foodLabel.setFont(Font.font(30));

                this.quatityLabel = quatityLabel;
                quatityLabel.setFont(Font.font(30));

                this.addressLabel = addressLabel;
                addressLabel.setFont(Font.font(30));
                System.out.println(dataObject.getString("Name"));

                datePicker.setText("Date: "+dataObject.getString("Date"));
                nameLabel.setText("Name: "+dataObject.getString("Name"));
                phoneNumLabel.setText("PhoneNumber: "+dataObject.getString("Phone"));
                foodLabel.setText("Food Donated: "+dataObject.getString("Food"));
                quatityLabel.setText("Quantity: "+dataObject.getString("Quantity"));
                foodType.setText(""+dataObject.getString("FoodType"));
                addressLabel.setText("Pickup Address:"+dataObject.getString("PickUp"));
                
                // personDetailsVBox.setVisible(true);
                // personDetailsVBox.setPrefHeight(200);
                // personDetailsVBox.setStyle("-fx-background-color:transparent; -fx-border-color:NAVY;  -fx-borderstyle:solid; -fx-border-radius: 35; -fx-border-width: 2;");
                // personDetailsVBox.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY,  new BorderWidths(2))));
    
    
            } catch (Exception ex) {
                ex.printStackTrace();


        }
            
           
        });

        /* Complete VBox for storing images,texts etc.. */

        VBox fxd_VBox = new VBox(16, fxd_ImageView,fxd_HBox1, fxd_HBox2, fxd_HBox3,fxd_HBox6,fxd_HBox4, fxd_VBox3, fxd_VBox5,
                fxd_VBox1,fxd_VBox4, fxd_VBox2,backButton);
               // fxd_VBox.setAlignment(Pos.CENTER);
              //  fxd_VBox.setPrefSize(515, 775);
                fxd_VBox.setStyle("-fx-background-color:transparent; -fx-border-color:NAVY;  -fx-borderstyle:solid; -fx-border-radius: 35; -fx-border-width: 2;");
                fxd_VBox.setLayoutX(800);
                fxd_VBox.setLayoutY(190);
                fxd_VBox.setPadding(new Insets(50));
                fxd_VBox.setPrefHeight(600);
                fxd_VBox.setMaxHeight(900);
                fxd_VBox.setAlignment(Pos.CENTER_RIGHT);

                  //Bacground Image
             String fxd_video =( "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/video6.mp4");

        URI uri = Paths.get(fxd_video).toUri();

        // Create a Media object
        Media media = new Media(uri.toString());

        // Create a MediaPlayer object
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        // Create a MediaView object
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaView.setFitWidth(1920);
        mediaView.setPreserveRatio(true);

        // Start playing the video
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop the video
        mediaPlayer.play();
        

        
            HBox mainHbox = new HBox(150,personDetailsVBox,fxd_VBox);
                mainHbox.setPadding(new Insets(30));
                mainHbox.setLayoutX(400);

                 gr = new Group(mediaView,fxd_hbox1_nav,mainHbox);

            fxd_checkBox2.setOnAction(e -> {
            try {
                if (fxd_checkBox2.isSelected()) {
                    throw new LocationUseException("Cannot use current location for pick-up.");
                }
            } catch (LocationUseException ex) {
                // Handle the exception by displaying a red label
                Label errorLabel = new Label(ex.getMessage());
                errorLabel.setTextFill(Color.RED);
                errorLabel.setFont(Font.font("Roboto", FontWeight.BOLD, 14));
                VBox errorBox = new VBox(errorLabel);
                errorBox.setAlignment(Pos.CENTER);
                errorBox.setPadding(new Insets(10));
                // Replace or add errorBox to your existing VBox
                // Ensure appropriate positioning or layout management
                fxd_VBox.getChildren().add(errorBox);
                fxd_checkBox2.setSelected(false);
            }
        });
        
             }
             
        
            public Group getView() {
        
                return gr;
            }

            public void handleDonation(String NameofVolunteer,String PhoneNumber,String NameofFood,String QunatitytoDonate,String PickUpAddress,String DatePicker,String ChoiceBox) {

                try {
                        dataService = new DataService();

                        this.NameofVolunteer = NameofVolunteer;

                        Map<String, Object> data = new HashMap<>();

                        data.put("Name", NameofVolunteer);
                        data.put("Phone", PhoneNumber);
                        data.put("Food", NameofFood);
                        data.put("Quantity", QunatitytoDonate+" kgs");
                        data.put("PickUp", PickUpAddress);
                        data.put("Date", DatePicker);
                        data.put("FoodType", ChoiceBox);
                

                        dataService.addDonationDetails("FoodInfo",NameofVolunteer,data);
                        System.out.println("Donation Details added Successfully");

                } catch (Exception e) {

                    e.printStackTrace();
                }

                

        }


}