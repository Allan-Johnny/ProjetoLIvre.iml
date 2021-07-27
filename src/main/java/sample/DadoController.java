package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.awt.*;
import java.io.IOException;
import java.util.Random;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class DadoController {

    @FXML
    private Label resultadodado;

    @FXML
    private Button btRolar;

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
}