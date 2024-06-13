void main() {
    // + - * / %

    int x = 0;

    System.out.println(STR."x++: \{x++}");
    System.out.println(STR."x: \{x}");
    System.out.println(STR."++x: \{++x}");

    System.out.println(STR."x--: \{x--}");
    System.out.println(STR."x: \{x}");
    System.out.println(STR."--x: \{--x}");

    // Div atau Pembagian
    int a = 5;
    int b = 3;
    int c = a/b;
    double d= a/b;

    System.out.println(STR."\{a} / \{b} ->  c= \{c} d= \{d}");


    double da = 5.0;
    int db = 2;
    double dc = da/db;
    System.out.println(STR."\{da} / \{db} = \{dc}");

    // Modulo %

    int q = 5 % 2;
    System.out.println(STR."5 mod 2 = \{q}");


}