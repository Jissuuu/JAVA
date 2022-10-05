/*
GeometricShapes
Consider geometric objects. Suppose you want to design the classes to model GeometricObjects such as circles and rectangles.
Geometricobjects have many common properties and behaviors. They can be drawn in a certain color and be filled or unfilled.
Thus, a general class GeometricObject can be used to model all geometric objects.
This class contains the properties objectName, color and filled and their appropriate getter() and setter() methods.
Since a Circle is a special type of geometric object, it shares common properties and methods with other geometric
objects.
Thus, it makes sense to define the Circle class that extends the GeometricObject class.
Likewise, Rectangle can also be defined as a special type of GeometricObject.
As a programmer, write a java application to illustrate the above scenario.

Note :

All the Data members are either Private or Protected (But not public)
Member method may be either Public, Private or Protected.
Use Constructors to initialize default values for all the Data members in each class
By Default ObjectName = "Circle/Rectangle", Color = "White" and Filled = true(Boolean)
Input :

First line must Read the Type of GeometricObject (R/r - Rectangle and C/c - Circle)
Second line must read Either Radius (if Type is "Circle") or both Width and Height (if Type is "Rectangle")
Output :

Print Object_Name, Color, Filled, Diameter, Area and Perimeter (if Type is Circle) or Print Object_Name, Color, Filled, Area and Perimeter
Print "Type Invalid" if Type is other than Circle or Rectangle

*/

import java.util.*;

class GeometricObject{
    private String obname;
    private String colour;
    private boolean fillcheck;
    
    public GeometricObject() {
        obname = "Circle/Rectangle";
        colour = "White";
        fillcheck = true;
    }
    public void setter(){
        System.out.println(colour);
        System.out.println(fillcheck);
    }
}

class Circle extends GeometricObject{
    protected int radius,Diameter;
    public void setter(){
        super.setter();
        int Diameter = 2*radius;
        double Area = Math.PI*radius*radius;
        double Perimeter = 2*Math.PI*radius;
        System.out.printf("Diameter of the Circle : %d",Diameter);
        System.out.printf("\nArea of Circle : %.2f",Area);
        System.out.printf("\nCircumference of circle : %.2f",Perimeter);
    }
}

class Rectangle extends GeometricObject{
    protected int length,breadth;
    public void setter(){
        super.setter();
        int Area = length*breadth;
        int Perimeter = 2*(length+breadth);
        System.out.printf("Area of Rectangle : %d",Area);
        System.out.printf("\nPerimeter of Rectangle : %d",Perimeter);
    }
}


class Shape{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char t = in.next().charAt(0);
        if(t=='C' || t=='c'){
            Circle c = new Circle();
            c.radius = in.nextInt();
            c.setter();
        }
        else if(t=='R' || t=='r'){
            Rectangle r = new Rectangle();
            r.length = in.nextInt();
            r.breadth = in.nextInt();
            r.setter();
        }
        else{
            System.out.println("Type Invalid ");
        }
        in.close();
    }
}