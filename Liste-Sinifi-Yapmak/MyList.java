import java.util.Arrays;

public class MyList <T> {

	private int capacity = 10 ;
	private T[] arr ;
	private int count = 0 ;
	
	public MyList() {
		
		this.arr = (T[]) new Object[capacity] ;
		
	}
	
	public MyList(int capacity) {
		
		this.capacity = capacity ;
				
	}
	
	int size() {
		
		return this.count ;
		
	}
	
	int getCapacity() {
		
		return this.capacity ;
		
	}
	
	void add(T data) {
		
		if(count == this.capacity) {
			
			T[] newArr = (T[]) new Object[2*capacity];
			int i = 0 ;
			for(T arr : this.arr) {
				newArr[i] = arr ;
				i++ ;
			}
			this.arr = newArr ;
			this.capacity = this.capacity*2;
			
		}
		arr[count] = data ;
		count++;
	}
	
	T get(int index) {
		
		if(index < 0 || index >= this.arr.length) {
			return null ;
		}
		
		return this.arr[index] ;
		
	}

	T remove(int index) {
		
		this.count-- ;
		
		if(index < 0 || index >= this.arr.length) {
			return null ;
		}
		
		for(int i = index ; i < this.arr.length-1 ; i++) {
			
			arr[i] = arr[i+1] ;
			
		}
		return arr[index] ;
	}
	
	T set(int index, T data) {
		
		if(index < 0 || index >= this.arr.length) {
			return null ;
		}
		
		arr[index] = data ;
		
		return arr[index] ;
		
	}
	
	public String toString() {
		
		return Arrays.toString(arr) ;
		
	}
	
	int indexOf(T data) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] == data) {
				
				return i ;
				
			}
			
		}
		return -1 ;
	}
	
	int lastIndexOf(T data) {
		
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			
			if(arr[i] == data) {
				
				return i ;
				
			}
			
		}
		return -1 ;
	}
	
	boolean isEmpty() {
		
		return count == 0 ? true : false ;
		
	}
	
	T[] toArray() {
		
		return this.arr ;
		
	}
	
	void clear() {
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = (T) "" ;
			
		}
		
	}
	
	MyList<T> subList(int start, int finish){
		
		MyList<T> temp = new MyList<>() ;
		
		for(int i = start ; i <= finish ; i++) {
			
			temp.add(this.arr[i]);
			
		}
		return temp ;
	}
	
	boolean contains(T data) {
		
		for(T arr2 : this.arr) {
			
			if(arr == data) {
				
				return true ;
				
			}
			
		}
		
		return false ;
	}
	
	
	
	
	
	
	
}
