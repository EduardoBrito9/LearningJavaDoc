import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, world!");
        System.out.println("Im really happy!");
        System.out.println("I just learned a shortcut");

        //variables

        int x;
        x = 123; //assignment
        int y = 321; //initialization
        long extremelyBig = 929292929292922929L;
        double z = 3.14;
        boolean truth = true;
        char symbol = '@';
        String name = "Eduardo";
        System.out.println(x + y + extremelyBig + symbol + name + z + ", " + truth);

        //swap variables

        String cup = "water";
        String mixer = "Kool-Aid";
        System.out.println("cup: " + cup);
        System.out.println("mixer: " + mixer);
        cup = mixer;
        System.out.println("cup: " + cup);

        String temp;

        temp = cup;
        cup = mixer;
        mixer = temp;

        System.out.println(cup + mixer);

        //Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String nameAnswer = scanner.nextLine();

        System.out.println("how old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite language?");
        String language = scanner.nextLine();

        System.out.println("É um prazer ter você conosco!" + nameAnswer);
        System.out.println("Great, you are able when you are older! " + age);
        System.out.println(language);

        //expression
        int friends = 10;
        friends++; // 11 friends or friends-- is 9 friends

        String gui = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, "Hello, " + gui + "!");

        int ageTest = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null, "My age is " + ageTest + " too!");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
        JOptionPane.showMessageDialog(null, "Your height is " + height + "m, its great!");


        // Pitagoras challenge

        double e = 3.14;
        double d = -10;

        double f = Math.max(e, d);
        //Math.min = will return the min, Math.abs = will remove all signals of negative and return the biggest number...
        //in that case it is 10. 10 is the biggest number when we use Math.abs, Math.sqrt = square root = 25 = 5, Math.round is
        // 3.14 -> 3, Math.ceil - round up, Math.floor - round down
        System.out.println(f);

        //hˆ2 = cˆ2 + cˆ2
        System.out.println("say the first side");
        double cfirst = scanner.nextDouble();
        System.out.println("say the second side");
        double csecond = scanner.nextDouble();
        System.out.println("H =" + Math.sqrt((cfirst * cfirst) + (csecond * csecond)));

        //GENERATING A RANDOM VALUE

        Random random = new Random();
        int randomInt = random.nextInt(100); // +1 if I would like to eliminate 0 from that range
        System.out.println(randomInt);

        boolean wwb = random.nextBoolean();
        System.out.println(wwb);

        //if is obvious

        //switch allows a variable to be tested for equality against a list of values

        String myName = "Eduardo";

        switch (myName) {
            case "Eduardo":
                System.out.println("Hello, Eduardo!");
                break;
            case "Kool-Aid":
                System.out.println("Hello, Kool-Aid!");
            default:
                System.out.println("your name wasn't found here, sorry");
        }

        /*
         logical operators = && -> both conditions must be true, || -> either condition must be true, !no -> this is
        like -> !no == yes
        */


        //EQUALS
        String learningEquals = scanner.next();
        if(learningEquals.equals("yes") || learningEquals.equals("y")) {
            System.out.println("OMG");
        }

    }
}