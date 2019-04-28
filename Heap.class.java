import java.util.*;

 //set path=c:\Program Files\Java\jdk-12.0.1\bin 	
class Heap {
	
	int[] pool = {};
	int pointer = -1;
	List<Integer> pool2 = new ArrayList<Integer>();

	/*function to insert value into array*/
	public void setVal(int in_val){ 
		pool2.add(in_val);
		pointer++;
	}

	public int getVal(int in_index){
		int ret = -1; // if the function returns -1 means it hits out of bound errors
		if(checkBounds(in_index)){
			ret  = pool2.get(in_index);
			pool2.remove(in_index);
		}else{
			System.out.println("No more items left");
			System.exit(0);
		}
		return ret;
	}
	
	public int peek(){
		return getVal(pointer);
	}
	
	public boolean equals(Heap in_heap){
		
		// System.out.println("Own: "+pool2);
		// System.out.println("Input: "+in_heap.pool2);
		return pool2.equals(in_heap.pool2);
	}
	
	/*function to check if the index is within the array boundaries*/
	private boolean checkBounds(int in_index){ 
		boolean ret=false;
		if(in_index>=0 && in_index<pool2.size()){
			ret = true;
		}else{
			ret = false;
		}
		return ret;
	}
}
