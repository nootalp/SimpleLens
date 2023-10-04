package components;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class Components {

    public static VBox createVBox(String javaVersion, String javaFXVersion) {
        Label javaVersionLabel = new Label("Java Version: " + javaVersion);
        Label javaFXVersionLabel = new Label("JavaFX Version: " + javaFXVersion);

        return new VBox(
                javaVersionLabel, 
                javaFXVersionLabel
                );
    }

    public static HBox createHBox(String buttonName, String buttonEventMessage) {
        Button button = new Button(buttonName);
        button.setOnAction(event -> System.out.println(buttonEventMessage));

        return new HBox(button);
    }
}
