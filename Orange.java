public class Orange{
    private double prix;
    private String origine;

    public Orange(double p, String o)
    {
        if( p<0 )
            p = -p;
        this.prix = p;
        this.origine = o;
    }

    /**
    @return Prix
    **/
    public double getPrix()
    {
        return prix;
    }

    /**
    @return Origine
    */
    public String getOrigine()
    {
        return origine;
    }

    
    @Override
    public String toString(){
        String str="Prix : "+prix+"\n origine : "+origine+" \n";
        return str;
        
    }
}

  
  /*  public void testPrixPositif()
    {
        System.out.println("Test de la méthode GetPrix() avec prix positif");
        Orange o = new Orange(3,"Danemark");
        double t1 = 3; // Prix du test
        double p1 = o.getPrix(); // Prix de l'orange o
        AssertEquals(t1,p1,0,0);
    }

    
    public void testPrixNegatif()
    {
        System.out.println("Test de la méthode GetPrix() avec prix négatif");
        Orange o = new Orange(-3,"Danemark");
        double t1 = 3; // Prix du test
        double p1 = o.getPrix(); // Prix de l'orange o
        AssertEquals(t1,p1,0,0);
    }

    
    public void testOrigine()
    {
        System.out.println("Test de la méthode getOrigine()");
        Orange o = new Orange(3,"France");
        String t1 = "France"; // Origine du test
        String o1 = o.getOrigine(); // Origne de l'orange o
        AssertEquals(t1, o1);
    }

    
    public void testToString()
    {
        System.out.println("Test de la méthode ToString");
        Orange o = new Orange(3,"France");
        String t1 ="Prix : 3\nOrigine : France";
        String o1 = o.ToString();
        AssertEquals(t1,o1);
    }*/
    