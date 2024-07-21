package com.merge.UIDesign;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
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
import javafx.stage.Stage;

public class SignupForm extends Application {

    public static void main(String[] args) {
        Application.launch(args);

    }

    public void start(Stage prStage) throws FileNotFoundException {

        Group group2;

        FileInputStream fileInputStream1 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Desktop/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Anuj_Img/Selection2.jpg");

        Image image1 = new Image(fileInputStream1);

        ImageView imgView1 = new ImageView(image1);
        imgView1.setFitHeight(700);
        imgView1.setPreserveRatio(true);
        VBox imageView = new VBox(imgView1);
        imageView.setAlignment(Pos.CENTER);
        imageView.setPrefSize(500, 700);
        imageView.setLayoutY(200);
        imageView.setLayoutX(850);

        // --------------------------------------------------------------------------------------
        FileInputStream fileInputStream2 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Desktop/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/hlogo.png");
        Image image2 = new Image(fileInputStream2);
        ImageView imgView2 = new ImageView(image2);
        imgView2.setFitWidth(370);
        imgView2.setPreserveRatio(true);
        VBox imageView2 = new VBox(imgView2);
        imageView2.setAlignment(Pos.TOP_RIGHT);
        imageView2.setPrefSize(100, 50);
        imageView2.setPadding(new Insets(-50, -10, 145, 115));
        imageView2.setLayoutX(1450);
        imageView2.setLayoutY(0);

        // imageView2.setBorder(new Border(new BorderStroke(
        // Color.BLACK, // Border color
        // BorderStrokeStyle.SOLID, // Border style
        // CornerRadii.EMPTY, // Corner radii
        // new BorderWidths(2) // Border widths
        // )));
        // ------------------------------------------------------------------------------------------

        Label label1 = new Label("Welcome !");
        label1.setFont(Font.font("Roboto", FontWeight.BOLD, 60));
        label1.setTextFill(Color.WHITE);
        label1.setPadding(new Insets(0, 20, 0, 0));

        Label label2 = new Label("SignUp to Make your First Move..");
        label2.setFont(Font.font("TimesNewRoman", FontWeight.BOLD, 30));
        label2.setTextFill(Color.WHITE);
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
        TextField textField3 = new TextField();
        textField3.setPromptText("Username");
        textField3.setFocusTraversable(false);
        textField3.setFont(Font.font("Roboto", 16));
        textField3.setStyle("-fx-background-radius:10");

        VBox VboxforLabel3 = new VBox(8);
        VboxforLabel3.getChildren().addAll(label3, textField3);
        VboxforLabel3.setPrefSize(310, 0);

        FileInputStream fileInputStream3 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Desktop/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Anuj_Img/UserIcon.png");
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
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setFont(Font.font("Roboto", 16));
        passwordField.setFocusTraversable(false);
        passwordField.setPrefWidth(265);
        passwordField.setPrefHeight(270);
        passwordField.setStyle("-fx-background-radius:10");

        // ------------------------------------------------------------------------------------------------------------------------------------------------

        // Password Button

        TextField textField = new TextField();
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
                "C:/Users/ANUJKISHORBANKAR/Desktop/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Anuj_Img/PasswordIcon.png");
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

        Button signupButton = new Button("SIGNUP");
        signupButton.setPadding(new Insets(15));
        signupButton.setStyle("-fx-background-radius:15");
        signupButton.setPrefSize(238, 50);
        signupButton.setFocusTraversable(false);
        signupButton.setFont(Font.font("Roboto", FontWeight.BOLD, 19));
        signupButton.setStyle("-fx-background-radius:15;-fx-background-color:rgb(0, 255, 127)");

        VBox VboxforsignupButton = new VBox(signupButton);
        VboxforsignupButton.setPrefSize(450, 50);
        VboxforsignupButton.setAlignment(Pos.TOP_CENTER);
        // ----------------------------------------------------------------------------------------------------------------------------------------

        Button skipLogin = new Button("Back To LoginPage");
        skipLogin.setUnderline(true);
        skipLogin.setFont(Font.font("Roboto", 20));
        skipLogin.setPadding(new Insets(15));
        skipLogin.setPrefSize(220, 50);
        skipLogin.setFocusTraversable(false);
        skipLogin.setTextFill(Color.DARKBLUE);
        skipLogin.setStyle("-fx-background-color:rgb(218,112,214)");

        VBox VBoxtoSkip = new VBox(skipLogin);
        VBoxtoSkip.setAlignment(Pos.TOP_CENTER);
        VBoxtoSkip.setPrefSize(200, 200);

        VBox VBoxforButtons = new VBox(36, VboxforsignupButton, VBoxtoSkip);
        VBoxforButtons.setAlignment(Pos.CENTER_RIGHT);

        VBoxforButtons.setPrefSize(800, 230);

        VBoxforButtons.setAlignment(Pos.TOP_CENTER);

        // ---------------------------------------------------------------------------------------------------------------------------------

        VBox Contents = new VBox();
        Contents.setSpacing(35);
        Contents.getChildren().addAll(HboxforLabel3, HboxforLabel4, VBoxforButtons);

        Contents.setPrefHeight(900);
        Contents.setPrefWidth(749);
        Contents.setLayoutY(250);
        Contents.setPadding(new Insets(0, 50, 0, 0));
        VBox Container = new VBox(60);
        Container.getChildren().addAll(LabelContainer, Contents);
        Container.setPrefSize(749, 991);
        Container.setBackground(new Background(new BackgroundFill(Color.rgb(218, 112, 214), CornerRadii.EMPTY, null)));

        group2 = new Group();
        group2.getChildren().addAll(imageView2, imageView, Container);

        // -----------------------------------------------------------------------------------------------------------------------
        Scene scene = new Scene(group2);

        prStage.setScene(scene);

        prStage.show();

    }
}
