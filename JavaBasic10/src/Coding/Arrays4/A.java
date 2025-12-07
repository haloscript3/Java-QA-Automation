package Coding.Arrays4;

public class A
{
    int id = 5;
}
class B extends  A{
    String name = "Yasser";
}

class C extends B
{
    C()
    {
        System.out.println(id + name);
    }
}

