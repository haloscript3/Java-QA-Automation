package HW;

public class DogClassMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Karabas","Malakli","Siyah",3);
        dog1.eat();
        dog1.bark();
        dog1.sleep();
        System.out.println("-----------------");
        dog1.getInfo();

    }
}
