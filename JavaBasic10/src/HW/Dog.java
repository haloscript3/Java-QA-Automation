package HW;

public class Dog {
    String name;
    String breed;
    String color ;
    int age ;

    public Dog(String name , String breed , String color , int age)
    {
        this.name = name;
        this.breed = breed;
        this.color= color;
        this.age = age;
    }

    void eat()
    {
        System.out.println(name + " is eating");
    }
    void sleep()
    {
        System.out.println(name + " is sleeping");
    }
    void bark()
    {
        System.out.println(name + " is barking");
    }
    void getInfo()
    {
        System.out.println(name + " is the name of the dog");
        System.out.println(breed + " is the breed of the dog");
        System.out.println(color + " is the color of the dog");
        System.out.println(name + " is " + age + " years old");
    }
}
