package sort;

/**
 * @ClassName: BubbleSort
 * @date 2017年9月11日 下午4:34:39
 * @author ToniR
 * @Description: 冒泡排序
 */
public class BubbleSort {

	public void bubbleSort(Integer[] arr, Integer start, Integer end) {
		int count = 0;
		for (int i = start; i < end; i++) {
			for (int j = 1; j < end - i; j++) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				}
				count++;
			}
			slog(arr);
		}
		System.out.println(count);
	}

	/**
	 * @author ToniR
	 * @since 2017年9月11日 下午2:28:58
	 * @title swap
	 * @description 交换两数
	 * @return void
	 */
	public void swap(Integer[] arr, Integer i, Integer j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[j] ^ arr[i];
		arr[i] = arr[i] ^ arr[j];
	}

	public void slog(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] arr = { 50, 23, 45, 123, 34, 12, 32 };
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr, 0, arr.length);
	}
}
