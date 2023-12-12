import java.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {
    public static void main(String[] args) {

        int numCircles = 4;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Circle[] circles = new Circle[numCircles];


        int x;
        int y;
        Double radious;

        //Istanza dei 4 cerchi
        for (int i = 0; i<numCircles; i++){
            System.out.println("Cerchio " + i + ":");
            System.out.println("Inserire x:");
            try {
                x = Integer.parseInt(input.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Inserire y:");
            try {
                y = Integer.parseInt(input.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Inserire raggio:");
            try {
                radious = Double.parseDouble(input.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            circles[i] = new Circle(x, y, radious);
        }

        for(int i=0;i<numCircles;i++){

            System.out.println("Cerchio " + i + ":" + "(" + circles[i].getCentre().getX() + "," + circles[i].getCentre().getY() + ") raggio:" + circles[i].getRadious());

        }

        //prova dello spostamento (di un centro e di conseguenza di un punto)
        System.out.println("vecchio centro: (" + circles[0].getCentre().getX() + "," +  circles[0].getCentre().getY() + ")");
        circles[0].moveX(2);
        circles[0].moveY(2);
        System.out.println("nuovo centro: (" + circles[0].getCentre().getX() + "," +  circles[0].getCentre().getY() + ")");

        //prova di appartenenza di un punto a un cerchio
        System.out.println("");

    }
}