package tr.com.cinigaz.Model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void loadView(Stage stage) throws MalformedURLException {
        URL url = new File("D:\\KioskApplication\\src\\main\\resources\\views\\girisEkrani.fxml").toURI().toURL();
        try {
            Parent parent1 = FXMLLoader.load(url); //Main.class.getResource("D:\\Work\\Projects\\KioskApplication\\src\\main\\java\\tr\\com\\cinigaz\\views\\girisEkrani.fxml"));
            stage.setScene(new Scene(parent1));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
