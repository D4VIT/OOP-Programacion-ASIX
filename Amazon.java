import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe base Producte
abstract class Producte {
    protected int codi;
    protected String nom;
    protected double preu;

    public Producte(int codi, String nom, double preu) {
        this.codi = codi;
        this.nom = nom;
        this.preu = preu;
    }

    public abstract double calcularPreuFinal();

    @Override
    public String toString() {
        return "Codi: " + codi + ", Nom: " + nom + ", Preu: " + preu;
    }
}

// Classe Aliment
class Aliment extends Producte {
    private LocalDate dataCaducitat;

    public Aliment(int codi, String nom, double preu, LocalDate dataCaducitat) {
        super(codi, nom, preu);
        this.dataCaducitat = dataCaducitat;
    }

    public void setDataCaducitat(LocalDate dataCaducitat) {
        this.dataCaducitat = dataCaducitat;
    }

    @Override
    public double calcularPreuFinal() {
        LocalDate avui = LocalDate.now();
        if (dataCaducitat.isBefore(avui.plusDays(3))) {
            return preu * 0.5; // 50% de descompte si falta menys de 3 dies
        }
        return preu;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de Caducitat: " + dataCaducitat + ", Preu Final: " + calcularPreuFinal();
    }
}

// Classe Electrodomestic
class Electrodomestic extends Producte {
    private int mesosGarantia;

    public Electrodomestic(int codi, String nom, double preu, int mesosGarantia) {
        super(codi, nom, preu);
        this.mesosGarantia = mesosGarantia;
    }

    public void setMesosGarantia(int mesosGarantia) {
        this.mesosGarantia = mesosGarantia;
    }

    @Override
    public double calcularPreuFinal() {
        if (mesosGarantia > 24) {
            return preu * 1.1; // 10% de recàrrec si la garantia és superior a 24 mesos
        }
        return preu;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mesos de Garantia: " + mesosGarantia + ", Preu Final: " + calcularPreuFinal();
    }
}

// Classe Llibre
class Llibre extends Producte {
    private String autor;
    private int numPagines;

    public Llibre(int codi, String nom, double preu, String autor, int numPagines) {
        super(codi, nom, preu);
        this.autor = autor;
        this.numPagines = numPagines;
    }

    @Override
    public double calcularPreuFinal() {
        if (numPagines > 500) {
            return preu * 1.15; // 15% de recàrrec si el llibre té més de 500 pàgines
        }
        return preu;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Número de Pàgines: " + numPagines + ", Preu Final: " + calcularPreuFinal();
    }
}

// Classe Botiga
class Botiga {
    private List<Producte> productes;

    public Botiga() {
        this.productes = new ArrayList<>();
    }

    public void afegirProducte(Producte producte) {
        productes.add(producte);
    }

    public double calcularPreuTotal() {
        double total = 0;
        for (Producte producte : productes) {
            total += producte.calcularPreuFinal();
        }
        return total;
    }

    public void mostrarDetallsProductes() {
        for (Producte producte : productes) {
            System.out.println(producte);
        }
    }
}

// Classe Principal
public class Principal {
    public static void main(String[] args) {
        Botiga botiga = new Botiga();

        // Afegint productes a la botiga
        botiga.afegirProducte(new Aliment(1, "Pa", 1.5, LocalDate.now().plusDays(2)));
        botiga.afegirProducte(new Aliment(2, "Llet", 1.0, LocalDate.now().plusDays(5)));
        botiga.afegirProducte(new Electrodomestic(3, "Rentadora", 300, 36));
        botiga.afegirProducte(new Electrodomestic(4, "Nevera", 500, 12));
        botiga.afegirProducte(new Llibre(5, "Java per a Tothom", 30, "John Doe", 600));
        botiga.afegirProducte(new Llibre(6, "Introducció a la Programació", 25, "Jane Smith", 400));

        // Calculant el preu total de la botiga
        double preuTotal = botiga.calcularPreuTotal();
        System.out.println("Preu Total: " + preuTotal);

        // Mostrant els detalls de tots els productes
        botiga.mostrarDetallsProductes();
    }
}
