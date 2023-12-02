package API$GUI;

// primero agregué las librerías
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PeliculaAPIManager {

    public static void main(String[] args) {
        String apiKey = "7543e1e5622c01d6aa50e81783013ef9";
        String tituloPelicula = "TITULO_DE_LA_PELICULA";
        String detallesPelicula = obtenerDetallesPelicula(apiKey, tituloPelicula);
        System.out.println(detallesPelicula);
    }

    public static String obtenerDetallesPelicula(String apiKey, String tituloPelicula) {
        try {
            // Construir la URL de la solicitud
            String apiUrl = "https://api.themoviedb.org/3/search/movie";
            String apiKeyParam = "api_key=" + apiKey;
            String queryParam = "query=" + tituloPelicula;
            String urlStr = apiUrl + "?" + apiKeyParam + "&" + queryParam;

            // Abrir la conexión HTTP
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Leer la respuesta
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Procesar la respuesta JSON, por ejemplo, imprimir la respuesta completa
                System.out.println(response.toString());

                // Devolver la respuesta como cadena
                return response.toString();
            } else {
                // Manejar errores
                System.out.println("Error en la solicitud. Código de respuesta: " + responseCode);
            }
        } catch (IOException e) {
            // Manejar excepciones de red
            e.printStackTrace();

        }

        return null;
    }

    String obtenerDetallesPelicula(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String obtenerTrailersPelicula(String apiKey, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String Reparto(String apiKey, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

// Otros métodos para obtener tráilers, reparto y recomendaciones

