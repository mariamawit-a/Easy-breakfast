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
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.controlsfx.control.CheckComboBox;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;



/**
 *
 * @author kalua
 */
public class Easy_Breakfast extends Application 
{
    //declaring global variables that can be accessed by all methods 
    List<String> allSelected = new ArrayList<>() ;
    RecipeBook allrecipe = new RecipeBook();
    Label[] numberMissingIngredients = new Label [allrecipe.getRecipeBook().getRecipes().length];
    Label[] listRecipe = new Label [allrecipe.getRecipeBook().getRecipes().length];
    CheckBox[] box = new CheckBox [listRecipe.length];
    
 @Override // Override the start method in the Application class
 public void start(Stage primaryStage) throws FileNotFoundException, InterruptedException
 {
     
    // Create a border pane
    BorderPane pane = new BorderPane();

    pane.setTop(getHBox());
   //thread for title
    starter();

   //The Ingredient menu
    pane.setLeft(getVBox());

   //Recipe list
    ScrollPane AllRecipe = new ScrollPane (getGridPane());
    pane.setCenter(AllRecipe);

    recipePreview.setMaxSize(650, 900);
    BackgroundImage backgroundimage = new BackgroundImage(new Image("img/pic52.jpg", 650,900, true, true),  
                                               BackgroundRepeat.NO_REPEAT,  
                                               BackgroundRepeat.NO_REPEAT,  
                                               BackgroundPosition.CENTER,  
                                               new  BackgroundSize(100, 100, true, true,true, true));
    recipePreview.setBackground(new Background(backgroundimage));

    SplitPane splitPane = new SplitPane();
    splitPane.getItems().addAll(pane, recipePreview);
    
    //final File file = new File("C:/Users/kalua/Downloads/intro.mp4");
    //final String MEDIA_URL = file.toURI().toString(); 
 
   // Import and play intro video
     Media media = new Media("http://www.xghq.com/test/output_free_3.mp4");
    // Media media = new Media(MEDIA_URL);
     MediaPlayer player = new MediaPlayer(media);
     MediaView view = new MediaView();

    DoubleProperty width = view.fitWidthProperty();
    DoubleProperty height = view.fitHeightProperty();
    width.bind(Bindings.selectDouble(view.sceneProperty(), "width"));
    height.bind(Bindings.selectDouble(view.sceneProperty(), "height"));
    view.setPreserveRatio(true); 
    
     Group root = new Group(view);
     Scene scene1 = new Scene(root);


    primaryStage.setTitle("Easy Breakfast"); // Set the stage title
    primaryStage.setScene(scene1); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    primaryStage.setFullScreen(true);

    view.setMediaPlayer(player);     
    player.play();
    player.setOnEndOfMedia(() -> {
         
        Scene scene = new Scene(splitPane, 1800, 900);
        
         primaryStage.setScene(scene);
         primaryStage.setFullScreen(true);

           view.setVisible(false); 
   }); 

    //list of missing ingredients for selected recipes
     List <String> missingList = new ArrayList<>();
     
     shoppingList.setOnAction((e)-> {
      
        missingList.clear();
     
        for (int i = 0; i < listRecipe.length; i++) 
        {
            //if recipe is selected
            if(box[i].isSelected())
            {
                //compare each ingriedients of selected recipe with slected ingredients
                for (String ingredient : allrecipe.getRecipeBook().getRecipes()[i].getIngredients()) 
                {   
                    boolean isMissing = true;
                    for (int j = 0; j< allSelected.size(); j++) 
                    {
                        if (allSelected.get(j).equalsIgnoreCase(ingredient)) 
                        {
                            isMissing = false ;
                            break;
                        }
                    }
                   //if ingriedients of selected recipe is not in the slected ingredients mark as missing
                    if (isMissing == true && !missingList.contains(ingredient)) 
                        missingList.add(ingredient);
                       
                }
            }
        }
       
                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                VBox dialogVbox = new VBox(10);
                
                 BackgroundImage backgroundimage2 = new BackgroundImage(new Image("img/Easy Breakfast .png", 900,900, true, true),  
                                               BackgroundRepeat.ROUND,  
                                               BackgroundRepeat.ROUND,  
                                               BackgroundPosition.CENTER,  
                                               new  BackgroundSize(100, 100, true, true,true, true));
                dialogVbox.setBackground(new Background(backgroundimage2));
                
                Text missingTitle = new Text ("Missing Ingredients");
                missingTitle.setFont(Font.font("Papyrus", FontWeight.BOLD, 20));
                dialogVbox.getChildren().add(missingTitle);
                
                for(int i=0; i < missingList.size(); i++)
                {   
                    //print each missing ingridients
                    dialogVbox.getChildren().add(new Text (missingList.get(i)));
                }
                
                Button save = new Button("Save shopping list");
                //creat a file with all missing ingridients and save the file in the computer
                save.setOnAction((f)->{
                    try 
                    {
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(".\\shopping_list.txt"))) 
                        {
                            for (int i =0; i < missingList.size(); ++i) 
                            {    
                                writer.write(missingList.get(i)+"\n");
                            }                        
                        }
                        
                    } 
                    catch (IOException ex) 
                    {
                        Logger.getLogger(Easy_Breakfast.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  
                });
                dialogVbox.getChildren().add(save);
                
                Scene dialogScene = new Scene(dialogVbox);
                dialog.setScene(dialogScene);
                dialog.show();
        
       });
 
  primaryStage.setOnCloseRequest((WindowEvent t) -> {
      Platform.exit();
      System.exit(0);
    });
 }
 
//Multithread starter 
public void starter()
{
    Multip thread =  new Multip();
    thread.start();
}

//Multithread
public class Multip extends Thread
{ 
    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run()
    {
        try
        { 
            while(true) 
            {                   
                text.setText(xxx);
                char x = xxx.charAt(0);
                String xx = xxx.substring(1);
                xxx=xx + x;
                Thread.sleep(300);
            }
        } 
        catch (InterruptedException e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    }
}
 
 //Title used in multi and HBox
 Text text=new Text();
 String xxx = "  for     breakfast?    What's  ";
 
 //Title
 private HBox getHBox() throws FileNotFoundException 
 {
    HBox hBox = new HBox();
    hBox.setPadding(new Insets(5, 5, 5, 5));
    hBox.setStyle("-fx-background-color: gold");


    ImageView iw = new ImageView(new Image("img/Easy Breakfast .png")); 
    iw.setFitHeight(100);
    iw.setFitWidth(150);
    Label logo = new Label("",iw);
    //logo.setStyle("-fx-border-color: brown;");
    //logo.setStyle("-fx-background-color: #FFFFFF;");
    hBox.getChildren().add(logo);

    text.setFont(Font.font("Papyrus", FontWeight.SEMI_BOLD, 70)); 
    text.setFill(Color.SIENNA);

    HBox qu = new HBox(text);
    qu.setAlignment(Pos.TOP_RIGHT);

    hBox.getChildren().add(qu);
   
    return hBox;
 }

   
 Button shoppingList = new Button ("Create Shopping List");        
 
 private VBox getVBox() 
 {
    VBox vBox = new VBox(15);
    vBox.setPadding(new Insets(15, 5, 5, 5));
    vBox.setMaxWidth(200);
    vBox.getChildren().add(new Label("Select your ingredients"));

    
    Label[] catagory = {new Label("Dairy"), new Label("Meat"), new Label("Vegetable"), new Label("Fruit"), new Label("Grains/Nuts Products"),new Label("Breads/Tortillas/Crusts"), new Label("Condiments/Seasonings:"), new Label("Oils/Misc.")};
    
    
     final ObservableList<String> strings = FXCollections.observableArrayList();
     strings.addAll("Butter","Buttermilk","Cheddar cheese","Cottage Cheese","Colby-Monterey Jack cheese","Cream cheese","Egg","Egg yolks","Egg whites","Evaporated milk","Half-and-half cream","Heavy cream","Parmesan cheese","Margarine","Mexican cheese blend","Milk","Monterey Jack cheese","Mexican blend cheese","Sharp cheddar cheese");
 
     final ObservableList<String> strings1 = FXCollections.observableArrayList();
     strings1.addAll("Bacon","Beef cube steaks","Beef skirt steak","Canadian-style bacon","Lamb","Chicken breast","Chicken breas","Chorizo sausage","Cooked ham","Crab Meat","Ham","Imitation crabmeat","Maple-flavored breakfast sausage","Pork sausage meat","Sausages","Thick-cut bacon");
     
     final ObservableList<String> strings2 = FXCollections.observableArrayList();
     strings2.addAll("Bell pepper","Broccoli","Chives","Green onions","Hash brown potatoes","Hunt's(R) Diced Tomatoes","Jalapeno pepper","Garlic","Green Onions","Mushrooms","Onion","Parsley","Potatoes","Red Potatoes","Red Bell Pepper","Sweet onion");
     
     final ObservableList<String> strings3 = FXCollections.observableArrayList();
     strings3.addAll("Apple","Blueberries","Cranberries","Dried figs","Lemon juice","Orange juice","Orange liqueur","Raisins","Hazelnuts","Raisins");
     
     final ObservableList<String> strings4 = FXCollections.observableArrayList();
     strings4.addAll("All-purpose flour","Almonds","Flour","Oats","Pecans","Peanut butter","Self-rising flour","Sunflower seeds","Toasted hazelnuts","Walnuts","Wheat germ");
     
     final ObservableList<String> strings5 = FXCollections.observableArrayList();
     strings5.addAll("Bread","Biscuit dough","Biscuit baking mix","Crescent rolls","Corn tortillas","Deep dish frozen pie crust","English muffins","Flour tortillas ","French bread","Pie crust","Southern-style flaky refrigerated biscuits","White bread");
     
     final ObservableList<String> strings6 = FXCollections.observableArrayList();
     strings6.addAll("Brown sugar ","Carne asada seasoning","Chilli Powder","Corn syrup","Distilled white vinegar","Garlic salt","Garlic powder","Ground black pepper","Ground cinnamon","Ground ginger","Ground nutmeg","Honey","Hot pepper sauce","Kosher salt","Maple syrup","Rosemary","Salt","Salsa","Seasoning salt","Vanilla extract","White pepper","White sugar","White vinegar","Worcestershire sauce");
     
     final ObservableList<String> strings7 = FXCollections.observableArrayList();
     strings7.addAll("Bacon grease", "Baking power", "Baking soda", "Cooking spray", "Frying oil", "Vegetable oil", "Vegerable shorteining", "Water");
     
     

        // Create the CheckComboBox with the Ingredients 
       final CheckComboBox<String> checkComboBox = new CheckComboBox<>(strings);
       final CheckComboBox<String> checkComboBox1 = new CheckComboBox<>(strings1);
       final CheckComboBox<String> checkComboBox2 = new CheckComboBox<>(strings2);
       final CheckComboBox<String> checkComboBox3 = new CheckComboBox<>(strings3);
       final CheckComboBox<String> checkComboBox4 = new CheckComboBox<>(strings4);
       final CheckComboBox<String> checkComboBox5 = new CheckComboBox<>(strings5);
       final CheckComboBox<String> checkComboBox6 = new CheckComboBox<>(strings6);
       final CheckComboBox<String> checkComboBox7 = new CheckComboBox<>(strings7);

 /*
checkComboBox.getCheckModel().getCheckedItems().addListener(new ListChangeListener<String>() {
   @Override
   public void onChanged(ListChangeListener.Change<? extends String> c) {
        System.out.println(checkComboBox.getCheckModel().getCheckedItems());
        ingredientList[0].setText(checkComboBox.getCheckModel().getCheckedItems().toString());
     }
 });
*/
    
     for(int i=0; i<catagory.length; i++)
     {
        VBox.setMargin(catagory[i], new Insets(0, 0, 0, 15));
        vBox.getChildren().add(catagory[i]);
     
            switch(i)
            {
               case(0):
                    vBox.getChildren().add(checkComboBox);
                    break;
               case(1):
                    vBox.getChildren().add(checkComboBox1); 
                    break;
               case(2):
                    vBox.getChildren().add(checkComboBox2); 
                    break;
               case(3):
                    vBox.getChildren().add(checkComboBox3); 
                    break;
               case(4):
                    vBox.getChildren().add(checkComboBox4); 
                    break;
               case(5):
                    vBox.getChildren().add(checkComboBox5); 
                    break;
               case(6):
                    vBox.getChildren().add(checkComboBox6);  
                    break;
                case(7):
                    vBox.getChildren().add(checkComboBox7);  
                    break;    
            }        
     }
    
    Button go = new Button ("Find Recipes");
    VBox.setMargin(go, new Insets(50, 0, 50, 50));
    go.setShape(new Circle(10));
    vBox.getChildren().add(go);
     
    vBox.getChildren().add(shoppingList);

    //add all selected ingredients in an list
    go.setOnAction((e)-> 
    {
        
        allSelected.clear();
        
        allSelected.addAll((List) checkComboBox.getCheckModel().getCheckedItems());
        allSelected.addAll((List) checkComboBox1.getCheckModel().getCheckedItems());
        allSelected.addAll((List) checkComboBox2.getCheckModel().getCheckedItems());
        allSelected.addAll((List) checkComboBox3.getCheckModel().getCheckedItems());
        allSelected.addAll((List) checkComboBox4.getCheckModel().getCheckedItems());
        allSelected.addAll((List) checkComboBox5.getCheckModel().getCheckedItems());
        allSelected.addAll((List) checkComboBox6.getCheckModel().getCheckedItems());
        allSelected.addAll((List) checkComboBox7.getCheckModel().getCheckedItems());          

        //count number of missing ingredients 
        coutMissing(allSelected);
        //reorder recipe in order of missing ingredients
        reorderRecipes();
    });
    
     return vBox;
}
 
 
Text showRecipe = new Text();
FlowPane recipePreview = new FlowPane();

private GridPane getGridPane() throws FileNotFoundException 
{
    GridPane gridPane = new GridPane();
    gridPane.setMinSize(400, 200);
    gridPane.setPadding(new Insets(10, 10, 10, 10)); 
     
    
    //Setting the vertical and horizontal gaps between the columns 
    gridPane.setVgap(10); 
    gridPane.setHgap(10);       
    gridPane.setStyle("-fx-background-color: cornsilk");

    //calls function that list all recipes
    listAllRecipes();
   
    //gets the image of each recipe and intializies missing ingredients
    for(int i=0; i < allrecipe.getRecipeBook().getRecipes().length; i++ )
     {   
        ImageView iw3 =new ImageView(new Image(allrecipe.getRecipeBook().getRecipes()[i].getImage())) ;
         iw3.setFitHeight(200);
         iw3.setFitWidth(200);    

        numberMissingIngredients[i] = new Label("# Missing Ingredients",iw3 );  
     }

    
    //shows recipe discreption when clicked 
    recipePreview.getChildren().add(showRecipe);
    showRecipe.setText("Click on image for Recipe Information");
    showRecipe.setFont(Font.font("Papyrus", FontWeight.BLACK, 18));
    showRecipe.setWrappingWidth(450);

     numberMissingIngredients[0].setOnMouseClicked(e-> { showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[0].getDirection());});
     numberMissingIngredients[1].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[1].getDirection());});
     numberMissingIngredients[2].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[2].getDirection());});
     numberMissingIngredients[3].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[3].getDirection());});
     numberMissingIngredients[4].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[4].getDirection());});
     numberMissingIngredients[5].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[5].getDirection());});
     numberMissingIngredients[6].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[6].getDirection());});
     numberMissingIngredients[7].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[7].getDirection());});
     numberMissingIngredients[8].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[8].getDirection());});
     numberMissingIngredients[9].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[9].getDirection());});
     numberMissingIngredients[10].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[10].getDirection());});
     numberMissingIngredients[11].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[11].getDirection());});
     numberMissingIngredients[12].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[12].getDirection());});
     numberMissingIngredients[13].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[13].getDirection());});
     numberMissingIngredients[14].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[14].getDirection());});
     numberMissingIngredients[15].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[15].getDirection());});
     numberMissingIngredients[16].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[16].getDirection());});
     numberMissingIngredients[17].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[17].getDirection());});
     numberMissingIngredients[18].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[18].getDirection());});
     numberMissingIngredients[19].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[19].getDirection());});
     numberMissingIngredients[20].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[20].getDirection());});    
     numberMissingIngredients[21].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[21].getDirection());});
     numberMissingIngredients[22].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[22].getDirection());});
     numberMissingIngredients[23].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[23].getDirection());});
     numberMissingIngredients[24].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[24].getDirection());});
     numberMissingIngredients[25].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[25].getDirection());});
     numberMissingIngredients[26].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[26].getDirection());});
     numberMissingIngredients[27].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[27].getDirection());});
     numberMissingIngredients[28].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[28].getDirection());});
     numberMissingIngredients[29].setOnMouseClicked(e-> {showRecipe.setText(allrecipe.getRecipeBook().getRecipes()[29].getDirection());});


     
    for (int i = 0; i < listRecipe.length; i++) 
    { 
        final CheckBox box1 = box[i] = new CheckBox(listRecipe[i].getText());
    }
           
         

    int j=0, k=0, l=1;
    for(int i=0;i<listRecipe.length;i++)
    {
       numberMissingIngredients[i].setContentDisplay(ContentDisplay.TOP);
       numberMissingIngredients[i].setStyle("-fx-border-color: brown;");

       if(i%5==0 && i!=0)
       {    k+=2; l+=2; j=0;}

       gridPane.add( box[i], j, k);
       gridPane.add(numberMissingIngredients[i], j, l);

       j++;    
    }

  return gridPane;
}


int [] MissingIngredients = new int [allrecipe.getRecipeBook().getRecipes().length];
    
public void coutMissing(List<String> allSelected)
{
    for(int l=0; l<MissingIngredients.length;l++)
    {MissingIngredients[l]=0;}
    
    for(int i=0; i< allrecipe.getRecipeBook().getRecipes().length ; i++)
    {
        for (String ingredient : allrecipe.getRecipeBook().getRecipes()[i].getIngredients()) 
        {   
            boolean isMissing = true;
            
            for (int j = 0; j< allSelected.size(); j++) 
            {
                if (allSelected.get(j).equalsIgnoreCase(ingredient)) 
                {
                    isMissing = false ;
                    break;
                }
            }
            if( isMissing == true) 
                ++MissingIngredients[i];
        }
    }
}

public void reorderRecipes()
    {
        RecipeBook temp = new RecipeBook(); 
        int[] minimumIndexes = new int[MissingIngredients.length];
        int[] sortedArray = MissingIngredients.clone();

            Arrays.sort(sortedArray);
            Set<Integer> savedIndexes = new HashSet<>();

            for (int index = 0; index < MissingIngredients.length; index++)
            {
                int minIndex = 0;
                // Add the index in ascending order, we need to keep the indexes already
                // saved, so won't miss indexes from repeted values
                for (int number : MissingIngredients) {
                    if (number == sortedArray[index] && !savedIndexes.contains(minIndex)) { 
                        savedIndexes.add(minIndex);
                        minimumIndexes[index] = minIndex;
                        break;
                    }
                    minIndex++;
                }
            }

         for(int i=0; i< allrecipe.getRecipeBook().getRecipes().length; i++)
         {  
            temp.getRecipeBook().getRecipes()[i].setRecipe(allrecipe.getRecipeBook().getRecipes()[minimumIndexes[i]]); 
            numberMissingIngredients[i].setText("Number of missing ingredients - "+Integer.toString(sortedArray[i]));
            
            ImageView iw3 =new ImageView(new Image(temp.getRecipeBook().getRecipes()[i].getImage())) ;
            iw3.setFitHeight(200);
            iw3.setFitWidth(200);    
            numberMissingIngredients[i].setGraphic(iw3);
         }
            allrecipe.setRecipeBook(temp);
            listAllRecipes();
          
            for(int i=0; i< box.length ; i++)
         {
            box[i].setText(listRecipe[i].getText());
         }
                  
    }

    public void listAllRecipes()
    {
         for(int i=0; i< allrecipe.getRecipeBook().getRecipes().length; i++)
         {  
            listRecipe[i] = new Label(allrecipe.getRecipeBook().getRecipes()[i].getTitle()); 
         }
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}

