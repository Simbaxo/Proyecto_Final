package frmGameGUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class JugadorManager {
    private ArrayList<Jugador> jugadorList = new ArrayList<>();

    // Add an automatic ID
    public int generateNewId() {
        int maxId = 0;
        for (Jugador j : jugadorList) {
            if (j.getId() > maxId) {
                maxId = j.getId();
            }
        }
        return maxId + 1; // This gives the next available ID (eg 1,2,3,...)
    }

    // Add a new Jugador if ID is unique
    public boolean addJugador(Jugador newJugador) {
        for (Jugador j : jugadorList) {
            if (j.getId() == newJugador.getId()) {
                return false; // Duplicate ID
            }
        }
        jugadorList.add(newJugador);
        return true;
    }

    // Delete Jugador by ID
    public boolean removeJugador(int id) {
        return jugadorList.removeIf(j -> j.getId() == id);
    }

    // Return the list (for displaying)
    public ArrayList<Jugador> getJugadorList() {
        return jugadorList;
    }

    // Find Jugador by ID
    public Jugador getJugadorById(int id) {
        for (Jugador j : jugadorList) {
            if (j.getId() == id) {
                return j;
            }
        }
        return null;
    }

    // Update Jugador
    public boolean editJugador(Jugador jugadorEdited) {
        for (int i = 0; i < jugadorList.size(); i++) {
            if (jugadorList.get(i).getId() == jugadorEdited.getId()) {
                jugadorList.set(i, jugadorEdited);
                return true;
            }
        }
        return false;
    }

    // Save the entire player list to a file
    public void saveJugadoresToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Jugador jugador : jugadorList) {
                writer.write(jugador.getId() + "," +
                        jugador.getJugador() + "," +
                        jugador.getNivel() + "," +
                        jugador.getJuegoFavorito() + "," +
                        jugador.getScore() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load players from a file when the app starts
    public void loadJugadoresFromFile(String filePath) {
        jugadorList.clear(); // start fresh

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) !=null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int id = Integer.parseInt(parts[0]);
                    String jugador = parts[1];
                    int nivel = Integer.parseInt(parts[2]);
                    String juegoFavorito = parts[3];
                    int score = Integer.parseInt(parts[4]);

                    jugadorList.add(new Jugador(id, jugador, nivel, juegoFavorito, score));
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
