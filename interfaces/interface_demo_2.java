
package interfaces;

interface hi {

    void show();

    void name();

    public static void deparment() {
        System.out.println("I am from Electronics and Communication Engineering");
    }

}

class hello implements hi {

    @Override
    public void show() {
        System.out.println("hi");

    }

    @Override
    public void name() {
        System.out.println("I am benitto");
    }
}

public class interface_demo_2 {

    public static void main(String arrgs[]) {
        hello h = new hello();
        h.show();
        h.name();
        hi.deparment();
    }
}
