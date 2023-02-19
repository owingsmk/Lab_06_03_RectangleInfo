import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Had help on this one because I was getting frustrated, a friend who codes pushed me in the rigth direction for half of this.

public class RectangleInfo {

    public static void main(String[] args) {

        int width = 0; //Variables
        int length = 0;

        try {
            //Read the length from Console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter length of a rectangle: ");
            length = Integer.parseInt(br.readLine());
            //Read the width from console
            System.out.println("Please enter width of rectangle: ");
            width = Integer.parseInt(br.readLine());
        }
        //If invalid value was enter
        catch (NumberFormatException ne) {
            System.out.println("Invalid value " + ne);
            //System.exit (0)
        } catch (IOException ioe) {
            System.out.println("IO Error " + ioe);
            //System.exit (0)
        }
        // calculate of area length*width
        int area = length * width;
        System.out.println("Area of a rectangle is " + area);
    }
}
