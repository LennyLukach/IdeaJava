public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is chirping.");
    }

    public void eat() {
        super.eat();
        System.out.println(name + " is a bird and eats seeds.");
    }
}
