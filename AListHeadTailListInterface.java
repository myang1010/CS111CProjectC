import java.util.Arrays;

public class AListHeadTailListInterface<T extends Comparable<? super T>> implements HeadTailListInterface<T>{

	ListInterface<T> aList; // initialize to type AList
	
	public AListHeadTailListInterface(int initialCapacity){
		aList = new AList<T>(initialCapacity);
	}
	
	public void addFront(T newEntry){
		aList.add(1, newEntry);
	}

	/**
	 * Adds a new entry to the end of the list. 
	 * Entries currently in the list are unaffected.
	 * The list's size is increased by 1.
	 * 
	 * @param newEntry The object to be added as a new entry.
	 */
	public void addBack(T newEntry){
		aList.add(aList.getLength()+1, newEntry);
	}

	/**
	 * Removes an entry from the beginning of the list. 
	 * Entries currently in the list are shifted up.
	 * The list's size is decreased by 1.
	 * 
	 * @return A reference to the removed entry or null if the list is empty.
	 */
	public T removeFront(){
		if (size()==0)
			return null;
		else
			return aList.remove(1);
	}

	/**
	 * Removes an entry from the end of the list. 
	 * Entries currently in the list are unaffected.
	 * The list's size is decreased by 1.
	 * 
	 * @return A reference to the removed entry or null if the list is empty.
	 */
	public T removeBack(){
		if (size()==0)
			return null;
		else
			return aList.remove(aList.getLength());
	}

	/** Removes all entries from this list. */
	public void clear(){
		aList.clear();
	}

	/**
	 * Retrieves the entry at a given position in this list.
	 * 
	 * @param givenPosition An integer that indicates the position of the desired entry.
	 * @return A reference to the indicated entry or null if the index is out of bounds.
	 */
	public T getEntry(int givenPosition){
		if (givenPosition<0 || givenPosition > size())
			return null;
		else
			return aList.getEntry(givenPosition+1);
	}

	/**
	 * Displays the contents of the list to the console, in order.
	 */
	public void display(){
		System.out.print(aList.getLength() +" elements;" + "\t" );
		if (aList.getLength()!=0)
			System.out.println(Arrays.toString(aList.toArray()));
	}

	/**
	 * Checks whether this list contains a given entry.
	 * 
	 * @param anEntry the object to search for in the list.
	 * @return the position of the entry that was found or -1 if the object is not found.
	 */
	public int contains(T anEntry){
		int result = -1;
		if (!aList.contains(anEntry))
			return result;
		else {
			boolean found = false;
			int index = 1;
			while (!found && (index <= aList.getLength())) {
				if (anEntry.equals(aList.getEntry(index)))
					found = true;
				index++;
			} 
			result = index-2;
		} 
		return result;
	}

	/**
	 * Gets the length of this list.
	 * 
	 * @return The integer number of entries currently in the list.
	 */
	public int size(){
		return aList.getLength();
	}

	/**
	 * Checks whether this list is empty.
	 * 
	 * @return True if the list is empty, or false if the list contains one or more elements.
	 */
	public boolean isEmpty(){
		return aList.isEmpty();
	}

} 


