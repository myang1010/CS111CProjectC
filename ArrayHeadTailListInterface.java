import java.util.ArrayList;
import java.util.Arrays;

public class ArrayHeadTailListInterface<T> implements HeadTailListInterface<T>{ 

	private T[] listArray;
	private int numberOfElements;

	public ArrayHeadTailListInterface(int initialCapacity){
		@SuppressWarnings("unchecked")
		T[] tempList = (T[]) new Object[initialCapacity];
		listArray = tempList;
		numberOfElements = 0;
	}

	/**
	 * Adds a new entry to the beginning of the list. 
	 * Entries currently in the list are shifted down.
	 * The list's size is increased by 1.
	 * 
	 * @param newEntry The object to be added as a new entry.
	 */
	public void addFront(T newEntry){
		if (numberOfElements == 0){
			listArray[0] = newEntry;
			numberOfElements++;}
		else{
			numberOfElements++;
			ensureCapacity(); 
			for (int index = numberOfElements-1; index > 0; index--) 
				listArray[index] = listArray[index-1];
			listArray[0]=newEntry;
		}
	}

	/**
	 * Adds a new entry to the end of the list. 
	 * Entries currently in the list are unaffected.
	 * The list's size is increased by 1.
	 * 
	 * @param newEntry The object to be added as a new entry.
	 */
	public void addBack(T newEntry){
		if(numberOfElements == 0){
			listArray[0] = newEntry;
			numberOfElements++;
		}
		else{
			numberOfElements++;
			ensureCapacity();
			listArray[numberOfElements-1]=newEntry;
		}
	}

	/**
	 * Removes an entry from the beginning of the list. 
	 * Entries currently in the list are shifted up.
	 * The list's size is decreased by 1.
	 * 
	 * @return A reference to the removed entry or null if the list is empty.
	 */
	public T removeFront(){
		T result=null;
		if (numberOfElements==0)
			return result;
		else{
			result = listArray[0];
			for (int index = 0; index < numberOfElements; index++)
				listArray[index] = listArray[index + 1];
			numberOfElements--;
		}
		return result;
	}

	/**
	 * Removes an entry from the end of the list. 
	 * Entries currently in the list are unaffected.
	 * The list's size is decreased by 1.
	 * 
	 * @return A reference to the removed entry or null if the list is empty.
	 */
	public T removeBack(){
		T result = null;
		if (numberOfElements==0)
			return result;
		else{
			result = listArray[numberOfElements-1];
			listArray[numberOfElements-1]=null;
			numberOfElements--;
			return result;}
	}

	/** Removes all entries from this list. */
//	public void clear(){
//		for (int index = 0; index <= numberOfElements; index++)
//			listArray[index] = null;
//		numberOfElements=0;
//	}

	public void clear(){
		for (T element : listArray)
			element = null;
		numberOfElements=0;
	}
	/**
	 * Retrieves the entry at a given position in this list.
	 * 
	 * @param givenPosition An integer that indicates the position of the desired entry.
	 * @return A reference to the indicated entry or null if the index is out of bounds.
	 */
	public T getEntry(int givenPosition){
		T result = null;
		if (givenPosition>=0&&givenPosition<=numberOfElements){
			result = listArray[givenPosition];
			return result;
		}
		else
			return result;

	}

	/**
	 * Displays the contents of the list to the console, in order.
	 */
	public void display(){
		System.out.print(numberOfElements+" elements; capacity = " + listArray.length +"\t");
		if (numberOfElements>0)
			System.out.println(Arrays.toString(toArray()));
	}

	/**
	 * Checks whether this list contains a given entry.
	 * 
	 * @param anEntry the object to search for in the list.
	 * @return the position of the entry that was found or -1 if the object is not found.
	 */
	public int contains(T anEntry){
		int result = -1;
		for (int i = 0; i< numberOfElements; i++){
			if (anEntry.equals(listArray[i]))
				result = i;}
		return result;
	}

	/**
	 * Gets the length of this list.
	 * 
	 * @return The integer number of entries currently in the list.
	 */
	public int size(){
		return numberOfElements;
	}

	/**
	 * Checks whether this list is empty.
	 * 
	 * @return True if the list is empty, or false if the list contains one or more elements.
	 */
	public boolean isEmpty(){
		return numberOfElements==0;
	}

	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[numberOfElements]; 
		for (int index = 0; index < numberOfElements; index++) {
			result[index] = listArray[index];
		} 
		return result;
	}

	private void ensureCapacity() {
		int capacity = listArray.length;
		if (numberOfElements > capacity) {
			int newCapacity = 3 * capacity;
			listArray = Arrays.copyOf(listArray, newCapacity);
		} 
	} 

}
