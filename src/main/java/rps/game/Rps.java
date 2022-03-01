package rps.game;

public enum Rps {
	
	ROCK {
		@Override
		public Result beats(Rps opponent) {
			if (opponent == this)
				return Result.DRAW;
			else if (opponent == SCISSORS)
				return Result.WIN;
			else if (opponent == PAPER)
				return Result.LOSE;
			else
				return null;
		}
	},
	PAPER {
		@Override
		public Result beats(Rps opponent) {
			if (opponent == this)
				return Result.DRAW;
			else if (opponent == ROCK)
				return Result.WIN;
			else if (opponent == SCISSORS)
				return Result.LOSE;
			else
				return null;
		}
	},
	SCISSORS {
		@Override
		public Result beats(Rps opponent) {
			if (opponent == this)
				return Result.DRAW;
			else if (opponent == PAPER)
				return Result.WIN;
			else if (opponent == ROCK)
				return Result.LOSE;
			else
				return null;
		}
	};

	public abstract Result beats(Rps opponent);
	
}
