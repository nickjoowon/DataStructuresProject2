package cs146F19.Swanson.project2;

public class MaxSubarray  {
	
	public int profit;
	public int arrive;
	public int depart;
	
	//for the purpose of returning all three values as an object
	public MaxSubarray(int profit, int arrive, int depart) {
		this.profit = profit;
		this.arrive = arrive;
		this.depart = depart;
	}
	
	//creating get methods for each values
	public int getProfit() {
		return profit;
	}
	
	public int getArrive() {
		return arrive;
	}
	
	public int getDepart() {
		return depart;
	}
	
}
