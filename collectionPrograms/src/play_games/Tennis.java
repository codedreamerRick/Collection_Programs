package play_games;

public class Tennis implements Ball 
{
	private String game;
	Tennis(String game)
	{
		this.game = game;
	}
	public String getGame()
	{
		return game;
	}
	public void rulesToPlay()
	{
		System.out.println("1. Only two players are allowed...!!!");
	}
}
