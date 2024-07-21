// Author : Monika Bhosale 

package com.merge.MainPages;

import java.awt.Desktop;
import java.io.FileInputStream;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class AboutUsPage {

    private LoginController loginController;

    private ScrollPane fxd_scroll;

    public AboutUsPage(LoginController loginController) throws Exception {

        this.loginController = loginController;

        initialize();

    }

    public void initialize() throws Exception {

        // Buttons for navbar
        Button fxd_homeButton = createStyledButton("Home");

        fxd_homeButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {

                loginController.NavigateToHomePage();

            }

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

        // Image of logo
        FileInputStream fxd_lo = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/logom-removebg-preview.png");
        Image fxd_logo = new Image(fxd_lo);
        ImageView fxd_logov = new ImageView(fxd_logo);
        fxd_logov.setFitHeight(200);
        fxd_logov.setFitWidth(180);
        fxd_logov.setPreserveRatio(true);

        // Hbox for navbar
        HBox fxd_navbar = new HBox(fxd_homeButton,   fxd_storiesButton,
                fxd_donateButton,fxd_contactButton,fxd_aboutButton);
        fxd_navbar.setSpacing(50);
        fxd_navbar.setPrefHeight(100);
        fxd_navbar.setAlignment(Pos.CENTER_RIGHT);

        // hbox for logo+navbar
        HBox fxd_hbox1_nav = new HBox(fxd_logov);
        fxd_hbox1_nav.setAlignment(Pos.TOP_LEFT);

        // hbox for logo+navbar
        HBox fxd_HBox = new HBox(750,fxd_hbox1_nav,fxd_navbar);
        //fxd_hbox1_nav.setPadding(new Insets(0, 0, 0, 150));

        // Mission Label
        Label fxd_lb1 = new Label("Our Mission");
        fxd_lb1.setFont(Font.font("Lucida calligraphy", FontWeight.BOLD, 33));
        fxd_lb1.setTextFill(Color.BLACK);
        fxd_lb1.setAlignment(Pos.TOP_LEFT);

        // Mission Content
        Label fxd_lb2 = new Label(
                "At Feed-n-joy, our mission is to create a sustainable \nfuture by reducing food waste and providing nutri- \ntious meals to those in need. We strive  to bridge \nthe gap between food surplus & food scarcity through \ninnovative solutions, community engagement,& strategic \npartnerships. By rescuing surplus food & redistributing \nit to hungry individuals and families,we aim to promote\nenvironmental sustainability, social responsibility,&food \nsecurity for all.\n");
        fxd_lb2.setFont(Font.font("Arial", 22));
        fxd_lb2.setTextFill(Color.BLACK);
        fxd_lb2.setLayoutX(10);
        fxd_lb2.setLayoutY(140);
        fxd_lb2.setPadding(new Insets(10, 0, 0, 0));
        // Mission Image
        FileInputStream fxd_miss = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/about.png");
        Image fxd_ig = new Image(fxd_miss);
        ImageView fxd_im = new ImageView(fxd_ig);
        fxd_im.setPreserveRatio(true);
        fxd_im.setFitWidth(500);
        fxd_im.setFitHeight(250);
        // add mission content and image in HBox
        HBox fxd_hb1 = new HBox(10, fxd_lb2, fxd_im);
        fxd_hb1.setLayoutX(30);
        // Mission Label and HBox(mission) in VBox
        VBox fxd_mission = new VBox(10, fxd_lb1, fxd_hb1);
        fxd_mission.setLayoutX(30);
        fxd_mission.setLayoutY(30);
        // fxd_mission.setPadding(new Insets(0, 60, 0, 0));
        fxd_mission.setStyle("-fx-border-color:BLACK; -fx-border-width: 2; -fx-border-radius: 10; -fx-padding: 20");

        // Label of Vision
        Label fxd_ll1 = new Label("Our Vision");
        fxd_ll1.setFont(Font.font("Lucida calligraphy", FontWeight.BOLD, 35));
        fxd_ll1.setTextFill(Color.BLACK);
        fxd_ll1.setAlignment(Pos.TOP_LEFT);
        // Image of vision
        FileInputStream fxd_vis = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/f.png");
        Image fxd_ig1 = new Image(fxd_vis);
        ImageView fxd_im1 = new ImageView(fxd_ig1);
        fxd_im1.setPreserveRatio(true);
        fxd_im1.setFitWidth(500);
        fxd_im1.setFitHeight(250);
        // Content of vision
        Label fxd_ll2 = new Label(
                "Feed-n-joy is an organisation which aim to redistribute \nfood from weddings, parties, events to those who are hungry.. \nAt Feed-n-joy, we envision a world where no one goes \nhungry and food waste is a thing of the past.\nOur goal is to create a sustainable,efficient,& compassionate \nfood management and donation network  that connects \nsurplus food with those in need,fostering a community of \ngenerosity, environmental stewardship,& social responsibility.");
        fxd_ll2.setFont(Font.font("Arial", 22));
        fxd_ll2.setTextFill(Color.BLACK);
        // add content of vision and image in HBox
        HBox fxd_hb2 = new HBox(10, fxd_ll2, fxd_im1);
        // add Label of vision and HBox(vision) in one VBox
        VBox fxd_vision = new VBox(30, fxd_ll1, fxd_hb2);
        // fxd_vision.setPadding(new Insets(60, 0, 0, 0));
        fxd_vision.setStyle("-fx-border-color:BLACK; -fx-border-width: 2; -fx-border-radius: 10; -fx-padding: 20");

        // both mission and vision VBox gives to HBox
        HBox fxd_middle = new HBox(50, fxd_mission, fxd_vision);
        fxd_middle.setPadding(new Insets(0, 0, 0, 40));

        // Label of Our Team
        Label fxd_Team = new Label("Our Team");
        fxd_Team.setFont(Font.font("Lucida calligraphy", FontWeight.BOLD, 40));
        fxd_Team.setTextFill(Color.BLACK);
        fxd_Team.setAlignment(Pos.CENTER);
        fxd_Team.setPadding(new Insets(0, 50, 0, 0));

        // Image of Team Member (Anuj Bankar)
        FileInputStream fxd_anuj = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/anuj2.jpg");
        Image fxd_member1 = new Image(fxd_anuj);
        ImageView fxd_m1 = new ImageView(fxd_member1);
        fxd_m1.setPreserveRatio(true);
        fxd_m1.setFitWidth(500);
        fxd_m1.setFitHeight(250);

        Circle circle4 = new Circle(120, 120, 120); // centerX, centerY, radius

        // Set the circle as the clip for the ImageView
        fxd_m1.setClip(circle4);

        // Add the ImageView to a VBox
        VBox vbox4 = new VBox();
        vbox4.getChildren().add(fxd_m1);

        Text fxd_tx = new Text("   Anuj Bankar");
        fxd_tx.setFill(Color.BLACK);
        fxd_tx.setFont(Font.font("Lucida calligraphy", FontWeight.BOLD, 25));
        Text fxd_tx1 = new Text("      Programmer");
        fxd_tx1.setFill(Color.BLACK);
        fxd_tx1.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 25));
        // Image and Information about Anuj in VBox
        VBox fxd_Team1 = new VBox(15, vbox4, fxd_tx, fxd_tx1);
        // fxd_Team1.setStyle("-fx-border-color:LIGHTBLUE; -fx-border-width: 2;
        // -fx-border-radius: 5; -fx-padding: 25");

        // Images of Team Member (Varun Deshmukh)
        FileInputStream fxd_var = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/varun.jpg");
        Image fxd_member2 = new Image(fxd_var);
        ImageView fxd_m2 = new ImageView(fxd_member2);
        fxd_m2.setPreserveRatio(true);
        fxd_m2.setFitWidth(500);
        fxd_m2.setFitHeight(250);

        Circle circle5 = new Circle(120, 120, 120); // centerX, centerY, radius

        // Set the circle as the clip for the ImageView
        fxd_m2.setClip(circle5);

        // Add the ImageView to a VBox
        VBox vbox5 = new VBox();
        vbox5.getChildren().add(fxd_m2);

        Text fxd_txtG = new Text("  Varun Deshmukh");
        fxd_txtG.setFill(Color.BLACK);
        fxd_txtG.setFont(Font.font("Lucida calligraphy", FontWeight.BOLD, 25));
        Text fxd_txtG1 = new Text("       Programmer");
        fxd_txtG1.setFill(Color.BLACK);
        fxd_txtG1.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 25));
        // Image and Information about Gauri in VBox
        VBox fxd_Team3 = new VBox(15, vbox5, fxd_txtG, fxd_txtG1);
        // fxd_Team3.setStyle("-fx-border-color: LIGHTBLUE; -fx-border-width: 2;
        // -fx-border-radius: 5; -fx-padding: 25");

        // Images of Team Member (Monika Bhosale)
        FileInputStream fxd_mon = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/my.jpg");
        Image fxd_member3 = new Image(fxd_mon);
        ImageView fxd_m3 = new ImageView(fxd_member3);
        fxd_m3.setPreserveRatio(true);
        fxd_m3.setFitWidth(500);
        fxd_m3.setFitHeight(250);

        Circle circle6 = new Circle(120, 120, 120); // centerX, centerY, radius

        // Set the circle as the clip for the ImageView
        fxd_m3.setClip(circle6);

        // Add the ImageView to a VBox
        VBox vbox6 = new VBox();
        vbox6.getChildren().add(fxd_m3);

        Text txt = new Text("   Monika Bhosale");
        txt.setFill(Color.BLACK);
        txt.setFont(Font.font("Lucida calligraphy", FontWeight.BOLD, 25));
        Text txt1 = new Text("        Programmer");
        txt1.setFill(Color.BLACK);
        txt1.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 25));
        // Image and Information about monika in VBox
        VBox fxd_Team2 = new VBox(15, vbox6, txt, txt1);
        // fxd_Team2.setStyle("-fx-border-color: LIGHTBLUE; -fx-border-width: 2;
        // -fx-border-radius: 5; -fx-padding: 25");

        // Image of Team Member (gauri dagale)
        FileInputStream fxd_ga = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/Gauri.jpg");
        Image fxd_mo4 = new Image(fxd_ga);
        ImageView fxd_m4 = new ImageView(fxd_mo4);
        fxd_m4.setPreserveRatio(true);
        fxd_m4.setFitWidth(500);
        fxd_m4.setFitHeight(250);

        Circle circle = new Circle(118, 118, 118); // centerX, centerY, radius

        // Set the circle as the clip for the ImageView
        fxd_m4.setClip(circle);

        // Add the ImageView to a VBox
        VBox vbox = new VBox();
        vbox.getChildren().add(fxd_m4);

        Text fxd_txtV = new Text("     Gauri Dagale");
        fxd_txtV.setFill(Color.BLACK);
        fxd_txtV.setFont(Font.font("Lucida calligraphy", FontWeight.BOLD, 25));
        Text fxd_txtV1 = new Text("        Programmer");
        fxd_txtV1.setFill(Color.BLACK);
        fxd_txtV1.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 25));
        // Image and Information about Varun in VBox
        VBox fxd_Team4 = new VBox(15, vbox, fxd_txtV, fxd_txtV1);
        // fxd_Team4.setStyle("-fx-border-color: LIGHTBLUE; -fx-border-width: 2;
        // -fx-border-radius: 5; -fx-padding: 25");

        // Image of core2web
        FileInputStream fxd_cr = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/c2w.jpg");
        Image fxd_mo5 = new Image(fxd_cr);
        ImageView fxd_m5 = new ImageView(fxd_mo5);
        fxd_m5.setPreserveRatio(true);
        fxd_m5.setFitWidth(500);
        fxd_m5.setFitHeight(250);

        Circle circle2 = new Circle(120, 120, 120); // centerX, centerY, radius

        // Set the circle as the clip for the ImageView
        fxd_m5.setClip(circle2);

        Hyperlink fxd_c2w = new Hyperlink();
        fxd_c2w.setGraphic(fxd_m5);
        fxd_c2w.setOnAction( e-> {
                openWebPage("https://core2web.in/about-us");
            });

        //Add hover effects to the ImageView
            fxd_m5.setOnMouseEntered(e -> {
                fxd_m5.setCursor(Cursor.HAND);
                fxd_m5.setScaleX(1.05);
                fxd_m5.setScaleY(1.05);
            });
            fxd_m5.setOnMouseExited(e -> {
                fxd_m5.setScaleX(2);
                fxd_m5.setScaleY(2);
            });

        // Add the ImageView to a VBox
        VBox vbox2 = new VBox();
        vbox2.getChildren().add(fxd_c2w);

        Text fxd_txtC = new Text("        Core2web ");
        fxd_txtC.setFill(Color.BLACK);
        fxd_txtC.setFont(Font.font("Lucida calligraphy", FontWeight.BOLD, 25));
        Text fxd_txtC1 = new Text("          Inspiration");
        fxd_txtC1.setFill(Color.BLACK);
        fxd_txtC1.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 25));
        // Image and Information about Core2web in VBox
        VBox fxd_Team5 = new VBox(15, vbox2, fxd_txtC, fxd_txtC1);
        // fxd_Team5.setStyle("-fx-border-color:LIGHTBLUE; -fx-border-width: 3;
        // -fx-border-radius: 10; -fx-padding: 25");

        // All Team Members VBOX in HBox
        HBox fxd_Next = new HBox(100, fxd_Team1, fxd_Team3, fxd_Team5, fxd_Team2, fxd_Team4);
        fxd_Next.setPadding(new Insets(30, 0, 0, 80));

        // Team Label and HBox in VBox
        VBox fxd_Leader = new VBox(20, fxd_Team, fxd_Next);
        fxd_Leader.setPadding(new Insets(60, 0, 20, 0));
        fxd_Leader.setAlignment(Pos.CENTER);

        // BorderPane for set Navbar at top
        BorderPane fxd_Bp = new BorderPane();
        fxd_Bp.setTop(fxd_HBox);
        // navbar,(mission,vission),Our Team in VBox
        VBox fxd_all = new VBox(20, fxd_Bp, fxd_middle, fxd_Leader);

        // // footer content
        // Label footerLabel = new Label("© 2024 Feed-N-Joy. All rights reserved.");
        // footerLabel.setStyle("-fx-font-size: 15px; -fx-text-fill:BLACK;");
        // HBox footer = new HBox(footerLabel);
        // footer.setStyle("-fx-background-color:GRAY; -fx-padding: 8px;");
        // footer.setAlignment(Pos.CENTER);

        // // BorderPane for footer
        // BorderPane fxd_brFooter = new BorderPane();
        // fxd_brFooter.setBottom(footer);

        // give background image and all content to group
        VBox fxd_gr = new VBox(fxd_all);
        fxd_gr.setPrefWidth(2000);
        fxd_gr.setStyle(
                "-fx-background-image:url('https://images.unsplash.com/photo-1554034483-04fda0d3507b?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D')");
        fxd_gr.setPadding(new Insets(0, 0, 10, 0));
        fxd_scroll = new ScrollPane(fxd_gr);
        fxd_scroll.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        fxd_scroll.setHbarPolicy(ScrollBarPolicy.NEVER);
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
        return button;

    }

    public static void openWebPage(String urlPath) {
    try {
        Desktop.getDesktop().browse(new URL(urlPath).toURI());
    } catch(Exception e) {
        System.out.println(e.getMessage());
    }
}

    public ScrollPane getView() {

        return fxd_scroll;

    }

}
