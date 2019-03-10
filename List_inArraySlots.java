/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    private int[] list; //the array
    private int slotsFilled; //num of slot in array filled

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        list = new int[5];
        slotsFilled = 0;
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return slotsFilled;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String output = "[";
        for (int i = 0; i < slotsFilled; i++) {
            output += list[i] + ",";
        }
        return output + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add( int value) {
        if(slotsFilled == list.length) //checks if there are open slots
            expand();
        list[slotsFilled++] = value;
        return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data
     */
     private void expand() {
        int[] storage = list; //store old list
        list = new int[2 * slotsFilled]; //create new list
        for(int i = 0; i < storage.length; i++) //repopulate with old values
           list[i] = storage[i];
     }

     /**
       accessor
       @return element @index from this list
       precondition: @index is within the bounds of the array.
           (Having warned the user about this precondition,
            you should NOT complicate your code to check
            whether user violated the condition.)
      */
     public int get( int index ) {
       return list[index];
     }

     /**
       Set value at @index to @newValue

       @return old value at @index
       @precondition: @index is within the bounds of this list.
      */
     public int set( int index, int newValue ) {
       int holder = list[index];
       list[index] = newValue;
       return holder;
     }

     /**
       Insert @value at position @index in this list.

       Shift the element currently at that position (if any)
       and any subsequent elements to the right
       (that is, increase the index associated with each).
      */
      public void add( int index, int value) {
        for (int i = list.length-1; i > index; i--){
            list[i] = list[i-1];
        }
        list[index] = value;
      }


     /**
       Remove the element at position @index in this list.

       Shift any subsequent elements to the left (that is,
       decrease the index associated with each).

       @return the value that was removed from the list
      */
      public int remove( int index) {
        int holder = list[index];
        for (int i = index; i < list.length-1; i++){
            list[i] = list[i+1];
        }
        return holder;
      }

}
