package Inheritance;

class SuperHeros {
    private String name;
    private String power;
    String suit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void superHerosSound() {
        System.out.println("Bowwws!!!");
    }

}

class batmanClass extends SuperHeros{
    static batmanClass batman = new batmanClass();
    static void Sound() {
        batman.setName("Batman");
        batman.setPower("Flying");
        batman.setSuit("Black");
    }

}
public class Inheritance {
    public static void main(String[] args) {
        SuperHeros batman = new SuperHeros();
        batman.setName("Batman");
        batman.setPower("Flying");
        batman.setSuit("Black");

        SuperHeros hulk = new SuperHeros();
        hulk.setName("Hulk");
        hulk.setPower("Strength");
        hulk.setSuit("Green");
    }
}


