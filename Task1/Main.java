//1.a
public class Main {

	public static void main(String[] args) {
		//1.g
		Team t1 = new Team("De Uovervindelige");
		//1.i
		t1.setRank(3);

		//1.k
		Team t2 = new Team("Kaffe Pause");
		t2.setRank(6);
		Team t3 = new Team("MVP'er");
		t3.setRank(2);
		Team t4 = new Team("Google-eksperter");
		t4.setRank(1);
		Team t5 = new Team("Ubeslutsom");
		t5.setRank(5);
		Team t6 = new Team("Space Boys");
		t6.setRank(4);

		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println(t4.toString());
		System.out.println(t5.toString());
		System.out.println(t6.toString());
	}
}