package sample;

import javafx.scene.control.Label;

public class Controller {

    public Label oznaka;

    public void Reci(javafx.event.ActionEvent actionEvent) {
        oznaka.setText("Hello World!");
    }
}
