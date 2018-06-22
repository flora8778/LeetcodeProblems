/**
 * 
 * @author florafeng
 * Design and implement a TwoSum class. It should support the following operations:add and find.
 * add - Add the number to an internal data structure.
 * find - Find if there exists any pair of numbers which sum is equal to the value.
 * 		For example,
 * 			add(1); add(3); add(5);
 * 			find(4) -> true
 * 			find(7) -> false
 */
import java.util.HashMap;

public class TwoSumIII_DataStructureDesign{
	private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public void add(int input){
		if(map.containsKey(input)){
			map.put(input, map.get(input) + 1); //Object put(Object key, Object value) 
		} else
		map.put(input, 1);	// value is how many input is there
	}

	public boolean find(int value){
		for(int i: map.keySet()){
			 int com = value - i;
			 if(map.containsKey(com)){
			 	if((com != i) || map.get(i)>=2){  //except the same value & must be two values at least
			 		return true;
			 	}
			 }
		}
		 return false;
	}
}

/*
 * use hashmap to store o(n), find o(1). 
 */