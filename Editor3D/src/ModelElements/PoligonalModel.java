package ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс моделей полигонов
 */
public class PoligonalModel {
    public List<Poligon> poligons;
    public List <Texture> textures;

    /**
     * Конструктор
     * @param textures
     */
    public PoligonalModel(List <Texture> textures) {
        this.poligons = new ArrayList<>();
        this.textures = textures;
    }
}