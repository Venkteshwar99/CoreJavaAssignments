package Assignment5;

// Generic method to exchange positions of the two different elements in the array.
import java.lang.reflect.Array;
public class Generics3 {

	


		public static void main(String[] args) {
			
			Integer arr[] = {10,20};
			 
			
			System.out.println("Before Exchange : " + arr[0] +" "+arr[1]);
			
			System.out.print("After Exchange : " );
			 
			exchangeArrNum(arr);
			
		}

		public static <E> Void exchangeArrNum(E[] arr ) {
			
			E temp= arr[1];
			arr[1] = arr[0];
			arr[0]= temp;
			System.out.println(arr[0]+ " " + arr[1]);
			return null; 
			
		}
	}