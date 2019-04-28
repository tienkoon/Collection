import java.util.*;

 //set path=c:\Program Files\Java\jdk-12.0.1\bin 	
class Queue extends Heap{
	int pointer2=0;
	public void enqueue(int in_val){
		setVal(in_val);
	}
	public int dequeue(){
		int ret = getVal(pointer2);
		pointer2 ++;
		return ret;
	}
	
}
