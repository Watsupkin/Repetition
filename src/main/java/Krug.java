public class Krug extends Figure{
    public Krug() {
    }

    public int square (int r) {
        int s = (int) (3.14*(r*r));
        System.out.println("Square of krug: ");
        System.out.println(s);
        return s;
    }

    public int perimeter(int r) {
        int p = (int) (3.14*r*2);
        System.out.println("Perimeter of krug: ");
        System.out.println(p);
        return p;
    }
}
