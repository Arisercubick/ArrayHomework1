import java.util.Random;
import java.util.Scanner;
public class Arrays {
  private static Random rand = new Random();
  private static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("How long should the array be: ");
    int arrLength = reader.nextInt();
    int[] arr = new int[arrLength];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt();
    }

    printArray(arr);

    int[] copy = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      copy[i] = arr[i];
    }

    for (int i = arr.length-1, n = 0; i > 0; i--, n++) {
      arr[n] = copy[i];
    }
    System.out.print("\n");
    printArray(arr);
  }

  public static void printArray(int[] arr) {
    System.out.print("\n");
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        System.out.print("[" + arr[i] + ", ");
      } else if (i == arr.length-1) {
        System.out.print(arr[i] + "]");
      } else {
        System.out.print(arr[i] + ", ");
      }
    }
  }
}
