class Mother {
    int x;

    void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    void show() {
        System.out.println("Hello JUET");
    }
}

class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); // show() of Mother is called

        Child ch = new Child();
        ch.show(); // show() overridden in Child is called
    }
}
