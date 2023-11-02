module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens poov.batalhanaval to javafx.fxml;
    opens poov.batalhanaval.controller to javafx.fxml, javafx.graphics;
    opens poov.batalhanaval.model to java.base, javafx.base, javafx.fxml, javafx.graphics;
    exports poov.batalhanaval;
}
