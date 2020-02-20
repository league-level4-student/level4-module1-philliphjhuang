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
		newList[list.length] = (T)val;
		for(int i = 0; i < list.length; i++) {
			newList[i]=list[i];
		}
		list=newList;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newList = (T[]) new Object[list.length+1];
		for (int i = 0;i<loc;i++) {
			newList[i] = list[i];
		}
		newList[loc] = val;
		for (int i = loc;i<list.length;i++) {
			newList[i+1] = list[i];
		}
		list = newList;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] newArray = (T[]) new Object[list.length-1];
		for(int i = 0; i < list.length; i++) {
			if(i<loc) {
				newArray[i] = list[i];
			} else if(i>loc){
				newArray[i-1] = list[i];
			}
		}
		list = newArray;
	}
	
	public boolean contains(T val) {
		boolean con = false;
		for(int i = 0; i < list.length; i++) {
			if(list[i]==val) {
				con = true;
				break;
			}
		}
		return con;
	}
	
	public int size() {
		return list.length;
	}
}