package com.example.mother_pls_help;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


import static javafx.application.Application.launch;


public  class Answer3_1video  implements Initializable{
    @FXML

    private MediaView mediaView;

    @FXML
    private Button ExitButton;

    @FXML
    private Button pauseButton;

    @FXML
    private Button resetButton;

    @FXML
    private Button nextButton;

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;





    public void playMedia() {
        mediaPlayer.play();
    }

    public void pauseMedia() {
        mediaPlayer.pause();
    }

    public void resetMedia() {
        mediaPlayer.seek(Duration.seconds(0.0));
    }

    public void nextQuestion(ActionEvent event) throws IOException {
        openNewScene("Answer3_1.fxml");
    }

    private void openNewScene(String window) {
        // nextQuestion().getScene.getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();


    }



    public void Quit(ActionEvent event) throws Exception{
        System.exit(0);


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        file = new File("C:\\Users\\Полина\\OneDrive\\Рабочий стол\\Eto-Jaza-main\\Mother_pls_help\\src\\main\\resources\\com\\example\\mother_pls_help\\videos_java_app\\africa\\mammals\\herbivore\\africa_mammals_herbivore.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
    }
}



