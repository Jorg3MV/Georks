package API$GUI;

// Clase Main (JavaFX)
//librerías necesarias
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Movie Search App");

        // Crear una instancia de la clase PeliculaAPIManager
        PeliculaAPIManager apiManager = new PeliculaAPIManager();

        // Crear componentes de la GUI
        Button searchButton = new Button("Search");
        searchButton.setOnAction(e -> {
            // Lógica para manejar la búsqueda de películas
            // Aquí puedes llamar a los métodos de PeliculaAPIManager
            String apiKey = "7543e1e5622c01d6aa50e81783013ef9";
            String tituloPelicula = "TITULO_DE_LA_PELICULA";

            String detallesPelicula = PeliculaAPIManager.obtenerDetallesPelicula(apiKey, tituloPelicula);
            System.out.println(detallesPelicula);

            // También puedes llamar a otros métodos, como obtenerTrailersPelicula, obtenerRepartoPelicula, etc.
           
            System.out.println("Detalles de la película:\n" + detallesPelicula);


        });

        // Configurar el diseño de la GUI
        VBox layout = new VBox(20, searchButton);
        layout.setBackground(new Background(new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
    // Implementación de eventos, campos de búsqueda, etc.

    private void Pelicula(String apiKey, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
