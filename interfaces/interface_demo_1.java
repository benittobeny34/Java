
package interfaces;

interface beni {

    static void show() {  //in java 8 we can write static methods in inside the interfaces.
        System.out.println("hi");
    }

}

class benitto implements beni {

    void show() {
        System.out.println("hello");
    }
}

public class interface_demo_1 {

    public static void main(String... args) {
        benitto obj = new benitto();
        obj.show();
        beni.show();
    }
}
