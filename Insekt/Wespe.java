public class Wespe extends Insekt
{
    public boolean im_Nest;
    public boolean ist_weiblich;
    
    public Wespe(String n, int k, boolean ist_w)
    {
        super(n, k);
            
        im_Nest = true;
        
        OptATK [1] = " sticht mit ihrem Stachel in den Angreifer!";
        OptATK [2] = " ruft aggressive Nestgenossen herbei!";
        OptATK [3] = " beißt den Gegner mit ihrem Mundwerkzeug!";
        
        OptDMG [1] = 15;
        OptDMG [2] = 20;
        OptDMG [3] = 10;
        
        System.out.println("Die Wespe " + name + " ist geschlüpft!");
    }
    
    public void verteidigen(int z)
    {
        if(lebendig == true)
        {
            if(z == 3 && KP + 10 < maxKP)
            {
                KP = KP + 10;
                System.out.println("Die Wespe " + name + OptATK [3] + " " + name + " hat sich regeneriert!");
            }
            else
            {
                System.out.println("Die Wespe " + name + OptATK [z]);
            }     
        }   
    }
    
    public void summen()
    {
        if(lebendig == true)
        {
            System.out.println("Die Wespe " + name + " sirrt.");
        }
    }
    
    public void Zurückfliegen()
    {
        if(lebendig == true)
        {
            if(im_Nest == false)
            {
                im_Nest = true;
                System.out.println("Die Wespe " + name + " ist zurück in das Wespennest geflogen!");
            }
        }
    }
        
    public void Heilen(int p)
    {
        if(lebendig == true)
        {
           for(int i = 10; i <= p*10; i = i + 10)
           {
               KP = KP + 10;
           }
           String h = "" + p*10;
           System.out.println("Die Wespe " + name + " hat " + h + " Lebenspunkte generiert!");
        }
    }
}