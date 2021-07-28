package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.awt.*;
import java.io.IOException;
import java.util.Random;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class DadoseisController {

    @FXML
    private Label resultadodado;

    @FXML
    private Button btRolar;

    public void btRolar(ActionEvent event) throws IOException {
        int dadoseis;


        Random gerador = new Random();
        dadoseis = gerador.nextInt(6) + 1;
            resultadodado.setText(String.valueOf(dadoseis));

    }

    public void btsair(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }

}