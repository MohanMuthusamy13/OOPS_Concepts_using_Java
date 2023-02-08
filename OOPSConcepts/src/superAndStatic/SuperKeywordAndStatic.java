package superAndStatic;


class Animals {
    private String name;

    public String getName() {
        return name;
    }

    public Animals(String n) {
        this.name = n;
    }
}

class Hippo extends Animals {
    private String hipStrategy;
    public Hippo(String name) {
        super(name);
        this.hipStrategy = "Fast";
    }

    public String getHipStrategy() {
        return hipStrategy;
    }
}

class Tiger extends Animals {
    public Tiger(String name) {
        super(name);
    }
    Hippo hiptig = new Hippo("Hips");
    public void friendlyTiger() {
        Hippo hiptig = new Hippo("Hips");
    }

}
public class SuperKeywordAndStatic {
    public static void main(String[] args) {
        Hippo hip = new Hippo("BurryHippo");
        System.out.println(hip.getName());
        System.out.println(hip.getHipStrategy());

        Tiger tiggy = new Tiger("Tiggy");
        System.out.println(tiggy.getName());


    }
}


// IF A CLASS HAS ONLY STATIC METHODS WE CAN USE THE CLASS NAME AND DOT OPERATOR TO ACCESS THE STATIC METHOD

/*
class Sports {

    private String groundShape;


    static void Cricket() {
        groundShape = "Oval";
        System.out.println("Play cricket");
    }

    static void Football() {
        Cricket();
        System.out.println("Play football");
    }
}
public class Main {
    public static void main(String[] args) {
//        Sports.Cricket();
        Sports s = new Sports();
        Sports.Football();
    }
}

 */

// WORKING WITH STATIC

/*
class Sports {

    static int sportsCount;
    private static final int i;

    static {
        i = (int)(Math.random() * 10);
    }

    public Sports() {
        sportsCount++;
        System.out.println("Buz..the sports objects count is " + sportsCount);

        System.out.println(i);
    }
    public void Cricket() {
        System.out.println("Yayy! Its cricket");
    }

    public void Football() {
        System.out.println("Yayyyayay! Its football");
    }
}
public class Main {
    public static void main(String[] args) {
        Sports cric = new Sports();
        Sports foot = new Sports();
        System.out.println(Sports.sportsCount);

    }
}

 */
