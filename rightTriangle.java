import java.util.Scanner;
public class rightTriangle {
    public static void main(String [] args) {
        Scanner e = new Scanner(System.in);
        String hIf;
        String unit;
        double a;
        double b;
        double c;
        /*The purpose of this program is to just ask for 2 sides of a right triangle to calculate the third side,
        or, in other words, this program evaluates the pythagorean theorem, a^2+b^2=c^2
         */
        System.out.println("This program will calculate one missing side length of a right triangle.");
        System.out.println("Please input the units you will be using.");
            unit = e.nextLine();
        System.out.println("Will you be calculating the length of the hypotenuse? Type yes or no.");
            hIf = e.nextLine();
        if (hIf.equalsIgnoreCase("yes"))
        {
            System.out.println("To calculate the length of the hypotenuse, you will need to input the length of the two other sides.");
            System.out.println("Please input the length of side A.");
                    a = e.nextDouble();
            System.out.println("Please input the length of side B.");
                b = e.nextDouble();
                c = Math.pow(a, 2) + Math.pow(b, 2);
                c = Math.sqrt(c);

        }
        else
            {
            System.out.println("To calculate the length of the missing side, you will need to input the length of the hypotenuse, and the other known side.");
            System.out.println("Please input the length of the hypotenuse.");
                c = e.nextDouble();
            System.out.println("Please input the length of the other side.");
                a = e.nextDouble();
                b = Math.pow(c, 2) - Math.pow(a, 2);
                b = Math.sqrt(b);

        }
System.out.println("Side A: " + String.format("%.2f", a) + " " + unit);
System.out.println("Side B: " + String.format("%.2f", b) + " " + unit);
System.out.println("Side C: " + String.format("%.2f", c) + " " + unit);

    }

}
