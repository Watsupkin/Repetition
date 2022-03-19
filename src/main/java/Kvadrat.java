public class Kvadrat extends Figure{
    public Kvadrat() {
    }

    public int square (int a) {
        int s = a*a;
        System.out.println("Square of kvadrat: ");
        System.out.println(s);
        return s;
    }

    public int perimeter(int a) {
        int p = a*4;
        System.out.println("Perimeter of kvadrat: ");
        System.out.println(p);
        return p;
    }
}
