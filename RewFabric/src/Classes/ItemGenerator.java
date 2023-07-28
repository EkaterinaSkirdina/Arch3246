package Classes;

/**
 * Абстрактеый класс фвбрики наград
 */
public abstract class ItemGenerator {
    public void openReward(){
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}
