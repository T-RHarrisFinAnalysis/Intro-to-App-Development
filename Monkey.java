{
// Monkey-specific attributes required by the specification document
private String species;
private String tailLength;
private String height;
private String bodyLength;

/**
 * Default constructor
 * Creates a Monkey object without assigning values initially.
 */
public Monkey() {
}

/**
 * Full constructor
 * Initializes all inherited RescueAnimal attributes and monkey-specific attributes.
 */
public Monkey(String name, String species, String gender, String age,
              String weight, String acquisitionDate, String acquisitionCountry,
              String trainingStatus, boolean reserved, String inServiceCountry,
              String tailLength, String height, String bodyLength) {

    // Set inherited RescueAnimal attributes using setter methods
    setName(name);
    setAnimalType("monkey");
    setGender(gender);
    setAge(age);
    setWeight(weight);
    setAcquisitionDate(acquisitionDate);
    setAcquisitionLocation(acquisitionCountry);
    setTrainingStatus(trainingStatus);
    setReserved(reserved);
    setInServiceCountry(inServiceCountry);

    // Set monkey-specific attributes
    this.species = species;
    this.tailLength = tailLength;
    this.height = height;
    this.bodyLength = bodyLength;
}

// Accessor methods (getters)

public String getSpecies() {
    return species;
}

public String getTailLength() {
    return tailLength;
}

public String getHeight() {
    return height;
}

public String getBodyLength() {
    return bodyLength;
}

// Mutator methods (setters)

public void setSpecies(String species) {
    this.species = species;
}

public void setTailLength(String tailLength) {
    this.tailLength = tailLength;
}

public void setHeight(String height) {
    this.height = height;
}

public void setBodyLength(String bodyLength) {
    this.bodyLength = bodyLength;
}
}
