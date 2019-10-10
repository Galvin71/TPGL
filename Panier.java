import java.util.ArrayList;

import java.util.Observable;

public class Panier extends Observable{

    public ArrayList<Orange> liste;
    public int max;

    public Panier(int m)
    {
        this.liste = new ArrayList<Orange>();
        this.max = m;
    }

    public ArrayList<Orange> getListe()
    {
        return liste;
    }

    public int getSize()
    {
        return getListe().size();
    }

    public Orange getOrange(int i)
    {
        return getListe().get(i);
    }

    public double getPrix()
    {
        double p = 0;
        for(int i=0; i<getListe().size(); i++)
        {
            p+=getListe().get(i).getPrix();
        }
        return p;
    }

    public boolean estPlein()
    {
        if(getListe().size()==max)
        {
            return true;
        }
        return false;
    }

    public boolean estVide()
    {
        return getListe().isEmpty();
    }

    public void AjoutOrange(Orange o)
    {
        getListe().add(o);
        setChanged();
        notifyObservers();
    }

    public void retire()
    {
        getListe().remove(getListe().size()-1);
        setChanged();
        notifyObservers();
    }

    public String toString()
    {
        String str="";
        for(int i=0 ; i<getListe().size(); i++ ){
            str+=getListe().get(i);
        }
        return str;
    }
    
    public void Affiche()
    {
		System.out.println(toString());    
    }

    public static void main(String[] args)
    {
        Orange o = new Orange(-3, "France");
        Orange o1 = new Orange(4.5, "Allemagne");
        Orange o2 = new Orange(7, "Danemark");
        Panier p = new Panier(3);
        //System.out.println(p.estVide());
        p.AjoutOrange(o);
        p.AjoutOrange(o1);
        p.AjoutOrange(o2);
        p.Affiche();
        //System.out.println(p.estPlein());
       //System.out.println(p.getPrix());
       // System.out.println(p.toString());
        //System.out.println(p.retire());
    }
}