void main() {

    for (int dayNumber = 1; dayNumber < 8; dayNumber++) {

        switch (dayNumber) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("It's not weekend yet :(");
                break;
            case 6:
                System.out.println("Hurray it is Saturday !!");
                break;
            case 7:
                System.out.println("It still Sunday");
                break;
            default:
                System.out.println("Error no day number");
        }

        // Java 12 pakai Arrow Case
        String value = switch (dayNumber) {
            case 1,2,3,4,5 -> {
                System.out.println("Process weekend day");
                yield "It's not weekend yet";
            }
            case 6 -> "Hurray it is Saturday";
            case 7 -> "Hurray it is Sunday";
            default -> "Error, no day number";
        };

        System.out.println(STR."[AC] \{value}");
        System.out.println("=========");
    }
}