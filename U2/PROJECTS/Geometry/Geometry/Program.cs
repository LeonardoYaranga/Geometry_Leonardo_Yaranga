using System;

namespace Geometry
{
    class Program
    {
        static void Main(string[] args)
        {
            Square square = new Square(17);
            Rectangle rectangle = new Rectangle(5, 3);  
            Circle circle = new Circle(16.6667);


            IShape[] shapes = { rectangle, square, circle };

            foreach (IShape shape in shapes)
             {    
                Console.WriteLine("Area of "+shape +" =");
                 Console.WriteLine(shape.CalculateArea());
                Console.WriteLine("Perimeter of " + shape + " =");
                Console.WriteLine(shape.CalculatePerimeter());
            }
            
            /*
              Console.WriteLine(square.CalculateArea());
            Console.WriteLine(rectangle.CalculateArea());
            Console.WriteLine(circle.CalculateArea());

            Console.WriteLine(square.CalculatePerimeter());
            Console.WriteLine(rectangle.CalculatePerimeter());
            Console.WriteLine(circle.CalculatePerimeter());
            */

        }
    }
}
