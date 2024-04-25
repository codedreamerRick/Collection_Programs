package play_games;

public class Football implements Ball 
{
	private String game;
	Football(String game)
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
	}
}
