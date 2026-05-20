// Import your code from the Dragon Class: Accessor and Mutator exercise

public class Dragon 
{
    // Instance variables
    private String Name;
    private int Level;
    private boolean canBreatheFire;
    private int DefenseRating;
    
    // Constructor
    public Dragon (String Name, int Level)
    {
        this.Name = Name;
         this.Level= Level;
        if (Level >= 70)
    {
        canBreatheFire = true;
    }
        else
        {
        canBreatheFire = false;
        }

    
    }
    
    // Accessor methods
    public String getName()
    {
        return Name;
    }
    public int getLevel()
    {
        return Level;
    }
    public void setName (String newName)
    {
        Name = newName;
    }
    public boolean isFireBreather()
    {
        return canBreatheFire;
    }
    public void setLevel()
    {
        Level = Level;
        if (Level < 70)
        {
        canBreatheFire = false; 
        }
        else 
        {
        canBreatheFire = true;
        }
    }
      public void attack();
     {
      
     int count = 0;
    System.out.println("ATTACK");
        if (canBreatheFire)
            {
                for (int i; i<=this.Level;i++)
                {
                    System.out.println (">");
                    
                    if (i%10==0)
               {
                   System.out.println();
               }
               if (level% 10!=0)
               System.out.println();
                
        }
        public double getDefenseRating();
        { 
            double rating = this.Level*3;
            if (canBreatheFire){
           rating += 30;
        }
           return rating;
           
        }
      public void gainExperience (int levelGained)
      this.Level += LevelsGained;
      
      if (this.Level >= 70){
      this.canBreatheFire = true;
            }
            System.out.print("gained + levelGained);

    // Mutator methods
    

    // String representation of the objectn   ej,5
    public String toString()
    {
        return "Dragon " + Name + " is at level " + Level;
    }
}