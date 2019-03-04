//Dog.java
//Kate Bagshaw

public class Dog extends Animal{

    private String name;
    private int numLegs;

    Dog(String name, int numLegs){
	this.name = name;
	this.numLegs = numLegs;
    }

    public String getName(){
	return this.name;
    }

    public int getLegs(){
	return this.numLegs;
    }

    public String toString(){
	return this.getName() + ": " + numLegs + " legs";
    }

}
