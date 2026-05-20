public class DragonRunner
{
    public static void main(String[] args)
    {
        // Create new dragon object and print initial info
        Dragon pete = new Dragon("Pete", 60);
        System.out.println("Name: " + pete.getName());
        System.out.println("Level: " + pete.getLevel());
        System.out.println("Fire breather: " + pete.isFireBreather());
        System.out.println("Defense rating: " + pete.getDefenseRating());

        // Dragon attack without fire (level < 70)
        pete.attack();

        // Gain experience, putting level above 70
        pete.gainExperience(15);
        
        // Dragon attack with fire (level > 70)
        pete.attack();

        // Print final info
        System.out.println("Name: " + pete.getName());
        System.out.println("Level: " + pete.getLevel());
        System.out.println("Fire breather: " + pete.isFireBreather());
        System.out.println("Defense rating: " + pete.getDefenseRating());
    }
}