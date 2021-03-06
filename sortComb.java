import java.util.Arrays;

public class sortComb {
	public static void main(String[] args) {
		int size = Integer.valueOf(args[0]);
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = (int)Math.round(Math.random() * 100);
		}
		System.out.println("original:"+Arrays.toString(a));
		toSort(a);
		System.out.println("sorted:"+Arrays.toString(a));

	}	
	public static void toSort(int[] a) {
		int temp;
		double factor = 1.247330950103979;
		int step = (int)Math.round(a.length / factor);
		boolean flag = true;
		while ((step > 1) || (flag)) {
			step = (int)(step / factor);
			flag = false;
			for (int j = 0; j < (a.length - step); j++) {
				if (a[j] > a[j + step]) {
					temp = a[j];
					a[j] = a[j + step];
					a[j + step] = temp;
					flag = true;
				}
			}
		}
	}

}