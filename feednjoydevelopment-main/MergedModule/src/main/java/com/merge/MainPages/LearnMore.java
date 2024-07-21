package com.merge.MainPages;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.net.URI;
import java.nio.file.Paths;
import javafx.scene.Group;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LearnMore {

    private LoginController loginController;

    private StackPane fxd_StackPane;
    private Group total;
    // private  Button fxd_back;

    public LearnMore(LoginController loginController) throws Exception {

        this.loginController = loginController;

        initialize();
    }

    public void initialize() throws Exception {

        Label fxd_Label = new Label("Food Waste Management");
        fxd_Label.setFont(Font.font("Comic sanc", FontWeight.BOLD, 30));
        fxd_Label.setStyle("-fx-font-weight:bold");
        fxd_Label.setAlignment(Pos.CENTER);
        fxd_Label.setPadding(new Insets(0, 146, 0, 0));

        Label fxd_content = new Label();
        fxd_content.setText(
                "       Food waste is a significant issue in India, where millions of\npeople live in poverty, and a large number of individuals struggle with\nfood insecurity. At the same time, India is one of the largest food\nproducers in the world, with a considerable amount of food produced\ngoing to waste every year. The government of India has recognized the\nseverity of the issue and has implemented various initiatives to manage\nfood waste. The government has launched the 'Anna Daata Sukhi Bhava'\ncampaign, which aims to create awareness about the importance of not\n wasting food. Additionally, the government has established the Indian\nFood Banking Network, which collects surplus food from hotels, restau-\nrants, and other food establishments and distributes it to the needy.\n");

        fxd_content.setAlignment(Pos.CENTER);
        fxd_content.setStyle("-fx-font-size: 20px; -fx-text-fill:BLACK");

        Label fxd_content1 = new Label();
        fxd_content1.setText(
                "       Numerous non-profit organizations in India are also working on\nfood waste. For example, Feeding India is an NGO that has established\na network of volunteers who collect excess food from various sources\nand distribute it to those in need. Similarly, Robin Hood Army is\nanother NGO that has established a network of volunteers who collect\nexcess food and distribute it to the homeless individuals.\n");

        fxd_content1.setAlignment(Pos.CENTER);
        fxd_content1.setFont(Font.font("cambria",FontWeight.SEMI_BOLD, 20));
        fxd_content1.setStyle("-fx-font-size: 20px; -fx-text-fill:BLACK");

        Label fxd_content2 = new Label();
        fxd_content2.setText(
                "       In recent years, there has also been an increase in the number of\nstartups working towards reducing food waste in India. Companies like\nToo Good To Go, Zomato Feeding India, and Khaana Chahiye are some\nexamples of startups that are working towards reducing food waste by\nproviding a platform for restaurants and hotels to sell excess food\nat discounted rates.\n");

        fxd_content2.setAlignment(Pos.CENTER);
        fxd_content2.setFont(Font.font("cambria",FontWeight.SEMI_BOLD, 20));
        fxd_content2.setStyle("-fx-font-size: 20px;  -fx-text-fill:BLACK");

        Label fxd_content3 = new Label();
        fxd_content3.setText(
                "       Overall, food waste management in India is still a working in\nprogress, but various initiatives and organizations are working towards\nreducing the amount of food wasted and ensuring that it is used to\nfeed the needy");

        fxd_content3.setAlignment(Pos.CENTER);
        fxd_content3.setFont(Font.font("cambria",FontWeight.SEMI_BOLD, 20));
        fxd_content3.setStyle("-fx-font-size: 20px; -fx-text-fill:BLACK");

        // VBox fxd_VBox = new VBox(10, fxd_Label, fxd_content, fxd_content1, fxd_content2, fxd_content3);
        // fxd_VBox.setAlignment(Pos.CENTER_RIGHT);
        // fxd_VBox.setPadding(new Insets(0, 170, 0, 0));

        FileInputStream fxd_file = new FileInputStream("C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Monika_Img/AA.png");
        Image fxd_Image = new Image(fxd_file);
        ImageView fxd_ImageView = new ImageView(fxd_Image);
        fxd_ImageView.setFitWidth(1920);
        fxd_ImageView.setFitHeight(1200);

        FileInputStream fxd_file2 = new FileInputStream("C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/VarunImg/th7.jpg");
        Image fxd_Image2 = new Image(fxd_file2);
        ImageView fxd_ImageView2 = new ImageView(fxd_Image2);
        fxd_ImageView2.setFitHeight(800);
        fxd_ImageView2.setFitWidth(800);
        fxd_ImageView2.setPreserveRatio(true);

        Button fxd_back = new Button("Back");
        fxd_back.setFont(Font.font("Roboto", FontWeight.BOLD, 15));
        fxd_back.setPadding(new Insets(9));
        fxd_back.setStyle("-fx-background-color:WHITE;-fx-background-radius:10");
        fxd_back.setMinSize(60, 10);
        fxd_back.setAlignment(Pos.CENTER);

         fxd_back.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {

                loginController.NavigateToHomePage();

            }

        });

        VBox fxd_VBox4 = new VBox(fxd_back); 
        fxd_VBox4.setAlignment(Pos.CENTER);

        VBox fxd_VBox = new VBox(10, fxd_Label, fxd_content, fxd_content1, fxd_content2, fxd_content3,fxd_VBox4);
        fxd_VBox.setAlignment(Pos.CENTER_RIGHT);
        fxd_VBox.setPadding(new Insets(0, 170, 0, 0));


        VBox fxd_VBox2 = new VBox(fxd_ImageView2);
        fxd_VBox2.setAlignment(Pos.CENTER_LEFT);
        fxd_VBox2.setPadding(new Insets(0, 0, 0, 80));

        String fxd_video = "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/video5.mp4";

        URI uri = Paths.get(fxd_video).toUri();

        // Create a Media object
        Media media = new Media(uri.toString());

        // Create a MediaPlayer object
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        // Create a MediaView object
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaView.setFitWidth(1920);
        mediaView.setFitHeight(1200);
        mediaView.setPreserveRatio(true);

        // Start playing the video
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop the video
        mediaPlayer.play();
          
        // Button fxd_back = new Button("Back");
        // fxd_back.setFont(Font.font("Roboto", FontWeight.BOLD, 15));
        // fxd_back.setPadding(new Insets(9));
        // fxd_back.setStyle("-fx-background-color:STEELBLUE;-fx-background-radius:10");

        HBox fxd_HBox = new HBox(220,fxd_VBox2,fxd_VBox);
        total = new Group(mediaView,fxd_HBox);

    //     fxd_back.setOnAction(e -> {

    //             loginController.NavigateToSignUp();
    //             total.setVisible(false);
    //         });
    

        fxd_StackPane = new StackPane(mediaView,fxd_HBox);

    }

    

    public StackPane getView() {

        return fxd_StackPane;
    }
}

// Food waste is a significant issue in India, where millions of people still
// live in poverty, and a large number of individuals struggle with food
// insecurity. At the same time, India is one of the largest food producers in
// the world, with a considerable amount of food produced going to waste every
// year.

// The government of India has recognized the severity of the issue and has
// implemented various initiatives to manage food waste. The government has
// launched the 'Anna Daata Sukhi Bhava' campaign, which aims to create
// awareness about the importance of not wasting food. Additionally, the
// government has established the Indian Food Banking Network, which collects
// surplus food from hotels, restaurants, and other food establishments and
// distributes it to the needy.

// Numerous non-profit organizations in India are also working towards\nfood
// waste. For example, Feeding India is an NGO that has established a\nnetwork
// of volunteers who collect excess food from various sources and\ndistribute it
// to those in need. Similarly, Robin Hood Army is another NGO\nthat has
// established a network of volunteers who collect excess food and\ndistribute
// it to the homeless and underprivileged individuals.\n
