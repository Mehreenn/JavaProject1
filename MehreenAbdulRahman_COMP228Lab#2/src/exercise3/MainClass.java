package exercise3;

public class MainClass 
{
    //overloaded methods performing same functionalities
    public static int addition(int num1, int num2)
    {
        int num3 = num1+num2;
        return num3;
    }
    public static float addition(float num1, float num2)
    {
        float num3 = num1+ num2;
        return num3;
    }
    public static double addition(double num1, double num2, double num3)
    {
        double num4 = num1 + num2 + num3;
        return num4;
    }

//main 
    public static void main(String[] args)
    {
        System.out.println("Method with different parameters:");
        System.out.println("Sum of two integer variables: "+addition(9,5));
        System.out.println("Method with different parameters:");
        System.out.println("Sum of two float variables: "+(10.7883 + 1.712));
        System.out.println("Method with different parameters:");
        System.out.println("Sum of three double variables: "+(6.04 + 7.22 + 4.303));
    }
}

