import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Figure figure = new Figure();
       Kvadrat kvadrat = new Kvadrat();
       Krug krug = new Krug();

       figure.perimeter(4,2);
       kvadrat.perimeter(2);
       krug.perimeter(2);

        figure.square(4,2);
        kvadrat.square(2);
        krug.square(2);


    }
}
