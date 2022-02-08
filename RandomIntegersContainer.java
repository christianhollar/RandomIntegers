
/**
 * RandomIntegersContainer includes methods to manipulate a given array. The 
 * methods include adding a number to the back,front, and inputted position
 * of the array. The true length of the array can also be requested. 
 *
 * Christian Hollar
 * 8/30/2020
 * hollarc@lafayette.edu
 * CS150
 */

public class RandomIntegersContainer
{
    // instance variables - replace the example below with your own
    private int[] genArray;
    
    public static void main(String args[]){
        RandomIntegersContainer r = new RandomIntegersContainer();
        
    }

    /**
     * Constructor for objects of class RandomIntegersContainer
     */
    public RandomIntegersContainer()
    {
        // initialise instance variables
        genArray = new int[10];
        
    }

    public void addToBack(int newB)
    {
        /*
         * The if statement figures out if there is space in the array for a 
         * new value. If there is not, the array creates a new array that is 
         * double the length. The values from the first array are copied over.
         * The first array is then set equal to the second array. 
         */
        if(this.genArray[this.genArray.length-1]!=0){

            int[] tempArray = new int[this.genArray.length*2];
            System.arraycopy(this.genArray,0,tempArray,0,this.genArray.length);
            this.genArray=tempArray;
            
            for(int i =0; i <= this.genArray.length-1; i++){
            /*
             * The array is then scanned for a 0 value aka the first blank value
             * where the new number can be added. Once this is found and completed
             * break is used to end the loop
             */
            if(this.genArray[i]!=0){
                this.genArray[i]= newB;
                break;
            }
        }
            
            
        }
        else{
            /*
             * Same as earlier
             */
            for(int i =0; i <= this.genArray.length-1; i++){
            
            if(this.genArray[i]!=0){
                this.genArray[i]= newB;
                break;
            }
        }
        }
    }
    
        public void addToFront(int newF)
    {
        /*
         * The array is once again first scanned for if it can hold another value.
         * This is used by if statement searching for the last value of the array
         * to be blank. 
         */
        
        if(this.genArray[this.genArray.length-1]!=0){
            int[] tempArray = new int[this.genArray.length*2];
            System.arraycopy(this.genArray,0,tempArray,0,this.genArray.length);
            this.genArray=tempArray;
            
            int[] tempFArray = new int[this.genArray.length+1];
            /*
             * The array is copied over but pushes each value of the original
             * array by one. This leaves the front value blank allowing space to
             * input the new desired value.
             */
            for(int i = 0; i<=0; i++){
                tempFArray[i+1]=this.genArray[i];                
            }
            this.genArray=tempFArray;
            this.genArray[0]=newF;
            
        }
        else{
            /*
             * Same thing without making array larger
             */
            int[] tempFArray = new int[this.genArray.length+1];
            for(int i = 0; i<=0; i++){
                tempFArray[i+1]=this.genArray[i];                
            }
            this.genArray=tempFArray;
            this.genArray[0]=newF;
            
        }
        
    }
    
        public boolean addAt(int val, int pos)
    {
        /*
         * Array first scans to see if the position is larger than the length
         * If so, false return. If not, the array is split. A temperorary array
         * is created using two loops. The position of the temperary is left
         * blank when copying by allowing second loop to push everything up by
         * one similar to addtoFront. 
         */
        if(pos>this.genArray.length){
            return false;
        }
        else{
            int[] tempBArray = new int[this.genArray.length+1];
            for(int i = 0; i<pos; i++){
                tempBArray[i]=this.genArray[i];                
            }
            for(int i = pos; i<tempBArray.length; i++){
                tempBArray[i+1]=this.genArray[i];
            }
            tempBArray[pos]=val;
            this.genArray=tempBArray;
            return true;

        }
    }
    
        public int numEntries()
    {
        /*
         * This returns the number of non blank values within a desire array
         * by looping them with an if statement and using a counter.
         */
        int count =0;
        for(int i = 0; i<=genArray.length-1; i++){
            if(genArray[i]!=0){
                count++;
            }
        }
        
        
        return count;
    }
    
        public int[] toArray(int y)
    {
        // put your code here
        return this.genArray;
    }
}
