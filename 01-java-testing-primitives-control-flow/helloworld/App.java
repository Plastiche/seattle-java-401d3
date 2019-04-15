public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // comments
        /*
         * Multi line comments
         */

        // variables - numbers
        // primitives
        // byte byteNum = 0;
        // short shortNum = 1;
        int num = 1; // var num = 1;
        // long num2 = 10000;
        // double num3 = 1000.5;
        // float num4 = 1000.69;
        // long longNum = num;
        // int intNum = num2;

        // variables - others
        boolean myTrue = true;
        char character = 'A';
        String firstName = "Bob";
        String lastName = "McRobertson";
        // char firstLetter = name[0];
        // System.out.println(firstLetter);

        // operators +, -, /, *, %
        int test = 1 + 2;

        // strings
        String fullName = firstName + " " + lastName;
        String fullNamePlusANumber = fullName + num;
        System.out.println(num);

        // conditionals
        if (true || false) {
            System.out.println("Yes? No?");
        } else if (false) {

        } else {

        }

        if (fullName != null && fullName.length() > 0) {

        }

        

        // methods/parameters
        int results = myCoolFunction(2, 3);

        // basic arrays
        int[] array = new int[] { 1, 2 };
        array[0] = 5; // 5, 2
        int[] array2 = new int[2];

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        // for(int i=0;i<array2.length;i++){System.out.println(i);}
        System.out.println("Names: ");
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static int myCoolFunction(int a, int b) {
        int num = a + b;
        return num;
    }

    public static void doAThing(int a) {

    }
}