import java.util.Arrays;

public class HeroSummon {
	
	private double oneStar;
	
	private double twoStar;
	
	private double threeStar;
	
	private double threeStarLD;
	
	private double fourStarFst;
	private double fourStarFrt;
	private double fourStarAby;
	private double fourStarShd;
	
	private double fourStarL;
	private double fourStarD;
	
	private double fourStarShards;
	
	private double fourStarShardsL;
	
	private double fourStarShardsD;
	
	private double unNatfiveStarFst;
	private double unNatfiveStarFrt;
	private double unNatfiveStarAby;
	private double unNatfiveStarShd;
	
	private double unNatfiveStarL;
	private double unNatfiveStarD;
	
	private double fiveStarFst;
	private double fiveStarFrt;
	private double fiveStarAby;
	private double fiveStarShd;
	
	private double fiveStarL;
	private double fiveStarD;
	
	private double fiveStarEliteFst;
	private double fiveStarEliteFrt;
	private double fiveStarEliteAby;
	private double fiveStarEliteShd;
	
	private double fiveStarEliteL;
	private double fiveStarEliteD;
	
	private double fiveStarShards;
	
	private double eventHeroRate;
	
	private double CoTRate;
	
	private double overallOneStar;
	private double overallTwoStar;
	private double overallThreeStar;
	private double overallThreeStarLD;
	private double overallFourStar;
	private double overallFourStarLD;
	private double overallUnNatFiveStar;
	private double overallUnNatFiveStarLD;
	private double overallFiveStar;
	private double overallFiveStarLD;
	private double overallFiveStarElite;
	private double overallFiveStarEliteLD;
	private double overallCoTRate;
	
	private int HSEventTotalDraws;
	private int compassTotalDraws;
	private double compassHeroRate;
	private double compassHeroLDRate;
	private double resetCompassHeroRate;
	private double resetCompassHeroLDRate;
	
	
	public HeroSummon()
	{
		oneStar = 0;
		
		twoStar = 0;
		
		threeStar = 0;
		
		threeStarLD = 0;
		
		fourStarFst = 0;
		fourStarFrt = 0;
		fourStarAby = 0;
		fourStarShd = 0;
		
		fourStarL = 0;
		fourStarD = 0;
		
		fourStarShards = 0;
		
		fourStarShardsL = 0;
		
		fourStarShardsD = 0;
		
		unNatfiveStarFst = 0;
		unNatfiveStarFrt = 0;
		unNatfiveStarAby = 0;
		unNatfiveStarShd = 0;
		
		unNatfiveStarL = 0;
		unNatfiveStarD = 0;
		
		fiveStarFst = 0;
		fiveStarFrt = 0;
		fiveStarAby = 0;
		fiveStarShd = 0;
		
		fiveStarL = 0;
		fiveStarD = 0;
		
		fiveStarEliteFst = 0;
		fiveStarEliteFrt = 0;
		fiveStarEliteAby = 0;
		fiveStarEliteShd = 0;
		
		fiveStarEliteL = 0;
		fiveStarEliteD = 0;
		
		fiveStarShards = 0;
		
		eventHeroRate = 0;
		
		CoTRate = 0;
		compassHeroRate = 1;
		compassHeroLDRate = 0.25;	
		resetCompassHeroRate = 1;
		resetCompassHeroLDRate = 0.25;
		
		HSEventTotalDraws = 0;
		compassTotalDraws = 0;
	}
	
	
	
	private static final String heroes[] =
	{
		"Bella- 1*", "Scout- 1*", "Sailor- 1*",
		"Imp- 1*", "Son of Flame- 1*", "Lava Beetle- 1*",
		"Honest Man- 1*", "Woodcutter- 1*", "Old Miner- 1*",
		"Foolish- 1*", "Dark Christian- 1*", "Luminous Body- 1*",
		
		"Lavine- 2*", "Dryad- 2*", "Blue Warrior- 2*", "Ent- 2*",
		"Golden Horn- 2*", "Silver Horn- 2*", "Johnson- 2*", "Blackstone- 2*",
		"The Gray- 2*", "Tower Guard- 2*", "Dungeon Guard- 2*", "ZH-07- 2*",
		"Charlotte- 2*", "Markina- 2*", "Bone Archer- 2*", "Bone Warrior- 2*",
			
		"Sybil- 3*", "Undomiel- 3*", "Blue Shaman- 3*", "Frey- 3*", "Forest Captain- 3*",
        "Abyss Guard- 3*", "Wild Beast- 3*", "Succube- 3*", "Flaming Lips- 3*", "Mirko- 3*",
        "Reggie- 3*", "Carver- 3*", "Tara's Servant- 3*", "Fire Fist- 3*", "MK-05- 3*",
        "Chain Hammer- 3*", "Poison Tongue- 3*", "Shirley- 3*", "Dark Priest- 3*", "Ice Troll- 3*",

        "Holy Kid- 3*",
        "Ghost of Aspen- 3*",

        "Wind Walker- 4*", "Chief- 4*", "Ent Elder- 4*", "Headstriker- 4*", "Thale- 4*", "Kargath- 4*", "The Grey-eyed- 4*", "Zekkis- 4*",
        "Rogge- 4*", "Destroyer- 4*", "Tanner- 4*", "Akasha- 4*", "Lemegeton- 4*", "Aleria- 4*", "Norma- 4*", "Immolatus- 4*",
        "Time Mage- 4*", "Storm Hudde- 4*", "Roy- 4*", "Sierra- 4*", "Liquor- 4*", "LM-02- 4*", "Iron Bambi- 4*", "Kristian- 4*",
        "Grumpy Corpse- 4*", "Gbagbo- 4*", "Bonecarver- 4*", "Glen- 4*", "Nightmare Knight- 4*", "Bone General- 4*", "Lamb- 4*", "Deathsworn- 4*",

        "Divine Spirit- 4*", "Fegan- 4*", "Disciple- 4*",
        "Dark Spirit- 4*", "Logan- 4*", "Darkness Fanella- 4*",

        "4 Star Shards",

        "Light 4 Star Shards",

        "Dark 4 Star Shards",

        "Wind Walker- 5*", "Chief- 5*", "Ent Elder- 5*", "Headstriker- 5*", "Thale- 5*", "Kargath- 5*", "The Grey-eyed- 5*", "Zekkis- 5*",
        "Rogge- 5*", "Destroyer- 5*", "Tanner- 5*", "Akasha- 5*", "Lemegeton- 5*", "Aleria- 5*", "Norma- 5*", "Immolatus- 5*",
        "Time Mage- 5*", "Storm Hudde- 5*", "Roy- 5*", "Sierra- 5*", "Liquor- 5*", "LM-02- 5*", "Iron Bambi- 5*", "Kristian- 5*",
        "Grumpy Corpse- 5*", "Gbagbo- 5*", "Bonecarver- 5*", "Glen- 5*", "Nightmare Knight- 5*", "Bone General- 5*", "Lamb- 5*", "Deathsworn- 5*",

        "Divine Spirit- 5*", "Fegan- 5*", "Disciple- 5*",
        "Dark Spirit- 5*", "Logan- 5*", "Darkness Fanella- 5*",

        "Eddga- 5*", "Faceless- 5*", "Dragon Slayer- 5*", "Malassa- 5*", "Groo- 5*", "Demon Hunter- 5*", "Rosa- 5*",
        "Gusta- 5*", "Lord Balrog- 5*", "Fat Mu- 5*", "Margaret- 5*", "Queen- 5*", "Karim- 5*", "Dantalian- 5*", "Barea- 5*",
        "Flame Strike- 5*", "Bleeker- 5*", "Honor Guard- 5*", "Mirage- 5*", "OD-01- 5*", "Iceblink- 5*", "Miki- 5*", "Emily- 5*",
        "Dominator- 5*", "Field- 5*", "Lutz- 5*", "Kharma- 5*", "Walter- 5*", "Baade- 5*", "Blood Blade- 5*",

        "Vesa- 5*", "Starlight- 5*", "Heart Watcher- 5*", "Valkyrie- 5*", "Oberon- 5*", "Garuda- 5*", "Elyvia- 5*", "Rogan- 5*", "Flora- 5*", "Gloria- 5*", "Xiahao- 5*", "Freya- 5*",
        "Skerei- 5*", "King Barton- 5*", "Kroos- 5*", "Cthugha- 5*", "Nakia- 5*", "Delacium- 5*", "Ignis- 5*", "Morax- 5*", "Waldek- 5*", "Natasha- 5*",
        "Ormus- 5*", "Sigmund- 5*", "Xia- 5*", "Valentino- 5*", "Penny- 5*", "UniMax-3000- 5*", "Sherlock- 5*", "Inosuke- 5*", "Fiona- 5*", "Saja- 5*", "Holmes Young- 5*",
        "Kamath- 5*", "Aidan- 5*", "Corpsedemon- 5*", "Jahra- 5*", "Horus- 5*", "Gustin- 5*", "Ithaqua- 5*", "Tix- 5*", "Eloise- 5*", "Onkirimaru- 5*", "Annabelle- 5*",

        "Michelle- 5*", "Asmodel- 5*", "Gerke- 5*",
        "Das Moge- 5*", "Sleepless- 5*", "Dark Arthindol- 5*",

        "Faith Blade- 5*", "Belrain- 5*", "Aida- 5*", "Tara- 5*", "Russell- 5*", "Trashilago- 5*", "Andrea- 5*", "Eos- 5*",
        "Amuvor- 5*", "Mihm- 5*", "Aspen- 5*", "Amen-Ra- 5*", "Carrie- 5*", "Drake- 5*", "Phorcys- 5*", 

        "5 Star Shards",
        
        "Mockman- 5*",
        
        "Core of Transcendence"
	};
	
	public String[] getHeroes()
	{
		return heroes;
	}
	

	
	public double[] getRates()
	{
		double pullRates[] =
		{
			oneStar, oneStar, oneStar,
			oneStar, oneStar, oneStar,
			oneStar, oneStar, oneStar,
			oneStar, oneStar, oneStar,
			
			twoStar, twoStar, twoStar, twoStar,
			twoStar, twoStar, twoStar, twoStar,
			twoStar, twoStar, twoStar, twoStar,
			twoStar, twoStar, twoStar, twoStar,
				
			threeStar, threeStar, threeStar, threeStar, threeStar,
		    threeStar, threeStar, threeStar, threeStar, threeStar,
		    threeStar, threeStar, threeStar, threeStar, threeStar,
		    threeStar, threeStar, threeStar, threeStar, threeStar,

		    threeStarLD,
		    threeStarLD,

		    fourStarFst, fourStarFst, fourStarFst, fourStarFst, fourStarFst, fourStarFst, fourStarFst, fourStarFst,
		    fourStarAby, fourStarAby, fourStarAby, fourStarAby, fourStarAby, fourStarAby, fourStarAby, fourStarAby, 
		    fourStarFrt, fourStarFrt, fourStarFrt, fourStarFrt, fourStarFrt, fourStarFrt, fourStarFrt, fourStarFrt, 
		    fourStarShd, fourStarShd, fourStarShd, fourStarShd, fourStarShd, fourStarShd, fourStarShd, fourStarShd, 

		    fourStarL, fourStarL, fourStarL,
		    fourStarD, fourStarD, fourStarD,

		    fourStarShards,

		    fourStarShardsL,

		    fourStarShardsD,

		    unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst, 
		    unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby, 
		    unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt, 
		    unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd, 
		    
		    unNatfiveStarL, unNatfiveStarL, unNatfiveStarL,
		    unNatfiveStarD, unNatfiveStarD, unNatfiveStarD,

		    fiveStarFst, fiveStarFst, fiveStarFst, fiveStarFst, fiveStarFst, fiveStarFst, fiveStarFst,
		    fiveStarAby, fiveStarAby, fiveStarAby, fiveStarAby, fiveStarAby, fiveStarAby, fiveStarAby, fiveStarAby,
		    fiveStarFrt, fiveStarFrt, fiveStarFrt, fiveStarFrt, fiveStarFrt, fiveStarFrt, fiveStarFrt, fiveStarFrt,
		    fiveStarShd, fiveStarShd, fiveStarShd, fiveStarShd, fiveStarShd, fiveStarShd, fiveStarShd,

		    fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst,
		    fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby,
		    fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt,
		    fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd,


		    fiveStarL, fiveStarL, fiveStarL,
		    fiveStarD, fiveStarD, fiveStarD,

		    fiveStarEliteL, fiveStarEliteL, fiveStarEliteL, fiveStarEliteL, fiveStarEliteL, fiveStarEliteL, fiveStarEliteL, fiveStarEliteL,
		    fiveStarEliteD, fiveStarEliteD, fiveStarEliteD, fiveStarEliteD, fiveStarEliteD, fiveStarEliteD, fiveStarEliteD,

		    fiveStarShards,

		    eventHeroRate,
		    
		    CoTRate
		};
		
		return pullRates;
	}
	
	
    public boolean checkLengths()
    {
    	double heroListLen = heroes.length;
    	double ratesListLen = getRates().length;
    	
    	if(heroListLen == ratesListLen)
    	{
    		return true;
    	}
    	else
    	{
    		if(heroListLen > ratesListLen)
    		{
    			System.out.println("Heros list longer than rates list");
    			return false;
    		}
    		else
    		{
        		System.out.println("Rates list longer than heroes list");
        		return false;
    		}
    	}
    }
    
	public void resetRates()
	{
		oneStar = 0;
		
		twoStar = 0;
		
		threeStar = 0;
		
		threeStarLD = 0;
		
		fourStarFst = 0;
		fourStarFrt = 0;
		fourStarAby = 0;
		fourStarShd = 0;
		
		fourStarL = 0;
		fourStarD = 0;
		
		fourStarShards = 0;
		
		fourStarShardsL = 0;
		
		fourStarShardsD = 0;
		
		unNatfiveStarFst = 0;
		unNatfiveStarFrt = 0;
		unNatfiveStarAby = 0;
		unNatfiveStarShd = 0;
		
		unNatfiveStarL = 0;
		unNatfiveStarD = 0;
		
		fiveStarFst = 0;
		fiveStarFrt = 0;
		fiveStarAby = 0;
		fiveStarShd = 0;
		
		fiveStarL = 0;
		fiveStarD = 0;
		
		fiveStarEliteFst = 0;
		fiveStarEliteFrt = 0;
		fiveStarEliteAby = 0;
		fiveStarEliteShd = 0;
		
		fiveStarEliteL = 0;
		fiveStarEliteD = 0;
		
		fiveStarShards = 0;
		
		CoTRate = 0;
	}
	
	public void getPullCount()
	{
		System.out.println(HSEventTotalDraws);
		System.out.println(compassTotalDraws);
	}
	
	
	/*
	 * Responsible for determining what is randomly selected
	 */
	
	public static int distribution(double items[])
	{
		// Compute the total weight of all items together
		double totalWeight = 0.0d;
		for (double i : items)
		{
		    totalWeight += i;
		}
		// Now choose a random item
		int randomIndex = -1;
		double random = Math.random() * totalWeight;
		for (int i = 0; i < items.length; ++i)
		{
		    random -= items[i];
		    if (random <= 0.0d)
		    {
		        randomIndex = i;
		        break;
		    }
		}
		return randomIndex;
	};
	
	
	/*
	 * Color the text of hero names based on how they appear in game chat
	 */
	
	public void printWithColor(int index)
	{
		String OS = System.getProperty("os.name").split(" ")[0].toLowerCase();
	    final String ANSI_RESET = "\u001B[0m";
	    final String ANSI_BLUE = "\u001B[36m";
	    final String ANSI_YELLOW = "\u001B[33m";
	    final String ANSI_PURPLE = "\u001B[35m";
	    final String ANSI_GREEN = "\u001B[32m";
	    final String ANSI_RED = "\u001B[31m";
	    final String ANSI_OTHER = "\u001B[37m";
	    
	    int oneStarBegin = findIndex("Bella", 1);
	    int oneStarEnd = findIndex("Luminous Body", 1);
	    int twoStarBegin = findIndex("Lavine", 2);
	    int twoStarEnd = findIndex("Bone Warrior", 2);
	    int threeStarBegin = findIndex("Sybil", 3);
	    int threeStarEnd = findIndex("Ghost of Aspen", 3);
	    int fourStarBegin = findIndex("Wind Walker", 4);
	    int fourStarEnd = Arrays.asList(heroes).lastIndexOf("Dark 4 Star Shards");
	    int fiveStarBegin = findIndex("Wind Walker", 5);
	    int fiveStarEnd = findIndex("Mockman", 5);
	    
	    if(!OS.equals("windows"))
	    {
	    	
		    if(index >= oneStarBegin && index <= oneStarEnd)
		    {
		    	System.out.println(ANSI_BLUE + heroes[index] + ANSI_RESET);
		    }
		    else if(index >= twoStarBegin && index <= twoStarEnd)
		    {
		    	System.out.println(ANSI_YELLOW + heroes[index] + ANSI_RESET);
		    }
		    else if(index >= threeStarBegin && index <= threeStarEnd)
		    {
		    	System.out.println(ANSI_PURPLE + heroes[index] + ANSI_RESET);
		    }
		    else if(index >= fourStarBegin && index <= fourStarEnd)
		    {
		    	System.out.println(ANSI_GREEN + heroes[index] + ANSI_RESET);
		    }
		    else if(index >= fiveStarBegin && index <= fiveStarEnd)
		    {
		    	System.out.println(ANSI_RED + heroes[index] + ANSI_RESET);
		    }
		    else
		    {
		    	System.out.println(ANSI_OTHER + heroes[index] + ANSI_RESET);
		    }
	    }
	    else
	    {
	    	System.out.println(heroes[index]);
	    }
	}
	
	
	/*
	 * Basic summon
	 */
	
	public void basicSummon(int draws)
	{
		overallOneStar = 4.67;
		overallTwoStar = 2.125;
		overallThreeStar = 0.34;
		overallThreeStarLD = 0.85;
		overallFourStar = 0.375;
		overallFourStarLD = 0.0417;
		overallFiveStar = 0.00167;
		
		oneStar = overallOneStar;
		
		twoStar = overallTwoStar;
		
		threeStar = overallThreeStar;
		threeStarLD = overallThreeStarLD;
		
		fourStarFst = overallFourStar;
		fourStarAby = overallFourStar;
		fourStarFrt = overallFourStar;
		fourStarShd = overallFourStar;
		
		fourStarL = overallFourStarLD;
		fourStarD = overallFourStarLD;
		
		fiveStarFst = overallFiveStar;
		fiveStarAby = overallFiveStar;
		fiveStarFrt = overallFiveStar;
		fiveStarShd = overallFiveStar;
		int index = 0;
		
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			// System.out.println(heroes[index]);
			printWithColor(index);
		}
		resetRates();
	}
	
	
	/*
	 * Friendship summon
	 */
	
	public void friendshipSummon(int draws)
	{
		overallTwoStar = 2;
		overallThreeStar = 2.2;
		overallThreeStarLD = 5;
		overallFourStar = 0.325;
		overallFourStarLD = 0.47;
		overallFiveStar = 0.223;
		
		twoStar = overallTwoStar;
		
		threeStar = overallThreeStar;
		threeStarLD = overallThreeStarLD;
		
		fourStarFst = overallFourStar;
		fourStarAby = overallFourStar;
		fourStarFrt = overallFourStar;
		fourStarShd = overallFourStar;
		
		fourStarL = overallFourStarLD;
		fourStarD = overallFourStarLD;
		
		fiveStarFst = overallFiveStar;
		fiveStarAby = overallFiveStar;
		fiveStarFrt = overallFiveStar;
		fiveStarShd = overallFiveStar;
		int index = 0;
		
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	
	/*
	 * Heroic summons
	 */
	
	public void heroicSummonEvent(int draws)
	{
		overallThreeStar = 3.288;
		overallThreeStarLD = 5.54;
		overallFourStar = 0.525;
		overallFourStarLD = 0.5333;
		overallFiveStar = 0.064;
		overallFiveStarLD = 0.0334;
		overallFiveStarElite = 0.0218;
		overallFiveStarEliteLD = 0.005;
		eventHeroRate = 0.005;
			
		double eventHeroRateCopy = eventHeroRate;
		
		threeStar = overallThreeStar;
		threeStarLD = overallThreeStarLD;
			
		fourStarFst = overallFourStar;
		fourStarAby = overallFourStar;
		fourStarFrt = overallFourStar;
		fourStarShd = overallFourStar;
			
		fourStarL = overallFourStarLD;
		fourStarD = overallFourStarLD;
			
		fiveStarFst = overallFiveStar;
		fiveStarAby = overallFiveStar;
		fiveStarFrt = overallFiveStar;
		fiveStarShd = overallFiveStar;
			
		fiveStarL = overallFiveStarLD;
		fiveStarD = overallFiveStarLD;
			
		fiveStarEliteFst = overallFiveStarElite;
		fiveStarEliteAby = overallFiveStarElite;
		fiveStarEliteFrt = overallFiveStarElite;
		fiveStarEliteAby = overallFiveStarElite;
			
		fiveStarEliteL = overallFiveStarEliteLD;
		fiveStarEliteD = overallFiveStarEliteLD;
		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			HSEventTotalDraws++;
			if(HSEventTotalDraws%500 == 0)
			{
				index = heroes.length-2;
			}
			else if(HSEventTotalDraws >= 400)
			{
				eventHeroRate = eventHeroRateCopy*5;
				index = distribution(getRates());
			}
			else if(HSEventTotalDraws >= 300)
			{
				eventHeroRate = eventHeroRateCopy*4;
				index = distribution(getRates());
			}
			else if(HSEventTotalDraws >= 200)
			{
				eventHeroRate = eventHeroRateCopy*3;
				index = distribution(getRates());
			}
			else if(HSEventTotalDraws >= 100)
			{
				eventHeroRate = eventHeroRateCopy*2;
				index = distribution(getRates());
			}
			else
			{
				index = distribution(getRates());
			}
				
			printWithColor(index);
			
			if(index == heroes.length-2)
			{
				HSEventTotalDraws = 0;
			}
		}
		resetRates();
	}
	
	public void heroicSummon(int draws)
	{
		overallThreeStar = 3.288;
		overallThreeStarLD = 5.54;
		overallFourStar = 0.525;
		overallFourStarLD = 0.5333;
		overallFiveStar = 0.064;
		overallFiveStarLD = 0.0334;
		overallFiveStarElite = 0.0218;
		overallFiveStarEliteLD = 0.005;
		
		
		threeStar = overallThreeStar;
		threeStarLD = overallThreeStarLD;
			
		fourStarFst = overallFourStar;
		fourStarAby = overallFourStar;
		fourStarFrt = overallFourStar;
		fourStarShd = overallFourStar;
			
		fourStarL = overallFourStarLD;
		fourStarD = overallFourStarLD;
			
		fiveStarFst = overallFiveStar;
		fiveStarAby = overallFiveStar;
		fiveStarFrt = overallFiveStar;
		fiveStarShd = overallFiveStar;
			
		fiveStarL = overallFiveStarLD;
		fiveStarD = overallFiveStarLD;
			
		fiveStarEliteFst = overallFiveStarElite;
		fiveStarEliteAby = overallFiveStarElite;
		fiveStarEliteFrt = overallFiveStarElite;
		fiveStarEliteAby = overallFiveStarElite;
			
		fiveStarEliteL = overallFiveStarEliteLD;
		fiveStarEliteD = overallFiveStarEliteLD;
		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	
	/*
	 * Prophet summons
	 */
	
	public void prophetSummonFst(int draws)
	{		
		fourStarShards = 7;
		fourStarFst = 7.5;
		fiveStarShards = 24;
		unNatfiveStarFst = 0.6;
		fiveStarFst = 0.4;	
		fiveStarEliteFst = 0.117;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void prophetSummonAby(int draws)
	{		
		fourStarShards = 7;
		fourStarAby = 7.5;
		fiveStarShards = 24;
		unNatfiveStarAby = 0.6;
		fiveStarAby = 0.4;	
		fiveStarEliteAby = 0.127;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void prophetSummonFrt(int draws)
	{		
		fourStarShards = 7;
		fourStarFrt = 7.5;
		fiveStarShards = 24;
		unNatfiveStarFrt = 0.6;
		fiveStarFrt = 0.4;	
		fiveStarEliteFrt = 0.117;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void prophetSummonShd(int draws)
	{		
		fourStarShards = 7;
		fourStarShd = 7.5;
		fiveStarShards = 24;
		unNatfiveStarShd = 0.6;
		fiveStarShd = 0.4;	
		fiveStarEliteShd = 0.127;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void prophetSummonLD(int draws)
	{	
		fourStarShardsL = 20;
		fourStarShardsD = 20;
		fourStarL = 4.7;
		fourStarD = 4.6;
		fiveStarShards = 28;
		unNatfiveStarL = 0.5;
		unNatfiveStarD = 0.5;
		fiveStarL = 0.133;	
		fiveStarD = 0.133;	
		fiveStarEliteL = 0.0133;
		fiveStarEliteD = 0.0133;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	
	/*
	 * Three star shards
	 */
	
	public void threeStarShardSummon(int draws)
	{	
		threeStar = 4.8;
		threeStarLD = 2;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	/*
	 * Four star shards
	 */
	
	public void fourStarShardSummon(int draws)
	{	
		overallFourStar = 3.0625;
		overallFourStarLD = 0.333;
		
		fourStarFst = overallFourStar;
		fourStarAby = overallFourStar;
		fourStarFrt = overallFourStar;
		fourStarShd = overallFourStar;
		
		fourStarL = overallFourStarLD;
		fourStarD = overallFourStarLD;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fourStarShardSummonFst(int draws)
	{	
		fourStarFst = 12.5;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fourStarShardSummonAby(int draws)
	{	
		fourStarAby = 12.5;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fourStarShardSummonFrt(int draws)
	{	
		fourStarFrt = 12.5;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fourStarShardSummonShd(int draws)
	{	
		fourStarShd = 12.5;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fourStarShardSummonL(int draws)
	{	
		fourStarL = 33.3;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fourStarShardSummonD(int draws)
	{	
		fourStarD = 33.3;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	/*
	 * 5 star shards
	 */
	
	public void fiveStarShardSummon(int draws)
	{	
		overallFiveStar = 2.94;
		
		fiveStarFst = overallFiveStar;
		fiveStarAby = overallFiveStar;
		fiveStarFrt = overallFiveStar;
		fiveStarShd = overallFiveStar;
		
		double fiveStarList[] = getRates();
		
		fiveStarList[findIndex("Valkyrie", 5)] = overallFiveStar;
		fiveStarList[findIndex("Starlight", 5)] = overallFiveStar;
		fiveStarList[findIndex("Ormus", 5)] = overallFiveStar;
		fiveStarList[findIndex("Aidan", 5)] = overallFiveStar;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(fiveStarList);
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fiveStarShardSummonFst(int draws)
	{	
		fiveStarFst = 11.1;
		
		double fiveStarFstList[] = getRates();
		
		fiveStarFstList[findIndex("Valkyrie", 5)] = fiveStarFst;
		fiveStarFstList[findIndex("Starlight", 5)] = fiveStarFst;
		

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(fiveStarFstList);
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fiveStarShardSummonAby(int draws)
	{	
		fiveStarAby = 12.5;
		
		double fiveStarAbyList[] = getRates();

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(fiveStarAbyList);
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fiveStarShardSummonFrt(int draws)
	{	
		fiveStarFrt = 11.1;
		
		double fiveStarFrtList[] = getRates();
		
		fiveStarFrtList[findIndex("Ormus", 5)] = fiveStarFrt;
		
		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(fiveStarFrtList);
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fiveStarShardSummonShd(int draws)
	{	
		fiveStarShd = 12.5;
		
		double fiveStarShdList[] = getRates();
		
		fiveStarShdList[findIndex("Aidan", 5)] = overallFiveStar;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(fiveStarShdList);
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fiveStarShardSummonL(int draws)
	{	
		fiveStarL = 33.3;
		

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fiveStarShardSummonD(int draws)
	{	
		fiveStarD = 33.3;
		

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(getRates());
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fiveStarEliteShardSummon(int draws)
	{	
		overallFiveStarElite = 0.834;
		
		fiveStarEliteFst = overallFiveStarElite;
		fiveStarEliteAby = overallFiveStarElite;
		fiveStarEliteFrt = overallFiveStarElite;
		fiveStarEliteShd = overallFiveStarElite;
		
		double eliteList[] = getRates();
		
		double lowerRates = 4.375;
		eliteList[findIndex("King Barton", 5)] = lowerRates;
		eliteList[findIndex("Kamath", 5)] = lowerRates;
		eliteList[findIndex("Skerei", 5)] = lowerRates;
		eliteList[findIndex("Corpsedemon", 5)] = lowerRates;
		eliteList[findIndex("Vesa", 5)] = lowerRates;
		eliteList[findIndex("Sigmund", 5)] = lowerRates;
		eliteList[findIndex("Valentino", 5)] = lowerRates;
		eliteList[findIndex("Oberon", 5)] = lowerRates;
		
		double upperRates = 5.625;
		eliteList[findIndex("Garuda", 5)] = upperRates;
		eliteList[findIndex("Heart Watcher", 5)] = upperRates;
		eliteList[findIndex("Penny", 5)] = upperRates;
		eliteList[findIndex("Horus", 5)] = upperRates;
		eliteList[findIndex("Kroos", 5)] = upperRates;
		eliteList[findIndex("Jahra", 5)] = upperRates;
		eliteList[findIndex("Cthugha", 5)] = upperRates;
		eliteList[findIndex("Xia", 5)] = upperRates;
		
		double none = 0;
		eliteList[findIndex("Valkyrie", 5)] = none;
		eliteList[findIndex("Starlight", 5)] = none;
		eliteList[findIndex("Ormus", 5)] = none;
		eliteList[findIndex("Aidan", 5)] = none;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(eliteList);
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fiveStarEliteShardSummonL(int draws)
	{	
		fiveStarEliteL = 6.67;
		
		double eliteListL[] = getRates();
		
		double upperRates = 30;
		eliteListL[findIndex("Belrain", 5)] = upperRates;
		eliteListL[findIndex("Faith Blade", 5)] = upperRates;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(eliteListL);
			printWithColor(index);
		}
		resetRates();
	}
	
	public void fiveStarEliteShardSummonD(int draws)
	{	
		fiveStarEliteL = 8;
		
		double eliteListD[] = getRates();
		
		double upperRates = 30;
		eliteListD[findIndex("Mihm", 5)] = upperRates;
		eliteListD[findIndex("Amuvor", 5)] = upperRates;

		int index = 0;
			
		for(int i = 0; i < draws; i++)
		{
			index = distribution(eliteListD);
			printWithColor(index);
		}
		resetRates();
	}
	
	
	public void compassOfTranscendedFate(int draws, String hero, String heroLD)
	{
		overallUnNatFiveStarLD = 1.67;
		overallUnNatFiveStar = 1.62;
		overallFiveStar = 0.933;
		overallFiveStarLD = 0.83;
		overallFiveStarElite = 0.091;
		overallFiveStarEliteLD = 0.0667;
		overallCoTRate = 6.67;
	
		
		unNatfiveStarL = overallUnNatFiveStarLD;
		unNatfiveStarD = overallUnNatFiveStarLD;
		
		unNatfiveStarFst = overallUnNatFiveStar;
		unNatfiveStarAby = overallUnNatFiveStar;
		unNatfiveStarFrt = overallUnNatFiveStar;
		unNatfiveStarShd = overallUnNatFiveStar;
		
		fiveStarFst = overallFiveStar;
		fiveStarAby = overallFiveStar;
		fiveStarFrt = overallFiveStar;
		fiveStarShd = overallFiveStar;
		
		fiveStarFst = overallFiveStar;
		fiveStarAby = overallFiveStar;
		fiveStarFrt = overallFiveStar;
		fiveStarShd = overallFiveStar;
			
		fiveStarL = overallFiveStarLD;
		fiveStarD = overallFiveStarLD;
			
		fiveStarEliteFst = overallFiveStarElite;
		fiveStarEliteAby = overallFiveStarElite;
		fiveStarEliteFrt = overallFiveStarElite;
		fiveStarEliteAby = overallFiveStarElite;
			
		fiveStarEliteL = overallFiveStarEliteLD;
		fiveStarEliteD = overallFiveStarEliteLD;
		
		CoTRate = overallCoTRate;
		
		
		
		int index = 0;
		
		for(int i = 0; i < draws; i++)
		{
			compassHeroRate += 0.1;
			compassHeroLDRate += 0.025;
			compassTotalDraws++;
			
			double compassList[] = getRates();
			compassList[findIndex(hero)] = compassHeroRate;
			compassList[findIndex(heroLD)] = compassHeroLDRate;
			
			index = distribution(compassList);
			printWithColor(index);
			
			if(index == findIndex(hero))
			{
				compassHeroRate = resetCompassHeroRate;
			}
			if(index == findIndex(heroLD))
			{
				compassHeroLDRate = resetCompassHeroLDRate;
			}
		}
		resetRates();
		printCompassRates();
	}
	
	public void compassOfTranscendedGuidance(int draws, String hero, String heroLD)
	{
		overallUnNatFiveStarLD = 1.67;
		overallUnNatFiveStar = 1.62;
		overallFiveStar = 0.933;
		overallFiveStarLD = 0.83;
		overallFiveStarElite = 0.091;
		overallFiveStarEliteLD = 0.0667;
	
		
		unNatfiveStarL = overallUnNatFiveStarLD;
		unNatfiveStarD = overallUnNatFiveStarLD;
		
		unNatfiveStarFst = overallUnNatFiveStar;
		unNatfiveStarAby = overallUnNatFiveStar;
		unNatfiveStarFrt = overallUnNatFiveStar;
		unNatfiveStarShd = overallUnNatFiveStar;
		
		fiveStarFst = overallFiveStar;
		fiveStarAby = overallFiveStar;
		fiveStarFrt = overallFiveStar;
		fiveStarShd = overallFiveStar;
		
		fiveStarFst = overallFiveStar;
		fiveStarAby = overallFiveStar;
		fiveStarFrt = overallFiveStar;
		fiveStarShd = overallFiveStar;
			
		fiveStarL = overallFiveStarLD;
		fiveStarD = overallFiveStarLD;
			
		fiveStarEliteFst = overallFiveStarElite;
		fiveStarEliteAby = overallFiveStarElite;
		fiveStarEliteFrt = overallFiveStarElite;
		fiveStarEliteAby = overallFiveStarElite;
			
		fiveStarEliteL = overallFiveStarEliteLD;
		fiveStarEliteD = overallFiveStarEliteLD;
		
		
		int index = 0;
		
		for(int i = 0; i < draws; i++)
		{
			compassHeroRate += 0.1;
			compassHeroLDRate += 0.025;
			compassTotalDraws++;
			
			if(compassTotalDraws % 15 == 0)
			{
				index = heroes.length-1;
			}
			else
			{
				double compassList[] = getRates();
				compassList[findIndex(hero)] = compassHeroRate;
				compassList[findIndex(heroLD)] = compassHeroLDRate;
				
				index = distribution(compassList);
			}
			printWithColor(index);
			
			if(index == findIndex(hero))
			{
				compassHeroRate = resetCompassHeroRate;
			}
			if(index == findIndex(heroLD))
			{
				compassHeroLDRate = resetCompassHeroLDRate;
			}
		}
		resetRates();
		printCompassRates();
	}
	
	public int findIndex(String heroName)
	{
		int index = Arrays.asList(heroes).lastIndexOf(heroName);
		return index;
	}
	
	public int findIndex(String heroName, int star)
	{
		String strInt = String.valueOf(star);
		
		String heroesCopy[] = new String[heroes.length];
		for(int i = 0; i < heroes.length; i++)
		{
			heroesCopy[i] = heroes[i].toLowerCase();
		}
		
		
		heroName = heroName.toLowerCase();
		String output = heroName + "- " + strInt + "*";
		
		int index = Arrays.asList(heroesCopy).lastIndexOf(output);
		return index;
	}
	
	public void printCompassRates()
	{
		System.out.println("Hero rate: "+String.format("%.2f", compassHeroRate));
		System.out.println("Hero LD rate: "+String.format("%.3f", compassHeroLDRate));
	}

}
