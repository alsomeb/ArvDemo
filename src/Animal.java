public class Animal {

    protected String name;
    protected String color;

    // No args constructor so we can skip super() in subclass when newing up objects
    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color != null) {  // Smart objekt
            this.color = color;
        } else {
            throw new NullPointerException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
