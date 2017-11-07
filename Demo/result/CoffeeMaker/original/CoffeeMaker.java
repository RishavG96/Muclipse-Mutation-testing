// This is mutant program.
// Author : ysma

public class CoffeeMaker
{

    private final Recipe[] recipeArray;

    private final int NUM_RECIPES = 4;

    private final boolean[] recipeFull;

    private final Inventory inventory;

    public CoffeeMaker()
    {
        recipeArray = new Recipe[NUM_RECIPES];
        recipeFull = new boolean[NUM_RECIPES];
        for (int i = 0; i < NUM_RECIPES; i++) {
            recipeArray[i] = new Recipe();
            recipeFull[i] = false;
        }
        inventory = new Inventory();
    }

    public boolean addRecipe( Recipe r )
    {
        boolean canAddRecipe = true;
        canAddRecipe = !checkList( r );
        if (canAddRecipe) {
            int emptySpot = -1;
            for (int i = 0; i < NUM_RECIPES; i++) {
                if (!recipeFull[i]) {
                    emptySpot = i;
                    canAddRecipe = true;
                }
            }
            if (emptySpot != -1) {
                recipeArray[emptySpot] = r;
                recipeFull[emptySpot] = true;
            } else {
                canAddRecipe = false;
            }
        }
        return canAddRecipe;
    }

    private boolean checkList( Recipe r )
    {
        boolean isInList = false;
        for (int i = 0; i < NUM_RECIPES; i++) {
            if (r.equals( recipeArray[i] )) {
                isInList = true;
            }
        }
        return isInList;
    }

    public boolean deleteRecipe( Recipe r )
    {
        boolean canDeleteRecipe = false;
        if (r != null) {
            for (int i = 0; i < NUM_RECIPES; i++) {
                if (r.equals( recipeArray[i] )) {
                    recipeArray[i] = null;
                    canDeleteRecipe = true;
                }
            }
        }
        return canDeleteRecipe;
    }

    public boolean editRecipe( Recipe oldRecipe, Recipe newRecipe )
    {
        boolean canEditRecipe = false;
        for (int i = 0; i < NUM_RECIPES; i++) {
            if (recipeArray[i].getName() != null) {
                if (newRecipe.equals( recipeArray[i] )) {
                    recipeArray[i] = new Recipe();
                    if (addRecipe( newRecipe )) {
                        canEditRecipe = true;
                    } else {
                        canEditRecipe = false;
                    }
                }
            }
        }
        return canEditRecipe;
    }

    public boolean addInventory( int amtCoffee, int amtMilk, int amtSugar, int amtChocolate )
    {
        boolean canAddInventory = true;
        if (amtCoffee < 0 || amtMilk < 0 || amtSugar < 0 || amtChocolate < 0) {
            canAddInventory = false;
        } else {
            inventory.setCoffee( inventory.getCoffee() + amtCoffee );
            inventory.setMilk( inventory.getMilk() + amtMilk );
            inventory.setSugar( inventory.getSugar() + amtSugar );
            inventory.setChocolate( inventory.getChocolate() + amtChocolate );
        }
        return canAddInventory;
    }

    public Inventory checkInventory()
    {
        return inventory;
    }

    public int makeCoffee( Recipe r, int amtPaid )
    {
        boolean canMakeCoffee = true;
        if (amtPaid < r.getPrice()) {
            canMakeCoffee = false;
        }
        if (!inventory.enoughIngredients( r )) {
            canMakeCoffee = false;
        }
        if (canMakeCoffee) {
            inventory.setCoffee( inventory.getCoffee() - r.getAmtCoffee() );
            inventory.setMilk( inventory.getMilk() - r.getAmtMilk() );
            inventory.setSugar( inventory.getSugar() - r.getAmtSugar() );
            inventory.setChocolate( inventory.getChocolate() - r.getAmtChocolate() );
            return amtPaid - r.getPrice();
        } else {
            return amtPaid;
        }
    }

    public Recipe[] getRecipes()
    {
        return recipeArray;
    }

    public Recipe getRecipeForName( java.lang.String name )
    {
        Recipe r = new Recipe();
        for (int i = 0; i < NUM_RECIPES; i++) {
            if (recipeArray[i].getName() != null) {
                if (recipeArray[i].getName().equals( name )) {
                    r = recipeArray[i];
                }
            }
        }
        return r;
    }

}
