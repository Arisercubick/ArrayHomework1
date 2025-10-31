import java.util.Random;
import java.util.Scanner;
public class Arrays {
  private static Random rand = new Random();
  public static void main(String[] args) {
    System.out.print("How long should the array be: ");
    int arrLength = reader.nextInt();
    int[] arr = new int[arrLength];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt();
    }
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
