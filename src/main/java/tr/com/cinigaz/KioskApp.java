package tr.com.cinigaz;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import tr.com.cinigaz.views.Main;

@Configuration
@SpringBootApplication
public class KioskApp extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() throws ExceptionInInitializerError {
        this.applicationContext = SpringApplication.run(KioskApp.class);
        //  SpringApplication.run(KioskApp.class);
    }

    @Override
    public void stop() throws Exception {
        applicationContext.close();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Main.loadView(stage);

    }
}
