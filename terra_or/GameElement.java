package terra_or;

public class GameElement<T> {
    private String name;
    private T value;

    public GameElement(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this
    }
}