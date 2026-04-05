// Dog.java
// This class represents a Dog in the Pet BAG system.
// It includes attributes for the dog's boarding space number, weight, and grooming status.
// The class provides a constructor to initialize these attributes,
// as well as getter and setter methods to access and modify them.

public class Dog {
    // Boarding space number assigned to the dog
    private int dogSpaceNumber;

// Weight of the dog in pounds  
private double dogWeight;

// Whether grooming service is requested (true/false)  
private boolean grooming;

/**  
 * Constructor for the Dog class.  
 * Initializes all attributes when a new Dog object is created.  
 * @param spaceNumber The boarding space number for the dog  
 * @param weight The weight of the dog  
 * @param groom Whether grooming service is requested  
 */  
public Dog(int spaceNumber, double weight, boolean groom) {  
    dogSpaceNumber = spaceNumber;  
    dogWeight = weight;  
    grooming = groom;  
}

/**  
 * Gets the boarding space number of the dog.  
 * @return The dog?s boarding space number  
 */  
public int getDogSpaceNumber() {  
    return dogSpaceNumber;  
}

/**  
 * Sets the boarding space number of the dog.  
 * @param spaceNumber The new boarding space number to assign  
 */  
public void setDogSpaceNumber(int spaceNumber) {  
    dogSpaceNumber = spaceNumber;  
}

/**  
 * Gets the weight of the dog.  
 * @return The dog?s weight in pounds  
 */  
public double getDogWeight() {  
    return dogWeight;  
}

/**  
 * Sets the weight of the dog.  
 * @param weight The new weight of the dog  
 */  
public void setDogWeight(double weight) {  
    dogWeight = weight;  
}

/**  
 * Gets the grooming status of the dog.  
 * @return True if grooming is requested; false otherwise  
 */  
public boolean getGrooming() {  
    return grooming;  
}

/**  
 * Sets the grooming status of the dog.  
 * @param groom True if grooming is requested; false otherwise  
 */  
public void setGrooming(boolean groom) {  
    grooming = groom;  
}  

}