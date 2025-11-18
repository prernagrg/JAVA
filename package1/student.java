package package1;

public class student {
    private int a = 10;
    protected int b = 20;
    public int c = 30;
    int d = 40;

    public void display() {

        System.out.println("I am in student class");
        System.out.println("accessing private a =" + a);
        System.out.println("accessing protected b =" + b);
        System.out.println("accessing public c  =" + c);
        System.out.println("default = " + d);
    }
}
