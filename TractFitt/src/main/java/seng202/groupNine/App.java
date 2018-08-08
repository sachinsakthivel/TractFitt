package seng202.groupNine;

import java.util.ArrayList;
/**
 * Hello world of Arrays!
 *
 */
public class App {
    private int testArray[] = {0, 1, 2, 3, 4, 5};
    public int[] getTestArray() {
        return testArray;
    }
    public void setTestArray(int[] testArray) {
        this.testArray = testArray;
    }



    public static void main(String[] args) {
        System.out.println("Hello World!");
        App app = new App();
        int x[] = app.getTestArray();
        System.out.println(x[2]);
    }

}
