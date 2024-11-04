module es.aritzherrero.ejercicioj {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.aritzherrero.ejercicioj to javafx.fxml;
    exports es.aritzherrero.ejercicioj;
    opens es.aritzherrero.ejercicioj.Control to javafx.fxml;

}