package play_games;

public class Cricket implements Ball
{
	private String game;
	Cricket(String game)
	{
		this.game = game;
	}
	public String getGame()
	{
		return game;
	}
	public void rulesToPlay()
	{
		System.out.println("1. Only 11 players are allowed...!!!");
		System.out.println("2. Every team should have their own bat & ball");
	}
}
