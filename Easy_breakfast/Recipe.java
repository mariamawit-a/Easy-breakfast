/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_brekfast;


public class Recipe
{
    private  int Id;
    private  String Title;
    private String Image;
    private  String[] Ingredients;
    private  String Direction;

    public Recipe(int Id,String Title, String Image, String[] Ingredients, String Direction)
    {
        this.Id = Id;
        this.Title = Title;
        this.Image = Image;
        this.Ingredients = Ingredients;
        this.Direction = Direction;
    }
    
    public void setRecipe (Recipe recipe)
    {
        this.Id = recipe.getId();
        this.Title = recipe.getTitle();
        this.Image = recipe.getImage();
        this.Ingredients = recipe.getIngredients();
        this.Direction = recipe.getDirection();
    }

    
    public int getId ()
    {
       return Id; 
    }
    
     public String getTitle ()
    {
       return Title; 
    }
     
    public String getImage ()
    {
       return Image; 
    }
    
    public String[] getIngredients ()
    {
       return Ingredients ; 
    }
    
    public String getDirection()
    {
       return Direction; 
    }
       
}