public class Dog {
    String name = "Biscuit";
    String hairColor = "brown";
    int age = 7;

    public void bark () {
        System.out.println("Woof Woof!");
    }
    public void eat () {
        System.out.println(name + " is eating kibble.");
    }
    public void info () {
        System.out.println("My dog's name is " + name + ". He is " + age + " years old. He has " + hairColor + " fur.");
    }
    public void trick () {
        System.out.println(name + " is playing dead. I'll give him a treat.");
    }
}
