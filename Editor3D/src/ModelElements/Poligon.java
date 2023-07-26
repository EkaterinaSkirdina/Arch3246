package ModelElements;

import Stuff.Point3D;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс полигонов
 */
public class Poligon {
    public List<Point3D> points = new ArrayList<>();

    /**
     * Конструктор
     * @param point начальная точка
     */
    public Poligon(Point3D point) {
        points.add(point);
    }
}