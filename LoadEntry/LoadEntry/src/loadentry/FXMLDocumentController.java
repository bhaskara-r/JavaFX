/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadentry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author bhaskara-r
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label lEnter;
    @FXML
    private Label lTime;
    @FXML
    private Label lDate;
    @FXML
    private Label lAddItems;
    @FXML
    private RadioButton RFromList;
    @FXML
    private RadioButton RKeyBoardEntry;
    @FXML
    private Button BInc;
    @FXML
    private TextField TextField;
    @FXML
    private Label lItemsAdded;
    @FXML
    private TableView<?> CDescription;
    @FXML
    private TableColumn<?, ?> CItem;
    

    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
            // Grouping of Radio Buttons
            ToggleGroup group = new ToggleGroup();
            RFromList.setToggleGroup(group);
            RKeyBoardEntry.setToggleGroup(group);
            
            // Updating the text to the corresponding labels
            lEnter.setText("Enter Load Item Data");
            lTime.setText("Time To TBD");
            lDate.setText("Date To TBD");
            lAddItems.setText("Add Items:");
            lItemsAdded.setText("Items Added:");
            RFromList.setText("From List");
            RKeyBoardEntry.setText("Keyboard Entry");
      
    }    
    
}
