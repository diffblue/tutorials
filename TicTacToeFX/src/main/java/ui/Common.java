package ui;

import javafx.beans.property.*;

import java.util.HashMap;

public interface Common {

    String[] symbol = new String[] {"\u00D7", "\u26AC"};

    StringProperty messageContent = new SimpleStringProperty();
    BooleanProperty gameEnd = new SimpleBooleanProperty(false);
    HashMap<Integer, String> map = new HashMap<>(9);
    BooleanProperty [] shows = new SimpleBooleanProperty[] {
            new SimpleBooleanProperty(false),
            new SimpleBooleanProperty(false),
            new SimpleBooleanProperty(false),
            new SimpleBooleanProperty(false),
            new SimpleBooleanProperty(false),
            new SimpleBooleanProperty(false),
            new SimpleBooleanProperty(false),
            new SimpleBooleanProperty(false)
    };
}
