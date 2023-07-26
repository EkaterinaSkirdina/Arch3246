package ModelElements;


import java.util.ArrayList;
import java.util.List;

/**
 * Класс сцены
 */
public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List <Flash> flashes;
    public List<Camera> cameras = new ArrayList<>();
   
    /**
     * Конструктор
     * @param id id сцены
     * @param models список моделей
     * @param flashes список освещения
     * @param cameras список камер
     * @throws Exception исключение о не корректных данных в конструкторе
     */
    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if(!models.isEmpty()) {
            this.models = models;
        } else{
            throw new Exception("Список моделей не может быть пустым!");
        }
        this.flashes = flashes;
        if (!cameras.isEmpty()) {
            this.cameras = cameras;
        }else{
            throw new Exception("Список камер не может быть пустым!");
        }
    }

    /**
     * Метод заглушка 1
     * @return
     * @param <T>
     */
    public <T> T method1(T flash){
        return flash;
    }

    /**
     * Метод заглушка 2
     * @return
     * @param <T>
     * @param <E>
     */
    public <T, E> T method2(T model, E flash){
        return model;
    }
}