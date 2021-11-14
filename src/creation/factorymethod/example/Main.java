package creation.factorymethod.example;

import creation.factorymethod.example.framework.*;
import creation.factorymethod.example.idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("高橋さん");
        Product card2 = factory.create("田中さん");
        Product card3 = factory.create("佐藤さん");
        card1.use();
        card2.use();
        card3.use();
    }
}
