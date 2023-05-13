interface Testable {
    void display();
}

class Test implements Testable {
    public void display() {
        System.out.println("Displaying test information.");
    }
}

abstract class AbsTest implements Testable {
}

public class que2 {
    public static void main(String[] args) {
        Test test = new Test();
        test.display(); 
        AbsTest absTest = new AbsTest() {
            public void display() {
                System.out.println("Displaying abstract test information.");
            }
        };
        absTest.display(); 
    }
}
