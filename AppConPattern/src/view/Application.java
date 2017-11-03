package view;

/*
 * @author Keith Downing
 */
import appconpattern.AppConPattern;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        AppConPattern deligate = new AppConPattern();
        String add = "add";
        String sub = "sub";
        String mul = "mul";
        String div = "div";
        Integer num1 = -5;
        Integer num2 = 5;
        String command;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        num1 = Integer.parseInt(in.nextLine());
        System.out.println("Enter a Command(+, *, /, -, ^): ");
        command = in.nextLine();
        System.out.println("Enter Another Number: ");
        num2 = Integer.parseInt(in.nextLine());

        System.out.println(num1 + " " + command + " " + num2 + " = ");
        deligate.handleCommand(command, num1, num2);

    }
}


// Sandbox from video; https://www.youtube.com/watch?v=BpoQGC0SQoI