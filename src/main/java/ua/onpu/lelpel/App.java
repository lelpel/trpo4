package ua.onpu.lelpel;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[][] mtx = {{1, 4, 6, 0}, {10, 6, 1, 1}, {7, 3, 4, 0}, {5, 6, 7, 8}, {3, 4, 8, 5}};
        Task task = new Task();
        System.out.println("Source matrix:");
        task.printMatrix(mtx);
//        System.out.println("Sorted and swapped matrix:");
//        task.printMatrix(task.sortAndSwap(mtx));
        System.out.println("Sorted only:");
        task.printMatrix(task.sort(mtx));
//        System.out.println("Swapped only:");
//        task.printMatrix(task.swap(mtx));
    }
}
