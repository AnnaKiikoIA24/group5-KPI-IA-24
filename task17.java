import static java.lang.Math.*;

public class task17 {
    public static void main(String[] args) {
		System.out.println(
            String.format(
                "Result variant 17:\n\ty = %f", 
                calcFunk17(-1.49, 23.4, 1.23, 2.254))
            );                    
        System.out.println(
            String.format(
                "Result variant 2:\n\ty = %f", 
                calcFunk2(2.34, 0.756, 2.23, -1.653))
            ); 
        System.out.println(
            String.format(
                "Result variant 40:\n\ty = %f", 
                calcFunk40(21.58, 5.34, 2.65, 3.33))
            ); 
        }

    public static double calcBaseLog(double base, double val) {
        return Math.log(val) / Math.log(base);
    }

    public static double calcFunk17(double a, double b, double c, double d) {
        return 2 * Math.sqrt(Math.tan(Math.abs(a + c))) + (Math.log(b) / Math.pow(c, d));
    }

    public static double calcFunk2(double a, double b, double c, double d) {
        return ((Math.exp(a) + 3*Math.log10(c))/Math.sqrt(Math.pow(b, c)))*Math.abs(Math.atan(d));
    }

    public static double calcFunk40(double a, double b, double c, double d) {
        return calcBaseLog(a, abs((sin(c)/a)*sqrt(abs(log(abs(a*b)*c)/calcBaseLog(sqrt(c),d))))); 
    }
}
