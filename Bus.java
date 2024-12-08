package busreservation;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;	
	Bus (int busNo,boolean ac,int capacity){
		this.busNo = busNo;
		this.ac = ac;
		this.capacity=capacity;
	}
	public int getBusno(){
		return busNo;
	}
	public boolean getAc() {
		return ac;
	}
	public int getcapacity() {
		return capacity;
	}
	public void setAc(boolean ac) {
		this.ac=ac;
	}
	public void setcapacity(int capacity) {
		this.capacity=capacity;
	}
	
}
