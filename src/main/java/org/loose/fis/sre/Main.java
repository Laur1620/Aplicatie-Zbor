package org.loose.fis.sre;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.loose.fis.sre.services.FileSystemService;
import org.loose.fis.sre.services.FlightService;
import org.loose.fis.sre.services.UserService;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main extends Application {

    public static boolean loggedIn;

    public static Stage primaryStage;

    public static String role;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.loggedIn = false;
        initDirectory();
        UserService.initDatabase();
        FlightService.initDatabase();
        Main.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        primaryStage.setTitle("Registration Example");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    private void initDirectory() {
        Path applicationHomePath = FileSystemService.APPLICATION_HOME_PATH;
        if (!Files.exists(applicationHomePath))
            applicationHomePath.toFile().mkdirs();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
