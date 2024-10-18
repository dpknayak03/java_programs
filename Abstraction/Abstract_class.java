package Abstraction;

// Abstract class
abstract class Shape 
{
    // Abstract method (no implementation)
    public abstract void draw();

    // Main method
    public static void main(String[] args) 
    {
        // Create an object of the subclass Circle
        Shape circle = new Circle();
        circle.draw(); // Calls the overridden draw() method in Circle
    }
}

// Subclass implementing the abstract method
class Circle extends Shape 
{
    @Override
    public void draw() 
    {
        System.out.println("Drawing a circle.");
    }
}