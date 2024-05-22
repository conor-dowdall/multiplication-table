/**
 * a class with a static 'print' method to print a neatly formatted
 * multiplication table
 * to the terminal
 */
public class MultiplicationTable {

    private static int spacing = 5;

    private static String addSpace(int number) {
        return String.format("%" + spacing + "d", number);
    }

    private static String getTableSide(int number) {
        return String.format("%" + spacing + "s", String.valueOf(number) + "|");
    }

    private static String getTableSide(String string) {
        return String.format("%" + spacing + "s", string + "|");
    }

    /**
     * print a multiplication table to the terminal
     * 
     * @param min - the lowest number to include in the multiplication table
     * @param max - the highest number to include in the multiplication table
     */
    public static void print(int min, int max) {
        // get the spacing right
        spacing = String.valueOf(max * max).length() + 1;

        // print the table heading
        System.out.print(getTableSide(""));
        for (int i = min; i <= max; i++) {
            System.out.print(addSpace(i));
        }
        System.out.println(); // go to next line
        for (int i = 0; i < spacing; i++) {
            System.out.print("-"); // print table top border side
        }
        for (int i = min; i <= max; i++) {
            for (int j = 0; j < spacing; j++) {
                System.out.print("-"); // print table top border for each number
            }
        }
        System.out.println(); // go to next line

        // print the table side and table body
        for (int i = min; i <= max; i++) {
            System.out.print(getTableSide(i));
            for (int j = min; j <= max; j++) {
                System.out.print(addSpace(j * i));
            }
            System.out.println("");
        }

    }

}
