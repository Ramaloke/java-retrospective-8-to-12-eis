package java11.string;

public class NewStringMethods {
    public static void main(String[] args) {
        System.out.println("=-=-=-=-= String.isBlank() =-=-=-=-=");
        isBlank();

        System.out.println("=-=-=-=-= String.isBlank() =-=-=-=-=");
        lines();

        System.out.println("=-=-=-=-= String.strip() =-=-=-=-=");
        strip();

        System.out.println("=-=-=-=-= String.repeat(int) =-=-=-=-=");
        repeatThreeTimes();
    }

    private static void isBlank() {
        String blank_no_whitespaces = "";
        String blank_only_whitespaces = "      ";
        String not_blank_with_whitespaces = "     text";

        System.out.println("blank_no_whitespaces.isBlank(): " + blank_no_whitespaces.isBlank());
        System.out.println("blank_only_whitespaces.isBlank(): " + blank_only_whitespaces.isBlank());
        System.out.println("not_blank_with_whitespaces.isBlank(): " + not_blank_with_whitespaces.isBlank());
    }

    /**
     * Line terminators are:
     * - a line feed character "\n"
     * - a carriage return character "\r"
     * - a carriage return followed immediately by a line feed "\r\n"
     */
    private static void lines() {
        String text ="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut\n" +
                "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris\r" +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit\r\n" +
                "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in " +
                "culpa qui officia deserunt mollit anim id est laborum.";

        text.lines()
                .map(line -> "line: " + line)
                .forEach(System.out::println);
    }

    private static void strip() {
        final String text = "     text     ";

        String stripTrailingWhitespaces = text.stripTrailing();
        System.out.println("Trailing whitespaces: " + stripTrailingWhitespaces + "!");

        String stripLeadingWhitespaces = text.stripLeading();
        System.out.println("Leading whitespaces: " + stripLeadingWhitespaces + "!");

        String stripLeadingAndTrailingWhitespaces = text.strip();
        System.out.println("Both leading and trailing whitespaces: " + stripLeadingAndTrailingWhitespaces + "!");
    }

    private static void repeatThreeTimes() {
        final String flipTheTable = " (╯°□°）╯︵ ┻━┻ ";
        System.out.println("Flip the table THREE times in a row: " + flipTheTable.repeat(3));

    }
}
