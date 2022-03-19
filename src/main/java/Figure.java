
public class Figure {

    public int square (int a, int b) {
        int s = a*b;
        System.out.println("Square: ");
        System.out.println(s);
        return s;
    }

    public int perimeter (int a, int b) {
        int p = (a+b)*2;
        System.out.println("Perimeter: ");
        System.out.println(p);
        return p;
    }

    public Figure() {
    }
}
