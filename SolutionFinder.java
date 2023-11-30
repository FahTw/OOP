package lab.week1;
public class SolutionFinder {
    public static void main(String[] args) {
        int a = 4, b = 8, c = 3;
        double x_1 = (-b + (Math.sqrt((Math.pow(b, 2)) - (4*a*c)))) / (2*a);
        double x_2 = (-b - (Math.sqrt((Math.pow(b, 2)) - (4*a*c)))) / (2*a);
        System.out.println(x_1);
        System.out.print(x_2);
    }
}
