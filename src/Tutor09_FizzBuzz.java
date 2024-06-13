void main() {
    // Print angka dari 1 s/d 15
    // Setiap angka yang habis dibagi 3 maka print Fizz
    // Setiap angka yang habis dibagi 5 maka print Buzz
    // Dan bila angkanya habis dibagi 3 dan 5 maka jadinya print FizzBuzz

    // Iterate dari 70 - 105
    // Pop untuk habis dibagi 7

    // Kalian bisa coba untuk yang ini.
    // Kalau ada angka 3 nya, tambahkan dengan Fizz lagi, misal 3 jadi FizzFizz, 13 Fizz
    // Kalau 30 FizzFizzBuzz

    for (int i = 70; i < 106; i++) {
        String result = "";

        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0 ) {
            result += "Buzz";
        }
        if (i % 7 == 0 ) {
            result += "Pop";
        }

        if (result.isEmpty()) {
            System.out.println(i);
        } else {
            System.out.println(result);
        }
    }
}