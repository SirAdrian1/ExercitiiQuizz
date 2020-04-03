package Calculator.Perimetru.Suprafata;

import java.util.Scanner;

class Area_Circle

{
    double area;
    void circle(double r)
    {
        area= (22*r*r)/7;
    }
}
class AreaOfCircle extends Area_Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double rad = s.nextDouble();
        AreaOfCircle a = new AreaOfCircle();
        a.circle(rad);
        System.out.println("Area of Circle is: " + a.area);

    }
}