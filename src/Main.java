public class Main {
    public static void main(String[] args) {


        Cat Leo = new Cat();
        Dog Roy = new Dog();

        Leo.eat();
        Leo.sleep();
        Leo.makeSound();

        System.out.println("*********************");
        Roy.eat();
        Roy.sleep();
        Roy.makeSound();


    }
}