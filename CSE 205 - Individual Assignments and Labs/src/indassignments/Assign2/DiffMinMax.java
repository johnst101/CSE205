package indassignments.Assign2;
public class DiffMinMax {
   public static void main(String[] agrs) {
      // you may write code in this main method to test your required method
	  System.out.println(DifferenceMinMax(50, 10, 20));
   }
   
   // define your required method here below
   public static int DifferenceMinMax(int num1, int num2, int num3) {
      int[] arr = {num1, num2, num3};
      int max = num1;
      int min = num1;
      
      for (int value : arr) {
         if (value > max) {
            max = value;
         }
         
         if (value < min) {
            min = value;
         }
      }
      
      return max - min;
   }
}