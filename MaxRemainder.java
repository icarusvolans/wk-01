public class Main {
    
    private long[] maxRemainderArray = {500, 25000, 20, 100, 1000000, 800, 10};     // long[] with values
    
    public static void main(String[] args){      // main method
        Main m = new Main();
        System.out.println(m.remainder(m.maxRemainderArray));
    }
    
    public static long remainder(long[] commonRemainder) {     // remainder method
//        long commonRemainder = 0;
        long maxAnswer = 0;
 //       long firstAnswer = 0;
        
        dio d = new dio();
        
        for(int i = 0; i < commonRemainder.length ; i++) { 
            if(i == 0){
                maxAnswer = d.eachRemainder(commonRemainder[i]);
            }else{    
                if(d.eachRemainder(commonRemainder[i]) > maxAnswer);
                    maxAnswer = d.eachRemainder(commonRemainder[i]);
                }               
                
            }      
            //System.out.println(maxAnswer);

            return maxAnswer;
  
    }
}





public class dio {
    
    long divisor = 12;
    
    public long eachRemainder(long l){
        return l % divisor;
        }// main method

}

