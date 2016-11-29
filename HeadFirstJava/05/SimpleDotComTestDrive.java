public class SimpleDotComTestDrive 
{
	public static void main(String[] args) 
	{
		SimpleDotCom dot = new SimpleDotCom();
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		int randomNum = (int)(Math.random()*5);
		int[] locations = {randomNum,randomNum+1,randomNum+2};
		dot.setLocationCells(locations);
		boolean isAlive = true;
		while(isAlive == true)
		{
			String userGuess = helper.getUserInput("enter a number");
			String result = dot.checkYourself(userGuess);
			numOfGuesses++;
			if(result.equals("kill"))
			{
				isAlive = false;
				System.out.println("You took " + numOfGuesses+ " guesses");
			}
		}
		
		
	}
}

