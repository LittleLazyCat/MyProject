public class SimpleDotCom
{
	int[] locationCells;
	int numOfHits;
	public void setLocationCells(int[] locs)
	{
		locationCells = locs;
	}
	public String checkYourself(String stringGuess)
	{
		String result = "miss";
		int guess = Integer.parseInt(stringGuess);
		for(int cell : locationCells)
		{
			if(guess == cell)
			{
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits == locationCells.length)
		{
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}
