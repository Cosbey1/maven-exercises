import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String test = StringUtils.upperCase("Lowercasetouppercase");
        System.out.println(test);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isNumber = StringUtils.isNumeric(input);
        String swapCase = StringUtils.swapCase(input);
        String backwards = StringUtils.reverse(input);

        System.out.println(isNumber);
        System.out.println(swapCase);
        System.out.println(backwards);


//    int userInput;

    }

}
