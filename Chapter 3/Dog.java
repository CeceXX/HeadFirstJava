class Dog {
	String name;
	public static void main(String[] args) {
		// make a Dog object and access it
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		// now make a dog array
		Dog[] myDogs = new Dog[3];
		
		// and put some dogs in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		// now access the Dogs using the array references
	}
}