
public class solution {

	public static int sumOfDigits(int input){
		
        if(input/10 == 0) {
            return input;
        }
        
        return input%10 + sumOfDigits(input/10);
        
	}
}
