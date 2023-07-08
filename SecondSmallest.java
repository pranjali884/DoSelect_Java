package doSelect;

public class SecondSmallest {

	public int getSecondSmallest(int a[]) {

		int smallest = Integer.MAX_VALUE;

		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallest) {
				secondSmallest = smallest;
				smallest = a[i];

			}
			if (a[i] > smallest && a[i] < secondSmallest) {
				secondSmallest = a[i];

			}
		}
		return secondSmallest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 5,10, 6, 11, 3, 9, -8 };

		SecondSmallest s = new SecondSmallest();
		int c = s.getSecondSmallest(a);
		System.out.println(c);

	}
}
