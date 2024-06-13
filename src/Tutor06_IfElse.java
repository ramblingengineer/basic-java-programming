import java.awt.*;

void main() {

    int x = 5;
    boolean isEven = x % 2 == 0;
    if( isEven ) {
        // code kamu kalau isEven == true
        System.out.println(STR."\{x} adalah Genap");
    } else {
        System.out.println(STR."\{x} adalah Ganjil");
    }

    int a = -4;
    if ( a > 0) {
        System.out.println(STR."\{a} is positive");
    } else if (a<0) {
        System.out.println(STR."\{a} is negative");
    } else {
        System.out.println(STR."\{a} is zero");
    }

    Point point1 = new Point(0,1);
    Point point2 = new Point(0,1);

    boolean isEqualPoint = point1.equals(point2);
    System.out.println(STR."Point is equal? \{isEqualPoint}");
}