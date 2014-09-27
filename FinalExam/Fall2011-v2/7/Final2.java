import java.util.ArrayList;
public class Final2{
	public static void main(String[] args){
		Object[] arrList = new Object[5];
		int[] intList = new int[5];
		ArrayList elt = new ArrayList();

		elt.add("hello");
		for(int i = 1; i < 6; i++){
			intList[i-1] = i;
		}

		arrList[0] = intList;
		arrList[1] = elt;
		arrList[2] = "goodbye";
		arrList[3] = 3;
		arrList[4] = new Integer(3);

		for(int i = 0; i < 5; i++){
			System.out.println(intList[i]);
		}
		for(int i = 1; i < 5; i++){
			System.out.println(arrList[i]);
		}
		elt = changeMe(elt, intList, arrList);
		for(int i = 0; i < 5; i++){
			System.out.println(intList[i]);
		}
		for(int i = 1; i < 5; i++){
			System.out.println(arrList[i]);
		}
	}

	public static ArrayList changeMe(ArrayList elt,
			int[] intList, Object[] arrList){
		elt = new ArrayList();
		elt.add("David");
		intList[3] = 7;
		((ArrayList) arrList[1]).add("John");
		arrList[2] = arrList[4];
		arrList[3] = 5;
		arrList[4] = new Integer(4);
		return elt;
	}
}
