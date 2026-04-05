/

Pet.java
Represents a pet in the Pet BAG boarding and grooming system.
This class models the shared attributes for all pets and supports future extension

to specific pet types like Dog and Cat.
*/
public class Pet {
 // Type of pet (e.g., "dog" or "cat")
 private String petType;
 // Name of the pet
 private String petName;
 // Age of the pet (in years)
 private int petAge;
 // Number of available dog spaces at the facility
 private int dogSpaces;
 // Number of available cat spaces at the facility
 private int catSpaces;
 // Number of days the pet will stay
 private int daysStay;
 // Total amount due for the pet's stay and any services
 private double amountDue;

 /

Constructor initializes all attributes of the pet.
@param petType   Type of the pet ("dog" or "cat")
@param petName   Name of the pet
@param petAge    Age of the pet
@param dogSpaces Number of available dog spaces
@param catSpaces Number of available cat spaces
@param daysStay  Number of days for the pet's stay

@param amountDue Total amount due for services
*/
public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue) {
 this.petType = petType;
 this.petName = petName;
 this.petAge = petAge;
 this.dogSpaces = dogSpaces;
 this.catSpaces = catSpaces;
 this.daysStay = daysStay;
 this.amountDue = amountDue;
}

// Getter and setter for petType
public String getPetType() {
 return petType;
}
public void setPetType(String petType) {
 this.petType = petType;
}

// Getter and setter for petName
public String getPetName() {
 return petName;
}
public void setPetName(String petName) {
 this.petName = petName;
}

// Getter and setter for petAge
public int getPetAge() {
 return petAge;
}
public void setPetAge(int petAge) {
 this.petAge = petAge;
}

// Getter and setter for dogSpaces
public int getDogSpaces() {
 return dogSpaces;
}
public void setDogSpaces(int dogSpaces) {
 this.dogSpaces = dogSpaces;
}

// Getter and setter for catSpaces
public int getCatSpaces() {
 return catSpaces;
}
public void setCatSpaces(int catSpaces) {
 this.catSpaces = catSpaces;
}

// Getter and setter for daysStay
public int getDaysStay() {
 return daysStay;
}
public void setDaysStay(int daysStay) {
 this.daysStay = daysStay;
}

// Getter and setter for amountDue
public double getAmountDue() {
 return amountDue;
}
public void setAmountDue(double amountDue) {
 this.amountDue = amountDue;
}
}