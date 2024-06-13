import java.util.Arrays;

void main() {

    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = 10 + i;
    }

    for (int number : numbers) {
        System.out.print(STR."\{number} ");
    }
}