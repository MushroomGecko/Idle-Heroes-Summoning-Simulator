import java.util.Scanner;

public class IHSummonSim {

	private static String transHero = "";
	private static String transHeroLD = "";
	
	public static void main(String[] args) {
		HeroSummon mySum = new HeroSummon();
		
		if(!mySum.checkLengths())
		{
			
		}
		else
		{
			Scanner scan = new Scanner(System.in);
			int validate = 1;
			while(validate != 0)
			{
				options();
				validate = getInput(scan);
				int upperInput = 7;
				
				if(validate == -1 || validate == -2)
				{
					System.out.println("Please enter in a number");
				}
				else if(validate >= 1 && validate <= upperInput)
				{
					if(validate == 1)
					{
						basicSummon(scan, mySum);
					}
					else if(validate == 2)
					{
						friendshipSummon(scan, mySum);
					}
					else if(validate == 3)
					{
						heroicSummon(scan, mySum);
					}
					else if(validate == 4)
					{
						heroicSummonEvent(scan, mySum);
					}
					else if(validate == 5)
					{
						prophetSummon(scan, mySum);
					}
					else if(validate == 6)
					{
						shardSummon(scan, mySum);
					}
					else if(validate == upperInput)
					{
						compassOfTranscendence(scan, mySum);
					}
				}
				else if(validate < 0 || validate > upperInput)
				{
					System.out.println("Number out of range");
				}
			}
			System.out.println("Exiting");
			scan.close();
		}
	}
	
	public static void options()
	{
		System.out.println("1. Basic Summon");
		System.out.println("2. Friendship Summon");
		System.out.println("3. Heroic Summon");
		System.out.println("4. Event Heroic Summon (Mockman)");
		System.out.println("5. Prophet Tree");
		System.out.println("6. Shard Summon");
		System.out.println("7. Compass of Transcended");
		System.out.println("0. Exit");
	}
	
	public static int getInput(Scanner scan)
	{
		String usrStr = scan.nextLine();
		int returnVal;
		
		if(usrStr.isEmpty())
		{
			returnVal = -1;
		}
		else
		{
			try 
			{ 
				returnVal = Integer.parseInt(usrStr);
			}  
			catch (NumberFormatException e)  
			{ 
				returnVal = -2;
			}
		}
		return returnVal;
	}
	
	public static void basicSummon(Scanner scan, HeroSummon mySum)
	{
		System.out.println("How many basic summons?");
		
		int num = 1;
		int prevNum = 10;
		
		while(num != 0)
		{
			num = getInput(scan);
			if(num == -1)
			{
				mySum.basicSummon(prevNum);
			}
			else if(num == -2  || num < 0)
			{
				System.out.println("Please enter in a valid number");
			}
			else if(num != 0)
			{
				mySum.basicSummon(num);
				prevNum = num;
			}
		}
	}
	
	public static void friendshipSummon(Scanner scan, HeroSummon mySum)
	{
		System.out.println("How many friendship summons?");
		
		int num = 1;
		int prevNum = 10;
		
		while(num != 0)
		{
			num = getInput(scan);
			if(num == -1)
			{
				mySum.friendshipSummon(prevNum);
			}
			else if(num == -2  || num < 0)
			{
				System.out.println("Please enter in a valid number");
			}
			else if(num != 0)
			{
				mySum.friendshipSummon(num);
				prevNum = num;
			}
		}
	}
	
	public static void heroicSummon(Scanner scan, HeroSummon mySum)
	{
		System.out.println("How many heroic summons?");
		
		int num = 1;
		int prevNum = 10;
		
		while(num != 0)
		{
			num = getInput(scan);
			if(num == -1)
			{
				mySum.heroicSummon(prevNum);
			}
			else if(num == -2  || num < 0)
			{
				System.out.println("Please enter in a valid number");
			}
			else if(num != 0)
			{
				mySum.heroicSummon(num);
				prevNum = num;
			}
		}
	}
	
	public static void heroicSummonEvent(Scanner scan, HeroSummon mySum)
	{
		System.out.println("How many heroic summons?");
		
		int num = 1;
		int prevNum = 10;
		
		while(num != 0)
		{
			num = getInput(scan);
			if(num == -1)
			{
				mySum.heroicSummonEvent(prevNum);
			}
			else if(num == -2  || num < 0)
			{
				System.out.println("Please enter in a valid number");
			}
			else if(num != 0)
			{
				mySum.heroicSummonEvent(num);
				prevNum = num;
			}
		}
	}
	
	public static void prophetSummon(Scanner scan, HeroSummon mySum)
	{
		int validate = 1;
		while(validate != 0)
		{
			System.out.println("What tree branch would you like to summon from?");
			System.out.println("1. Forest");
			System.out.println("2. Abyss");
			System.out.println("3. Fortress");
			System.out.println("4. Shadow");
			System.out.println("5. Light/Dark");
			System.out.println("0. Back");
			
			validate = getInput(scan);
			
			if(validate == -1 || validate == -2)
			{
				System.out.println("Please enter in a number");
			}
			else if(validate >= 1 && validate <= 5)
			{
				if(validate == 1)
				{
					System.out.println("How many Forest prophet summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.prophetSummonFst(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.prophetSummonFst(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 2)
				{
					System.out.println("How many Abyss prophet summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.prophetSummonAby(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.prophetSummonAby(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 3)
				{
					System.out.println("How many Fortress prophet summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.prophetSummonFrt(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.prophetSummonFrt(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 4)
				{
					System.out.println("How many Shadow prophet summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.prophetSummonShd(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.prophetSummonShd(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 5)
				{
					System.out.println("How many Light/Dark prophet summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.prophetSummonLD(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.prophetSummonLD(num);
							prevNum = num;
						}
					}
				}
			}
			else if(validate < 0 || validate > 5)
			{
				System.out.println("Number out of range");
			}
		}
	}
	
	public static void shardSummon(Scanner scan, HeroSummon mySum)
	{
		int validate = 1;
		while(validate != 0)
		{
			System.out.println("What tree branch would you like to summon from?");
			System.out.println("1. Three Star Shards");
			
			System.out.println();
			System.out.println("2. Four Star Shards");
			System.out.println("3. Four Star Shards Forest");
			System.out.println("4. Four Star Shards Abyss");
			System.out.println("5. Four Star Shards Fortress");
			System.out.println("6. Four Star Shards Shadow");
			System.out.println("7. Four Star Shards Light");
			System.out.println("8. Four Star Shards Dark");
			
			System.out.println();
			System.out.println("9. Five Star Shards");
			System.out.println("10. Five Star Shards Forest");
			System.out.println("11. Five Star Shards Abyss");
			System.out.println("12. Five Star Shards Fortress");
			System.out.println("13. Five Star Shards Shadow");
			System.out.println("14. Five Star Shards Light");
			System.out.println("15. Five Star Shards Dark");
			
			System.out.println();
			System.out.println("16. Elite Five Star Shards");
			System.out.println("17. Elite Five Star Shards Light");
			System.out.println("18. Elite Five Star Shards Dark");
			
			System.out.println();
			System.out.println("0. Exit");
			
			validate = getInput(scan);
			
			int limit = 18;
			if(validate == -1 || validate == -2)
			{
				System.out.println("Please enter in a number");
			}
			else if(validate >= 1 && validate <= limit)
			{
				if(validate == 1)
				{
					System.out.println("How many three star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.threeStarShardSummon(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.threeStarShardSummon(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 2)
				{
					System.out.println("How many four star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fourStarShardSummon(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fourStarShardSummon(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 3)
				{
					System.out.println("How many forest four star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fourStarShardSummonFst(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fourStarShardSummonFst(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 4)
				{
					System.out.println("How many abyss four star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fourStarShardSummonAby(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fourStarShardSummonAby(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 5)
				{
					System.out.println("How many fortress four star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fourStarShardSummonFrt(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fourStarShardSummonFrt(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 6)
				{
					System.out.println("How many shadow four star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fourStarShardSummonShd(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fourStarShardSummonShd(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 7)
				{
					System.out.println("How many light four star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fourStarShardSummonL(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fourStarShardSummonL(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 8)
				{
					System.out.println("How many dark four star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fourStarShardSummonD(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fourStarShardSummonD(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 9)
				{
					System.out.println("How many five star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fiveStarShardSummon(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fiveStarShardSummon(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 10)
				{
					System.out.println("How many forest five star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fiveStarShardSummonFst(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fiveStarShardSummonFst(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 11)
				{
					System.out.println("How many abyss five star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fiveStarShardSummonAby(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fiveStarShardSummonAby(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 12)
				{
					System.out.println("How many fortress five star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fiveStarShardSummonFrt(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fiveStarShardSummonFrt(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 13)
				{
					System.out.println("How many shadow five star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fiveStarShardSummonShd(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fiveStarShardSummonShd(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 14)
				{
					System.out.println("How many light five star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fiveStarShardSummonL(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fiveStarShardSummonL(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 15)
				{
					System.out.println("How many dark five star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fiveStarShardSummonD(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fiveStarShardSummonD(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 16)
				{
					System.out.println("How many elite five star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fiveStarEliteShardSummon(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fiveStarEliteShardSummon(num);
							prevNum = num;
						}
					}
				}
				else if(validate == 17)
				{
					System.out.println("How many elite light five star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fiveStarEliteShardSummonL(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fiveStarEliteShardSummonL(num);
							prevNum = num;
						}
					}
				}
				else if(validate == limit)
				{
					System.out.println("How many elite dark five star shard summons?");
					
					int num = 1;
					int prevNum = 10;
					
					while(num != 0)
					{
						num = getInput(scan);
						if(num == -1)
						{
							mySum.fiveStarEliteShardSummonD(prevNum);
						}
						else if(num == -2  || num < 0)
						{
							System.out.println("Please enter in a valid number");
						}
						else if(num != 0)
						{
							mySum.fiveStarEliteShardSummonD(num);
							prevNum = num;
						}
					}
				}
				
			}
			else if(validate < 0 || validate > limit)
			{
				System.out.println("Number out of range");
			}
		}
	}
	
	public static void generateCompassHero(Scanner scan, HeroSummon mySum)
	{
		String hero1 = "";
		String hero2 = "";
		String hero3 = "";
		int increment = 1;
		int count = 1;
		int indexStart = mySum.findIndex("Vesa", 5);
		int indexEnd = mySum.findIndex("Annabelle", 5);
		for(int i = indexStart; i <= indexEnd; i++)
		{
			if(count == 4)
			{
				System.out.printf("%-40s%-40s%-40s\n", hero1, hero2, hero3);
				
				count = 1;
				hero1 = "";
				hero2 = "";
				hero3 = "";
			}
			
			if(count == 1)
			{
				hero1 = increment + ". " + mySum.getHeroes()[i];
			}
			else if(count == 2)
			{
				hero2 = increment + ". " + mySum.getHeroes()[i];
			}
			else if(count == 3)
			{
				hero3 = increment + ". " + mySum.getHeroes()[i];
			}
			count++;
			increment++;
			if(i == indexEnd)
			{
				System.out.printf("%-40s%-40s%-40s\n", hero1, hero2, hero3);
			}
		}
		
		System.out.println("Pick a hero");
		int validate = 0;
		while(validate < 1 || validate >= increment)
		{
			validate = getInput(scan);
			if(validate == -1 || validate == -2)
			{
				System.out.println("Please enter in a number");
			}
			else if(validate >= 1 && validate < increment)
			{
				transHero = mySum.getHeroes()[indexStart-1 + validate];
			}
			else if(validate <= 0 || validate >= increment)
			{
				System.out.println("Number out of range");
			}
		}
	}
	
	public static void generateCompassHeroLD(Scanner scan, HeroSummon mySum)
	{
		String hero1 = "";
		String hero2 = "";
		String hero3 = "";
		int increment = 1;
		int count = 1;
		int indexStart = mySum.findIndex("Faith Blade", 5);
		int indexEnd = mySum.findIndex("Phorcys", 5);
		for(int i = indexStart; i <= indexEnd; i++)
		{
			if(count == 4)
			{
				System.out.printf("%-40s%-40s%-40s\n", hero1, hero2, hero3);
				
				count = 1;
				hero1 = "";
				hero2 = "";
				hero3 = "";
			}
			
			if(count == 1)
			{
				hero1 = increment + ". " + mySum.getHeroes()[i];
			}
			else if(count == 2)
			{
				hero2 = increment + ". " + mySum.getHeroes()[i];
			}
			else if(count == 3)
			{
				hero3 = increment + ". " + mySum.getHeroes()[i];
			}
			count++;
			increment++;
			if(i == indexEnd)
			{
				System.out.printf("%-40s%-40s%-40s\n", hero1, hero2, hero3);
			}
		}
		
		System.out.println("Pick a hero");
		int validate = 0;
		while(validate < 1 || validate >= increment)
		{
			validate = getInput(scan);
			if(validate == -1 || validate == -2)
			{
				System.out.println("Please enter in a number");
			}
			else if(validate >= 1 && validate < increment)
			{
				transHeroLD = mySum.getHeroes()[indexStart-1 + validate];
			}
			else if(validate <= 0 || validate >= increment)
			{
				System.out.println("Number out of range");
			}
		}
	}
	
	public static void compassGuidance(Scanner scan, HeroSummon mySum)
	{	
		System.out.println("Looking for Non-LD hero: " + transHero);
		System.out.println("Looking for LD hero: " + transHeroLD);
		
		System.out.println("How many compass summons?");
		String hero = transHero;
		String heroLD = transHeroLD;
		
		int num = 1;
		int prevNum = 10;
		
		while(num != 0)
		{
			num = getInput(scan);
			if(num == -1)
			{
				mySum.compassOfTranscendedGuidance(prevNum, hero, heroLD);
			}
			else if(num == -2  || num < 0)
			{
				System.out.println("Please enter in a valid number");
			}
			else if(num != 0)
			{
				mySum.compassOfTranscendedGuidance(num, hero, heroLD);
				prevNum = num;
			}
		}
	}
	
	public static void compassFate(Scanner scan, HeroSummon mySum)
	{	
		System.out.println("Looking for Non-LD hero: " + transHero);
		System.out.println("Looking for LD hero: " + transHeroLD);
		System.out.println("How many compass summons?");
		String hero = transHero;
		String heroLD = transHeroLD;
		
		
		int num = 1;
		int prevNum = 10;
		
		while(num != 0)
		{
			num = getInput(scan);
			if(num == -1)
			{
				mySum.compassOfTranscendedFate(prevNum, hero, heroLD);
			}
			else if(num == -2  || num < 0)
			{
				System.out.println("Please enter in a valid number");
			}
			else if(num != 0)
			{
				mySum.compassOfTranscendedFate(num, hero, heroLD);
				prevNum = num;
			}
		}
	}
	
	public static void compassOfTranscendence(Scanner scan, HeroSummon mySum)
	{
		if(transHero.isEmpty())
		{
			generateCompassHero(scan, mySum);
		}
		if(transHeroLD.isEmpty())
		{
			generateCompassHeroLD(scan, mySum);
		}
		
		int validate = 1;
		while(validate != 0)
		{
			System.out.println("What would you like to do?");
			System.out.println("1. Compass of Transcendence Fate");
			System.out.println("2. Compass of Transcendence Guidance");
			System.out.println("3. Change Non-LD Hero");
			System.out.println("4. Change LD Hero");
			System.out.println("0. Back");
			
			validate = getInput(scan);
			
			if(validate == -1 || validate == -2)
			{
				System.out.println("Please enter in a number");
			}
			else if(validate >= 1 && validate <= 4)
			{
				if(validate == 1)
				{
					compassFate(scan, mySum);
				}
				else if(validate == 2)
				{
					compassGuidance(scan, mySum);
				}
				else if(validate == 3)
				{
					generateCompassHero(scan, mySum);
				}
				else if(validate == 4)
				{
					generateCompassHeroLD(scan, mySum);
				}
			}
			else if(validate < 0 || validate > 4)
			{
				System.out.println("Number out of range");
			}
		}
	}

}


