package recursion2;

public class RemoveX {
	//return type string
	public static String removeX(String str) {
		//base case
		if(str.length() == 0) {
			return str;
		}
		//smaller problem solution
		String ans = "";
		if(str.charAt(0) != 'x') {
			ans = ans + str.charAt(0);
		}
		String smallAns = removeX(str.substring(1));
		
		return ans + smallAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "axbxcxdx";
		System.out.println(removeX(str));

	}

}
