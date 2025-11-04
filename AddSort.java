import java.util.Scanner;
import java.util.Random;
public class AddSort {
  private static Scanner reader = new Scanner(System.in);
  private static Random rand = new Random();
  public static void main(String[] args) {
    System.out.print("How big is the array: ");
    int input = (int) reader.nextDouble();
    int[] arr = new int[input];

    System.out.print("\nMinimum number:");
    int min = -((int) reader.nextDouble());
    System.out.print("\nMaximum number:");
    int max = (int) reader.nextDouble();
    
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(max+1-min)-min;
    }
    System.out.print("\nYour Array:\n");
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        System.out.print("[ " + arr[i] + ", ");
      } else if (i == arr.length - 1) {
        System.out.print(arr[i] + "]");
      } else {
        System.out.print(arr[i] + ", ");
      }
    }
  }
}
