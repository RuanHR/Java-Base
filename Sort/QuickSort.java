package sort;

/**
 * @ClassName: QuickSort
 * @date 2017年9月11日 下午4:34:25
 * @author ToniR
 * @Description: 快速排序
 */
public class QuickSort {

	/**
	 * @author ToniR
	 * @since 2017年9月11日 下午2:29:16
	 * @title quickSort
	 * @description 快排实现方法
	 * @return void
	 */
	public void quickSort(Integer[] arr, Integer start, Integer end) {
		if (start >= end) {
			return;
		}
		// 定义开始结束
		Integer i = start, j = end;
		// 设置flag，判断排前，后
		Boolean flag = true;
		// 初始值定义
		Integer value = arr[i];
		while (i != j) {
			if (flag) {
				// 数据和最后的数判断
				if (value > arr[j]) {
					swap(arr, i, j);
					flag = false;
				} else {
					j--;
				}
			} else {
				// 数据和前判断
				if (value < arr[i]) {
					swap(arr, i, j);
					flag = true;
				} else {
					i++;
				}
			}
		}
		slog(arr);
		quickSort(arr, start, j - 1);
		quickSort(arr, i + 1, end);
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
		Integer[] arr = { 25, 12, 3, 5, 88 };
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, arr.length - 1);
	}

}
