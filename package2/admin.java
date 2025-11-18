package package2;

import package1.student;

public class admin extends student {

    public void show() {
        System.out.println("Accessing protected b = " + b);
    }

    public static void main(String[] args) {
        student s = new student();
        s.display();
        // System.out.println("accessing protected b = " + s.b);
        System.out.println("accessing public c = " + s.c);
        admin a = new admin();
        a.show();
    }

}
