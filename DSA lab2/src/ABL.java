import java.util.*;
public class ABL implements MyList {
	int range = 0;
	Object[] abl = new Object[range];
	@Override
	public boolean add(int index, Object o) {
		if(index < 1 || index > range){
			
			return false;
			
		} else {
			range++;
			Object[] temp = new Object[range];
			for(int ind = 0; ind < range; ind++){
				
				if(ind==index){
					
					temp[index] = o;
					
				}else if(ind < index){
					
					temp[ind] = abl[ind];
					
					
				}else {
					
					temp[ind] = abl[ind-1];
					
				}
				
				
			}
			abl = new Object[range];	
			abl = temp;
			return true;
		}
	}

	@Override
	public boolean add(Object o) {
		// TODO Auto-generated method stub
		range++;
		Object[] temp = new Object[range];
		for(int index = 0; index < range; index++){
			
			temp[index] = abl[index];
			if(index == range-1){
				
				temp[index] = 0;
				
			}
			
		}
		abl = new Object[range];
		abl = temp;
		return true;
	}

	@Override
	public boolean clear() {
		range = 0;
		abl = new Object[range];
		return true;
	}

	@Override
	public boolean contains(Object o) {
		for(int i = 0; i < range; i++){
			
			if(abl[i].equals(o)){
				return true;
				
			}
			
		}
		return false;
	}

	@Override
	public Object get(int index) {
		if(index > range){
			
			return abl[index];
		}
		return null;
	}

	@Override
	public int indexOf(Object o) {
			for(int i = 0; i < range; i++){
			
				if(abl[i].equals(o)){
					return i;
				
			}
			
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		
		if(range == 0){
			
			return true;
			
		}
		return false;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean set(int index, Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MyList subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean swap(int position1, int position2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shift(int positions) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
