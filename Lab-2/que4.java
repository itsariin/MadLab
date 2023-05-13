class One {
    int x;

    One(int x) {
        this.x = x;
    }
}

class Two extends One {
    Two(int x) {
        super(x); // Invoke the parameterized constructor of One
    }
}
