import javax.swing.JFrame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class MainScreenController extends JFrame {

    @FXML
    private TextField tfEuroInput;

    @FXML
    private TextField tfEuroOutput;

    @FXML
    private TextField tfUSDInput;

    @FXML
    private TextField tfUSDOutput;

    @FXML
    void convertEuroToUSD(ActionEvent event) {

        double euro = Double.parseDouble(tfEuroInput.getText());
        double usd = euro * 1.4389;
        tfUSDOutput.setText(String.valueOf(usd));
    }

    @FXML
    void convertUSDToEuro(ActionEvent event) {
        double usd = Double.parseDouble(tfUSDInput.getText());
        double euro = usd / 1.4389;
        tfEuroOutput.setText(String.valueOf(euro));
    }

}
