package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;
import logic.Board;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable, Common {
    private int index = 0, clicks = 0;
    @FXML
    private Line l1Diag, l2Diag,l1Horiz, l2Horiz, l3Horiz, l1Vert, l2Vert, l3Vert;
    @FXML
    private Label message;
    @FXML
    private Button startButton, b0, b1, b2, b3, b4, b5, b6, b7, b8;
    Button[] arrayB;
    Line [] arrayL;

    @Override public void initialize(URL url, ResourceBundle rb) {

        arrayB = new Button[]{b0, b1, b2, b3, b4, b5, b6, b7, b8}; // group all buttons
        arrayL = new Line[]{l1Diag, l2Diag,l1Horiz, l2Horiz, l3Horiz, l1Vert, l2Vert, l3Vert}; // all lines

        for (int i = 0; i < 8; i++)
            arrayL[i].visibleProperty().bind(shows[i]); // bind the visibility of each line

        message.textProperty().bind(messageContent); // bind the content of the message label

        // observe changes to gameEnd boolean property
        gameEnd.addListener((obs, oldVal, newVal) ->
            {
                if (newVal) {
                    // if gameEnd switched to true
                    startButton.setDisable(false); // enable the start button
                    messageContent.set("Game Ended");
                    for (int i = 0; i < 9; i++)
                        arrayB[i].setDisable(true); // disable each button
                } else {
                    // if gameEnd switched to false
                    map.clear();
                    for (int i = 0; i < 9; i++) {
                        arrayB[i].setDisable(false); // disable each button
                        arrayB[i].setText(""); // assign an empty String to each button text
                    }
                    for (int i = 0; i < 8; i++) {
                        shows[i].set(false); // hide all red lines
                    }
                }
            });
    }

    @FXML
    void onStartButton(ActionEvent event) {
        ((Button)event.getSource()).setDisable(true);
        for (Button b : arrayB)
            b.setDisable(false);
        messageContent.set("Game Started");
        message.setVisible(true);
        gameEnd.set(false); // reset for anew game
        clicks = 0; // reset for a new game
    }

    @FXML
    void onPressButton(ActionEvent event) {
        Button B = (Button)event.getSource(); // fetch the button which triggered the click event
        int id = Integer.parseInt(B.toString().substring(11,12)); // parse the button name to form an id
        map.put(id, symbol[index]); // put a new key-value pair in the map
        B.setText(symbol[index]); // give the button a new text (nought or cross)
        B.setDisable(true); // disable that button
        swingIndex(); // change player sign from the symbol array
        clicks++; // update the number of clicks entered
        if (clicks == 9)
            gameEnd.set(true);

        // create a new object of Board type and call a method on it
        Board board = new Board(map);
        board.getWinner();
    }

    private void swingIndex() {
        if (index == 0)
            index++;
        else
            index--;
    }

}

