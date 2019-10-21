import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class multiDecider {
    public static String[] list(String filename) throws FileNotFoundException {
        Scanner s = new Scanner(new File (filename));
        int count = 0;
        while(s.hasNextLine()) {
            count++;
            s.nextLine();
        }
        s.close();
        String[] list = new String[count];
        Scanner parttwo = new Scanner(new File (filename));
        for(int idx=0; idx<list.length; idx++ ) {
            list[idx] = parttwo.nextLine();
        }
        s.close();

        return list;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("The purpose of this program is to draw from a list of movies and generate a movie to watch.");
        System.out.println("Press any key to start the program.");
        String ans = in.nextLine();
        String[] movies = list("movies.txt");
        while(!(ans.equalsIgnoreCase("q"))) {
            int randomNum = (int) (Math.random() * movies.length);
            System.out.println(movies[randomNum]);
            System.out.println("Press any key to run the program again, or type q to quit.");
            ans = in.nextLine();
        }
    }
}
