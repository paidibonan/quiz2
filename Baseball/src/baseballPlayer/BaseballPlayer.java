
package baseballPlayer;

import java.util.Scanner;


public class BaseballPlayer {
	
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private int atBats;
	private int hits;
	private int doubles;
	private int triples;
	private int homeRuns;
	private int runs;
	private int walks;
	
	public BaseballPlayer(String name, int AB, int H, int D, int T, int HR, int R, int W) {
		this.name = sc.next();
		this.atBats = sc.nextInt();
		this.hits = sc.nextInt();
		this.doubles = sc.nextInt();
		this.triples = sc.nextInt();
		this.homeRuns = sc.nextInt();
		this.runs = sc.nextInt();
		this.walks = sc.nextInt();
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
	
	public string Stats() {
		System.out.print("Name: " + name);
		System.out.print("Batting Average " + battingAverage());
		System.out.print("On base percentage: " + onBasePercentage());
		System.out.print("Total Bases: " + totalBases());
		System.out.print("Slugging Percentage: " + sluggingPercentage());
		System.out.print("On base + Slugging Percentage: " + obs());
	}



}
