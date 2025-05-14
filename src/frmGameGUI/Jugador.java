package frmGameGUI;

public class Jugador {
    // Jugador Attributes
    private int id;
    private String jugador;
    private int nivel;
    private String juegoFavorito;
    private int score;

    // Constructor
    public Jugador(int id, String jugador, int nivel, String juegoFavorito, int score) {
        this.id = id;
        this.nivel = nivel;
        this.jugador = jugador;
        this.juegoFavorito = juegoFavorito;
        this.score = score;
    }

    // Encapsulation Getter (read values)
    public int getId() {
        return id;
    }
    public String getJugador() {
        return jugador;
    }
    public int getNivel() {
        return nivel;
    }
    public String getJuegoFavorito() {
        return juegoFavorito;
    }
    public int getScore() {
        return score;
    }

    // Encapsulation Setter (change values)
    public void setScore(int score) {
        this.score = score;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
    public void setJuegoFavorito(String juegoFavorito) {
        this.juegoFavorito = juegoFavorito;
    }
}