import java.util.*;

 //set path=c:\Program Files\Java\jdk-12.0.1\bin 	
class Stack extends Heap{
	public void push(int in_val){
		setVal(in_val);
	}
	public int pop(){
		int ret = getVal(pointer);
		pointer --;
		return ret;
	}
}
