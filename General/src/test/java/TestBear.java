import org.testng.annotations.Test;

public class TestBear {
    @Test
    public void testBear() {
        Bear bear = new Bear("Baloo", 10);
        bear.makeSound();
        bear.eat();
    }
}
