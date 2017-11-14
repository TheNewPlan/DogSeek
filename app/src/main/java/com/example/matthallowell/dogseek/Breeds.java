package com.example.matthallowell.dogseek;

/**
 * Created by Matt Hallowell on 11/11/2017.
 */

public class Breeds {
    /**
     * This array contains all of the purebred breeds identified by the American Kennel Club
     * The information sourced is from the American Kennel Club as well
     * @TODO Complete the remaining ~170 dogs information
     */

    public static final Breed[] BREEDS = {
      new Breed("Affenpinscher", Breed.Group.Toy, Breed.Size.Small, Breed.Coat.Medium, Breed.Shedding.Seasonal, false, Breed.Trainability.EagerToPlease, Breed.Grooming.Weekly, Breed.BarkingFrequency.WhenNecessary, Breed.Energy.Medium, "Loyal, curious, famously funny; fearless out of all proportion to their size.",""),
      new Breed("Afghan Hound", Breed.Group.Hound, Breed.Size.Medium, Breed.Coat.Long, Breed.Shedding.Infrequent, true, Breed.Trainability.Independent, Breed.Grooming.Weekly, Breed.BarkingFrequency.WhenNecessary, Breed.Energy.High,"A breed of charming contradictions: independent and aloof, but sweet and profoundly loyal.",""),
      new Breed("Airedale Terrier", Breed.Group.Terrier, Breed.Size.Medium, Breed.Coat.Medium, Breed.Shedding.Seasonal, false, Breed.Trainability.EagerToPlease, Breed.Grooming.Weekly, Breed.BarkingFrequency.WhenNecessary, Breed.Energy.High, "Clever, confident, proud; friendly but courageous.",""),
      new Breed("Akita", Breed.Group.Working, Breed.Size.Large, Breed.Coat.Medium, Breed.Shedding.Seasonal, false, Breed.Trainability.EagerToPlease, Breed.Grooming.Weekly, Breed.BarkingFrequency.Quiet, Breed.Energy.Medium,"Dignified, courageous, and profoundly loyal.",""),
      new Breed("Alaskan Malamute", Breed.Group.Working, Breed.Size.Large, Breed.Coat.Long, Breed.Shedding.Seasonal, false, Breed.Trainability.Independent, Breed.Grooming.Weekly, Breed.BarkingFrequency.WhenNecessary, Breed.Energy.Medium, "Affectionate, loyal, playful but dignified.",""),
      new Breed("American English Coonhound", Breed.Group.Hound, Breed.Size.Medium, Breed.Coat.Short, Breed.Shedding.Seasonal, false, Breed.Trainability.RespondsWell, Breed.Grooming.Occasional, Breed.BarkingFrequency.Vocal, Breed.Energy.High, "Sweet, Mellow, Sociable",""),
      new Breed("American Eskimo Dog", Breed.Group.NonSporting, Breed.Size.Small, Breed.Coat.Long, Breed.Shedding.Seasonal, false, Breed.Trainability.EagerToPlease, Breed.Grooming.Occasional, Breed.BarkingFrequency.WhenNecessary, Breed.Energy.High, "Playful, perky, very smart; an excellent trick dog.",""),
      new Breed("American Foxhound", Breed.Group.Hound, Breed.Size.Large, Breed.Coat.Short, Breed.Shedding.Seasonal, false, Breed.Trainability.RespondsWell, Breed.Grooming.Occasional, Breed.BarkingFrequency.WhenNecessary, Breed.Energy.High, "Sweet-tempered and easygoing, but also stubborn and independent",""),
      new Breed("American Hairless Terrier", Breed.Group.Terrier, Breed.Size.Medium, Breed.Coat.Short, Breed.Shedding.Infrequent, true, Breed.Trainability.EagerToPlease, Breed.Grooming.Occasional, Breed.BarkingFrequency.WhenNecessary, Breed.Energy.Medium, "Friendly, lovable, inquisitive; fearlessly game for just about anything.","")
    };

    /**
     * String resources for the spinner adapters on the main activity
     */
    public static final String[] GROUPS = {"Herding", "Hound", "NonSporting", "Sporting", "Terrier", "Toy", "Working"};
    public static final String[] SIZES = {"Small","Medium","Large"};
    public static final String[] COATS = {"Hairless","Short","Medium","Long"};
    public static final String[] SHEDDING = {"Seasonal","Infrequent"};
    public static final String[] TRAINABILITY = {"Eager to Please","Responds Well","Independent"};
    public static final String[] GROOMINGFREQUENCIES = {"Daily","Weekly","Occasional"};
    public static final String[] BARKINGFREQUENCIES = {"Quiet","When Necessary","Vocal"};
    public static final String[] ENERGYLEVELS = {"Low","Medium","High"};
}
