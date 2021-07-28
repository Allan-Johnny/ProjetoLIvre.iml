package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.awt.*;
import java.io.IOException;
import java.util.Random;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class DadoController {

    @FXML
    private Label resultadodado;

    @FXML
    private Button btRolar;

    @FXML
    private Button btsair;

    public void btRolar(ActionEvent event) throws IOException {
        int dado;


        Random gerador = new Random();
        dado = gerador.nextInt(20) + 1;
        if (dado < 10) {
            resultadodado.setText(String.valueOf("0" + dado));

        } else {
            resultadodado.setText(String.valueOf(dado));

        }
    }
    public void btsair(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }
}