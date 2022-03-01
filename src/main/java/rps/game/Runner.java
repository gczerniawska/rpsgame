package rps.game;

public class Runner {

		public static void main(String[] args) {
			App rpss = new App();
			for (int i = 0; i < 100; i++)
				System.out.println(rpss.play(Rps.ROCK));

		}

}
