import java.util.ArrayList;
import java.util.List;

class Professor {
    private String nom;
    private String departament;
    private List<Curs> cursos;

    public Professor(String nom, String departament) {
        this.nom = nom;
        this.departament = departament;
        this.cursos = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getDepartament() {
        return departament;
    }

    public List<Curs> getCursos() {
        return cursos;
    }

    public void afegirCurs(Curs curs) {
        cursos.add(curs);
    }

    @Override
    public String toString() {
        return "Professor: " + nom + ", Departament: " + departament;
    }
}

class Estudiant {
    private String nom;
    private String matricula;

    public Estudiant(String nom, String matricula) {
        this.nom = nom;
        this.matricula = matricula;
    }

    public String getNom() {
        return nom;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Estudiant: " + nom + ", Matrícula: " + matricula;
    }
}

class Curs {
    private String nom;
    private String codi;
    private Professor professor;
    private List<Estudiant> estudiants;

    public Curs(String nom, String codi, Professor professor) {
        this.nom = nom;
        this.codi = codi;
        this.professor = professor;
        this.estudiants = new ArrayList<>();
        
        // Afegir el curs a la llista de cursos del professor
        professor.afegirCurs(this);
    }

    public String getNom() {
        return nom;
    }

    public String getCodi() {
        return codi;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Estudiant> getEstudiants() {
        return estudiants;
    }

    public void afegirEstudiant(Estudiant estudiant) {
        estudiants.add(estudiant);
    }

    @Override
    public String toString() {
        return "Curs: " + nom + ", Codi: " + codi + ", Professor: " + professor.getNom();
    }
}

public class Universitat {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Dr. Joan", "Matemàtiques");
        Curs curs1 = new Curs("Àlgebra", "MATH101", professor1);
        Estudiant estudiant1 = new Estudiant("Anna", "2021001");
        curs1.afegirEstudiant(estudiant1);

        System.out.println(professor1);
        System.out.println(curs1);
        for (Estudiant estudiant : curs1.getEstudiants()) {
            System.out.println(estudiant);
        }
    }
}
