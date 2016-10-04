import java.util.Random; import java.awt.*;

public class KampfSTRG
{
    Biene Opo1;
    Wespe Opo2;
    Random ZFA;
    
    public KampfSTRG(String nOP1, int kOP1, boolean kgOP1, String nOP2, int kOP2, boolean wOP2)
    {
        Opo1 = new Biene(nOP1, kOP1, kgOP1);
        Opo2 = new Wespe(nOP2, kOP2, wOP2);
        ZFA = new Random();
    }
    
    public void StandBy(int i)
    {
            try
            { Thread.sleep(i);}
            catch
            (InterruptedException e)
            {return;}
    }
    
    public void Reset()
    {
        Opo1.Wiederbeleben();
        Opo2.Wiederbeleben();
    }
    
    public void Simulationskampf()
    {
            System.out.println("Der Kampf zwischen " + Opo1.name + " und " + Opo2.name + " beginnt!");
        
            while(Opo1.lebendig == true && Opo2.lebendig == true)
            {
                int d = ZFA.nextInt(4);
                    if(Opo1.KP > 15)
                    {
                        Opo1.verteidigen(d);
                        Opo2.Schaden(Opo1.OptDMG [d]);
                    }
                    else
                    {
                        Opo1.Heilen(1);
                    }
            
                    StandBy(2500);
            
                    int z = ZFA.nextInt(4);
                    if(Opo2.KP > 15)
                    {
                        Opo2.verteidigen(z);
                        Opo1.Schaden(Opo2.OptDMG [z]);
                    }
                    else
                    {
                        Opo2.Heilen(1);
                    }
            
                    StandBy(2500);
                }              
                
                StandBy(2500);
                
            if(Opo1.lebendig == true)
            {
                System.out.println(Opo1.name + " hat gesiegt!");
            }
            else
            {
                System.out.println(Opo2.name + " hat gesiegt!");
            }
                
    }
}