package com.merge.NavigateToHomepage.LoginDetails;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import com.merge.MainPages.LoginController;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SignUp {

    private LoginController loginController;

    private TextField textField;

    private PasswordField passwordField;

    private Button signupButton;

    private TextField textField3;

    private Group group2;

    public SignUp(LoginController loginController) throws Exception {

        this.loginController = loginController;

        SignUp();

    }

    public void SignUp() throws Exception {

        FileInputStream fileInputStream1 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Anuj_Img/sign.png");

        Image image1 = new Image(fileInputStream1);

        ImageView imgView1 = new ImageView(image1);
        imgView1.setFitHeight(400);
        imgView1.setPreserveRatio(true);
        VBox imageView = new VBox(imgView1);
        imageView.setAlignment(Pos.CENTER);
        imageView.setPrefSize(350, 600);
        imageView.setLayoutY(250);
        imageView.setLayoutX(150);
        imageView.setStyle("-fx-border-color:NAVY;  -fx-borderstyle:solid; -fx-border-radius: 35; -fx-border-width: 2;");

        // --------------------------------------------------------------------------------------
        FileInputStream fileInputStream2 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/logom-removebg-preview.png");
        Image image2 = new Image(fileInputStream2);
        ImageView imgView2 = new ImageView(image2);
        imgView2.setFitWidth(200);
        imgView2.setPreserveRatio(true);
        VBox imageView2 = new VBox(imgView2);
        imageView2.setAlignment(Pos.TOP_LEFT);
        imageView2.setPrefSize(200, 200);
        imageView2.setPadding(new Insets(20, -0, 145, 35));
        //imageView2.setLayoutX(1450);
        //imageView2.setLayoutY(0);

        // imageView2.setBorder(new Border(new BorderStroke(
        // Color.BLACK, // Border color
        // BorderStrokeStyle.SOLID, // Border style
        // CornerRadii.EMPTY, // Corner radii
        // new BorderWidths(2) // Border widths
        // )));
        // ------------------------------------------------------------------------------------------

        Label label1 = new Label("Welcome !");
        label1.setFont(Font.font("Roboto", FontWeight.BOLD, 60));
        label1.setTextFill(Color.MAROON);
        label1.setPadding(new Insets(0, 20, 0, 0));

        Label label2 = new Label("SignUp to Make your First Move..");
        label2.setFont(Font.font("TimesNewRoman", FontWeight.BOLD, 30));
        label2.setTextFill(Color.MAROON);
        label2.setPadding(new Insets(0, 22, 0, 0));

        VBox LabelContainer = new VBox(13);
        LabelContainer.getChildren().addAll(label1, label2);
        LabelContainer.setAlignment(Pos.CENTER);
        LabelContainer.setPrefSize(20, 555);
        LabelContainer.setLayoutX(100);
        LabelContainer.setLayoutY(200);
        // -------------------------------------------------------------------------------------------

        Label label3 = new Label("Enter Username");
        label3.setFont(Font.font("TimesNewRoman", FontWeight.BOLD, 20));
        label3.setAlignment(Pos.CENTER);
        textField3 = new TextField();
        textField3.setPromptText("Username");
        textField3.setFocusTraversable(false);
        textField3.setFont(Font.font("Roboto", 16));
        textField3.setStyle("-fx-background-radius:10");

        VBox VboxforLabel3 = new VBox(8);
        VboxforLabel3.getChildren().addAll(label3, textField3);
        VboxforLabel3.setPrefSize(310, 0);

        FileInputStream fileInputStream3 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Anuj_Img/UserIcon.png");
        Image image3 = new Image(fileInputStream3);
        ImageView imgView3 = new ImageView(image3);
        imgView3.setFitWidth(72);
        imgView3.setPreserveRatio(true);

        VBox VBoxforIcons = new VBox();
        VBoxforIcons.getChildren().add(imgView3);
        VBoxforIcons.setPrefSize(200, 300);

        HBox HboxforLabel3 = new HBox();
        HboxforLabel3.setSpacing(10);
        HboxforLabel3.getChildren().addAll(imgView3, VboxforLabel3);
        HboxforLabel3.setAlignment(Pos.CENTER);
        HboxforLabel3.setLayoutX(0);
        HboxforLabel3.setLayoutY(0);
        // ----------------------------------------------------------------------------------------------------------------------------------------------

        Label label4 = new Label("Enter Password");
        label4.setFont(Font.font("TimesNewRoman", FontWeight.BOLD, 20));
        label4.setAlignment(Pos.CENTER);
        passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setFont(Font.font("Roboto", 16));
        passwordField.setFocusTraversable(false);
        passwordField.setPrefWidth(265);
        passwordField.setPrefHeight(270);
        passwordField.setStyle("-fx-background-radius:10");

        // ------------------------------------------------------------------------------------------------------------------------------------------------

        // Password Button

        textField = new TextField();
        textField.setManaged(false);
        textField.setVisible(false);
        textField.setFont(Font.font("Roboto", 16));
        textField.setPrefWidth(265);
        passwordField.setPrefHeight(270);
        textField.setStyle("-fx-background-radius:10");

        Button showPasswordButton = new Button("Show");
        showPasswordButton.setFocusTraversable(false);
        showPasswordButton.setFont(Font.font("Roboto", FontWeight.BOLD, 15));
        showPasswordButton.setStyle("-fx-background-radius:7;");
        showPasswordButton.setPadding(new Insets(1, 0, 0, 2));
        showPasswordButton.setPrefSize(70, 97);

        // Bind the text fields together
        textField.textProperty().bindBidirectional(passwordField.textProperty());

        showPasswordButton.setOnAction(e -> {
            if (textField.isVisible()) {
                textField.setVisible(false);
                textField.setManaged(false);
                passwordField.setVisible(true);
                passwordField.setManaged(true);
                showPasswordButton.setText("Show");
            } else {
                textField.setVisible(true);
                textField.setManaged(true);
                passwordField.setVisible(false);
                passwordField.setManaged(false);
                showPasswordButton.setText("Hide");
            }
        });

        HBox hbox = new HBox(10, passwordField, textField, showPasswordButton);
        HBox hboxforshow_passwordfield = new HBox(10, passwordField, hbox);

        VBox VboxforLabel4 = new VBox(8);
        VboxforLabel4.getChildren().addAll(label4, hboxforshow_passwordfield);
        VboxforLabel4.setPrefSize(310, 0);

        // ------------------------------------------------------------------------------------------------------------------------------

        FileInputStream fileInputStream4 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Anuj_Img/PasswordIcon.png");
        Image image4 = new Image(fileInputStream4);
        ImageView imgView4 = new ImageView(image4);
        imgView4.setFitHeight(72);
        imgView4.setPreserveRatio(true);
        imgView4.setLayoutY(10);

        VBox VBoxforIconPassword = new VBox();
        VBoxforIconPassword.getChildren().add(imgView4);
        VBoxforIconPassword.setPrefSize(200, 300);

        HBox HboxforLabel4 = new HBox();
        HboxforLabel4.setSpacing(10);
        HboxforLabel4.getChildren().addAll(imgView4, VboxforLabel4);
        HboxforLabel4.setAlignment(Pos.CENTER);
        HboxforLabel4.setPadding(new Insets(0, 0, 15, 0));
        // -----------------------------------------------------------------------------------------------------------------------------------------

        signupButton = new Button("SIGNUP");
        signupButton.setPadding(new Insets(15));
        signupButton.setStyle("-fx-background-radius:15");
        signupButton.setPrefSize(238, 50);
        signupButton.setFocusTraversable(false);
        signupButton.setFont(Font.font("Roboto", FontWeight.BOLD, 19));
        signupButton.setStyle("-fx-background-radius:15;-fx-background-color:STEELBLUE");
        signupButton.setTextFill(Color.WHITE);

        signupButton.setOnAction(e -> {

            handleSignUp(textField.getText(), passwordField.getText());
        });

        VBox VboxforsignupButton = new VBox(signupButton);
        VboxforsignupButton.setPrefSize(450, 50);
        VboxforsignupButton.setAlignment(Pos.TOP_CENTER);

        // ----------------------------------------------------------------------------------------------------------------------------------------

        Button backtoLogin = new Button("Back To LoginPage");
        backtoLogin.setUnderline(true);
        backtoLogin.setFont(Font.font("Roboto", 20));
        backtoLogin.setPadding(new Insets(15));
        backtoLogin.setPrefSize(220, 50);
        backtoLogin.setFocusTraversable(false);
        backtoLogin.setTextFill(Color.DARKBLUE);
        backtoLogin.setStyle("-fx-background-color:transparent; -fx-font-weight:BOLD");
        backtoLogin.setOnMouseEntered(e -> backtoLogin.setStyle("-fx-background-color:transparent; -fx-font-size:20; -fx-font-weight:BOLD"));
        backtoLogin.setOnMouseExited(e -> backtoLogin.setStyle("-fx-background-color:transparent; -fx-font-size:20; -fx-font-weight:BOLD"));
        


        backtoLogin.setOnAction(e -> {
            loginController.NavigateToSignIn();
        });

        // signup for NGO

        Button fxd_ngoSignUp = new Button("Signup as NGO");
        fxd_ngoSignUp.setPadding(new Insets(15));
        fxd_ngoSignUp.setStyle("-fx-background-radius:15");
        fxd_ngoSignUp.setPrefSize(238, 50);
        fxd_ngoSignUp.setFocusTraversable(false);
        fxd_ngoSignUp.setFont(Font.font("Roboto", FontWeight.BOLD, 19));
        fxd_ngoSignUp.setStyle("-fx-background-radius:15;-fx-background-color:STEELBLUE");
        fxd_ngoSignUp.setTextFill(Color.WHITE);

        VBox VboxNgosignupButton = new VBox(fxd_ngoSignUp);
        VboxNgosignupButton.setPrefSize(450, 50);
        VboxNgosignupButton.setAlignment(Pos.TOP_CENTER);

        fxd_ngoSignUp.setOnAction(e -> {
            loginController.NavigateToComingSoon();
        });

        VBox VBoxtoSkip = new VBox(backtoLogin);
        VBoxtoSkip.setAlignment(Pos.TOP_CENTER);
        VBoxtoSkip.setPrefSize(200, 200);
        VBox VBoxforButtons = new VBox(36, VboxforsignupButton, VboxNgosignupButton,VBoxtoSkip);
        VBoxforButtons.setAlignment(Pos.CENTER_RIGHT);
        VBoxforButtons.setPrefSize(800, 230);
        VBoxforButtons.setAlignment(Pos.TOP_CENTER);

        // ---------------------------------------------------------------------------------------------------------------------------------

        VBox Contents = new VBox();
        Contents.setSpacing(35);
        Contents.getChildren().addAll(HboxforLabel3, HboxforLabel4, VBoxforButtons);

        Contents.setPrefHeight(700);
        Contents.setPrefWidth(749);
        Contents.setLayoutY(250);
        VBox Container = new VBox(60);
        Container.getChildren().addAll(LabelContainer, Contents);
        Container.setPrefSize(700, 800);
        Container.setPadding(new Insets(30));
        Container.setLayoutX(950);
        Container.setLayoutY(100);
        Container.setStyle("-fx-background-color:transparent; -fx-border-color:NAVY;  -fx-borderstyle:solid; -fx-border-radius: 35; -fx-border-width: 2;");

        
        FileInputStream fxd_File = new FileInputStream(
            "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/AA.png");
    Image fxd_img = new Image(fxd_File);
    ImageView fxd_ima = new ImageView(fxd_img);
    fxd_ima.setFitHeight(1250);
    fxd_ima.setFitWidth(2000);

        group2 = new Group();
        group2.getChildren().addAll(fxd_ima,imageView2,Container,imageView);

    }

    public Group getView() {

        return group2;
    }

    private void handleSignUp(String username, String password) {

        DataService dataService;

        try {

            dataService = new DataService();

            Map<String, Object> data = new HashMap<>();

            data.put("password", password);

            data.put("username", username);

            dataService.addData("users", username, data);

            System.out.println("users registered successfully");

            loginController.NavigateToSignIn();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
