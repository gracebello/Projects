import java.util.Scanner;
public class volume {
    public static void main(String [] args){
        /*This program will calculate the volume of a shape, or a missing measurement of a shape given the volume
        and all other measurements.
         */
        //Math.PI
        Scanner r = new Scanner(System.in);
        double width;
        double length;
        double height;
        double radius;
        double volume;
        double pi = Math.PI;
        String ifVol;
        String unit;
        int shape;
        String missing;
    System.out.println("This program can calculate the volume of a specified shape or a missing measurement of a shape.");
    System.out.println("Please chose a number from the list below.");
    System.out.println("1.Cone" + '\n' + "2.Sphere" + '\n' + "3.Rectangular Prism" + '\n' + "4.Cylinder");
        shape = r.nextInt();
        //maybe change this to nextDouble and then have the while statement check the individual equalities ==
        while (!(shape>=1 && shape<=4)) {
            System.out.println("Incorrect choice. Please choose a shape again.");
                shape = r.nextInt();
        }
        System.out.println("Please indicate the units you will be using.");
        r.nextLine();
            unit = r.nextLine();
    if (shape == 1) {
        System.out.println("Do you already have the volume of the cone? Type yes or no.");
            //have to call scanner with no variable to prevent next input from being entered as a stray newline
            ifVol = r.nextLine();
            while(!(ifVol.equalsIgnoreCase("yes")||ifVol.equalsIgnoreCase("no"))) {
                System.out.println("Invalid input. Please type yes or no.");
                ifVol= r.nextLine();
            }
            if(ifVol.equalsIgnoreCase("yes")) {
                System.out.println("Please input which value, the radius or the height, is missing.");
                    missing = r.nextLine();
            while(!(missing.equalsIgnoreCase("radius")||missing.equalsIgnoreCase("height"))) {
                System.out.println("Invalid input. Please type radius or height.");
                    missing = r.nextLine();
            }
                System.out.print("Please input the volume.");
                    volume = r.nextDouble();
                    if (missing.equalsIgnoreCase("radius")) {
                        //calculate rad from vol and height
                        System.out.println("Please input the height.");
                            height = r.nextDouble();
                            radius = (3 * volume)/(height * pi);
                            radius = Math.sqrt(radius);
                           // System.out.println(radius);
                    }
                    else if (missing.equalsIgnoreCase("height")) {
                        System.out.println("Please input the radius.");
                            radius = r.nextDouble();
                            radius = Math.pow(radius, 2);
                            height = (3 * volume)/(radius * pi);
                           // System.out.println(height);
                    }

            }
            else if(ifVol.equalsIgnoreCase("no")) {
                System.out.println("Please input the radius.");
                radius = r.nextDouble();
                System.out.println("Please input the height.");
                height = r.nextDouble();
                radius = Math.pow(radius, 2);
                volume = ((pi)*(radius)*(height));
                volume = volume/3;
                System.out.println("The volume of the cone is " + volume + " " + unit + ".");
        //Cone is complete :))
    }
    }
    else if (shape == 2) {
        System.out.println("Do you already have the volume of the sphere?");
            ifVol = r.nextLine();
        while(!(ifVol.equalsIgnoreCase("yes")||ifVol.equalsIgnoreCase("no"))) {
            System.out.println("Invalid input. Please type yes or no.");
            ifVol= r.nextLine();
        }
        if(ifVol.equalsIgnoreCase("yes")) {
            // ask which is missing
        }
        else if (ifVol.equalsIgnoreCase("no")) {
            // input standard
        }
    }
    else if (shape == 3) {

    }
    else if (shape == 4) {
    }

    }
}
