import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello, world!");
//        System.out.println("Im really happy!");
//        System.out.println("I just learned a shortcut");
//
//        //variables
//
//        int x;
//        x = 123; //assignment
//        int y = 321; //initialization
//        long extremelyBig = 929292929292922929L;
//        double z = 3.14;
//        boolean truth = true;
//        char symbol = '@';
//        String name = "Eduardo";
//        System.out.println(x + y + extremelyBig + symbol + name + z + ", " + truth);
//
//        //swap variables
//
//        String cup = "water";
//        String mixer = "Kool-Aid";
//        System.out.println("cup: " + cup);
//        System.out.println("mixer: " + mixer);
//        cup = mixer;
//        System.out.println("cup: " + cup);
//
//        String temp;
//
//        temp = cup;
//        cup = mixer;
//        mixer = temp;
//
//        System.out.println(cup + mixer);
//
//        //Scanner
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        String nameAnswer = scanner.nextLine();
//
//        System.out.println("how old are you?");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("What is your favorite language?");
//        String language = scanner.nextLine();
//
//        System.out.println("É um prazer ter você conosco!" + nameAnswer);
//        System.out.println("Great, you are able when you are older! " + age);
//        System.out.println(language);
//
//        //expression
//        int friends = 10;
//        friends++; // 11 friends or friends-- is 9 friends
//
//        String gui = JOptionPane.showInputDialog("enter your name");
//        JOptionPane.showMessageDialog(null, "Hello, " + gui + "!");
//
//        int ageTest = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
//        JOptionPane.showMessageDialog(null, "My age is " + ageTest + " too!");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
//        JOptionPane.showMessageDialog(null, "Your height is " + height + "m, its great!");
//
//
//        // Pitagoras challenge
//
//        double e = 3.14;
//        double d = -10;
//
//        double f = Math.max(e, d);
//        //Math.min = will return the min, Math.abs = will remove all signals of negative and return the biggest number...
//        //in that case it is 10. 10 is the biggest number when we use Math.abs, Math.sqrt = square root = 25 = 5, Math.round is
//        // 3.14 -> 3, Math.ceil - round up, Math.floor - round down
//        System.out.println(f);
//
//        //hˆ2 = cˆ2 + cˆ2
//        System.out.println("say the first side");
//        double cfirst = scanner.nextDouble();
//        System.out.println("say the second side");
//        double csecond = scanner.nextDouble();
//        System.out.println("H =" + Math.sqrt((cfirst * cfirst) + (csecond * csecond)));
//
//        //GENERATING A RANDOM VALUE
//
//        Random random = new Random();
//        int randomInt = random.nextInt(100); // +1 if I would like to eliminate 0 from that range
//        System.out.println(randomInt);
//
//        boolean wwb = random.nextBoolean();
//        System.out.println(wwb);
//
//        //if is obvious
//
//        //switch allows a variable to be tested for equality against a list of values
//
//        String myName = "Eduardo";
//
//        switch (myName) {
//            case "Eduardo":
//                System.out.println("Hello, Eduardo!");
//                break;
//            case "Kool-Aid":
//                System.out.println("Hello, Kool-Aid!");
//            default:
//                System.out.println("your name wasn't found here, sorry");
//        }
//
//        /*
//         logical operators = && -> both conditions must be true, || -> either condition must be true, !no -> this is
//        like -> !no == yes
//        */
//
//
//        //EQUALS
//        String learningEquals = scanner.next();
//        if(learningEquals.equals("yes") || learningEquals.equals("y")) {
//            System.out.println("OMG");
//        }

        //nested loops = a  loop inside a loop

        int rows;
        int cols;
        String symbolNested;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of cols: ");
        cols = scanner.nextInt();
        System.out.println("Enter symbol: ");
        symbolNested = scanner.next();


        for (int i = 1; i <= rows; i++) {
            if (i > 1) System.out.println();
            for (int j = 1; j <= cols; j++) {
                System.out.print(symbolNested);
            }
        }

        //Array

        String[] cars = {"Camaro", "Ferrari", "Lamborghini", "Tesla" };

        cars[0] = "porsche";

        System.out.println(cars[0]); //porsche

        // Another way to create manage an array

        String[] carsLearning = new String[3]; // the max is three elements

        carsLearning[0] = "Ferrari";
        carsLearning[1] = "Lamborghini";
        carsLearning[2] = "BYD";
        System.out.println(carsLearning[2]);

        for (int i = 0; i < carsLearning.length; i++) {
            System.out.println(carsLearning[i]);
        }

        //2D array -> array of array

        String[][] array2d = {{"1o", "2o", "3o" }, {"4o", "5o", "6o" }, {"7o", "8o", "9o" }};

        String[][] cars2d = new String[3][3];
        cars2d[0][0] = "1o";
        cars2d[0][1] = "2o";
        cars2d[0][2] = "3o";
        cars2d[1][0] = "4o";
        cars2d[1][1] = "5o";
        cars2d[1][2] = "6o"; //...

        for (int i = 0; i < array2d.length; i++) {
            System.out.println();
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j]);
            }
        }

        //String methods

        String testingMethods = "Bro";

        if (testingMethods.equals("Bro")) {
            System.out.println(true);
        }
        if (testingMethods.equalsIgnoreCase("bro")) {
            System.out.println(true);
        }

        //int result = testingMethods.length();

        //char result = testingMethods.charAt(0);

        //int result = testingMethods.indexOf("o");

        //boolean result = testingMethods.isEmpty();

        //String result = testingMethods.toUpperCase(); or toLowerCase

        // .trim() -> this remove all empty space of a string

        String result = testingMethods.replace("o", "a");
        System.out.println(result);



        // wrapper class -> contain useful methods & can be used with collections (ex: ArrayList)

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        // Boolean a = true; autoboxing
        // boolean b = a; unboxing (a.booleanValue());

        // ArrayList => a resizable array.
        // Elements can be added and removed after compilation phase store reference data types


        // ArrayList = a resizable array.
        // Elements can be added and removed after compilation phase
        // store reference data types


        ArrayList<String> list = new ArrayList<>();
        list.add("Eduardo");
        list.add("Felipe");
        list.add("Hy");

        list.set(0, "Brito"); // now Brito is the first item and Eduardo doesn't exist
        // anymore
        list.remove(2); // Hy was removed
        list.clear(); //now it is empty

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        System.out.println(bakeryList);

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("pappers");

        System.out.println(produceList.get(0));

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("milk");
        drinkList.add("orange juice");

        System.out.println(drinkList.get(0));

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(0).get(0));

        // for-each traversing technique to iterate through the elements is an array/collection
        // less steps, more readable
        // less flexible

        String[] animals = {"cat", "dog", "rat", "bird"};

        for (String animal :  animals) {
            System.out.println(animal);
        }

        ArrayList<String> animalsWrap = new ArrayList<>();
        animalsWrap.add("cat");
        animalsWrap.add("dog");
        animalsWrap.add("rat");
        animalsWrap.add("bird");

        for (String animal : animalsWrap) {
            System.out.println(animal);
        }

        String parameter = "testing a parameter";
        int age = 18;
        hello(parameter, age);

        System.out.println(sum(2, 3));

        int x = sum(2,3, 4, 6);
        System.out.println(x);

        // printf() = an optional method to control, format, and display text to the console window two arguments =
        // format string + (object / variable / value)
        // [flags] [precision] [width] [conversion-character]

        System.out.printf("this is a format string: %d\n", 123);

        boolean myBoolean = true;
//        System.out.printf("Im learning about printf and this is an example: %b\n", myBoolean);
//        %d → int
//        %s → string
//        %.2f → float or double with two numbers after . -> 12.98
//        %n ou \n → nova linha

        // [Flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify ->
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        // EXAMPLES:
        // System.out.printf("Hello %-10s", myString) -> output = Bro''''''' -> each ' is a \n
        // System.out.printf("Hello %10s", myString) -> output = '''''''Bro -> each ' is a \n
        // System.out.printf("Hello %.2f", myDouble) -> output = 1000.92
        // System.out.printf("Hello %+f", myDouble) -> output = +1000.9233339393 (if the number is negative -> -1000...)
        // System.out.printf("Number formatted: %05d\n", number); - 000002000.0000
        // System.out.printf("Número format: %,f", numero); 1,000.0000


        //final keyword

        final double irreversible = 3.14; // I can no longer change that number, this turned in a permanent value;


        // OOP (Object)

        // object = an instance of a class that may contain attributes and methods
        // attributes => characteristics that this object has
        // methods => the different actions that this object can perform

        // EXAMPLE WITH A COFFEE -> CHARACTERISTICS = 20.0 TEMP, EMPTY, NO SUGAR. METHODS = DRINK(), SPILL();



        // example: phone, desk, computer, coffee cup

        Car myCar = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar.year + ' ' + myCar.model + ' ' + myCar.price);
        System.out.println(myCar2.year + ' ' + myCar2.model + ' ' + myCar2.price);
        myCar.drive();

        // Constructor = special method that is called when an object is instantiated (created)

        Human human = new Human("Rick", 18, 1.88, 74);
    }

    //method = a block of code that is a executed whenever it is called
    //upon - we can't make a static reference to the non-static

    static void hello(String something, int age) {
        System.out.println(something);
    }

    static int sum(int a, int b) {
        System.out.println("This is overloaded method number one");
        int z = a + b;
        return z;
    }

    // overloaded methods = methods that share the same name but have different parameters
    // method name + parameters = method signature

    static int sum(int a, int b, int c) {
        System.out.println("This is overloaded method number two");
        int z = a + b + c;
        return z;
    }



    static int sum(int a, int b, int c, int d) {
        System.out.println("This is overloaded method number three");
        int z = a + b + c + d;
        return z;
    }

    // when we use it? -> we use it in "optional" occasions; share the same name but have different parameters;
    // method name + parameters = method signature;



}













