package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    public void btLogin(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Telaprincipal.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("20 Dice");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node)event.getSource()).getScene().getWindow() );
        stage.show();

    }

    public void btCriar(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Cadastrousuario.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("My modal window");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node)event.getSource()).getScene().getWindow() );
        stage.show();

    }
    public void btSair(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }
}


