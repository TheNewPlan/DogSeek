package com.example.matthallowell.dogseek;

/**
 * Created by Matt Hallowell on 11/11/2017.
 * This class will be the template that will organize all of the required values for the person searching the application.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * For sake of simplicity for the time, I am only recognizing breeds accepted by the American Kennel Club
 */
public class Breed implements Serializable{
    //Name of the breed
    String name;

    //The breeds group
    enum Group {Any, Herding, Hound, NonSporting, Sporting, Terrier, Toy, Working }
    static ArrayList<Group> groupList = new ArrayList<>(Arrays.asList(Group.values()));
    Group group;
    //The breeds size
    enum Size {Any, Small, Medium, Large}
    static ArrayList<Size> sizeList = new ArrayList<>(Arrays.asList(Size.values()));
    Size size;
    //The breeds coat
    enum Coat {Any, Hairless, Short, Medium, Long}
    static ArrayList<Coat> coatList = new ArrayList<>(Arrays.asList(Coat.values()));
    Coat coat;
    //The breeds shedding frequency
    enum Shedding {Any, Seasonal, Infrequent}
    static ArrayList<Shedding> sheddingList = new ArrayList<>(Arrays.asList(Shedding.values()));
    Shedding shedding;
    //If the breed is Hypoallergenic or not
    enum Hypoallergenic {Any, True, False}
    static ArrayList<Hypoallergenic> hypoallergenicList = new ArrayList<>(Arrays.asList(Hypoallergenic.values()));
    Hypoallergenic hypoallergenic;
    //How easy/difficult it will be to train the breed
    enum Trainability {Any, EagerToPlease, RespondsWell, Independent}
    static ArrayList<Trainability> trainabilityList = new ArrayList<>(Arrays.asList(Trainability.values()));
    Trainability trainability;
    //How frequent the breed will need to be groomed
    enum Grooming {Any, Daily, Weekly, Occasional}
    static ArrayList<Grooming> groomingList = new ArrayList<>(Arrays.asList(Grooming.values()));
    Grooming grooming;
    //How frequent the dog may bark, whether they do it when necessary or not
    enum BarkingFrequency {Any, Quiet, Vocal, WhenNecessary}
    static ArrayList<BarkingFrequency> barkingList = new ArrayList<>(Arrays.asList(BarkingFrequency.values()));
    BarkingFrequency barkingFrequency;
    //The energy level of the breed (this is a generalized thought, no two dogs are the same)
    enum Energy {Any, High, Medium, Low}
    static ArrayList<Energy> energyList = new ArrayList<>(Arrays.asList(Energy.values()));
    Energy energy;
    //The descriptions which will be needed for the list view
    String shortDescription;
    String uri;
    public Breed (String name, Group group, Size size, Coat coat, Shedding shedding, Hypoallergenic hypoallergenic, Trainability trainability, Grooming grooming, BarkingFrequency barkingFrequency, Energy energy, String shortDescription, String uri){
        this.name = name;
        this.group = group;
        this.size = size;
        this.coat = coat;
        this.shedding = shedding;
        this.hypoallergenic = hypoallergenic;
        this.trainability = trainability;
        this.grooming = grooming;
        this.barkingFrequency = barkingFrequency;
        this.energy = energy;
        this.shortDescription = shortDescription;
        this.uri = uri;
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

    public Hypoallergenic getisHypoallergenic() {
        return hypoallergenic;
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

    public String getUri() {
        return uri;
    }

    @Override
    public String toString() {
        return name;
    }

    public static int getIconResource(Group group){
        switch (group){
            case Sporting: return R.drawable.sporting;
            case Hound: return R.drawable.hound;
            case Working: return R.drawable.working;
            case Terrier: return R.drawable.terrier;
            case Toy: return R.drawable.toy;
            case NonSporting: return R.drawable.nonsporting;
            case Herding: return R.drawable.herding;
        }
        return -1;
    }
}