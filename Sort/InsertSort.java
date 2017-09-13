package sort;

/**
 * @ClassName: InsertSort
 * @date 2017年9月11日 下午4:33:59
 * @author ToniR
 * @Description: 插入排序
 */
public class InsertSort {

	public void insertSort(Integer[] arr, Integer start, Integer end) {
		Integer temp = null;
		Integer j = null;
		for (int i = start + 1; i < end; i++) {
			temp = arr[i];
			j = i;
			while (j > start && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
			slog(arr);
		}
	}

	public void slog(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] arr = { 50, 23, 45, 123, 34, 12, 32 };
		InsertSort is = new InsertSort();
		is.insertSort(arr, 0, arr.length);
	}

}
