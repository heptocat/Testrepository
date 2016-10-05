public class Biene extends Insekt
{
    public boolean ist_koenigin;
    public boolean im_Bienenkorb;
    
    public Biene(String n, int k, boolean ist_kg)
    {
        super(n, k);
            
        ist_koenigin = ist_kg;
        im_Bienenkorb = true;
        
        OptATK [1] = " sticht mit voller Kraft zu!";
        OptATK [2] = " ruft Schwarm herbei!";
        OptATK [3] = " wirft mit Pollen auf den Angreifer!";
        
        OptDMG [1] = 30;
        OptDMG [2] = 10;
        OptDMG [3] = 25;
        
        System.out.println("Die Biene " + name + " ist geschlüpft!");
    }
    
    public void verteidigen(int z)
    {       
        if(lebendig == true)
        {
            System.out.println("Die Biene " + name + OptATK [z]);
        }     
    }   

    
    public void summen()
    {
        if(lebendig == true)
        {
            System.out.println("Die Biene " + name + " summt.");
        }
    }
    
    public void Zurückfliegen()
    {
        if(lebendig == true)
        {  
            if(im_Bienenkorb == false)
            {
                im_Bienenkorb = true;
                System.out.println("Die Biene " + name + " ist schnell zurück in den Bienenstock geflogen!");
            }
        }
    }

    public void Heilen(int p)
    {
            if(lebendig == true)
            {   
                    if(KP + p*10 <= maxKP)
                    {
                        for(int i = 10; i <= p*10; i = i + 10)
                        {
                            KP = KP + 10;
                        }
                            String h = "" + p*10;
                            System.out.println("Die Biene " + name + " hat " + h + " Lebenspunkte generiert!");
                        }                    
            }
    }
    
}

