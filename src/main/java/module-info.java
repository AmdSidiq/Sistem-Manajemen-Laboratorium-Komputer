module com.pbo.sistemmanajemenlab {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pbo.sistemmanajemenlab to javafx.fxml;
    opens com.pbo.sistemmanajemenlab.model to javafx.fxml;
    exports com.pbo.sistemmanajemenlab;
    exports com.pbo.sistemmanajemenlab.model;
}
