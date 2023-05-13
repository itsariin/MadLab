class Mother {
    int x;

    static void show() {
        System.out.println("Mother's show method");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Child's show method");
    }
}

class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); // show() of Mother is called

        Child ch = new Child();
        ch.show(); // show() of Child is called

        Mother m1 = new Child();
        m1.show(); // show() of Child is called using Mother reference

        // Testing static method inheritance and overriding
        Mother.show(); // static show() of Mother is called
        Child.show(); // static show() of Child is called

        // Static methods are not overridden, but they can be hidden
        // by defining a static method with the same signature in a subclass

        // Uncomment the line below to observe the error when trying to call static method with instance reference
        // m.show(); // Error: Cannot make a static reference to the non-static method show() from the type Mother

        // Uncomment the line below to observe the error when trying to call static method with instance reference
        // ch.show(); // Error: Cannot make a static reference to the non-static method show() from the type Child
    }
}
