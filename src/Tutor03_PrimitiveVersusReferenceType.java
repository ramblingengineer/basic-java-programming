import java.awt.*;

void main() {

    int x = 3;
    int y = x;
    System.out.println(STR."x: \{x} y:\{y}");
    x = 7;
    System.out.println(STR."x: \{x} y:\{y}");

    Point point1 = new Point(0, 1);
    Point point2 = point1;
    System.out.println(STR."point1: \{point1}");
    System.out.println(STR."point2: \{point2}");

    update(point2);
    System.out.println(STR."point1: \{point1}");
    System.out.println(STR."point2: \{point2}");

}

void update(Point point) {
    point.x = -33;
}