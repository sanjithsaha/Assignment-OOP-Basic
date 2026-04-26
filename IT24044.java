class Vehicle {

	 //Two  Private variable
	private String brand;
        private String color;

	// Public constructor
	public Vehicle(String b, String c) {
        brand = b;
        color = c;
      
	}

	// Public method
	public void Start(){
        System.out.println("Vehicle Brand : "+ brand);
        System.out.println("Vehicle Color : "+ color);
        System.out.println("Vehicle is starting.....");
	System.out.println();
    }



}


public class IT24044 {
	//Main Class
   	public static void main(String[] args) {
	//Command Line Input
	
	    for(int i = 0; i < args.length; i++) {
            Vehicle v1 = new Vehicle(args[i], args[++i]);
            v1.Start();
        }
    }
}
