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

public class PacManGame {
    public static void main(String[] args) {
        PacMan pacMan = new PacMan(0, 0, 3);
        List<Fantasma> fantasmes = inicialitzarFantasmes();
        while (pacMan.getVides() > 0) {
            actualitzarJoc(pacMan, fantasmes);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fora de joc");
    }

    private static List<Fantasma> inicialitzarFantasmes() {
        List<Fantasma> fantasmes = new ArrayList<>();
        fantasmes.add(new Fantasma(1, 1, "Pinky"));
        return fantasmes;
    }

    private static void actualitzarJoc(PacMan pacMan, List<Fantasma> fantasmes) {
        pacMan.moure(1, 2);
        for (Fantasma fantasma : fantasmes) {
            if (pacMan.detectarColisionFantasma(fantasma)) {
                System.out.println("Pac-Man colisiona amb " + fantasma.getNom() + "!");
                pacMan.perderVida();
                if (pacMan.getVides() == 0) {
                    break;
                }

                pacMan.moure(0, 0);

                System.out.println("Pac-Man reiniciat a la posicio inicial.");
            }
        }

                System.out.println("Puntuacio; " + pacMan.getPuntuacio());
    }
}
