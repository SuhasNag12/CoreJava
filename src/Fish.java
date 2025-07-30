public class Fish implements Predator, Prey {
    public void hunt() {
        System.out.println("Fish feasts on smaller fish.");
    }

    public void flee() {
        System.out.println("Fish runs from bigger fish.");
    }
}
