import java.util.Scanner;
import java.util.Random;
public class AddSort {
  private static Scanner reader = new Scanner(System.in);
  private static Random rand = new Random();
  public static void main(String[] args) {
    inputUser();
  }
  public static void inputUser() {
    System.out.print("How big is the array: ");
    int input = (int) reader.nextDouble();
    System.out.print("\nMinimum number:");
    int min = -((int) reader.nextDouble());
    System.out.print("\nMaximum number:");
    int max = (int) reader.nextDouble();
    int[] arr = fillArr(max, min, input);
    printArr(arr);
    arr = sortArr(arr);
    printArr(arr);
  }

  public static int[] fillArr(int max, int min, int count) {
    int[] arr = new int[count];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(max+1+min)-min;
    }
    return arr;
  }

  public static int[] sortArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int n = i; i < arr.length-i; n++) {
        if (arr[n] > arr[i]) {
          int cop = arr[i];
          arr[i] = arr[n];
          arr[n] = cop;
        }
    }
    return arr;
  }

  public static void printArr(int[] arr) {
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
