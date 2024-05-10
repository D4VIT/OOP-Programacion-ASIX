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

    
}