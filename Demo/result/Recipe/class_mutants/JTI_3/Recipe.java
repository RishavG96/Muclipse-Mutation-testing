// This is mutant program.
// Author : ysma

public class Recipe
{

    private java.lang.String name;

    private int price;

    private int amtCoffee;

    private int amtMilk;

    private int amtSugar;

    private int amtChocolate;

    public int getAmtChocolate()
    {
        return amtChocolate;
    }

    public void setAmtChocolate( int amtChocolate )
    {
        if (amtChocolate >= 1) {
            this.amtChocolate = amtChocolate;
        } else {
            this.amtChocolate = 0;
        }
    }

    public int getAmtCoffee()
    {
        return amtCoffee;
    }

    public void setAmtCoffee( int amtCoffee )
    {
        if (this.amtCoffee >= 1) {
            this.amtCoffee = amtCoffee;
        } else {
            this.amtCoffee = 0;
        }
    }

    public int getAmtMilk()
    {
        return amtMilk;
    }

    public void setAmtMilk( int amtMilk )
    {
        if (amtMilk >= 1) {
            this.amtMilk = amtMilk;
        } else {
            this.amtMilk = 0;
        }
    }

    public int getAmtSugar()
    {
        return amtSugar;
    }

    public void setAmtSugar( int amtSugar )
    {
        if (amtSugar >= 1) {
            this.amtSugar = amtSugar;
        } else {
            this.amtSugar = 0;
        }
    }

    public java.lang.String getName()
    {
        return name;
    }

    public void setName( java.lang.String name )
    {
        this.name = name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice( int price )
    {
        if (price >= 1) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public boolean equals( Recipe r )
    {
        if (r.getName() == null) {
            return false;
        }
        if (this.name == null) {
            return false;
        }
        if (this.name.equals( r.getName() )) {
            return true;
        }
        return false;
    }

    public java.lang.String toString()
    {
        return name;
    }

}
