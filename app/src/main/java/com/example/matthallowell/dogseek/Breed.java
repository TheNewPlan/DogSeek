package com.example.matthallowell.dogseek;

/**
 * Created by Matt Hallowell on 11/11/2017.
 * This class will be the template that will organize all of the required values for the person searching the application.
 */

/**
 * For sake of simplicity for the time, I am only recognizing breeds accepted by the American Kennel Club
 */
public class Breed {
    //Name of the breed
    String name;
    //The breeds group
    enum Group {Herding, Hound, NonSporting, Sporting, Terrier, Toy, Working }
    Group group;
    //The breeds size
    enum Size {Small, Medium, Large}
    Size size;
    //The breeds coat
    enum Coat {Hairless, Short, Medium, Long}
    Coat coat;
    //The breeds shedding frequency
    enum Shedding {Seasonal, Infrequent}
    Shedding shedding;
    //If the breed is isHypoallergenic or not
    boolean isHypoallergenic;
    //How easy/difficult it will be to train the breed
    enum Trainability {EagerToPlease, RespondsWell, Independent}
    Trainability trainability;
    //How frequent the breed will need to be groomed
    enum Grooming {Daily, Weekly, Occasional}
    Grooming grooming;
    //How frequent the dog may bark, whether they do it when necessary or not
    enum BarkingFrequency {Vocal, WhenNecessary}
    BarkingFrequency barkingFrequency;
    //The energy level of the breed (this is a generalized thought, no two dogs are the same)
    enum Energy {High, Medium, Low}
    Energy energy;
    //The descriptions which will be needed for the list view
    String shortDescription;
    String longDescription;
    public Breed (String name, Group group, Size size, Coat coat, Shedding shedding, boolean isHypoallergenic, Trainability trainability, Grooming grooming, BarkingFrequency barkingFrequency, Energy energy, String shortDescription, String longDescription){
        this.name = name;
        this.group = group;
        this.size = size;
        this.coat = coat;
        this.shedding = shedding;
        this.isHypoallergenic = isHypoallergenic;
        this.trainability = trainability;
        this.grooming = grooming;
        this.barkingFrequency = barkingFrequency;
        this.energy = energy;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public Size getSize() {
        return size;
    }

    public Coat getCoat() {
        return coat;
    }

    public Shedding getShedding() {
        return shedding;
    }

    public boolean getisHypoallergenic() {
        return isHypoallergenic;
    }

    public Trainability getTrainability() {
        return trainability;
    }

    public Grooming getGrooming() {
        return grooming;
    }

    public BarkingFrequency getBarkingFrequency() {
        return barkingFrequency;
    }

    public Energy getEnergy() {
        return energy;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    @Override
    public String toString() {
        return name;
    }
}