package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class WoodFabric extends ItemGenerator{
    
    @Override
    public iGameItem createItem() {
        return new Wood();
    }

}
