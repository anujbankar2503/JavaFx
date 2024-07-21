package com.merge.NavigateToHomepage.LoginDetails;

import java.io.FileInputStream;
import java.util.concurrent.ExecutionException;

import com.merge.MainPages.LoginController;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
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
import javafx.scene.Group;

public class SignIn {

    private LoginController loginController;

    private DataService dataService;

    private Group group1;

    private TextField textField;

    private PasswordField passwordField;

    private Button signinButton;

    private Button signupButton;

    public static String key = "monika";

    private TextField textField3;

    public SignIn(LoginController loginController) throws Exception {

        this.loginController = loginController;

        dataService = new DataService();

        SignIn();

    }

    public void SignIn() throws Exception {

        // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        FileInputStream fileInputStream1 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Anuj_Img/login.png");

        Image image1 = new Image(fileInputStream1);

        ImageView imgView1 = new ImageView(image1);
        imgView1.setFitWidth(500);
        imgView1.setFitHeight(500);
        
        VBox imageView = new VBox(imgView1);
        imageView.setAlignment(Pos.CENTER);
        imageView.setPrefSize(500, 500);
        imageView.setLayoutY(300);
        imageView.setLayoutX(1200);
        imageView.setStyle("-fx-background-color:transparent; -fx-border-color:Navy;  -fx-borderstyle:solid; -fx-border-width: 2;");

        FileInputStream fileInputStream2 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/logom-removebg-preview.png");
        Image image2 = new Image(fileInputStream2);
        ImageView imgView2 = new ImageView(image2);
        imgView2.setFitWidth(200);
        imgView2.setPreserveRatio(true);
        VBox imageView2 = new VBox(imgView2);
        imageView2.setAlignment(Pos.TOP_LEFT);
        imageView2.setPrefSize(200, 200);
        // imageView2.setLayoutX(-8);
        // imageView2.setLayoutY(-12);
        imageView2.setPadding(new Insets(20, 20, 15, -10));
        // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Label label1 = new Label("Welcome !");
        label1.setFont(Font.font("Roboto", FontWeight.BOLD, 60));
        label1.setTextFill(Color.MAROON);

        Label label2 = new Label("Login To Your Account");
        label2.setFont(Font.font("TimesNewRoman", FontWeight.BOLD, 30));
        label2.setTextFill(Color.MAROON);

        VBox LabelContainer = new VBox(13);
        LabelContainer.getChildren().addAll(label1, label2);
        LabelContainer.setAlignment(Pos.CENTER);
        LabelContainer.setPrefSize(20, 555);
        LabelContainer.setLayoutX(100);
        LabelContainer.setLayoutY(200);

        // ----------------------------------------------------------------------------------------------------------------------------------------------------------
        Label label3 = new Label("Enter Username");
        label3.setFont(Font.font("TimesNewRoman", FontWeight.BOLD, 20));
        label3.setAlignment(Pos.CENTER);
        textField3 = new TextField();
        textField3.setPromptText("Username");
        textField3.setFocusTraversable(false);
        textField3.setFont(Font.font("Roboto", 16));
        textField3.setStyle("-fx-background-radius:10");
        textField3.setPrefWidth(265);
        textField3.setPrefHeight(270);

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
        // ---------------------------------------------------------------------------------------------------------------------------------------------------

        Label label4 = new Label("Enter Password");
        label4.setFont(Font.font("TimesNewRoman", FontWeight.BOLD, 20));
        label4.setAlignment(Pos.CENTER);
        passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setFont(Font.font("Roboto", 16));
        passwordField.setFocusTraversable(false);
        passwordField.setPrefWidth(265);
        passwordField.setPrefHeight(276);
        passwordField.setStyle("-fx-background-radius:10");

        // ------------------------------------------------------------------------------------------------------------------------------------------------

        // Password Button

        textField = new TextField();
        textField.setManaged(false);
        textField.setVisible(false);
        textField.setFont(Font.font("Roboto", 16));
        textField.setPrefWidth(265);
        textField.setPrefHeight(276);
        textField.setStyle("-fx-background-radius:10");

        Button showPasswordButton = new Button("Show");
        showPasswordButton.setFocusTraversable(false);
        showPasswordButton.setFont(Font.font("Roboto", FontWeight.BOLD, 15));
        showPasswordButton.setStyle("-fx-background-radius:7;");
        showPasswordButton.setPadding(new Insets(1, 0, 0, 2));
        showPasswordButton.setPrefSize(70, 100);

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

        FileInputStream fileInputStream4 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Anuj_Img/PasswordIcon.png");
        Image image4 = new Image(fileInputStream4);
        ImageView imgView4 = new ImageView(image4);
        // imgView4.setFitWidth(60);
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
        HboxforLabel4.setPadding(new Insets(0, 0, 28, 0));

        // ------------------------------------------------------------------------------------------------------------------------------------------------------
        signinButton = new Button("LOGIN");
        signinButton.setPadding(new Insets(15));
        signinButton.setStyle("-fx-background-radius:15;-fx-background-color:STEELBLUE");
        signinButton.setTextFill(Color.WHITE);
        signinButton.setPrefSize(210, 30);
        signinButton.setFocusTraversable(false);
        signinButton.setFont(Font.font("Roboto", FontWeight.BOLD, 15));

        signinButton.setOnAction(e -> {

            handleLogin(textField3.getText(), passwordField.getText());

        });

        VBox VboxforsigninButton = new VBox(signinButton);
        VboxforsigninButton.setPrefSize(450, 50);
        VboxforsigninButton.setAlignment(Pos.TOP_CENTER);

        // -------------------------------------------------------------------------------------------------------------------------------------------------
        signupButton = new Button("SIGNUP");
        signupButton.setPadding(new Insets(15));
        signupButton.setStyle("-fx-background-radius:15");
        signupButton.setPrefSize(247, 30);
        signupButton.setFocusTraversable(false);
        signupButton.setTextFill(Color.WHITE);
        signupButton.setFont(Font.font("Roboto", FontWeight.BOLD, 15));
        signupButton.setStyle("-fx-background-radius:15;-fx-background-color:steelblue");

        signupButton.setOnAction(e -> {

            loginController.NavigateToSignUp();
        });

        VBox VboxforsignupButton = new VBox(signupButton);
        VboxforsignupButton.setPrefSize(450, 50);
        VboxforsignupButton.setAlignment(Pos.TOP_CENTER);

        // -------------------------------------------------------------------------------------------------------------------------------------------------------

        Button skipLogin = new Button("Skip Login");
        skipLogin.setUnderline(true);
        skipLogin.setFont(Font.font("Roboto", 20));
        skipLogin.setPadding(new Insets(15));
        skipLogin.setPrefSize(247, 50);
        skipLogin.setFocusTraversable(false);
        skipLogin.setTextFill(Color.NAVY);
        skipLogin.setStyle("-fx-background-color:transparent; -fx-font-weight:BOLD");
        skipLogin.setOnMouseEntered(e -> skipLogin.setStyle("-fx-background-color:transparent; -fx-font-size:20; -fx-font-weight:BOLD"));
        skipLogin.setOnMouseExited(e -> skipLogin.setStyle("-fx-background-color:transparent; -fx-font-size:20; -fx-font-weight:BOLD"));
        


        skipLogin.setOnAction(e -> {
            loginController.NavigateToHomePage();
        });

        VBox VBoxtoSkip = new VBox(skipLogin);
        VBoxtoSkip.setAlignment(Pos.TOP_CENTER);
        VBoxtoSkip.setPrefSize(200, 200);

        VBox VBoxforButtons = new VBox(36, VboxforsigninButton, VboxforsignupButton, VBoxtoSkip);
        VBoxforButtons.setAlignment(Pos.TOP_CENTER);
        VBoxforButtons.setPrefSize(800, 230);

        // ___________________________________________________________________________________________________________________________________________________________

        VBox Contents = new VBox();
        Contents.setSpacing(35);
        Contents.getChildren().addAll(HboxforLabel3, HboxforLabel4, VBoxforButtons);

        Contents.setPrefHeight(700);
        Contents.setPrefWidth(649);
        Contents.setLayoutY(250);

        VBox Container = new VBox(60);
        Container.getChildren().addAll( LabelContainer, Contents);
        Container.setAlignment(Pos.TOP_RIGHT);
        Container.setPrefSize(650, 900);
        Container.setLayoutX(400);
        Container.setPadding(new Insets(20));
        Container.setLayoutY(30);
        Container.setBackground(new Background(new BackgroundFill(Color.STEELBLUE, CornerRadii.EMPTY, null)));
        Container.setStyle("-fx-background-color:transparent; -fx-border-color:NAVY;  -fx-borderstyle:solid; -fx-border-radius: 35; -fx-border-width: 2;");

        
          FileInputStream fxd_File = new FileInputStream(
            "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/AA.png");
    Image fxd_img = new Image(fxd_File);
    ImageView fxd_ima = new ImageView(fxd_img);
    fxd_ima.setFitHeight(1250);
    fxd_ima.setFitWidth(2000);
        

        group1 = new Group(fxd_ima,imageView2, imageView, Container);

       
    }

    public Group getView() {

        return group1;

    }

    private void handleLogin(String username, String password) {

        try {

            if (dataService.authenticateUser(username, password)) {

                key = username;

                loginController.NavigateToHomePage();

            } else {
                System.out.println("Invalid credentials");
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Msg");
                alert.setHeaderText("Oops..Something went wrong!!");
                alert.setContentText("Invalid username or password..!!                      Please try again...");

                DialogPane dialogPane = alert.getDialogPane();
                dialogPane.setStyle(
                        "-fx-background-radius: 15; " +
                                "-fx-border-radius: 15; " +
                                "-fx-padding: 10; " +
                                "-fx-border-color: #D3D3D3; " +
                                "-fx-border-width: 2;");
                alert.showAndWait();
                key = null;
            }
        } catch (ExecutionException | InterruptedException ex) {

            ex.printStackTrace();
        }

    }

}