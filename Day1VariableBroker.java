public class Day1VariableBroker{

        public static void main(String[] args){
                Day1VariableCollector dessert = new Day1VariableCollector();
        
		System.out.println(dessert.getRecipeName());
                dessert.setRecipeName("Chocolate Cake");
                System.out.println(dessert.getRecipeName());

                System.out.println(dessert.getNumIngredients());
                dessert.setNumIngredients(19);
                System.out.println(dessert.getNumIngredients());

                System.out.println(dessert.getTastesGood());
                dessert.setTastesGood(false);
                System.out.println(dessert.getTastesGood());

                System.out.println(dessert.getStarRating());
                dessert.setStarRating(5);
                System.out.println(dessert.getStarRating());

                System.out.println(dessert.getDecoration());
                dessert.setDecoration('#');
                System.out.println(dessert.getDecoration());

	}
}
