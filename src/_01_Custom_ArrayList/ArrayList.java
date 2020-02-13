package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] list;
	public ArrayList() {
		list = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return list[loc];
	}
	
	public void add(T val) {
		T[] newList = (T[]) new Object[list.length+1];
		newList[list.length] = val;
		for(int i = 0; i < list.length; i++) {
			newList[i]=list[i];
		}
		list=newList;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newList = (T[]) new Object[list.length+1];
		for(int i = 0; i < loc-1; i++) {
			newList[i]=list[i];
		}
		newList[loc]=val;
		for(int i = loc; i < )
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		al[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}