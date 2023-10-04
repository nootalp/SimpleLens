package com.nootalp.simplelens;

import components.Components;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        VBox vBox = Components.createVBox(
                new SystemInfo().getJavaVersion(), 
                new SystemInfo().getJavaFXVersion()
        );
        HBox hBox = Components.createHBox("Click Here", "Clicked!");

        Scene scene = new Scene(new VBox(vBox, hBox), 640, 480);
        
        stage.setScene(scene);
        stage.setTitle("SimpleLens");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
