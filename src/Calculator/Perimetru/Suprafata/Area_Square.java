package Calculator.Perimetru.Suprafata;

import java.util.Scanner;

public class Area_Square
{
    public static void main(String[] args)
    {
        int side, peri, area;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Side Length of Square : ");
        side = scan.nextInt();

        area = side*side;
        peri = 4*side;

        System.out.print("Area = " +area);

        System.out.print("\nPerimeter = " +peri);
    }
}