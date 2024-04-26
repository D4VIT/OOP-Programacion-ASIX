import java.util.ArrayList;
import java.util.List;

class PacMan {
    private int posX;
    private int posY;
    private int vides;
    private int puntuacio;

    public PacMan(int posX, int posY, int vides) {
        this.posX = posX;
        this.posY = posY;
        this.vides = vides;
        this.puntuacio = 0;
    }

    public void moure(int novaPosX, int novaPosY) {
        this.posX = novaPosX;
        this.posY = novaPosY;
    }

    public void recolectarBola() {
        this.puntuacio += 10;
    }

    public void recolectarFruita() {
        puntuacio += 100;
    }

    public void perderVida() {
        vides--;
    }

    public boolean detectarColisionFantasma(Fantasma fantasma) {
        return posX == fantasma.getPosX() && posY == fantasma.getPosY();
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getVides() {
        return vides;
    }

    public int getPuntuacio() {
        return puntuacio;
    }
}

class Fantasma {
    private int posX;
    private int posY;
    private String nom;

    public Fantasma(int posX, int posY, String nom) {
        this.posX = posX;
        this.posY = posY;
        this.nom = nom;
    }

    public void moure(int novaPosX, int novaPosY) {
        posX = novaPosX;
        posY = novaPosY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String getNom() {
        return nom;
    }
}


