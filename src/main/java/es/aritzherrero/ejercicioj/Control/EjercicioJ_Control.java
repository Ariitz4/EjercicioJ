package es.aritzherrero.ejercicioj.Control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class EjercicioJ_Control implements Initializable{


    @FXML
    private ImageView imgAzulClaro;

    @FXML
    private ImageView imgAzulOscuro;

    @FXML
    private ImageView imgBlanco;

    @FXML
    private ImageView imgCoche;

    @FXML
    private ImageView imgGris;

    @FXML
    private ImageView imgGrisOscuro;

    @FXML
    private ImageView imgLuz;

    @FXML
    private ImageView imgMarron;

    @FXML
    private ImageView imgNegro;

    @FXML
    private ImageView imgRojo;

    @FXML
    private ImageView logoLuz;

    private boolean bEncendido;

    /**
     * Método para cambiar el icono de luz (encendido/apagado) y visibilizar la imagen de luces.
     * @param event
     */
    @FXML
    void luz(MouseEvent event) {
        if (!bEncendido) {
            bEncendido=true;
            logoLuz.setImage(new Image(getClass().getResource("/es/aritzherrero/ejercicioj/fxml/img/lucesOn.png").toString()));
        }else {
            bEncendido=false;
            logoLuz.setImage(new Image(getClass().getResource("/es/aritzherrero/ejercicioj/fxml/img/lucesOff.png").toString()));
        }

        imgLuz.setVisible(bEncendido);
    }

    /**
     * Método para cambiar la imagen al coche de color azul.
     * @param event
     */
    @FXML
    void colorAzulClaro(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/es/aritzherrero/ejercicioj/fxml/img/miniElectricBlue.png").toString()));
    }

    /**
     * Método para cambiar la imagen al coche de color azul oscuro.
     * @param event
     */
    @FXML
    void colorAzulOscuro(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/es/aritzherrero/ejercicioj/fxml/img/miniLapisluxuryBlue.png").toString()));
    }

    /**
     * Método para cambiar la imagen al coche de color blanco.
     * @param event
     */
    @FXML
    void colorBlanco(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/es/aritzherrero/ejercicioj/fxml/img/miniPepperWhite.png").toString()));
    }

    /**
     * Método para cambiar la imagen al coche de color gris.
     * @param event
     */
    @FXML
    void colorGris(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/es/aritzherrero/ejercicioj/fxml/img/miniMoonwalkGrey.png").toString()));
    }

    /**
     * Método para cambiar la imagen al coche de color gris oscuro.
     * @param event
     */
    @FXML
    void colorGrisOscuro(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/es/aritzherrero/ejercicioj/fxml/img/miniThunderGray.png").toString()));
    }

    /**
     * Método para cambiar la imagen al coche de color marron.
     * @param event
     */
    @FXML
    void colorMarron(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/es/aritzherrero/ejercicioj/fxml/img/miniVolcaninOrange.png").toString()));
    }

    /**
     * Método para cambiar la imagen al coche de color negro.
     * @param event
     */
    @FXML
    void colorNegro(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/es/aritzherrero/ejercicioj/fxml/img/miniMidnightBlack.png").toString()));
    }

    /**
     * Método para cambiar la imagen al coche de color rojo.
     * @param event
     */
    @FXML
    void colorRojo(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/es/aritzherrero/ejercicioj/fxml/img/miniBlazingRed.png").toString()));
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //@..\img\autoLuz.png
        bEncendido=false;
    }

}