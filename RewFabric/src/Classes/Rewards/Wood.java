package Classes.Rewards;

import Classes.iGameItem;

public class Wood implements iGameItem {
    
    @Override
    public void open() {
        System.out.println("Wood!");
    }

}
