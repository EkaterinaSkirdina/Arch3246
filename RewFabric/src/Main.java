import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Classes.Rewards.BronzeFabric;
import Classes.Rewards.GemFabric;
import Classes.Rewards.GlassFabric;
import Classes.Rewards.GoldFabric;
import Classes.Rewards.IronFabric;
import Classes.Rewards.SilverFabric;
import Classes.Rewards.WoodFabric;

public class Main {
    public static void main(String[] args) throws Exception {
        ItemGenerator fab1 = new GoldFabric();
        fab1.openReward();
        ItemGenerator fab2 = new GemFabric();
        fab2.openReward();
        ItemGenerator fab3 = new SilverFabric();
        fab3.openReward();
        ItemGenerator fab4 = new BronzeFabric();
        fab4.openReward();
        ItemGenerator fab5 = new WoodFabric();
        fab5.openReward();
        ItemGenerator fab6 = new IronFabric();
        fab6.openReward();
        ItemGenerator fab7 = new GlassFabric();
        fab7.openReward();

        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab1);
        fabricList.add(fab2);
        
        for(int i = 0; i<20; i++){
            int index = Math.abs(rnd.nextInt()%2==0?0:1);
            fabricList.get(index).openReward();
        }
    }
}
