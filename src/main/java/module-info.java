module es.ieslosmontecillos.di_t3a462_appusotextoboton {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.ieslosmontecillos.componentes_vignolothiago;



    opens es.ieslosmontecillos.di_t3a462_appusotextoboton to javafx.fxml;
    exports es.ieslosmontecillos.di_t3a462_appusotextoboton;
}