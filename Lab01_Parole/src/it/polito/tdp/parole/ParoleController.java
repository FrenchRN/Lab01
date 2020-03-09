package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	Parole elenco;
    @FXML
    private java.awt.TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private java.awt.TextArea txtResult;
    
    @FXML
    private java.awt.TextArea txtTempo;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnCancella;

    @FXML
    void doDelete(ActionEvent event) {
    elenco.cancella(txtParola.getText());
    txtTempo.setText(String.valueOf(System.nanoTime()));
    }

    @FXML
    void doInsert(ActionEvent event) {
    	elenco.addParola(txtParola.getText());
    	String s="";
    	for(String st:elenco.getElenco()) s=s+st+"\n";
    	txtResult.setText(s);
    	txtTempo.setText(String.valueOf(System.nanoTime()));
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtTempo.setText(String.valueOf(System.nanoTime()));
    }

}

