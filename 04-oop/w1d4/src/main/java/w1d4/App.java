/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package w1d4;

public class App {

    public static void main(String[] args) {
        // This is an instance of a flower
        Flower flower = new Flower("Flower McFlowering");

        // Not hidden by a getter/setter
        // so we can access it directly.
        flower.name = "Test";

        // grow is an instance method, so acts on the instance
        flower.grow();
        flower.grow();

        System.out.println(flower.getHeight());

        Flower.chop(flower);
        System.out.println(flower.getHeight());

        Flower.chopHeight = 10;
        Flower.chop(flower);
        System.out.println(flower.getHeight());

        flower.bloom();
        System.out.println(flower.isBloomed());

        flower.bloom();
        System.out.println(flower.isBloomed());

        // recursion
        // you can call the function from itself!
        // (direct recursion = functionA => FunctionA...)
        // (indirect recursion = functionA => functionB => functionA...)

//        willExplode(0);
        printPyramid(5);
    }

    public static void willExplode(int size) {
        // recursion should always have a base case.
        // otherwise... STACKOVERFLOW KABOOM
        // what's a stack? Exception "Stack trace" and debugger.
        willExplode(size + 1);
    }

    public static void printPyramid(int size) {
        if (size > 0) {
            printPyramid(size - 1);
            printStars(size);
        }
    }

    /**
     * Outputs stars (*) to the console.
     * If quantity = 3, results: ***
     *
     * @param quantity The number of stars to print
     */
    public static void printStars(int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Recursion is generally how you follow trees.  (Like folder structures)
    public static void folderTraverse(String path) {
        // get all folders in path
        // for every folder, folderTraverse(folder);

        // get all files in path
        // for every file, print(file)
    }

}