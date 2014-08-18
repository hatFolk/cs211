public class findMin{
	public object findMin(ArrayList<Comparable> arrayList){
		/*
		 * size = 0		?
		 * size = 1		[2] -> [2]
		 * size = 2		[2, 1] -> [1]
		 * size = 2		[1, 2] -> [1]
		 * size = 3		[1, 2, 3] -> [1]
		 * size = 3		[3, 2, 1] -> [1]
		 * size = 3		[3, 1, 2] -> [1]
		 * size = 3		[3, -1, 2] -> [-1]
		 * size = 5		[5, 3, 7, 2, 4] -> [2]
		 *
		 */
		Comparable smallest = arrayList.get(0);
		for(int i = 0; i < arrayList.size(); i++){
			Comparable current = arrayList.get(i);
			if(smallest.compareTo(current) > 0){
				smallest = current;
			}
		}
		return smallest;
	}
}
