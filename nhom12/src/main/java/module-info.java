module phenikaa.finalproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens phenikaa.finalproject to javafx.fxml;
    exports phenikaa.finalproject;
}
