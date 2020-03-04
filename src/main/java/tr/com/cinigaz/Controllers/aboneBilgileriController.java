package tr.com.cinigaz.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.beans.factory.annotation.Autowired;
import tr.com.cinigaz.dto.Abone;
import tr.com.cinigaz.restapi.KartOkuma;

import javax.xml.soap.Text;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class aboneBilgileriController implements Initializable {

    @FXML
    private Button kartOkumaAcBtn;

    @FXML  // ozgur
    private void kartOkumaAc(ActionEvent kartOkumaEvent) {
        // onceki ekranı kapat.
/*        Abone abone;
        //TextField ad_soyadText;
        KartOkuma kartOkuma = null;
        abone = kartOkuma.getKartOkuma();
*/
        Stage stage2 = (Stage) kartOkumaAcBtn.getScene().getWindow();
        stage2.hide();

        // Burada kart bilgilieri alınbmay çalışılacak :: // Özgür
        // Soraki ekrana karar ver
        //  if (abone.getAboneId().equals(null){
        // FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/kartOkumaRet.fxml"));     // Bu kart tanımsız
        // veya
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/aboneBilgiEkranı.fxml")); // Abone bilgilerinin gösterildiği ekran
        Parent root1;

        try {
            root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("ÇİNİGAZ DOĞALGAZ KİOSK FATURA ODEME");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    @FXML
    private Button anaEkranBtn;

    @FXML  // ozgur
    private void anaEkranaGit(ActionEvent event) {
        // onceki ekranı kapat.

        //todo runtimeexception atıyor. kapatıldı.
//            Stage stage5;
//            stage5=(Stage) anaEkranBtn.getScene().getWindow();
//            stage5.hide();

        FXMLLoader fxmlLoader3 = new FXMLLoader(getClass().getResource("/views/girisEkrani.fxml"));
        Parent root3;
        try {
            root3 = (Parent) fxmlLoader3.load();
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


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
