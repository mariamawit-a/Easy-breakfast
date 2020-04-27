/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_brekfast;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kalua
 */
public class RecipeBook {
 
private Recipes recipes;

    public RecipeBook()
    {
        this.recipes = new Recipes(new Recipe[]{recipe1, recipe2, recipe3, recipe4, recipe5, recipe6, recipe7, recipe8, recipe9, recipe10, recipe11, recipe12, recipe13, recipe14, recipe15, recipe16,
                                                recipe17, recipe18, recipe19, recipe20, recipe21, recipe22, recipe23, recipe24, recipe25, recipe26, recipe27, recipe28, recipe29, recipe30});
    }
    
     public RecipeBook(RecipeBook other)
     {
         this.recipes = other.recipes;
     }        
    
    public Recipes getRecipeBook()
    {
        return recipes;
    }  
    
    public void setRecipeBook(RecipeBook recipeBook)
    {
        this.recipes = recipeBook.getRecipeBook();
    }  
    
    
    
    Recipe recipe1 = new Recipe(0, "Amazing Muffin Cups", "img/Amazing muffin cups.jpg",
                                new String[]{"Shredded 4-cheese Mexican blend cheese", "Chopped red bell pepper", "Chopped fresh chives", "Green onion", 
                                "Johnsonville® Original breakfast sausage", "Frozen country style shredded hash brown potatoes", "Butter", "Salt", "Pepper", "Egg(s)"},
                                        "Shredded 4-cheese Mexican blend cheese - 2 cups\nChopped red bell pepper - 1/4 cup\nchopped fresh chives\ngreen onion\n"
                                        + "Johnsonville® Original breakfast sausage - 12 links\nFrozen country style shredded hash brown potatoes - 3 cups\n"
                                        + "Butter - 3 tablespoons\nSalt - 1/8 teaspoon\nPepper - 1/8 teaspoon\nEggs - 6\n\n1. Prepare sausage according to "
                                        + "package directions. cool slightly and cut into 1/2-inch pieces; set aside.\n2. In a bowl, combine hash browns, butter, "
                                        + "salt and pepper; divide evenly into 12 greased muffin cups. Press mixture onto sides and bottom of muffin cups.\n3. "
                                        + "Bake at 400 degrees F for 12 minutes or until lightly browned. Remove from oven; divide sausage pieces into muffin cups.\n4. "
                                        + "In a bowl, combine eggs, cheese and bell pepper. Spoon mixture evenly into muffin cups. Sprinkle with chives or onion. Return "
                                        + "to oven, bake 13-15 minutes or until set. Serve.\n\n"
    );
    
    Recipe recipe2 = new Recipe(1, "Authentic Mexican Tacos", "img/Authentic Mexican Breakfast Tacos.jpg",
                                new String[]{"Chorizo sausage", "Corn tortillas", "Egg", "Milk", "Pepper", "Salt", "Monterey Jack cheese", "Hot pepper sauce", "Salsa"},
                                        "Chorizo sausage - 6 ounces\nCorn tortillas - 8 (6 inch)\nEgg(s) - 6\nMilk - 1/4 cup\nPepper - 1/2 teaspoon\nSalt - 1/2 "
                                        + "teaspoon\nMonterey Jack cheese - 1 cup shredded\nHot pepper sauce - 1 dash (e.g. Tabasco(TM)), or to taste\nSalsa - 1/2 "
                                        + "cup\n\n1. Crumble the sausage into a skillet over medium-high heat. Cook and stir until evenly brown. Set aside.\n2. "
                                        + "Heat one skillet over medium heat, and heat another skillet over high heat. The skillet over high heat is for warming "
                                        + "tortillas. In a medium bowl, whisk together the eggs, milk, salt and pepper. Spray the medium heat skillet with some "
                                        + "cooking spray, and pour in the eggs. Cook and stir until almost firm. Add the sausage, and continue cooking and stirring "
                                        + "until firm.\n3. Meanwhile, warm tortillas for about 45 seconds per side in the other skillet, so they are hot and crispy "
                                        + "on the edges, but still pliable.\n4. Sprinkle a little shredded cheese onto each tortilla while it is still hot. "
                                        + "Top with some of the scrambled egg and sausage, then add hot pepper sauce and salsa to your liking.\n\n"
    );
    
    Recipe recipe3 = new Recipe(2, "Autumn Muffins","img/Autumn Muffins.jpg", 
                                new String[]{"Brown sugar", "White sugar", "All-purpose flour", "Baking soda", "Baking powder", "Salt", "Ground cinnamon", "Ground nutmeg", 
                                "Ground ginger","Butter", "Egg","Milk","Cranberries", "Apple", "Dried figs", "Toasted hazelnuts"},
                                         "Brown sugar - 3/4 cup\nWhite sugar - 3/4 cup\nAll-purpose flour - 3 cups\nBaking soda - 1/2 teaspoon\nBaking powder - 1 tablespoon\nSalt - 1/2 "
                                        + "teaspoon\nGround cinnamon - 2 teaspoons\nGround nutmeg - 1/2 teaspoon\nGround ginger - 1 teaspoon\nButter - 1 cup, melted\nEgg(s) - 2, "
                                        + "beaten\nMilk - 1 1/4 cups\nCranberries - chopped, 1 cup\nApple(s) - 1 cup, chopped, peeled\nDried figs - 1/2 cup, chopped\nToasted hazelnuts "
                                        + "- 3/4 cup chopped\n\n1. Preheat oven to 375 degrees F (190 degrees C). Grease muffin pans or line with paper muffin liners.\n2. In a large bowl, "
                                        + "stir together the brown sugar, white sugar, flour, baking powder, baking soda, salt, cinnamon, nutmeg and ginger. Make a well in the center, and "
                                        + "add the melted butter, milk and eggs, mix until smooth. Stir in the cranberries, apple, figs, and hazelnuts. Spoon the batter into the prepared muffin pans."
                                        + " Cups should be at least 3/4 full.\n3. Bake for 15 to 20 minutes in the preheated oven or until a toothpick inserted into a muffin comes out clean.\n\n"
    );

    Recipe recipe4 = new Recipe(3, "Baked Brunch Omelet","img/Baked Brunch Omelet.jpg",
                                new String[]{"White bread", "Cheddar cheese", "Cooked ham", "Egg", "Milk", "Salt", "Hot pepper sauce", "Green onions"},
                                        "White bread - 1/2 (1 pound) loaf, cut into cubes\nCheddar cheese - 1 1/2 pounds, shredded\nCooked ham - 1 cup cubed\nEgg(s) - 8\nMilk - 2 cups\nSalt - 1 pinch\n"
                                        + "Hot pepper sauce - 1 dash, or to taste\nGreen onions - 1/4 cup, chopped\n\n1. Preheat oven to 350 degrees F (175 degrees C). Lightly grease a 9x13 inch baking pan.\n2. "
                                        + "Place half of the bread cubes on bottom of baking pan. Sprinkle with half of the ham and then half of the cheese; repeat.\n3. In a large bowl, beat together eggs, "
                                        + "milk, salt, hot sauce and green onions. Pour egg mixture into pan.\n4. Place pan on top of a baking sheet with a rim and place in oven. Pour water into baking sheet "
                                        + "and bake for 60 minutes, or until eggs have set.\n\n"
            
    );
    
    Recipe recipe5 = new Recipe(4, "Breakfast Pies", "img/Breakfast Pies.jpg",
                                new String[]{"Sausage", "Onion", "Bell pepper","Biscuit dough","Egg", "Milk", "Colby-Monterey Jack cheese"},
                                        "Breakfast sausage - 3/4 pound\nOnion - 1/8 cup minced\nBell pepper - 1/8 cup minced green\nBiscuit dough - 1 (12 ounce) can refrigerated\nEgg(s) - 3, beaten\nMilk - 3 tablespoons"
                                       + "\nColby-Monterey Jack cheese - 1/2 cup shredded\n\n1. Preheat oven to 400 degrees F (200 degrees C).\n2. In a large, deep skillet over medium-high heat, combine sausage, "
                                       + "onion and green pepper. Cook until sausage is evenly brown. Drain, crumble, and set aside.\n3. Separate the dough into 10 individual biscuits. Flatten each biscuit out, "
                                       + "then line the bottom and sides of 10 muffin cups. Evenly distribute sausage mixture between the cups. Mix together the eggs and milk, and divide between the cups. "
                                       + "Sprinkle tops with shredded cheese.\n4. Bake in preheated oven for 18 to 20 minutes, or until filling is set.\n\n"
    );
    
    Recipe recipe6 = new Recipe(5, "Breakfast Pizza", "img/Breakfast Pizza.jpg",
                                new String[]{"Sausage", "Crescent rolls", "Hash brown potatoes", "Cheddar cheese", "Egg", "Milk", "Salt", "Ground black pepper","Parmesan cheese"},
                                    "Breakfast sausage - 1 pound ground \nCrescent rolls - 1 (8 ounce) package refrigerated \nHash brown potatoes -1 cup frozen, thawed\nCheddar cheese - 1 cup shredded \nEgg(s) - 5 \nMilk - 1/4 cup"
                                    + " \nSalt - 1/2 teaspoon \nGround black pepper - 1/8 teaspoon \nParmesan cheese - 1/4 cup grated \n\n1. Place sausage in a large, deep skillet. Cook over medium high heat until evenly brown."
                                    + " Drain, crumble and set aside. Preheat oven to 375 degrees F (190 degrees C).\n2. Brown sausage and drain. Separate crescent roll dough into 8 triangles. Place in an ungreased 12 inch pizza "
                                    + "pan with points toward the center. Press together to form a crust. Bottom of crust should be sealed and outside edge should be slightly raised. Spoon sausage over crust. Sprinkle "
                                    + "with hash browns and top with cheddar cheese.\n3. Beat together eggs, milk, salt and pepper; pour over crust. Sprinkle with parmesan cheese.\n4. Bake in preheated oven until eggs are set, "
                                    + "about 25 to 30 minutes.\n\n"
    );
    
    Recipe recipe7 = new Recipe(6, "Carne Asada Breakfast Burrito", "img/Carne Asada Breakfast Burrito.jpg",
                                new String[]{"Beef skirt steak", "Carne asada seasoning", "Garlic powder", "Vegetable oil", "Sweet onion", "Red bell pepper", "Jalapeno pepper", "Diced Tomatoes","Potatoes","Butter","Egg",
                                "Mexican cheese blend","Flour tortillas","Salt","Pepper"},
                                     "Beef skirt steak - 2 pounds, cut into thin strips\nCarne asada seasoning - 2 tablespoons\nGarlic powder - 1 tablespoon\nVegetable oil - 1 tablespoon\nSweet onion 1/2, diced\nRed bell pepper - 1,"
                                    + " seeded and chopped\nJalapeno pepper(s) - 1, seeded and diced\nHunt's(R) Diced Tomatoes - 1 (14.5 ounce) can, drained\nPotatoes - 2 cups frozen diced\nButter - 3 tablespoons, divided\n"
                                    + "Egg(s) - 6, whisked\nMexican cheese blend - 2 cups shredded\nFlour tortillas (12 inch) - 4\nSalt - to taste\nPepper - to taste\n\n1. Place beef slices in a mixing bowl. Sprinkle with "
                                    + "asada seasoning and garlic powder; toss in bowl to evenly coat. Let marinade 5 minutes.\n2. Heat oil in a large, deep skillet over medium-high heat. Place beef strips in skillet and "
                                    + "cook and stir until browned. Stir in bell pepper, onions, and jalapeno pepper. Add tomatoes and potatoes. Cook mixture until potatoes are tender, 5 to 8 minutes. Season with salt and"
                                    + " pepper. Transfer mixture to a bowl.\n3. Melt 1 tablespoon butter in the same skillet. Add the eggs, stirring occasionally, until eggs are scrambled and set. Transfer the beef mixture"
                                    + " back to skillet. Cook and stir until warmed through, about 2 minutes. Melt the remaining 2 tablespoons butter in a small dish in microwave.\n4. Divide shredded cheese among tortillas;"
                                    + " divide beef and veggie mixture and place on the cheese. Fold in sides of tortilla and roll up. Brush with melted butter and place folded side down in pan to brown; flip and brown on "
                                    + "top side. Burrito should be warmed though.\n\n"
    );
    
    Recipe recipe8 = new Recipe(7, "Chicken Frittata", "img/Chicken Frittata.jpg",
                                new String[]{"Potatoes", "Butter", "Garlic", "Onion", "Self-rising flour", "Milk", "Egg", "Broccoli", "Mushrooms", "Sharp cheddar cheese", "Chicken breast"},
                                    "Potatoes - 4 cups diced peeled\nButter - 1 tablespoon\nGarlic - crushed, 2 teaspoons\nOnion(s) - 2, diced\nSelf-rising flour - 1 cup\nMilk - 2 cups\nEgg(s) - 6\nBroccoli - 1 cup fresh, chopped\n"
                                    + "Mushrooms - 1 cup fresh, sliced\nSharp cheddar cheese - 2 cups shredded\nChicken breast - 1 cup cooked, diced boneless\n\n1. Preheat oven to 350 degrees F (175 degrees C).\n2. Place potatoes"
                                    + " in a medium saucepan with enough water to cover. Bring to a boil, and cook 10 minutes, or until tender but firm; drain.\n3. Melt butter in a medium skillet over medium heat, and saute garlic"
                                    + " and onions until tender.\n4. In a small bowl, mix the flour, milk, and eggs.\n5. In a medium bowl, mix potatoes, garlic and onions, flour mixture, broccoli, mushrooms, Cheddar cheese, and chicken."
                                    + " Transfer to a medium baking dish.\n6. Bake 25 minutes in the preheated oven, or until eggs are no longer runny and top is lightly browned.\n\n"
            
    );
    
    Recipe recipe9 = new Recipe(8, "Classic hash brown", "img/Classic hash brown.jpg",
                                new String[]{"Cayenne pepper","Paprika","Butter","salt","Ground black pepper"},
                                    "Cayenne pepper - 1 pinch \nPaprika - 1 pinch\nButter - 3 tablespoons clarified \nSalt\nGround black pepper\n\n1. Shred potatoes into a large bowl filled with cold water. Stir until water is cloudy, "
                                   + "drain, and cover potatoes again with fresh cold water. Stir again to dissolve excess starch. Drain potatoes well, pat dry with paper towels, and squeeze out any excess moisture.\n2. Heat "
                                   + "clarified butter in a large non-stick pan over medium heat. Sprinkle shredded potatoes into the hot butter and season with salt, black pepper, cayenne pepper, and paprika.\n3. "
                                   + "Cook potatoes until a brown crust forms on the bottom, about 5 minutes. Continue to cook and stir until potatoes are browned all over, about 5 more minutes.\n\n"
    );
    
    Recipe recipe10 = new Recipe(9, "Crab Quiche", "img/Crab Quiche.jpg",
                                new String[]{"Hot pepper sauce","Monterey Jack cheese","Parmesan cheese","Imitation crabmeat","Egg","Onion","Deep dish frozen pie crust","Heavy cream","Salt","Black pepper"},
                                     "Hot pepper sauce - 3 dashes (e.g. Tabasco™), or to taste\nMonterey Jack cheese - 1 cup shredded \nParmesan cheese - 1/4 cup grated \nImitation crabmeat - 1 (8 ounce) package, flaked\nOnion - 1 green, "
                                    + "chopped\nDeep dish frozen pie crust -1 (9 inch) \nEgg(s) -4 \nHeavy cream - 1 cup \nSalt - 1/2 teaspoon \nBlack pepper - 1/2 teaspoon \n\n1. Preheat the oven to 350 degrees F (175 degrees C). "
                                    + "Bake the pie crust for about 10 minutes, until just starting to brown. Remove from the oven, and allow to cool.\n2. In a large bowl, whisk together the eggs, cream, salt, pepper, and hot sauce. "
                                    + "Stir in shredded cheese, onion and imitation crab. Pour into the pie shell.\n3. Bake for 25 to 30 minutes in the preheated oven, then turn off the oven, but leave the door closed. Leave quiche "
                                    + "in the oven for an additional 20 to 30 minutes until firm. This will give it a smoother texture.\n\n"
    );
    
   
    
    Recipe recipe11 = new Recipe(10, "Creamy Banana Bread", "img/Creamy Banana Bread.jpg",
                                new String[]{"Margarine", "Cream cheese", "White sugar","Egg","Baking powder","Baking soda","Chopped pecans", "Brown sugar", "Ground cinnamon","Vanilla extract"},
                                    "Margarine - 1/2 cup, softened\nCream cheese - 1 (8 ounce) package, softened\nWhite sugar - 1 1/4 cups\nEgg(s) - 2\nBaking powder - 1 1/2  teaspoons\nBaking soda -1/2 teaspoon\nChopped pecans - 3/4 cup\nBrown "
                                    + "sugar - 2 tablespoons\nGround cinnamon - 2 teaspoons\nVanilla extract - 1 teaspoon vanilla extract\n\n1. Preheat oven to 350 degrees F (175 degrees C). Grease and flour two 8x4-inch loaf pans.\n2. "
                                    + "Cream the margarine and cream cheese together. Gradually add the white sugar, and continue beating until light and fluffy. Add eggs one at a time, beating well after each addition. Stir in the "
                                    + "mashed bananas and vanilla. Add flour, baking powder, and baking soda; mix until batter is just moist.\n3. In a small bowl, mix together chopped pecans, 2 tablespoons brown sugar, and cinnamon.\n4."
                                    + "Divide half the batter between the two prepared loaf pans. Sprinkle pecan mixture over the batter in the pans, and top with remaining batter.\n5.Bake in the preheated oven until a toothpick inserted"
                                    + " in the center of each loaf comes out clean, about 45 minutes.\n\n"
            
    );
    
     Recipe recipe12 = new Recipe(11, "Creme Brulee French Toast", "img/Creme Brulee French Toast.jpg",
                                new String[]{"Butter","Brown sugar","Corn syrup","French bread","Egg","Half-and-half cream","Vanilla extract", "Orange liqueur","Salt"},
                                    "Butter - 1/2 cup unsalted\nBrown sugar - 1 cup packed\nCorn syrup - 2 tablespoons\nFrench bread - 6 (1-inch thick) slices\nEgg(s) - 5\nHalf-and-half cream - 1 1/2 cups\nVanilla extract - 1 teaspoon\n"
                                    + "Orange liqueur - 1 teaspoon brandy-based (such as Grand Marnier(R))\nSalt - 1/4 teaspoon\n\n1. Melt butter in a small saucepan over medium heat. Mix in brown sugar and corn syrup, stirring "
                                    + "until sugar is dissolved. Pour into a 9x13 inch baking dish.\n2. Remove crusts from bread, and arrange in the baking dish in a single layer. In a small bowl, whisk together eggs, half and "
                                    + "half, vanilla extract, orange brandy, and salt. Pour over the bread. Cover, and chill at least 8 hours, or overnight.\n3. Preheat oven to 350 degrees F (175 degrees C). Remove the dish from "
                                    + "the refrigerator, and bring to room temperature.\n4Bake uncovered 35 to 40 minutes in the preheated oven, until puffed and lightly browned.\n\n"
    );
    
    Recipe recipe13 = new Recipe(12, "Crepes", "img/Crepes.jpg",
                                new String[]{"Egg", "Milk", "All-purpose flour", "Salt", "Vegetable oil"},
                                    "Egg(s) - 2\nMilk -1 cup\nAll-purpose flour - 2/3 cup\nSalt - 1 pinch\nVegetable oil - 1 1/2 teaspoons\n\n1. In a blender combine eggs, milk, flour, salt and oil. Process until smooth. Cover and refrigerate"
                                    + " 1 hour.\n2. Heat a skillet over medium-high heat and brush with oil. Pour 1/4 cup of crepe batter into pan, tilting to completely coat the surface of the pan. Cook 2 to 5 minutes, turning once, "
                                    + "until golden. Repeat with remaining batter.\n\n"
    );
    
    Recipe recipe14 = new Recipe(13, "Easy Quiche", "img/Easy Quiche.jpg",
                                new String[]{"Milk", "Egg", "Biscuit baking mix", "Butter", "Parmesan cheese", "Broccoli", "Ham", "Cheddar cheese"},
                                    "Milk 2 cup\nEgg(s) - 4 \nBiscuit baking mix - 3/4 cup\nButter - 1/4 cup, softened\nParmesan cheese - 1 cup grated \nBroccoli - 1 (10 ounce) package chopped frozen, thawed and drained\nHam - 1 cup"
                                    + "cubed cooked \nCheddar cheese - 8 ounces shredded \n\n1. Preheat oven to 375 degrees F (190 degrees C). Lightly grease a 10 inch quiche dish.\n2. In a large bowl, beat together milk, "
                                    + "eggs, baking mix, butter and parmesan cheese. Batter will be lumpy. Stir in broccoli, ham and Cheddar cheese. Pour into prepared quiche dish.\n3. Bake in preheated oven for 50 minutes, "
                                    + "until eggs are set and top is golden brown.\n\n"
    );
    
    Recipe recipe15 = new Recipe(14, "Easy Spicy Roasted Potatoes", "img/Easy Spicy Roasted Potatoes.jpg",
                                new String[]{"Chili powder","Extra virgin olive oil","Cheddar cheese","Red potatoes","Onion"},
                                     "Chili powder - 2 teaspoons\nExtra virgin olive oil - 1/4 cup \nCheddar cheese - 1 cup shredded (optional) \nRed potatoes - 5 medium, diced with peel\nOnion(s) - 1 medium, chopped \nGarlic powder - 1 "
                                    + "tablespoon\n Kosher salt - 1 tablespoon \n\n1. Preheat the oven to 450 degrees F (220 degrees C).\n2. Arrange the potatoes and onions in a greased 9x13 inch baking dish so that they are "
                                    + "evenly distributed. Season with garlic powder, salt and chili powder. Drizzle with olive oil. Stir to coat potatoes and onions with oil and spices.\n3. Bake for 35 to 40 minutes in the "
                                    + "preheated oven, until potatoes are fork tender and slightly crispy. Stir every 10 minutes. When done, sprinkle with cheese. Wait about 5 minutes for the cheese to melt before serving.\n\n"
    );
    
    Recipe recipe16 = new Recipe(15, "Egg in a Hole", "img/Egg in a Hole.jpg",
                                new String[]{"Bacon grease","Bread","Egg","Salt","Ground black pepper"},
                                    "Bacon grease - 1 1/2 teaspoons\nBread - 1 slice \nEgg(s) - 1 \nSalt - to taste\nGround black pepper - to taste\n\n1. Melt the bacon grease in a non-stick pan over low heat.\n2. Cut a 1 1/2 to 2-inch "
                                    + "hole from the center of the bread slice; lay in the hot skillet. When the side facing down is lightly toasted, about 2 minutes, flip and crack the egg into the hole; season with salt and peppe. "
                                    + "Continue to cook until the egg is cooked and mostly firm. Flip again and cook 1 minute more to assure doneness on both sides. Serve immediately.\n\n"
            
    );
    
    Recipe recipe17 = new Recipe(16, "Eggs Benedict", "img/Eggs Benedict.jpg",
                                new String[]{"Egg yolks", "Lemon juice", "White pepper", "Worcestershire sauce", "Water", "Butter", "Egg", "Salt", "Distilled white vinegaray","Canadian-style bacon","English muffins"},
                                    "Egg yolks - 4\nLemon juice - 3 1/2 tablespoons\nWhite pepper - 1 pinch, ground\nWorcestershire sauce - 1/8 teaspoon\nWater -1 tablespoon\nButter - 1 cup, melted\nSalt - 1/4 teaspoon\nEgg(s) - 8\n"
                                    + "Distilled white vinegar - 1 teaspoon\nCanadian-style bacon - 8 strips\nEnglish muffins - 4, split\nButter - 2 tablespoons, softened\n\n1.To Make Hollandaise: Fill the bottom of a double "
                                    + "boiler part-way with water. Make sure that water does not touch the top pan. Bring water to a gentle simmer. In the top of the double boiler, whisk together egg yolks, lemon juice, "
                                    + "white pepper, Worcestershire sauce, and 1 tablespoon water. \n2.Add the melted butter to egg yolk mixture 1 or 2 tablespoons at a time while whisking yolks constantly. If hollandaise "
                                    + "begins to get too thick, add a teaspoon or two of hot water. Continue whisking until all butter is incorporated. Whisk in salt, then remove from heat. Place a lid on pan to keep sauce warm. "
                                    + "\n3.Preheat oven on broiler setting. To Poach Eggs: Fill a large saucepan with 3 inches of water. Bring water to a gentle simmer, then add vinegar. Carefully break eggs into simmering water, "
                                    + "and allow to cook for 2 1/2 to 3 minutes. Yolks should still be soft in center. Remove eggs from water with a slotted spoon and set on a warm plate \n4.While eggs are poaching, brown the "
                                    + "bacon in a medium skillet over medium-high heat and toast the English muffins on a baking sheet under the broiler. \n5.Spread toasted muffins with softened butter, and top each one with a slice of "
                                            + "bacon, followed by one poached egg. Place 2 muffins on each plate and drizzle with hollandaise sauce. Sprinkle with chopped chives and serve immediately.\n\n"
    );
    
    Recipe recipe18 = new Recipe(17, "Fluffy Pancakes", "img/Fluffy Pancakes.jpg",
                                new String[]{"Milk", "White vinegar", "All-purpose flour", "White sugar", "Baking powder", "Salt", "Egg", "Butter", "Cooking spray"},
                                    "Milk - 3/4 cup\nWhite vinegar - 2 tablespoons\nAll-purpose flour - 1 cup\nWhite sugar - 2 tablespoons\nBaking powder - 1 teaspoon\nBaking soda - 1/2 teaspoon\nSalt - 1/2 teaspoon\nEgg(s) - 1\nButter "
                                    + "- 2 tablespoons, melted\nCooking spray\n\n1.Combine milk with vinegar in a medium bowl and set aside for 5 minutes to \"sour\".\n2.Combine flour, sugar, baking powder, baking soda, and salt "
                                    + "in a large mixing bowl. Whisk egg and butter into \"soured\" milk. Pour the flour mixture into the wet ingredients and whisk until lumps are gone.\n3.Heat a large skillet over medium heat, "
                                    + "and coat with cooking spray. Pour 1/4 cupfuls of batter onto the skillet, and cook until bubbles appear on the surface. Flip with a spatula, and cook until browned on the other side.\n\n"    
    );
    
    Recipe recipe19 = new Recipe(18, "Good Old Fashioned Pancakes", "img/Good Old Fashioned Pancakes.jpg",
                                new String[]{"All-purpose flour","Baking powder","Salt","White sugar","Milk","Egg","Butter"},
                                     "All-purpose flour - 1 1/2 cups\nBaking powder - 3 1/2 teaspoons\nSalt - 1 teaspoon\nWhite sugar - 1 tablespoon \nMilk - 1 1/4 cups \nEgg(s) - 1\nButter - 3 tablespoons, melted\n\n1. In a large bowl,"
                                    + " sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth.\n2. Heat a lightly oiled griddle or frying pan over "
                                    + "medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot.\n\n"
    );
    
    Recipe recipe20 = new Recipe(19, "Homemade Scotch Eggs", "img/Homemade Scotch Eggs.jpg",
                                new String[]{"Pork sausage meat","Worcestershire sauce","Egg","All-purpose flour","Salt","Ground black pepper","Bread","Frying oil"},
                                     "Pork sausage meat - 1 pound \nWorcestershire sauce - 2 teaspoons\nEgg(s) - 4 hard-cooked, peeled\nAll-purpose flour - 1 tablespoon \nSalt -1/8 teaspoon salt\nGround black pepper - 1/8 teaspoon\n"
                                    + "Egg(s) - 1, beaten\nBread  - 2/3 cup dry, crumbs\nFrying oil  - 1 quart for deep frying\n\n1. In a medium bowl, mix together the pork sausage and Worcestershire sauce. Combine the flour, "
                                    + "salt and pepper; mix into the sausage.\n2. Divide the sausage into four equal parts. Mold each part around one of the hard-cooked eggs, rolling between your hands to shape. Place the "
                                    + "beaten egg and bread crumbs into separate dishes. Dip the balls into the egg, then roll in the bread crumbs until coated. Shake off any excess.\n3. Heat the oil in a large saucepan or "
                                    + "deep fryer to 365 degrees F (180 degrees C), or until a cube of bread drooped into the oil turns brown in 1 minute. Lower the eggs carefully into the hot oil. Fry for 5 minutes, or "
                                    + "until deep golden brown.\n\n"
            
    );
    
    Recipe recipe21 = new Recipe(20,"Joseph's Best Easy Bacon", "img/Joseph's Best Easy Bacon Recipe.jpg",
                                new String[]{"Thick-cut bacon"},
                                    "Thick-cut bacon - 1 (16 ounce) package\n\n1. Line a large baking sheet with 2 sheets of aluminum foil, making sure pan is completely covered.\n2. Arrange bacon strips on the prepared baking sheet, "
                                    + "keeping at least 1/2-inch space between strips. Place pan in the cold oven.\n3. Heat oven to 425 degrees F (220 degrees C). Cook bacon for 14 minutes.\n3. Transfer cooked bacon to paper "
                                    + "towel-lined plates. Let cool for 5 minutes for bacon to crisp.\n\n"
            
    );
    
    Recipe recipe22 = new Recipe(21, "Megan's Granola", "img/Megan's Granola.jpg",
                                new String[]{"Oats", "Oat bran", "Sunflower seeds", "Almonds", "Pecans", "Walnuts", "Brown sugar", "Maple syrup","Honey","Vegetable oil","Ground cinnamon","Vanilla extract","Raisins","Cranberries"},
                                    "Oats - 8 cups rolled \nWheat germ - 1 1/2 cups \nOat bran - 1 1/2 cups \nSunflower seeds - 1 cup \nAlmonds - 1 cup finely chopped \nPecans - 1 cup finely chopped\nWalnuts -1 cup finely chopped \n"
                                   + "Salt - 1 1/2 teaspoons \nBrown sugar -  1/2 cup \nMaple syrup - 1/4 cup \nHoney -3/4 cup\nVegetable oil - 1 cup \nGround cinnamon - 1 tablespoon \nVanilla extract -1 tablespoon \nRaisins "
                                   + "or Cranberries - 2 cups \n\n1. Preheat the oven to 325 degrees F (165 degrees C). Line two large baking sheets with parchment or aluminum foil.\n2. Combine the oats, wheat germ, oat bran, "
                                   + "sunflower seeds, almonds, pecans, and walnuts in a large bowl. Stir together the salt, brown sugar, maple syrup, honey, oil, cinnamon, and vanilla in a saucepan. Bring to a boil over medium heat, "
                                   + "then pour over the dry ingredients, and stir to coat. Spread the mixture out evenly on the baking sheets.\n3. Bake in the preheated oven until crispy and toasted, about 20 minutes. "
                                   + "Stir once halfway through. Cool, then stir in the raisins or cranberries before storing in an airtight container.\n\n"
            
    );
    
    Recipe recipe23 = new Recipe(22, "Momma's Potatoes", "img/Momma's Potatoes.jpg",
                                new String[]{"Yukon Gold potatoes", "Rosemary", "Olive oil", "Salt", "Ground black pepper"},
                                    "Yukon Gold potatoes - 8, quartered\nRosemary - 1 tablespoon dried\nOlive oil - 1/4 cup\nSalt - to taste\nGround black pepper -  to taste\n\n1. Preheat oven to 350 degrees F (175 degrees C).\n2. "
                                     + "In a large bowl, combine the potatoes, rosemary, oil, salt and pepper. Toss well to coat.\n3. Spread evenly onto cookie sheet and bake in preheated oven for 30 minutes.\n\n"
            
    );
    
    Recipe recipe24 = new Recipe(23, "Peanut Butter French Toast", "img/Peanut Butter French Toast.jpg",
                                new String[]{"Vanilla extract","Ground cinnamon","Vegetable oil","Bread","Milk","Egg","Peanut butter","White sugar"},
                                     "Vanilla extract (optional) -  1/2 teaspoon\nGround cinnamon - 1/4 teaspoon\nVegetable oil - 1 tablespoon \nBread - 4 slices \nMilk - ½ cup \nEgg(s) - 3 \nPeanut butter - 1/4 cup \nWhite sugar - 2  "
                                     + "tablespoons \n\n1. Whisk together milk, eggs, peanut butter, sugar, vanilla extract, and cinnamon in a large bowl.\n2. Heat the oil in a griddle or frying pan over medium heat.\n3. "
                                    + "Dunk each slice of bread in egg mixture, soaking both sides. Place in pan, and cook on both sides until golden, about 3 to 4 minutes per side. Serve hot.\n\n"
            
    );
    
     Recipe recipe25 = new Recipe(24, "Potato Skillet", "img/Potato Skillet.jpg",
                                new String[]{"Bacon", "Potatoes", "Garlic salt","Seasoning salt", "Ground black pepper", "Egg", "Cheddar cheese"},
                                "Bacon - 4 slices\nPotatoes - 2 peeled and diced\nGarlic salt - 1/8 teaspoon\nSeasoning salt - 1/8 teaspoon\nGround black pepper - 1/8 teaspoon\nEgg(s) - 3, beaten\nCheddar cheese - 1/4 cup s"
                                + "hredded\n\n1. Place bacon in a large, deep skillet. Cook over medium-high heat until evenly brown. Remove bacon slices, reserving grease. Crumble bacon and set aside.\n2. "
                                + "Add potatoes to bacon grease and season with garlic salt, seasoned salt and black pepper. Cook until potatoes are soft.\n3. When potatoes are tender, add crumbled bacon. "
                                + "Pour eggs over potatoes and cook until firm. Spread with cheese and cover with lid until melted.\n\n"            
    );
    
    Recipe recipe26 = new Recipe(25, "Purple     Fruit Smoothie", "img/Purple Monstrosity Fruit Smoothie.jpg",
                                new String[] {"Bananas","Blueberries","orange juice","Honey","Vanilla extract"},
                                    "Bananas - 2 frozen, skins removed and cut in chunks\nBlueberries - 1/2 cup frozen \norange juice - 1 cup \nHoney - 1 tablespoon (optional)\nVanilla extract  - 1 teaspoon (optional)\n\n1. "
                                    + "Place bananas, blueberries and juice in a blender, puree. Use honey and/or vanilla to taste. Use more or less liquid depending on the thickness you want for your smoothie.\n\n"    
    );
    
    Recipe recipe27 = new Recipe(26, "Sausage Biscuits and Gravy", "img/Sausage Biscuits and Gravy.jpg",
                                new String[] {"Southern-style flaky refrigerated biscuits", "Maple-flavored breakfast sausage", "All-purpose flour", "Evaporated milk", "Milk", "Salt", "Ground black pepper", "Butter"},
                                    "Southern-style flaky refrigerated biscuits (such as Pillsbury Grands(R)) - 1 (19 ounce) can\nMaple-flavored breakfast sausage - 1 (16 ounce) package\nAll-purpose flour - 3 tablespoons,"
                                    + " or as needed\nEvaporated milk - 1 (12 ounce) can\nMilk - 1 1/2 cups\nSalt - 1/2 teaspoon\nGround black pepper - 1/4 teaspoon\nButter -1 teaspoon \n\n1. Preheat oven to 350 degrees F (175 degrees C).\n"
                                    + "2. Arrange biscuits about 1 1/2 inches apart on a baking sheet.\n3. Bake in the preheated oven until golden brown, 13 to 17 minutes. Slice cooked biscuits in half crosswise and keep warm.\n4. "
                                    + "While biscuits are baking, crumble sausage into a large skillet over medium heat; cook, breaking meat apart, until no longer pink inside, about 10 minutes. Sprinkle sausage and pan drippings "
                                    + "with flour and cook and stir until sausage is coated, about 1 more minute. Reduce heat to medium-low.\n5. Pour evaporated milk into sausage mixture, followed by milk; stir until thoroughly "
                                    + "combined. Bring to a simmer, stirring constantly, and cook until gravy is your desired thickness, 3 to 5 minutes. Season with salt and ground black pepper. Stir butter into gravy until melted. "
                                    + "Stir in more flour if gravy isn't thick enough.\n6. Place biscuits with cut sides up on serving plates; top with sausage gravy.\n\n"
    );
   
    Recipe recipe28 = new Recipe(27, "Soft Scrambled Eggs", "img/Soft Scrambled Eggs.jpg",
                                new String[] {"Egg", "Milk", "Cottage Cheese", "Salt", "Ground Black Pepper", "Butter"},
                                    "Egg(s) - 5\nMilk - 1/2 cup\nCottage Cheese - 1/4 cup, or more to taste\nSalt - to taste\nGround Black Pepper - to taste\nButter - 1 tablespoon\nParsley -  fresh 1 pinch chopped, or to taste (optional)\n\n1. "
                                    + "Lightly beat eggs together using a fork in a large bowl. Add milk, cottage cheese, salt,and pepper; beat for approximately 1 minute.\n\n2. Heat a large saute pan over medium heat. Melt butter "
                                    + "in the hot pan, making sure not to let it burn. Give eggs 1 last mix and pour into the pan. Reduce heat to low and cook, stirring frequently and slowly, about 10 minutes. Remove from heat, "
                                    + "allowing eggs to continue to cook slightly after heat is gone. Garnish with parsley and serve.\n\n"    
    );
     
    Recipe recipe29 = new Recipe(28, "Super Easy Egg Casserole", "img/Super Easy Egg Casserole.jpg",
                                new String[] {"Cheddar cheese", "Egg", "Bacon", "Bread", "Red Bell Pepper", "Green Onions", "Milk", "Garlic", "Salt", "Ground black pepper"},
                                    "Cheddar cheese - 1 cup shredded\nEgg(s) - 6 whisked\nBacon - 6 slices, diced\nBread - 2 slices, cubed\nRed Bell Pepper - 1/3, diced\nGreen Onions - 2, chopped\nMilk - 3 tablespoons\nGarlic"
                                    + " - 1/2 teaspoon minced, or to taste (optional)\nSalt - to taste\nGround black pepper - to taste\n\n1.Preheat oven to 350 degrees F (175 degrees C). Grease a 9x13-inch baking dish."
                                    + "\n2. Stir Cheddar cheese, eggs, bacon, bread, red bell pepper, green onion, milk, garlic, salt, and black pepper together in a bowl until well-combined; pour into prepared baking "
                                    + "dish.\n3.Bake in the pre-heated oven until eggs are set, 20 to 25 minutes.\n\n"
    );
      
    Recipe recipe30 = new Recipe(29, "The Best Chicken Fried Steak", "img/The Best Chicken Fried Steak.jpg",
                                new String[] {"Beef cube steaks", "All-purpose flour", "All-purpose flour", "Baking powder", "Baking soda", "Black pepper", "Salt", "Buttermilk", "Egg","Hot pepper sauce","Garlic", "Vegetable shortening"},
                                    "Beef cube steaks - 4 (1/2 pound)\nAll-purpose flour - 2 cups\nBaking powder - 2 teaspoons\nBaking soda - 1 teaspoon\nBlack pepper - 1 teaspoon\nSalt - 3/4 teaspoon\nButtermilk - 1 1/2 cups\n"
                                    + "Egg(s) - 1\nHot pepper sauce - 1 tablespoon (e.g. Tabasco(TM))\nGarlic - 2 cloves, minced\nVegetable shortening - 3 cups, for deep frying\nAll-purpose flour  - 1/4 cup\nMilk - 4 "
                                    + "cups\nSalt - to taste\nGround black pepper - to taste\n\n1. Pound the steaks to about 1/4-inch thickness. Place 2 cups of flour in a shallow bowl. Stir together the baking powder, "
                                    + "baking soda, pepper, and salt in a separate shallow bowl; stir in the buttermilk, egg, Tabasco Sauce, and garlic. Dredge each steak first in the flour, then in the batter, "
                                    + "and again in the flour. Pat the flour onto the surface of each steak so they are completely coated with dry flour.\n2.Heat the shortening in a deep cast-iron skillet to 325 "
                                    + "degrees F (165 degrees C). Fry the steaks until evenly golden brown, 3 to 5 minutes per side. Place fried steaks on a plate with paper towels to drain. Drain the fat from "
                                    + "the skillet, reserving 1/4 cup of the liquid and as much of the solid remnants as possible.\n3. Return the skillet to medium-low heat with the reserved oil. Whisk the "
                                    + "remaining flour into the oil. Scrape the bottom of the pan with a spatula to release solids into the gravy. Stir in the milk, raise the heat to medium, and bring the gravy "
                                    + "to a simmer, cook until thick, 6 to 7 minutes. Season with kosher salt and pepper. Spoon the gravy over the steaks to serve.\n\n"
    );
}

