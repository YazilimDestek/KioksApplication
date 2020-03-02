package tr.com.cinigaz.Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class girisEkraniController {
    public static void loadView(Stage stage) throws MalformedURLException {
        URL url = new File("D:\\KioskApplication\\src\\main\\java\\tr\\com\\cinigaz\\views\\girisEkrani.fxml").toURI().toURL();
        try {
            Parent parent = FXMLLoader.load(url); //Main.class.getResource("D:\\Work\\Projects\\KioskApplication\\src\\main\\java\\tr\\com\\cinigaz\\views\\girisEkrani.fxml"));
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
