import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Biblioteca {

    private static final String URL = "jdbc:mysql://localhost:3306/nom_de_la_base_de_dades";
    private static final String USER = "usuari";
    private static final String PASSWORD = "contrasenya";

    public static void main(String[] args) {
        // Exemple d'inserció de nous autors i llibres
        inserirAutor(4, "Jane", "Austen");
        inserirLlibre(5, "Pride and Prejudice", 1813, 4);

        // Exemple de recuperació de llibres d'un autor
        obtenirLlibresDunAutor("George", "Orwell");
    }

    public static void inserirAutor(int id, String nom, String cognom) {
        String sql = "INSERT INTO Autor (id, nom, cognom) VALUES (?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            pstmt.setString(2, nom);
            pstmt.setString(3, cognom);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserirLlibre(int id, String titol, int anyPublicacio, int autorId) {
        String sql = "INSERT INTO Llibre (id, titol, anyPublicacio, autorId) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            pstmt.setString(2, titol);
            pstmt.setInt(3, anyPublicacio);
            pstmt.setInt(4, autorId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void obtenirLlibresDunAutor(String nom, String cognom) {
        String sql = "SELECT Llibre.titol, Llibre.anyPublicacio FROM Llibre JOIN Autor ON Llibre.autorId = Autor.id WHERE Autor.nom = ? AND Autor.cognom = ?";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nom);
            pstmt.setString(2, cognom);
            
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String titol = rs.getString("titol");
                int anyPublicacio = rs.getInt("anyPublicacio");
                System.out.println(titol + " (" + anyPublicacio + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
