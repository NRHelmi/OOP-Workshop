class Animal {
  public void makeNoise(){
    System.out.println("Some sound");
  }
}
 
class Dog extends Animal{
  public void makeNoise(){
    System.out.println("Bark");
  }
}
 
class Cat extends Animal{
  public void makeNoise(){
    System.out.println("Meawoo");
  }
}

public class Polymorphism {

  public static void makeNoise(Animal a) {
    a.makeNoise();
  }
  public static void main(String[] args) {
    Animal a1 = new Dog();
    Animal a2 = new Cat();

    makeNoise(a1);
    makeNoise(a2);
  }
}