public class Day1VariableCollector{

        private String recipeName = "Birthday Cake";
        private int numIngredients = 13;
        private boolean tastesGood = true;
        private long starRating = 4;
        private char decoration = '*';


        public static void main(String[] args){
                Day1VariableCollector dessert = new Day1VariableCollector();
        
        }
        public void setRecipeName(String newRecipe){
                recipeName = newRecipe;
        }

        public String getRecipeName(){
                return recipeName;
        }
 
        public void setNumIngredients(int newIngredients){
                numIngredients = newIngredients;
        }
        public int getNumIngredients(){
                return numIngredients;
        } 
        
        public void setTastesGood(boolean newTaste){
                tastesGood = newTaste;
        }
        public boolean getTastesGood(){
                return tastesGood;
        }
        
        public void setStarRating(long newRating){
                starRating = newRating;
        }
        public long getStarRating(){
                return starRating;
        }
        
        public void setDecoration(char newDecoration){
                decoration = newDecoration;
        }
        public char getDecoration(){
                return decoration;
        }   
}

/*
	String recipeName = "Birthday Cake"
	int numIngredients = 13
	boolean tastesGood = true
	long starRating = 4
	char decoration = *


	public static void main(String[] args){
		Day1VariableCollector dessert = new Day1VariableCollector

                System.out.println(dessert.getRecipeName());
                dog.setNumFleas(23);
                System.out.println(dog.getNumFleas());

        }
        public void setRecipeName(String newRecipe){
                recipeName = newRecipe;
        }

        public String getRecipeName(){
                return recipeName;
	}	
}
*/


/*
import java.util.Random;

public class Dog{

        int numFleas=10;
        boolean isBald = true;

        public static void main(String[] args){
                Dog dog = new Dog();

                System.out.println(dog.getNumFleas());
                dog.setNumFleas(23);

                System.out.println(dog.getNumFleas());

                System.out.println(dog.numFleas);

                System.out.println(dog.getIsBald());
                dog.setIsBald(false);

                System.out.println("after setIsBald " + dog.getIsBald());
                Random random = new Random();

                System.out.println(random.nextInt());

        }
        public void setIsBald(boolean newBald){
                isBald = newBald;
        }

        public boolean getIsBald(){
                return isBald;
        }
        public void setNumFleas(int newFleas){
                numFleas = newFleas;
        }

        public int getNumFleas(){
                return numFleas;
        }




}
*/	
