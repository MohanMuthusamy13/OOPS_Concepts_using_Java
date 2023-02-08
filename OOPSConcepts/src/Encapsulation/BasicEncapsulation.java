package Encapsulation;

class Mobile {
    private String modelType;
    private int price;
    String getModel() {
        return modelType;
    }
    void setModelType(String modelType1) {
        modelType = modelType1;
    }

    int getPrice() {
        return price;
    }
    void setPrice(int price1) {
        price = price1;
    }
}

public class BasicEncapsulation {
    public static void main(String[] args) {
        Mobile vivo = new Mobile();
        vivo.setModelType("Y15");
        System.out.println(vivo.getModel());
        vivo.setPrice(150);
        System.out.println(vivo.getPrice());
    }
}

