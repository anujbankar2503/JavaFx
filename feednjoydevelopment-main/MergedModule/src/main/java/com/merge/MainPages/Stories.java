package com.merge.MainPages;

//Author : Monika Bhosale

import java.io.FileInputStream;
import java.security.acl.Group;

//import javax.swing.GroupLayout.Group;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
//import javafx.scene.Group;
//import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
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
import javafx.scene.text.Text;

public class Stories {

    private LoginController loginController;

    private ScrollPane fxd_scroll;

    public Stories(LoginController loginController) throws Exception {

        this.loginController = loginController;

        initialize();

    }

    public void initialize() throws Exception {

        // text for title
        Text fxd_label = new Text("Our Stories");
        fxd_label.setFont(Font.font("Lucida Calligraphy", FontWeight.BOLD, 50));
        fxd_label.setFill(Color.BLACK);

        // text for thanks message
        Label fxd_Text = new Label("Thanks for visiting...");
        fxd_Text.setFont(Font.font("Lucida Calligraphy", FontWeight.BOLD, 45));
        fxd_Text.setTextFill(Color.BLACK);
        fxd_Text.setPadding(new Insets(20, 0, 0, 0));

        // hbox for aligning title

        HBox fxd_title = new HBox(fxd_label);
        fxd_title.setAlignment(Pos.CENTER);

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

        // image for logo

        FileInputStream fxd_FileInputStream = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/logom-removebg-preview.png");
        Image fxd_image8 = new Image(fxd_FileInputStream);
        ImageView fxd_imageView8 = new ImageView(fxd_image8);
        fxd_imageView8.setFitHeight(200);
        fxd_imageView8.setFitWidth(200);
        fxd_imageView8.setPreserveRatio(true);

        HBox fxd_HBox = new HBox(fxd_imageView8);
        fxd_HBox.setPrefSize(200, 200);
        fxd_HBox.setPadding(new Insets(20, 540, 0, 0));

        HBox fxd_HBox2 = new HBox(40,fxd_homeButton, 
        fxd_storiesButton, fxd_donateButton, fxd_contactButton,fxd_aboutButton);
        fxd_HBox2.setPadding(new Insets(50, 240, 0, 0));


        // Hbox for navbar
        HBox fxd_navbar = new HBox();
        fxd_navbar.setSpacing(40);
        fxd_navbar.setPrefHeight(50);
        fxd_navbar.setPadding(new Insets(0, 0, 110, 0));
        fxd_navbar.setAlignment(Pos.CENTER);

        // add all buttons to HBox
        fxd_navbar.getChildren().addAll(fxd_HBox, fxd_HBox2);

        // label for restaurant's name

        Label fxd_label2 = new Label("Parsian Darbar");
        fxd_label2.setFont(Font.font("comic sanc", FontWeight.BOLD, 22));
        fxd_label2.setTextFill(Color.BLACK);
        fxd_label2.setAlignment(Pos.CENTER);

        // image of restaurant

        FileInputStream fxd_FileInputStream2 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/hotel.jpg");

        Image fxd_image = new Image(fxd_FileInputStream2);
        ImageView fxd_imageView = new ImageView(fxd_image);
        fxd_imageView.setFitHeight(200);
        fxd_imageView.setFitWidth(300);
        fxd_imageView.setPreserveRatio(true);

        // label for description about donation

        Label fxd_label3 = new Label();
        fxd_label3.setText(
                "The Parsian Darbar is a shining example\nof how local businesses and non-profits\ncan work together to create meaningful\nchange. Parsian Darbar helped needy\npeople by donating 30 kilos of food.");
        fxd_label3.setAlignment(Pos.CENTER);
        fxd_label3.setFont(Font.font("CALIBRY",FontWeight.BOLD,15));

        // label for volunteer name

        Label fxd_label4 = new Label("Samarth Thali");
        fxd_label4.setFont(Font.font("comic sanc", FontWeight.BOLD, 22));
        fxd_label4.setTextFill(Color.BLACK);
        fxd_label4.setAlignment(Pos.CENTER);

        // image of volunteer

        FileInputStream fxd_FileInputStream3 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/hotel6.jpg");

        Image fxd_image2 = new Image(fxd_FileInputStream3);
        ImageView fxd_imageView2 = new ImageView(fxd_image2);
        fxd_imageView2.setFitHeight(200);
        fxd_imageView2.setFitWidth(300);
        fxd_imageView2.setPreserveRatio(true);

        // label for description about donation

        Label fxd_label5 = new Label();
        fxd_label5.setText(
                "Samarth Thali has recently donated food to\nNGO. The donation included a variety of\nfreshly prepared, high-quality food items,\nto ensuring that the beneficiaries would\nreceive nutritious meals.");
        fxd_label5.setAlignment(Pos.CENTER);
        fxd_label5.setFont(Font.font("CALIBRY",FontWeight.BOLD,15));
        // label for restaurant's name

        Label fxd_label6 = new Label("George Restaurant");
        fxd_label6.setFont(Font.font("comic sanc", FontWeight.BOLD, 22));
        fxd_label6.setTextFill(Color.BLACK);
        fxd_label6.setAlignment(Pos.CENTER);

        // image of restaurant

        FileInputStream fxd_FileInputStream4 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/hotel2.jpg");

        Image fxd_image3 = new Image(fxd_FileInputStream4);
        ImageView fxd_imageView3 = new ImageView(fxd_image3);
        fxd_imageView3.setFitHeight(200);
        fxd_imageView3.setFitWidth(300);
        fxd_imageView3.setPreserveRatio(true);

        // label for description about donation

        Label fxd_label7 = new Label();
        fxd_label7.setText(
                "The George restaurant's commitment\nto sustainability and community support\naligns perfectly with our missions. This\nRestaurant has helped many needy people\nby donating 50 kilos of food.");
        fxd_label7.setAlignment(Pos.CENTER);
        fxd_label7.setFont(Font.font("CALIBRY",FontWeight.BOLD,15));

        // vbox for alignment of fxd_label2,fxd_imageView,fxd_label3

        VBox fxd_vBox = new VBox(12, fxd_label2, fxd_imageView, fxd_label3);
        fxd_vBox.setAlignment(Pos.CENTER);
        fxd_vBox.setStyle("-fx-border-color: black; -fx-border-width: 3px; -fx-border-radius: 30px;");
        fxd_vBox.setMinSize(350, 400);

        // vbox for alignment of fxd_label4,fxd_imageView2,fxd_label5

        VBox fxd_vBox2 = new VBox(12, fxd_label4, fxd_imageView2, fxd_label5);
        fxd_vBox2.setAlignment(Pos.CENTER);
        fxd_vBox2.setStyle("-fx-border-color: black; -fx-border-width: 3px; -fx-border-radius: 30px;");
        fxd_vBox2.setMinSize(350, 400);

        // vbox for alignment of fxd_label6,fxd_imageView3,fxd_label7

        VBox fxd_vBox3 = new VBox(12, fxd_label6, fxd_imageView3, fxd_label7);
        fxd_vBox3.setAlignment(Pos.CENTER);
        fxd_vBox3.setStyle("-fx-border-color: black; -fx-border-width: 3px; -fx-border-radius: 30px;");
        fxd_vBox3.setMinSize(350, 400);

        // hbox for aligning vboxes

        HBox fxd_hBox = new HBox(140, fxd_vBox, fxd_vBox2, fxd_vBox3);
        fxd_hBox.setAlignment(Pos.CENTER);

        // label for volunteer's name

        Label fxd_label8 = new Label("Hotel Rajdhani");
        fxd_label8.setFont(Font.font("comic sanc", FontWeight.BOLD, 22));
        fxd_label8.setTextFill(Color.BLACK);
        fxd_label8.setAlignment(Pos.CENTER);

        // image of volunteer

        FileInputStream fxd_FileInputStream7 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/hotel7.jpg");

        Image fxd_image4 = new Image(fxd_FileInputStream7);
        ImageView fxd_imageView4 = new ImageView(fxd_image4);
        fxd_imageView4.setFitHeight(200);
        fxd_imageView4.setFitWidth(300);
        fxd_imageView4.setPreserveRatio(true);

        // label for description about donation

        Label fxd_label9 = new Label();
        fxd_label9.setText(
                "Hotel Rajdhani donated food to an NGO,\nsupporting their efforts to feed the hungry.\nThis contribution helps alleviate food insecurity\nand encourages community involvement in\naddressing hunger and poverty.");
        fxd_label9.setAlignment(Pos.CENTER);
        fxd_label9.setFont(Font.font("CALIBRY",FontWeight.BOLD,15));

        // label for restaurant's name

        Label fxd_label10 = new Label("Shivsagar Restaurant");
        fxd_label10.setFont(Font.font("comic sanc", FontWeight.BOLD, 22));
        fxd_label10.setTextFill(Color.BLACK);
        fxd_label10.setAlignment(Pos.CENTER);

        // image of restaurant

        FileInputStream fxd_FileInputStream5 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/hotel3.jpg");

        Image fxd_image5 = new Image(fxd_FileInputStream5);
        ImageView fxd_imageView5 = new ImageView(fxd_image5);
        fxd_imageView5.setFitHeight(200);
        fxd_imageView5.setFitWidth(300);
        fxd_imageView5.setPreserveRatio(true);

        // label for description about donation

        Label fxd_label11 = new Label();
        fxd_label11.setText(
                "Shivsagar Restaurant, a renowned establishment\nin the community, has once again demonstrated\nRestaurant's commitment to social responsibility\nby donating 40 kg of food to a local Non-\nGovernmental Organization (NGO).");
        fxd_label11.setAlignment(Pos.CENTER);
        fxd_label11.setTextFill(Color.BLACK);
        fxd_label11.setFont(Font.font("CALIBRY",FontWeight.BOLD,15));

        // label for volunteer's name

        Label fxd_label12 = new Label("Parivar Restaurant");
        fxd_label12.setFont(Font.font("comic sanc", FontWeight.BOLD, 22));
        fxd_label12.setTextFill(Color.BLACK);
        fxd_label12.setAlignment(Pos.CENTER);

        // image of volunteer

        FileInputStream fxd_FileInputStream6 = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/hotel8.jpg");

        Image fxd_image6 = new Image(fxd_FileInputStream6);
        ImageView fxd_imageView6 = new ImageView(fxd_image6);
        fxd_imageView6.setFitHeight(200);
        fxd_imageView6.setFitWidth(300);
        fxd_imageView6.setPreserveRatio(true);

        // label for description about donation

        Label fxd_label13 = new Label();
        fxd_label13.setText(
                "Parivar restaurant has recently donated food to\nNGO. The donation included a variety of\nfreshly prepared, high-quality food items,\nto ensuring that the beneficiaries would\nreceive nutritious meals.");
        fxd_label13.setAlignment(Pos.CENTER);
        fxd_label13.setFont(Font.font("CALIBRY",FontWeight.BOLD,15));

        // vbox for aligning fxd_label8,fxd_imageView4,fxd_label9

        VBox fxd_vBox4 = new VBox(12, fxd_label8, fxd_imageView4, fxd_label9);
        fxd_vBox4.setAlignment(Pos.CENTER);
        fxd_vBox4.setStyle("-fx-border-color: black; -fx-border-width: 3px; -fx-border-radius: 30px;");
        fxd_vBox4.setMinSize(360, 400);

        // vbox for aligning fxd_label10,fxd_imageView5,fxd_label11

        VBox fxd_vBox5 = new VBox(25, fxd_label10, fxd_imageView5, fxd_label11);
        fxd_vBox5.setAlignment(Pos.CENTER);
        fxd_vBox5.setStyle("-fx-border-color: black; -fx-border-width: 3px; -fx-border-radius: 30px;");
        fxd_vBox5.setMinSize(360, 400);

        // vbox for aligning fxd_label12,fxd_imageView6,fxd_label13

        VBox fxd_vBox6 = new VBox(12, fxd_label12, fxd_imageView6, fxd_label13);
        fxd_vBox6.setAlignment(Pos.CENTER);
        fxd_vBox6.setStyle("-fx-border-color: black; -fx-border-width: 3px; -fx-border-radius: 30px;");
        fxd_vBox6.setMinSize(350, 400);

        // hbox for aligning above vboxes

        HBox fxd_hBox2 = new HBox(140, fxd_vBox4, fxd_vBox6, fxd_vBox5);
        fxd_hBox2.setAlignment(Pos.CENTER);

        // vbox for alignment of hboxes

        VBox fxd_vBox7 = new VBox(100, fxd_hBox, fxd_hBox2, fxd_Text);
        fxd_vBox7.setAlignment(Pos.CENTER);

        VBox fxd_vb = new VBox(fxd_navbar, fxd_vBox7);
        fxd_vb.setAlignment(Pos.CENTER);

        // // label for footer

        // Label footerLabel = new Label("© 2024 Feed-N-Joy. All rights reserved.");
        // footerLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #FFFFE0;");
        // HBox footer = new HBox(footerLabel);
        // footer.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5); -fx-padding: 10px;");
        // footer.setAlignment(Pos.CENTER);

        // Border Pane for Navbar
        BorderPane fxd_NavbarBp = new BorderPane();
        fxd_NavbarBp.setTop(fxd_navbar);
        fxd_NavbarBp.setCenter(fxd_vBox7);

        BorderPane fxd_BorderPane = new BorderPane();
        // fxd_BorderPane.setTop(fxd_navbar);
        fxd_BorderPane.setTop(fxd_NavbarBp);
        //fxd_BorderPane.setBottom(footer);

        VBox fxd_gr = new VBox(fxd_BorderPane);
        //fxd_gr.setPrefWidth(2000);
        //fxd_gr.setMaxHeight(1100);

        FileInputStream fxd_File = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/AA.png");
        Image fxd_im = new Image(fxd_File);
        ImageView fxd_ima = new ImageView(fxd_im);
        fxd_ima.setFitHeight(1450);
        fxd_ima.setFitWidth(2000);
        //fxd_im.setPreserveRatio(true);
        
        // stackpane for adding image in background
        StackPane fxd_stackpane = new StackPane(fxd_ima,fxd_gr);
        // scrollpane for scrolling

        fxd_scroll = new ScrollPane(fxd_stackpane);
        fxd_scroll.setVbarPolicy(ScrollBarPolicy.ALWAYS);

    }

    public ScrollPane getView() {

        return fxd_scroll;
    }

    // button style
    public Button createStyledButton(String text) {
        Button button = new Button(text);
        button.setPrefHeight(50);
        button.setPrefWidth(120);
        button.setStyle(
                "-fx-background-color:transparent; -fx-border-color:black; -fx-text-fill: black; -fx-font-size: 20px; -fx-font-weight: bold; -fx-border-width: 2; -fx-borderstyle:solid; -fx-border-radius: 35;");
        button.setOnMouseEntered(e -> button.setStyle(
                "-fx-background-color:BLACK; -fx-text-fill: white; -fx-font-size: 20px; -fx-font-weight: bold; -fx-background-radius: 20;"));
        button.setOnMouseExited(e -> button.setStyle(
                "-fx-background-color:transparent; -fx-border-color:black; -fx-text-fill: black; -fx-font-size: 20px; -fx-font-weight: bold; -fx-border-width: 2; -fx-borderstyle:solid; -fx-border-radius: 20"));
        return button;}
}
