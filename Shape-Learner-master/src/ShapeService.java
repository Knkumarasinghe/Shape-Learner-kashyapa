
import models.Shape;
import models.ShapeDTO;

import java.awt.*;
import java.awt.geom.Path2D;

public class ShapeService {
    static public ShapeDTO[] shapeDTOS = new ShapeDTO[]{
            new ShapeDTO(ShapeType.Square.name(),new Square()),
            new ShapeDTO(ShapeType.Circle.name(),new Circle()),
            new ShapeDTO(ShapeType.Rectangle.name(),new Rectangle()),
            new ShapeDTO(ShapeType.Triangle.name(),new Triangle()),
            new ShapeDTO(ShapeType.Pentagon.name(),new Pentagon()),
            new ShapeDTO(ShapeType.Hexagon.name(),new Hexagon()),
            new ShapeDTO(ShapeType.Octagon.name(),new Octagon()),
            new ShapeDTO(ShapeType.Heptagon.name(),new Heptagon()),
            new ShapeDTO(ShapeType.Nonagon.name(), new Nonagon()),
            new ShapeDTO(ShapeType.Decagon.name(), new Decagon()),
            new ShapeDTO(ShapeType.Ellipse.name(),new Ellipse()),
            new ShapeDTO(ShapeType.Diamond.name(),new Diamond()),
            new ShapeDTO(ShapeType.Trapezoid.name(),new Trapezoid()),
            new ShapeDTO(ShapeType.Parallelogram.name(),new Parallelogram()),
            new ShapeDTO(ShapeType.Cloud.name(),new Cloud()),
            new ShapeDTO(ShapeType.Cross.name(),new Cross()),
            new ShapeDTO(ShapeType.Oval.name(), new Oval()),
            new ShapeDTO(ShapeType.Flower.name(), new Flower()),
            new ShapeDTO(ShapeType.Star.name(), new Star()),
            new ShapeDTO(ShapeType.Heart.name(), new Heart()),
    };
}


enum ShapeType{
    Rectangle,
    Circle,
    Triangle,
    Square,
    Pentagon,
    Hexagon,
    Octagon,
    Ellipse,
    Diamond,
    Trapezoid,
    Parallelogram,
    Cloud,
    Cross,
    Oval,
    Flower,
    Heptagon,
    Nonagon,
    Decagon,
    Star,
    Heart
}

class Pentagon implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        int radius = Math.min(width, height) / 2;
        int[] xPoints = {(int) (x + width / 2 + radius * Math.cos(0)),
                (int) (x + width / 2 + radius * Math.cos(2 * Math.PI / 5)),
                (int) (x + width / 2 + radius * Math.cos(4 * Math.PI / 5)),
                (int) (x + width / 2 + radius * Math.cos(6 * Math.PI / 5)),
                (int) (x + width / 2 + radius * Math.cos(8 * Math.PI / 5))};
        int[] yPoints = {(int) (y + height / 2 - radius * Math.sin(0)),
                (int) (y + height / 2 - radius * Math.sin(2 * Math.PI / 5)),
                (int) (y + height / 2 - radius * Math.sin(4 * Math.PI / 5)),
                (int) (y + height / 2 - radius * Math.sin(6 * Math.PI / 5)),
                (int) (y + height / 2 - radius * Math.sin(8 * Math.PI / 5))};
        g.fillPolygon(xPoints, yPoints, 5);
    }
}

class Hexagon implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        int[] xPoints = {x + width / 4, x + width * 3 / 4, x + width, x + width * 3 / 4, x + width / 4, x};
        int[] yPoints = {y, y, y + height / 2, y + height, y + height, y + height / 2};
        g.fillPolygon(xPoints, yPoints, 6);
    }
}

class Octagon implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        int[] xPoints = {x + width / 3, x + width * 2 / 3, x + width, x + width, x + width * 2 / 3, x + width / 3, x, x};
        int[] yPoints = {y, y, y + height / 3, y + height * 2 / 3, y + height, y + height, y + height * 2 / 3, y + height / 3};
        g.fillPolygon(xPoints, yPoints, 8);
    }
}

class Heptagon implements Shape {

    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        int[] xPoints = calculateXPoints(x, width);
        int[] yPoints = calculateYPoints(y, height);

        g.fillPolygon(xPoints, yPoints, 7);
    }

    private int[] calculateXPoints(int x, int width) {
        int[] xPoints = new int[7];
        double angle = 2 * Math.PI / 7;

        for (int i = 0; i < 7; i++) {
            xPoints[i] = (int) (x + width / 2 + width / 2 * Math.cos(i * angle));
        }

        return xPoints;
    }

    private int[] calculateYPoints(int y, int height) {
        int[] yPoints = new int[7];
        double angle = 2 * Math.PI / 7;

        for (int i = 0; i < 7; i++) {
            yPoints[i] = (int) (y + height / 2 + height / 2 * Math.sin(i * angle));
        }

        return yPoints;
    }
}










