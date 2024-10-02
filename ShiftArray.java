public class ShiftArray {

    
	public static int[] shiftBy(int[] arr, int shift) {

		System.out.println("Original array: " + java.util.Arrays.toString(arr));
		System.out.println("Shift amount: " + shift);

		
		shift = shift % arr.length;
		System.out.println("Normalized shift amount: " + shift);


		int[] newArray = new int[arr.length];

		for(int i = 0; i < arr.length; i++){
			int index = (i+shift) % arr.length;
			newArray[index] = arr[i];
		}

       
        System.out.println("New array before array before assignment: " + java.util.Arrays.toString(newArray));


		arr = newArray;
		System.out.println("Finished shifting. Original array reference still points to:" + java.util.Arrays.toString(arr));
		return arr;
	}


	public static void main(String[] args) {
		try{
			int[] a = {3, 4, 5, 6};
			int shiftAmount = Integer.valueOf(args[0]);
			if (shiftAmount < 0){
				System.out.println("Sorry, shift about must be positive.");
				return;
			}
			a = shiftBy(a, shiftAmount);
			for(int i : a){
				System.out.print(i + " ");
			}
		}catch(Exception e){
			System.out.println("Please rerun the program with proper command line arguments: " + e.getMessage());
		}
	}

}