public class Bear extends Animal{
    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is growling.");
    }

    public void eat() {
        super.eat();
        System.out.println(name + " is a bear and eats fish.");
    }

}
