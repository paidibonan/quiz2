package baseballPlayer;


public class BaseballPlayer {
	
	private String name;
	private int atBats;
	private int hits;
	private int doubles;
	private int triples;
	private int homeRuns;
	private int runs;
	private int walks;
	
	public BaseballPlayer(String name, int AB, int H, int D, int T, int HR, int R, int W) {
		this.name = name;
		this.atBats = AB;
		this.hits = H;
		this.doubles = D;
		this.triples = T;
		this.homeRuns = HR;
		this.runs = R;
		this.walks = W;
	}
	
	public double battingAverage() {
		return this.hits / this.atBats;
	}
	
	public double onBasePercentage() {
		return (this.hits + this.walks) / 
				(this.atBats + this.walks);
	}
	
	public double totalBases() {
		int b1 = (this.doubles + this.triples + this.homeRuns) - this.hits;
		return b1 + 2 * this.doubles + 3 * this.triples + 4 * this.homeRuns;
	}
	
	public double sluggingPercentage() {
		return  this.totalBases() / this.atBats;
	}
	
	public double obs() {
		return this.onBasePercentage() + this.sluggingPercentage();
	}



}
