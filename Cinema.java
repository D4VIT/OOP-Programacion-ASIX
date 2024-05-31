import java.sql.*;

public class CinemaManagement {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/cinema_db";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            // Inserir un nou director
            insertDirector(conn, "Quentin", "Tarantino");

            // Inserir una nova pel·lícula
            insertPelicula(conn, "Pulp Fiction", 1994, 3);

            // Recuperar pel·lícules d'un director
            getPeliculasByDirector(conn, "Quentin", "Tarantino");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertDirector(Connection conn, String nom, String cognom) throws SQLException {
        String sql = "INSERT INTO Director (nom, cognom) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nom);
            pstmt.setString(2, cognom);
            pstmt.executeUpdate();
        }
    }

    public static void insertPelicula(Connection conn, String titol, int anyEstrena, int directorId) throws SQLException {
        String sql = "INSERT INTO Pelicula (titol, anyEstrena, directorId) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, titol);
            pstmt.setInt(2, anyEstrena);
            pstmt.setInt(3, directorId);
            pstmt.executeUpdate();
        }
    }

    public static void getPeliculasByDirector(Connection conn, String nom, String cognom) throws SQLException {
        String sql = "SELECT P.id, P.titol, P.anyEstrena FROM Pelicula P JOIN Director D ON P.directorId = D.id WHERE D.nom = ? AND D.cognom = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nom);
            pstmt.setString(2, cognom);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String titol = rs.getString("titol");
                int anyEstrena = rs.getInt("anyEstrena");
                System.out.println("ID: " + id + ", Titol: " + titol + ", Any d'Estrena: " + anyEstrena);
            }
        }
    }
}
