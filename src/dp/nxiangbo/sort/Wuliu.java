package dp.nxiangbo.sort;

public class Wuliu implements Comparable{
	private long time;
	private String info;
	
	public Wuliu(long time, String info) {
		super();
		this.time = time;
		this.info = info;
	}
	
	
	@Override
	public String toString() {
		return "Wuliu [time=" + time + ", info=" + info + "]";
	}


	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	

	@Override
	public int compareTo(Object o) {
		return (int) (this.time-((Wuliu)o).getTime());
	}
}
