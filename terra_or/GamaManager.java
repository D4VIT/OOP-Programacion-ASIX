package terra_or;

import java.util.ArrayList;
import java.util.List;

public class GamaManager {
    public static void main(String[] args) {
        List<GameElement<Character>> characters = loadElementsFromXML("personatges.xml");

        for (GameElement<Character> characterElement : characters) {
            Character character = characterElement.getValue();

            System.out.println("Nombre: " + character.getName());
            System.out.println("Nivel: " + character.getLevel());
            System.out.println("Puntos de vida: " + character.getHealthPoints());
            System.out.println("Puntos de maná: " + character.getManaPoints());
            System.out.println("Arma: " + character.getWeapon());
            System.out.println("Armadura: " + character.getArmor());
            System.out.println();
        }
    }

    public static List<GameElement<Character>> loadElementsFromXML(String filePath) {
        List<GameElement<Character>> elements = new ArrayList<>();

        Character character1 = new Character("Gandalf", 10, 100, 150, "Gràvida de llum", "Roba de mag");
        Character character2 = new Character("Aragorn", 8, 120, 80, "Andúril", "Elfos");

        GameElement<Character> gameElement1 = new GameElement<>("Elemento 1", character1);
        GameElement<Character> gameElement2 = new GameElement<>("Elemento 2", character2);

        elements.add(gameElement1);
        elements.add(gameElement2);

        return elements;

}
}