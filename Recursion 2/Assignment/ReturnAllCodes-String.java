public class solution {

	// Return a string array that contains all possible codes
	public static  String[] getCode(String input){
		
        if(input.length() == 0) {
            String eAns[] = {""};
            return eAns;
        }
        
        String sAns[] = getCode(input.substring(1));
        int an = input.charAt(0)-'0';
        char mapping1 = helper(an);
        for(int i = 0; i<sAns.length; i++) {
            sAns[i] = mapping1 + sAns[i];
        }
        
         String sAns2[] = new String[0];
       
        if(input.length()>=2) {
            
               int ch1 = input.charAt(0)-'0';
               int ch2 = input.charAt(1)-'0';
               int combineInt = (ch1*10)+ch2;
            
             if(combineInt >= 10 && combineInt <= 26) {
                 
                 char mapping2 = helper(combineInt);
                 sAns2 = getCode(input.substring(2));
            
             for(int i = 0; i<sAns2.length; i++) {
                  sAns2[i] = mapping2 + sAns2[i];
         }
             }
        }
        
       String ans[] = new String[sAns.length + sAns2.length];
        int k = 0;
        for(int i = 0; i<sAns.length; i++) {
            ans[k] = sAns[i];
            k++;
        }
        
        for(int i = 0; i<sAns2.length; i++) {
            ans[k] = sAns2[i];
            k++;
        }
		
        return ans;
	}
    
    public static char helper(int a) {
        
        return (char)(a + 'a' - 1);
    }

}
