/*
* INFO I-211/CSCI C-202
* MyList.java
* Purpose: This program is create a spellchecker that will compare each word in 
* a sent-in file with a dictionary of correctly spelled words to determine 
* whether or not a word is spelled properly. The purpose of this program is to 
* show how Linked Lists in programming can solve real-world problems. 
* 
* Dr. Hettiarachchi
* Cody Main 
* October 21-25, 2016
*/ 

package Program4;


/* DO NOT CHANGE THIS CODE */

public interface MyList<E> {

  /** Add a new element at the end of this list */
  public void add(E e);

  /** Add a new element at the specified index in this list */
  public void add(int index, E e);

  /** Clear the list */
  public void clear();

  /** Return true if this list contains the element */
  public boolean contains(E e);

  /* Return true if this list contains the element and increments count. */
  public boolean contains(E e, int[] count);
  
  
  /** Return the element from this list at the specified index */
  public E get(int index);

  /** Return the index of the first matching element in this list.
   *  Return -1 if no match. */
  public int indexOf(E e);

  /** Return true if this list contains no elements */
  public boolean isEmpty();

  /** Return the index of the last matching element in this list
  *  Return -1 if no match. */
  public int lastIndexOf(E e);

  /** Remove the first occurrence of the element o from this list.
   *  Shift any subsequent elements to the left.
   *  Return true if the element is removed. */
  public boolean remove(E e);

  /** Remove the element at the specified position in this list
   *  Shift any subsequent elements to the left.
   *  Return the element that was removed from the list. */
  public E remove(int index);

  /** Replace the element at the specified position in this list
   *  with the specified element and returns the new set. */
  public E set(int index, E e);

  /** Return the number of elements in this list */
  public int size();

}

