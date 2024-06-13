import java.util.Arrays;

void main() {
    // kumpulan data dengan tipe variable yang sama
    // di tiap containernya ada indexnya

    int[] numbers = new int[3];
    int[] numbers2 = {10, 20, 30};

    System.out.println(STR."numbers: \{Arrays.toString(numbers)}");
    System.out.println(STR."numbers2: \{Arrays.toString(numbers2)}");

    int[][] twoDimArray = {{11,12,13}, {20,21,22}};
    System.out.println(STR."twoDimArray: \{Arrays.deepToString(twoDimArray)}");

    System.out.println(STR."numbers2 index2: \{numbers2[2]}");
    numbers[0] = 31;
    numbers[1] = 32;
    numbers[2] = 33;
    System.out.println(STR."numbers: \{Arrays.toString(numbers)}");

}