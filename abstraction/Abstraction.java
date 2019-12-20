abstract class Shape{  
  abstract void draw();  
}    

class Rectangle extends Shape{  
  void draw(){System.out.println("drawing rectangle");}  
}  

class Circle extends Shape{  
  void draw(){System.out.println("drawing circle");}  
}  

public class Abstraction {
    public static void main(String[] args) {
			Shape rectangle = new Rectangle();
			rectangle.draw();

			Shape circle = new Circle();
			circle.draw();
    }
}