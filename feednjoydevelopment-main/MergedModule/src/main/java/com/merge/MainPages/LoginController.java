package com.merge.MainPages;

import java.io.FileInputStream;

import com.merge.NavigateToHomepage.LoginDetails.SignIn;
import com.merge.NavigateToHomepage.LoginDetails.SignUp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoginController extends Application {

    private Stage pStage;

    private Scene HomepageScene;
    private HomePage2 homePage;

    private Scene AboutUsScene;
    private AboutUsPage aboutUs;

    private Scene ContactUsScene;
    private ContactUs contactUs;

    private Scene StoriesScene;
    private Stories stories;

    private Scene DonationScene;
    private DonationPage donation;

    private Scene SignInScene;
    private SignIn signIn;

    private Scene SignUpScene;
    private SignUp signUp;

    private Scene LearnMoreScene;
    private LearnMore learnMore;

    private Scene ComingSoonScene;
    private ComingSoon comingSoon;

    @Override

    public void start(Stage pStage) throws Exception {

        FileInputStream fileInputStream = new FileInputStream(
                "C:/Users/ANUJKISHORBANKAR/Documents/feednjoydevelopment-main/feednjoydevelopment-main/MergedModule/src/main/resources/Gauri__Img/logom-removebg-preview.png");

        // Screen screen = Screen.getPrimary();
        // double screenWidth = screen.getBounds().getWidth();
        // double screenHeight = screen.getBounds().getHeight();

        this.pStage = pStage;

        homePage = new HomePage2(this);
        HomepageScene = new Scene(homePage.getView(), 1920, 1000);

        aboutUs = new AboutUsPage(this);
        AboutUsScene = new Scene(aboutUs.getView(), 1920, 1000);

        contactUs = new ContactUs(this);
        ContactUsScene = new Scene(contactUs.getView(), 1920, 1000);

        stories = new Stories(this);
        StoriesScene = new Scene(stories.getView(), 1920, 1000);

        donation = new DonationPage(this);
        DonationScene = new Scene(donation.getView(), 1920, 1000);

        signIn = new SignIn(this);
        SignInScene = new Scene(signIn.getView(), 1920, 1000);

        signUp = new SignUp(this);
        SignUpScene = new Scene(signUp.getView(), 1920, 1000);

        learnMore = new LearnMore(this);
        LearnMoreScene = new Scene(learnMore.getView(), 1920, 1000);

        comingSoon = new ComingSoon(this);
        ComingSoonScene = new Scene(comingSoon.getView(), 1920, 1000);

        pStage.setTitle("Feed n joy");
        pStage.setScene(SignInScene);
        pStage.getIcons().add(new Image(fileInputStream));
        pStage.show();
    }

    public void NavigateToHomePage() {

        pStage.setScene(HomepageScene);

    }

    public void NavigateToAboutUs() {

        pStage.setScene(AboutUsScene);

    }

    public void NavigateToContactUs() {

        pStage.setScene(ContactUsScene);
    }

    public void NavigateToStories() {

        pStage.setScene(StoriesScene);

    }

    public void NavigateToDonationPage() {

        System.out.println("DonationClick");

        pStage.setScene(DonationScene);
    }

    public void NavigateToSignIn() {

        pStage.setScene(SignInScene);

    }

    public void NavigateToSignUp() {

        pStage.setScene(SignUpScene);

    }

    public void NavigateToLearnMore() {

        pStage.setScene(LearnMoreScene);

    }

    public void NavigateToComingSoon() {

        pStage.setScene(ComingSoonScene);

    }


}
