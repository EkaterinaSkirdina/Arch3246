package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class IronFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Gold();
    }
    
}
