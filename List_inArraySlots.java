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
}
