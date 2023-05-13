abstract class Bharatvanshi {
    public abstract void fight();

    public abstract void obey();

    public void kind() {
        System.out.println("Being a Bharatvanshi, I am kind.");
    }
}

class Pandav extends Bharatvanshi {
    public void fight() {
        System.out.println("Arjun is fighting with skill.");
    }

    public void obey() {
        System.out.println("Arjun is obedient.");
    }
}

class Kaurav extends Bharatvanshi {
    public void fight() {
        System.out.println("Kauravs are known for their fighting skills.");
    }

    public void obey() {
        System.out.println("Kauravs are disobedient.");
    }
}

class Vikarn extends Kaurav {
    public void fight() {
        System.out.println("Vikarn is a noble fighter.");
    }

    public void obey() {
        System.out.println("Vikarn is obedient.");
    }

    public void kind() {
        System.out.println("Vikarn is kind-hearted.");
    }
}

public class que1 {
    public static void main(String[] args) {
        Pandav arjun = new Pandav();
        Pandav bheem = new Pandav();
        Kaurav duryodhan = new Kaurav();
        Vikarn vikarn = new Vikarn();

        arjun.fight();  
        arjun.obey();  
        arjun.kind();  

        bheem.fight();  
        bheem.obey();  
        bheem.kind(); 

        duryodhan.fight();  
        duryodhan.obey();  
        duryodhan.kind(); 

        vikarn.fight();  
        vikarn.obey();  
        vikarn.kind();  
    }
}
