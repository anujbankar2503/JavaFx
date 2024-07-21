package com.merge.MainPages;

import java.io.FileInputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;
import java.awt.Desktop;

public class HomePage2 {

    private LoginController loginController;
    private Label timeLabel;
    private DateTimeFormatter timeFormatter;
    private ScrollPane fxd_scrollpane;
    private VBox chatbotBox;
    private VBox chatHistory;
    

    public HomePage2(LoginController loginController) throws Exception {
        this.loginController = loginController;
        initialize();
    }

    public void initialize() throws Exception {
        // Create UI elements
        Label fxd_welcomeLabel = new Label("Your Extra Their");
        fxd_welcomeLabel.setAlignment(Pos.CENTER);
        Label fxd_welcomeLabel4 = new Label("Essentials");
        fxd_welcomeLabel4.setAlignment(Pos.CENTER);

        Label fxd_welcomeLabel1 = new Label("Turning the waste into worth");
        fxd_welcomeLabel1.setAlignment(Pos.CENTER);
        fxd_welcomeLabel1.setTextFill(Color.DARKGREEN);
        Label fxd_welcomeLabel3 = new Label("Give Meal, Give Hope!!!");
        fxd_welcomeLabel3.setAlignment(Pos.CENTER);
        fxd_welcomeLabel3.setTextFill(Color.DARKGREEN);

        fxd_welcomeLabel.setStyle("-fx-font-size: 55px; -fx-font-weight: bold; -fx-text-fill:MAROON");
        fxd_welcomeLabel4.setStyle("-fx-font-size: 55px; -fx-font-weight: bold; -fx-text-fill:MAROON");
        fxd_welcomeLabel1.setStyle("-fx-font-size: 24px;-fx-font-weight: bold");
        fxd_welcomeLabel3.setStyle("-fx-font-size: 24px;-fx-font-weight: bold");

        // Buttons for navbar
        Button fxd_homeButton = createStyledButton("Home");

        Button fxd_aboutButton = createStyledButton("About");
        fxd_aboutButton.setOnAction(e -> loginController.NavigateToAboutUs());

        Button fxd_contactButton = createStyledButton("Contact");
        fxd_contactButton.setOnAction(e -> loginController.NavigateToContactUs());

        Button fxd_donateButton = createStyledButton("Donate");
        fxd_donateButton.setOnAction(e -> loginController.NavigateToDonationPage());

        Button fxd_storiesButton = createStyledButton("Stories");
        fxd_storiesButton.setOnAction(e -> loginController.NavigateToStories());
        
        Button  fxd_Logout = createStyledButton("Logout");
        fxd_Logout.setOnAction(e -> {loginController.NavigateToSignIn();});

        Button fxd_learnMore = new Button("learnmore");
        fxd_learnMore.setTextFill(Color.DARKBLUE);
        fxd_learnMore.setFont(Font.font("ARIAL",FontWeight.BOLD,20));
        fxd_learnMore.setUnderline(true);
        fxd_learnMore.setStyle("-fx-background-color:transparent");

        fxd_learnMore.setOnAction(e -> {

            loginController.NavigateToLearnMore();

        });


        // Chatbot button added to the navbar
        Button fxd_chatbotButton = createStyledButton("Chatbot");
        fxd_chatbotButton.setOnAction(e -> chatbotBox.setVisible(!chatbotBox.isVisible()));


        // Footer content
        Label footerLabel = new Label("© 2024 Feed-N-Joy. All rights reserved.                                                               ");
        footerLabel.setStyle("-fx-font-size: 15px; -fx-text-fill:BLACK;");
        footerLabel.setPadding(new Insets(0, 0, 0, 650));
        HBox footer = new HBox(footerLabel);
        footer.setStyle("-fx-background-color:whitesmoke; -fx-padding: 8px;");
        footer.setAlignment(Pos.BOTTOM_CENTER);
        footer.setMaxWidth(1950);

        // BorderPane for alignment of footer
        BorderPane fxd_border = new BorderPane();
        fxd_border.setBottom(footer);
        fxd_border.setPadding(new Insets(70, 0, 0, 0));

    
        FileInputStream fxd_Stream = new FileInputStream("C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/logom-removebg-preview.png");
        Image fxd_image1 = new Image(fxd_Stream);
        ImageView fxd_imageView1 = new ImageView(fxd_image1);
        fxd_imageView1.setFitHeight(210);
        fxd_imageView1.setFitWidth(200);
        fxd_imageView1.setPreserveRatio(true);


        HBox fxd_HBox = new HBox(10, fxd_imageView1);
        fxd_HBox.setAlignment(Pos.CENTER);
        fxd_HBox.setPadding(new Insets(0, 20, 20, 0));


        // HBox for navbar
        HBox fxd_navbar = new HBox(fxd_homeButton, fxd_storiesButton, fxd_donateButton,fxd_contactButton, fxd_aboutButton, fxd_chatbotButton,fxd_Logout);
        fxd_navbar.setSpacing(50);
        fxd_navbar.setPrefHeight(60);
        fxd_navbar.setAlignment(Pos.TOP_CENTER);
        fxd_navbar.setPadding(new Insets(40, 0, 120, 630));

        Button fxd_Button = new Button("Learn more");
        fxd_Button.setAlignment(Pos.CENTER);
        fxd_Button.setMinSize(100, 20);
        fxd_Button.setStyle("-fx-background-radius:20; fx-padding:10");

        VBox fxd_VBox = new VBox(20, fxd_HBox, fxd_welcomeLabel, fxd_welcomeLabel4, fxd_welcomeLabel1, fxd_welcomeLabel3, fxd_learnMore);
        fxd_VBox.setAlignment(Pos.CENTER);
        fxd_VBox.setPadding(new Insets(0, 0, 0, 650));

        VBox fxd_VBox2 = new VBox(40, fxd_navbar, fxd_VBox);
        VBox fxd_VBox3 = new VBox(200, fxd_VBox2 );
        fxd_VBox3.setPadding(new Insets(0, 0, 0, 50));

       
        // Create the chat history VBox
        chatHistory = new VBox();
        chatHistory.setSpacing(10);
       // chatHistory.setPadding(new Insets(10));
        chatHistory.setStyle("-fx-border-color: gray; -fx-border-width: 1px; -fx-background-color:lightblue;");
        chatHistory.setPrefHeight(400); 
        chatHistory.setMaxWidth(400);
        chatHistory.setPadding(new Insets(30));
        chatHistory.setLayoutX(30);

        // Create the simplified chatbot UI elements
        TextField userInput = new TextField();
        userInput.setPromptText("Ask a question...");
        userInput.setPrefHeight(50);
        userInput.setPrefWidth(200);
        userInput.setAlignment(Pos.CENTER_LEFT);


        Button sendButton = new Button("Send");
        sendButton.setFont(Font.font("Roboto", FontWeight.BOLD, 19));
        sendButton.setStyle("-fx-background-radius:15;-fx-background-color:STEELBLUE");
        sendButton.setPrefHeight(40);
        sendButton.setPrefWidth(90);
        sendButton.setTextFill(Color.WHITE);
        sendButton.setOnAction(e -> {
            String userText = userInput.getText();
            if (!userText.isEmpty()) {
                addMessage("You: " + userText, true);  // Add user message to chat history
                String response = getChatbotResponse(userText);
                addMessage("Chatbot: " + response, false);  // Add chatbot response to chat history
                userInput.clear();
            }
        });

        Button fxd_back = new Button("Back");
        fxd_back.setFont(Font.font("Roboto", FontWeight.BOLD, 19));
        fxd_back.setTextFill(Color.WHITE);
        fxd_back.setStyle("-fx-background-color:STEELBLUE;-fx-background-radius:15");
     //   fxd_back.setPadding(new Insets(10));
        fxd_back.setPrefHeight(40);
        fxd_back.setPrefWidth(90);
        

        HBox inputBox = new HBox(userInput, sendButton,fxd_back);
        inputBox.setSpacing(10);
        inputBox.setLayoutX(30);
        inputBox.setLayoutY(700);
        inputBox.setMaxHeight(500);
        inputBox.setMaxWidth(500);
        inputBox.setPadding(new Insets(30));


        // Container for chat history and input
        chatbotBox = new VBox(chatHistory, inputBox);
        chatbotBox.setPrefSize(400, 200); // Adjusted size for input + history
        chatbotBox.setAlignment(Pos.CENTER_LEFT);
        chatbotBox.setVisible(false);
        chatbotBox.setPadding(new Insets(30));
        chatbotBox.setLayoutX(70);
        chatbotBox.setLayoutY(700);
        fxd_back.setOnAction(b->{

            chatbotBox.setVisible(false);
    
    
        });

        // String fxd_video =( "MergedModule\\src\\main\\resources\\Gauri__Img\\vecteezy-a-young-waiter-delive-unscreen.mp4");

        // URI uri = Paths.get(fxd_video).toUri();

        // // Create a Media object
        // Media media = new Media(uri.toString());

        // // Create a MediaPlayer object
        // MediaPlayer mediaPlayer = new MediaPlayer(media);

        // // Create a MediaView object
        // MediaView mediaView = new MediaView(mediaPlayer);
        // mediaView.setFitWidth(500);
        // mediaView.setPreserveRatio(true);

        // // Start playing the video
        // mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop the video
        // mediaPlayer.play();

        // HBox fxd_Box = new HBox(mediaView);
        // fxd_Box.setAlignment(Pos.CENTER_LEFT);
        // fxd_Box.setPadding(new Insets(0, 0, 0, 80));


             //set Background Image
             FileInputStream fxd_File = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/Back_groundd2.jpg");
        Image fxd_im = new Image(fxd_File);
        ImageView fxd_ima = new ImageView(fxd_im);
        fxd_ima.setFitHeight(1100);
        fxd_ima.setFitWidth(1920);

        // Main content StackPane
        StackPane fxd_StackPane = new StackPane(fxd_ima, fxd_VBox3,chatbotBox);

        fxd_scrollpane = new ScrollPane(fxd_StackPane);
        fxd_scrollpane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        fxd_scrollpane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        // Fade in animation for welcome labels
        FadeTransition fadeInTransition = new FadeTransition(Duration.seconds(2), fxd_welcomeLabel);
        fadeInTransition.setFromValue(0.0);
        fadeInTransition.setToValue(1.0);
        fadeInTransition.play();

        // Slide in animation for buttons
        TranslateTransition slideInTransition = new TranslateTransition(Duration.seconds(1.5), fxd_VBox2);
        slideInTransition.setFromX(-600);
        slideInTransition.setToX(0);
        slideInTransition.play();
    }

    private void updateTime() {
        timeLabel.setText(LocalTime.now().format(timeFormatter));
    }

    // button style 
    public Button createStyledButton(String text) {
        Button button = new Button(text);
        button.setPrefHeight(50);
        button.setPrefWidth(120);
        button.setStyle("-fx-background-color:transparent; -fx-border-color:black; -fx-text-fill: black; -fx-font-size: 20px; -fx-font-weight: bold; -fx-border-width: 2; -fx-border-style:solid; -fx-border-radius: 35;");
        button.setOnMouseEntered(e -> button.setStyle("-fx-background-color:BLACK; -fx-text-fill: white; -fx-font-size: 20px; -fx-font-weight: bold; -fx-background-radius: 20;"));
        button.setOnMouseExited(e -> button.setStyle("-fx-background-color:transparent; -fx-border-color:black; -fx-text-fill: black; -fx-font-size: 20px; -fx-font-weight: bold; -fx-border-width: 2; -fx-border-style:solid; -fx-border-radius: 20"));
        return button;
    }
    public static void openWebPage(String urlPath) {
        try {
            Desktop.getDesktop().browse(new URL(urlPath).toURI());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ScrollPane getView() {
        return fxd_scrollpane;
    }

    private String getChatbotResponse(String userInput) {
        String response;

        switch (userInput.toLowerCase()) {
            case "hi":
            case "hello":
                response = "Hello! How can I assist you today?";
                break;
            case "what is your mission?":
            case "tell me about your mission":
                response = "Our mission is to turn food waste into worth by providing meals to those in need. We aim to give hope by sharing surplus food.";
                break;
            case "how can I donate food?":
            case "donate food":
                response = "You can donate food by visiting our 'Donate' page and filling out the donation form";
                break;
            case "how can I donate 3":
            case "donate food ":
                response = "You can donate food by visiting our 'Donate' page and filling out the donation form";
                break;
            case "how can i donate food":
                response = "You can donate food by visiting our 'Donate' page and filling out the donation form";
                break;
            case "how can I volunteer?":
            case "volunteer opportunities":
                response = "We appreciate your interest in volunteering! Please visit our 'Volunteer' page to sign up and see the various opportunities available.";
                break;
            case "what are your contact details?":
            case "contact information":
                response = "You can reach us via email at contact@feednjoy.com or call us at (123) 456-7890.";
                break;
            case "how can my business partner with you?":
            case "partnership opportunities":
                response = "We welcome partnerships! Please visit our 'Partnership' page to learn more about how we can collaborate and make a difference together.";
                break;
            case "where are you located?":
            case "location":
                response = "We are located at 123 Food Drive, Hope City. You can find more details on our 'Contact' page.";
                break;
            case "what is your story?":
            case "tell me your story":
                response = "Our story began with a mission to combat food waste and hunger. We have grown into a community-driven organization dedicated to making a positive impact.";
                break;
            case "how can I stay updated?":
            case "stay updated":
                response = "You can stay updated by following us on our social media channels and subscribing to our newsletter. Links are available on our homepage.";
                break;
            case "what events are coming up?":
            case "upcoming events":
                response = "Check out our 'Events' page for the latest information on upcoming events and how you can participate.";
                break;
            case "how can I share my story?":
            case "share story":
                response = "We would love to hear your story! Please visit our 'Stories' page and use the submission form to share your experience with us.";
                break;
            case "who can I contact for media inquiries?":
            case "media inquiries":
                response = "For media inquiries, please contact our media relations team at media@feednjoy.com.";
                break;
            case "how do you ensure food safety?":
            case "food safety":
                response = "We follow strict food safety protocols, including proper storage, handling, and transportation of food, to ensure the highest standards.";
                break;
            case "can I host a fundraising event?":
            case "host event":
                response = "Yes, you can! Please visit our 'Fundraise' page for guidelines and support in hosting your own fundraising event.";
                break;
            case "core2web?":
            case "support system":
                response = "Respected Shashi sir";
                break;
            case "Describe core2web in one word":
            case "describe core2web in one word":
            case "describe c2w in one word":
                response = " Shashi Sir...";
                break;
            default:
                response = "I'm sorry, I didn't understand that. Can you please rephrase or ask something else?";
                break;
        }

        return response;
    }

    private void addMessage(String message, boolean isUser) {
        Label messageLabel = new Label(message);
        messageLabel.setWrapText(true);
        messageLabel.setMaxWidth(800); // Adjusted max width to make the box smaller
        messageLabel.setStyle("-fx-background-color: " + (isUser ? "#b3ecff" : "#e6f7ff") + "; -fx-padding: 8px; -fx-background-radius: 5px;");
        chatHistory.getChildren().add(messageLabel);
        chatHistory.layout();
            //chatHistory.setScrollTop(Double.MAX_VALUE); // Scroll to bottom
            }
}