package API$GUI;

public class Pelicula {

    private String titulo;
    private String originalTitle;
    private String overview;
    private String posterPath;

    // Constructor, getters y setters
    public Pelicula(String titulo, String originalTitle, String overview, String posterPath) {
        this.titulo = titulo;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.posterPath = posterPath;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

}
