import java.util.Scanner;
public class gpaCalculator {
    public static void main(String [] args) {
        Scanner e = new Scanner(System.in);
        int totalCredit = 0;
        String ltrGrade;
        int creditHrs;
        double gpa = 0;
        int classes;
        System.out.println("GPA CALCULATOR");
        System.out.println("---------------");
        System.out.print("This program calculates your cumulative GPA based on your score in x amount of classes ");
        System.out.println("and also weighs those classes by credit hours.");
        System.out.println("Please enter the amount of classes you are taking.");
        classes = e.nextInt();
        while(classes>0){
            System.out.println("Please enter the letter grade for the next class");
            ltrGrade = e.next();
            System.out.println("Please enter the amount of hours this class is worth");
            creditHrs = e.nextInt();
            if(ltrGrade.equalsIgnoreCase("A")){
                gpa = gpa + (4.0 * creditHrs);
            }
            else if (ltrGrade.equalsIgnoreCase("B")){
                gpa = gpa + (3.0 * creditHrs);
            }
            else if (ltrGrade.equalsIgnoreCase("C")){
                gpa = gpa + (2.0 * creditHrs);
            }
            else if (ltrGrade.equalsIgnoreCase("D")){
                System.out.println("Seriously?");
                gpa = gpa + (1.0 * creditHrs);
            }
            else if (ltrGrade.equalsIgnoreCase("F")){
                System.out.println("No you didn't.");
            }
            totalCredit = totalCredit + creditHrs;
            classes--;
        }
        gpa = gpa/(double)totalCredit;
        System.out.println("Your GPA as of today is " + String.format("%.2f",gpa));
    }
}