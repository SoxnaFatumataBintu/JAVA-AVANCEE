/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Couty
 */
public class AttribuerclasseController implements Initializable {

    @FXML
    private TableView<?> tblModules;
    @FXML
    private TableColumn<?, ?> tblcModules;
    @FXML
    private ComboBox<?> cmbClasse;
    @FXML
    private ComboBox<?> cmbModules;
    @FXML
    private TextField txtMatricule;
    @FXML
    private TextField txtNomComplet;
    @FXML
    private TextField txtGrade;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleRechercherProfesseur(ActionEvent event) {
    }

    @FXML
    private void handleCreerProfesseur(ActionEvent event) {
    }
    
}
