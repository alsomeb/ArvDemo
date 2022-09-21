public class Main {
    public static void main(String[] args) {
        System.out.println("Inheritance demo\n");

        Dog atlas = new Dog("Atlas", "Brown", "Pudel");
        Dog alfonz = new Dog("Dexter", "White", "Bichon Bolognese");
        Dog adde = new Dog("Adde", "Blue", "Chäfer");

        System.out.println(atlas);
        System.out.println(alfonz);
        System.out.println(adde);

        atlas.setBreed("Husky");
        atlas.setColor("Black");
        System.out.println(atlas);

        System.out.println();
        adde.setColor("Red");
        adde.setBreed("Bossdog");
        System.out.println(adde);
        System.out.println(adde.getBreed());
        System.out.println(adde.getColor());
    }
}