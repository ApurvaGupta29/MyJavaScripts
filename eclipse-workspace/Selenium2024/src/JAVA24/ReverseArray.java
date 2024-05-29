package JAVA24;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Example array
		        int[] array = {1, 2, 3, 4, 5};

		        // Print the original array
		        System.out.println("Original array:");
		        for (int i : array) {
		            System.out.print(i + " ");
		        }
		        System.out.println();

		        // Reverse the array
		        reverseArray(array);

		        // Print the reversed array
		        System.out.println("Reversed array:");
		        for (int i : array) {
		            System.out.print(i + " ");
		        }
		    }

		    // Method to reverse the array
		    public static void reverseArray(int[] array) {
		        int left = 0;
		        int right = array.length - 1;

		        while (left < right) {
		            // Swap the elements at left and right indices
		            int temp = array[left];
		            array[left] = array[right];
		            array[right] = temp;

		            // Move towards the middle
		            left++;
		            right--;
		        }
		    }
		

	}

