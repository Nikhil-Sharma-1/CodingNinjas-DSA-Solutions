public class Polynomial {

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
    int data[] = new int[100];;
    

    
	public void setCoefficient(int degree, int coeff){
		
       
        data[degree] = coeff;
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		
        for(int i = 0; i<data.length; i++) {
            if(data[i] != 0) {
                System.out.print(data[i]+"x"+i+" ");
            }
        }
        
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){

        
        for(int i = 0; i<this.data.length; i++) {
            this.data[i] = this.data[i] + p.data[i];
        }
		return this;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
			
         
         for(int i = 0; i<this.data.length; i++) {
            this.data[i] = this.data[i] - p.data[i];
        }
		return this;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		
        Polynomial k = new Polynomial();
        for(int i = 0; i<this.data.length/2; i++) {
            for(int j = 0; j<p.data.length/2; j++) {
                k.data[i+j] += this.data[i] * p.data[j];
            }
        }
        return k;
	}

}
