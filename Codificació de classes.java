public class Media {
    private String nom;
    private String autor;
    private int duradaSegons;

    public Media(String nom, String autor, int duradaSegons) {
        this.nom = nom;
        this.autor = autor;
        this.duradaSegons = duradaSegons;
    }

    public String getNom() {
        return nom;
    }

    public String getAutor() {
        return autor;
    }

    public int getDurada() {
        return duradaSegons;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public void setDurada(int d) {
        this.duradaSegons = d;
    }
}

public class ProgramaProva {
    public static void main(String[] args) {
        Media media = new Media("Cancion X", "Artista Y", 180);

        S
    }
}