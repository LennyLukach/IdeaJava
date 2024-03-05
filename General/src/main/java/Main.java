public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear("Baloo", 10);
        bear.makeSound();
        bear.eat();

        Bird bird = new Bird("Tweety", 3);
        bird.makeSound();
        bird.eat();
    }
}
