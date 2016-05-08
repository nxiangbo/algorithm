package dp.nxiangbo.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeSort {
	public static <T extends Comparable> boolean mergeSortNonRecursive(T[] t) {
		if (t == null || t.length <= 1)
			return true;

		int len = 1;
		// 处理程序边界
		while (len <= t.length) {
			for (int i = 0; i + len <= t.length - 1; i += len * 2) {
				int low = i, mid = i + len - 1, high = i + len * 2 - 1;
				if (high > t.length - 1)
					high = t.length - 1;
				merge(t, i, mid, high);
			}

			len *= 2;
		}
		return true;
	}

	//归并
	private static <T extends Comparable> boolean merge(T[] t, int low,
			int mid, int high) {
		T[] s = t.clone();// 复制一个辅助数组

		int i, j, k;// 三个指示器，i指示t[low...mid]，j指示t[mid+1...high]，k指示s[low...high]
		for (i = low, j = mid + 1, k = low; i <= mid && j <= high; k++) {
			if (t[i].compareTo(t[j]) <= 0) {
				s[k] = t[i++];
			} else {
				s[k] = t[j++];
			}
		}

		// 将剩下的元素复制到s中
		if (i <= mid) {
			for (; k <= high; k++) {
				s[k] = t[i++];
			}
		} else {
			for (; k <= high; k++) {
				s[k] = s[j++];
			}
		}
		for (int m = low; m <= high; m++) {
			t[m] = s[m];
		}

		return true;
	}
	
	
	
	//测试代码
	public static void main(String[] args) {
		Wuliu[] wulius = new Wuliu[] {new Wuliu(12323L, "南京"),new Wuliu(1232932L, "武汉")
		,new Wuliu(12L, "武汉"),new Wuliu(8232932L, "南京"),new Wuliu(94349332,"上海")};
		mergeSortNonRecursive(wulius);
		ArrayList<String> infos = new ArrayList<>();
		//去重
		for (Wuliu wuliu : wulius) {
			if(!infos.contains(wuliu.getInfo())){
				infos.add(wuliu.getInfo());
				System.out.println(wuliu);
			}
		}
		
	}
}
