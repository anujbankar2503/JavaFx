package com.merge.MainPages;

import javafx.scene.control.Label;

import javafx.scene.control.Button;
import java.net.URI;
import java.nio.file.Paths;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ComingSoon {

     private LoginController loginController;

    private StackPane fxd_StackPane;
    private Group total;
    // private  Button fxd_back;

    public ComingSoon(LoginController loginController) throws Exception {

        this.loginController = loginController;

        initialize();
    }

    public void initialize() throws Exception {

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

        Label fxd_message = new Label("Coming Soon...");
        fxd_message.setFont(Font.font("Lucida calligraphy", FontWeight.BOLD, 120));
        fxd_message.setAlignment(Pos.CENTER);

        VBox fxd_VBox = new VBox(fxd_message);
        fxd_VBox.setAlignment(Pos.CENTER);

        Button fxd_back = new Button("Back");
        fxd_back.setUnderline(true);
        fxd_back.setTextFill(Color.BLUEVIOLET);
        fxd_back.setFont(Font.font("Roboto", FontWeight.BOLD, 25));
        fxd_back.setPadding(new Insets(9));
        fxd_back.setStyle("-fx-background-color:transparent; -fx-font-weight:bold; -fx-background-radius:10");
        fxd_back.setMinSize(60, 30);

        VBox fxd_VBox2 = new VBox(fxd_back);
        fxd_VBox2.setAlignment(Pos.CENTER);
        fxd_VBox2.setPadding(new Insets(870, 0, 30, 0));

         fxd_back.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {

                loginController.NavigateToSignUp();

            }

        });
        

        fxd_StackPane = new StackPane(mediaView,fxd_VBox,fxd_VBox2);

    }

    public StackPane getView() {

        return fxd_StackPane;
    }
    
}
