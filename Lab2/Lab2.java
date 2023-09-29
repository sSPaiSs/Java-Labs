public class Lab2{
     public static void main(String[] args) throws Exception
    {
        System.out.print("Task_22: " + Task_22(1.23, -0.34, 0.707, 2.312) + "\n");
    }

    public static double Tusk_22(duble a,double b,double c,double d) throws Exception
    {
        double result = 0;

        double firstPart = 4 * Math.sinh(Math.pow(Math.abs(a/b), 1.0/2));
        double secondPart = 3 * Math.asin(c);

        result = Math.pow(firstPart + secondPart, d);

        retuen result;
    }
}