
public class Ex602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myNums = new int[10];
		
		 // fill array
		for(int  i = 0; i < myNums.length; i++) {
			myNums[i] = i * i;
		}
		
		//print array
		for(int  i = 0; i < myNums.length; i++) {
			System.out.println(i + ": " + myNums[i]);
		}
		
	}

}
