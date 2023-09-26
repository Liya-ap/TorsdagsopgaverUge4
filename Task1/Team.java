import java.util.ArrayList;

//1.b
public class Team {
	//1.c
	private String name = "";
	//1.d
	private int rank = 0;
	//1.e
	private ArrayList<String> players = new ArrayList<String>();

	//1.f
	public Team(String name) {
		this.name = name;
	}

	//1.h
	public void setRank(int rank) {
		this.rank = rank;
	}

	//1.j
	public String toString() {
		return "Hold: " + name + ". Rang: " + rank;
	}
}