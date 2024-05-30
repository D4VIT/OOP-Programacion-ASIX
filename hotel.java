import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Hotel {
    private String nom;
    private String adreca;
    private List<Habitacio> habitacions;

    public Hotel(String nom, String adreca) {
        this.nom = nom;
        this.adreca = adreca;
        this.habitacions = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public List<Habitacio> getHabitacions() {
        return habitacions;
    }

    public void afegirHabitacio(Habitacio habitacio) {
        habitacions.add(habitacio);
    }

    @Override
    public String toString() {
        return "Hotel: " + nom + ", Adreça: " + adreca;
    }
}

class Habitacio {
    private int numero;
    private int capacitat;
    private Reserva reserva;

    public Habitacio(int numero, int capacitat) {
        this.numero = numero;
        this.capacitat = capacitat;
        this.reserva = null;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "Habitació: Número " + numero + ", Capacitat: " + capacitat;
    }
}

class Reserva {
    private Date dataInici;
    private Date dataFi;
    private Client client;

    public Reserva(Date dataInici, Date dataFi, Client client) {
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.client = client;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public Date getDataFi() {
        return dataFi;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Reserva: Data d'Inici: " + dataInici + ", Data de Fi: " + dataFi + ", Client: " + client.getNom();
    }
}

class Client {
    private String nom;
    private String dni;

    public Client(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Client: Nom " + nom + ", DNI: " + dni;
    }
}

public class SistemaReservaHotel {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Hotel Paradís", "Carrer del Cel, 1");
        Habitacio habitacio1 = new Habitacio(101, 2);
        hotel1.afegirHabitacio(habitacio1);

        Client client1 = new Client("Anna Puig", "12345678A");
        Reserva reserva1 = new Reserva(new Date(), new Date(), client1);
        habitacio1.setReserva(reserva1);

        System.out.println(hotel1);
        for (Habitacio habitacio : hotel1.getHabitacions()) {
            System.out.println(habitacio);
            if (habitacio.getReserva() != null) {
                System.out.println(habitacio.getReserva());
            }
        }
    }
}
