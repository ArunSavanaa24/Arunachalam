package Collection;

import java.util.ArrayList;

public class LmsId {
public static void main(String[] args) {
	ArrayList <Integer> id = new ArrayList<>();
	id.add(123);
	id.add(345);
	id.add(456);
	id.add(345);
	id.add(3,666);
	id.set(2, 500);
	id.remove(4);
	
	/*for(int i=0;i<id.size();i++) {
		if(id.get(i)%2!=0) {
			System.out.println(id.get(i));
		}
	}*/
	//System.out.println(id);
	
		//System.out.println(id.get(2));
	
		//System.out.println(id.size());
	//********************************************
		/*for(int i=0;i<id.size();i++) {
			System.out.println(id.get(i));
		}  */                                //normal for method
	//*******************************************
		/*for(Integer Lms : id) {
			System.out.println(Lms);
		}  */                                   //enance for loop method
	//****************************************
	//id.forEach(num->System.out.println(num));         //for each method
	
	
	
	
	
}
}
