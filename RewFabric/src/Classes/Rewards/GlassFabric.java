package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;


public class GlassFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Glass();
    }
    
}
