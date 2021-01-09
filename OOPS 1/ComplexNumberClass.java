public class ComplexNumbers {
	
    private int real;
    private int imaginary;
    
    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public void plus(ComplexNumbers c) {
        this.real = this.real + c.real;
        this.imaginary = this.imaginary + c.imaginary;
    }
    
    public void multiply(ComplexNumbers c) {
        int temp = this.real;
        this.real = (this.real * c.real) - (this.imaginary * c.imaginary);
        this.imaginary = (temp * c.imaginary) + (this.imaginary * c.real);
    }
    
    public void print() {
        System.out.println(real + " + i" + imaginary);
    }
	
}
