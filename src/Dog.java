public class Dog extends Animal{
    private String breed;

    public Dog(String name, String color, String breed) {
        //super(name, color); // Color, Name kan man lägga in i constructor här så sätts den i Animal klassen som ärvs i dog
        // OM EN DEFAULT ARGS CONSTRUCTOR HAR GJORTS I SUPERCLASS BEHÖVER DU EJ SKRIVA SUPER
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed != null)  // Smart objekt
            this.breed = breed;
        else
            throw new NullPointerException();
    }

    @Override
    public String toString() {
        return "I am " + getName() + " a " + color + " " + getBreed();
    }
}
