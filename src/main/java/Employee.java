
public class Employee {
    private String name;
    private int age;
    private int exp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("Error");
        }
        else {
            this.age = age;
            System.out.println("Saved");
        }
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        if (exp < 0) {
            System.out.println("Error");
        }
        else {
            this.exp = exp;
            System.out.println("Saved");
        }
    }

}
