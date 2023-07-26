package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

/**
 * Класс камеры
 */
public class Camera {
    public Point3D location;
    public Angle3D angle;


    /**
     * Метод поворота камеры     
     * @param angle улог поворота камеры
     */
    public void rotate(Angle3D angle){}

    /**
     * Метод перемещения камеры
     * @param point точка для перемещения
     */
    public void move(Point3D point){}
}