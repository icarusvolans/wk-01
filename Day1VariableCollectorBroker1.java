public class Day1VariableBroker{
    
    public static void main(String[] args){
        Day1VariableCollector d = new Day1VariableBroker().new Day1VariableCollector();

        System.out.println(d.getRecipeName());
        System.out.println(d.getNumIngredients());
        System.out.println(d.getTastesGood());
        System.out.println(d.getStarRating());
        System.out.println(d.getDecoration());
//        dessert.setTastesGood(false);
//        System.out.println(dessert.getTastesGood());

        }
        
class Day1VariableCollector{
        private String recipeName = "Birthday Cake";
        private int numIngredients = 13;
        private boolean tastesGood = true;
        private long starRating = 4;
        private char decoration = '*';



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


}
