public class Lab2{
    public static double Tusk_22(duble a,double b,double c,double d) throws Exception
    {
        double result = 0;

        double firstPart = 4 * Math.sinh(Math.pow(Math.abs(a/b), 1.0/2));
        double secondPart = 3 * Math.asin(c);

        result = Math.pow(firstPart + secondPart, d);

        retuen result;
    }
}