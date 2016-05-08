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
		// �������߽�
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

	//�鲢
	private static <T extends Comparable> boolean merge(T[] t, int low,
			int mid, int high) {
		T[] s = t.clone();// ����һ����������

		int i, j, k;// ����ָʾ����iָʾt[low...mid]��jָʾt[mid+1...high]��kָʾs[low...high]
		for (i = low, j = mid + 1, k = low; i <= mid && j <= high; k++) {
			if (t[i].compareTo(t[j]) <= 0) {
				s[k] = t[i++];
			} else {
				s[k] = t[j++];
			}
		}

		// ��ʣ�µ�Ԫ�ظ��Ƶ�s��
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
	
	
	
	//���Դ���
	public static void main(String[] args) {
		Wuliu[] wulius = new Wuliu[] {new Wuliu(12323L, "�Ͼ�"),new Wuliu(1232932L, "�人")
		,new Wuliu(12L, "�人"),new Wuliu(8232932L, "�Ͼ�"),new Wuliu(94349332,"�Ϻ�")};
		mergeSortNonRecursive(wulius);
		ArrayList<String> infos = new ArrayList<>();
		//ȥ��
		for (Wuliu wuliu : wulius) {
			if(!infos.contains(wuliu.getInfo())){
				infos.add(wuliu.getInfo());
				System.out.println(wuliu);
			}
		}
		
	}
}
