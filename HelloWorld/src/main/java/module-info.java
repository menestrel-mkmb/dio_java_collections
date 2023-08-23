module edu.example.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.example.helloworld to javafx.fxml;
    exports edu.example.helloworld;
}