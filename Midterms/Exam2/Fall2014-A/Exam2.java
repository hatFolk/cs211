public class Exam2{
	public static void foo(int x){
		if(x>0 && x<3){
			String sam = null;
			sam.toString();
		}
		try{
			int[] arr = {4, 5, 6};
			x = arr[x];
			x = x/x;
		} catch(NullPointerException e){
			System.out.println("null");
		} catch(IndexOutOfBoundsException e){
			// do nothing
		} finally {
			System.out.println("bye");
		}
	}

	public static void main(String[] args){
		int [] nums = {7, 0, 1};

		for(int i = 0; i < nums.length; i++){
			try{
				foo(nums[i]);
				System.out.println("success");
			} catch (NullPointerException e){
				System.out.println("NPE");
			} catch (Exception e){
				System.out.println("main");
			}
		}
	}
}
