package tr.com.cinigaz.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


public class girisEkraniController {

    @FXML
    private Button kartOkumaAcBtn;

    @FXML
    private void kartOkumaAc(ActionEvent kartOkumaEvent) {
        FXMLLoader loader = new FXMLLoader();


        loader.setLocation(girisEkraniController.class.getClassLoader().getResource("/views/aboneBilgileriController.fxml"));
        //  FXMLLoader fxmlLoader3 = new FXMLLoader(getClass().getResource("/views/aboneBilgileriController.fxml"));
        Parent root3;
        try {
            root3 = (Parent) loader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root3));
            stage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }


//        // onceki ekranı kapat.
//        Stage stage2;
//        stage2 = (Stage) kartOkumaAcBtn.getScene().getWindow();
//        stage2.hide();
//        // Burada kart bilgilieri alınbmay çalışılacak :: // Özgür
//        // Soraki ekrana karar ver
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/kartOkumaRet.fxml"));     // Bu kart tanımsız
//        // veya
//        //  FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/aboneBilgiEkranı.fxml")); // Abone bilgilerinin gösterildiği ekran
//        Parent root1;
//        try {
//            root1 = (Parent) fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.initModality(Modality.APPLICATION_MODAL);
//            stage.initStyle(StageStyle.UNDECORATED);
//            stage.setTitle("ÇİNİGAZ DOĞALGAZ KİOSK FATURA ODEME");
//
//            stage.setScene(new Scene(root1));
//            stage.show();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }


}


