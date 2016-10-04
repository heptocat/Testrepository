public abstract class Insekt
{
    protected String name;
    protected String [] OptATK;
    protected int [] OptDMG;
    protected int KP;
    protected int maxKP;
    protected boolean lebendig;
    
    public Insekt(String name, int KP)
    {
        this.name = name;
        this.KP = KP;
        this.maxKP = KP;
        lebendig = true;
        OptATK = new String [4];
        OptDMG = new int [4];
        OptDMG [0] = 0;
        OptATK [0] = " hat verfehlt!";
    }
    
    public void krabbeln()
    {
        System.out.println(name + " krabbelt.");
    }
    
    public abstract void verteidigen(int z);
    
    public void Tod()
    {
        if(KP <= 0)
        {
           lebendig = false;
           KP = 0;
                
           System.out.println(name + " ist gestorben!");
        }
    }
    
    public void Wiederbeleben()
    {
        if(lebendig == false)
        {
            lebendig = true;
            KP = maxKP;
            
            System.out.println(name + " wurde wiederbelebt!");
        }
        else
        {
            KP = maxKP;
            System.out.println(name + " hat sich vollständig erholt!");
        }
    }
                
        public void Schaden(int d)
    {

            KP = KP - d;

            String da = "" + d;
            
            System.out.println(name + " hat " + da + " Schaden kassiert!");
            
            if(KP <= 10 && KP > 0)
            {
                System.out.println(name + " steht kurz vor der Ohnmacht!");
            }
            
            Tod();
    }
}