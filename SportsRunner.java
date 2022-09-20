class SportsRunner{
	public static void main(String[] cricket)
	{
		System.out.println("entered cricketersNames");
		String[] PlayerNames={"Virat Kohli","Rohit Sharma","Rishabh Pant",
		"Hardik Pandya","KL Rahul","Sanju Samson","MS Dhoni","Dinesh Karthik",
		"Ravindra Jadeja","Yuzvendra Chahal","Kuldeep Yadav"};
		Sports.cricketTeamMembers(PlayerNames);
	
		System.out.println("entered jerseyNumbers");
		int[] JerseyNos={7,4,27,39,9,23,17,15,28,25};
		Sports.kabbadiTeamMembersJerseyNos(JerseyNos);
		
		System.out.println("entered footballSalaries perYear");
		double[] salary={243345,123456,876543,234567,345678,123457,543216,876654,267895,145678};
		Sports.FootBallTeamMembersSalary(salary);
	
		System.out.println("entered LudoMobilenNumber");
		long[] MobileNos={9972456667L,9975432666L,8098997654L,8897676898L,8789989896L,
		8976897654L,7896789876L,9876540899L,8765432109L,7896754369L};
		Sports.LudoTeamMobileNumber(MobileNos);
		
		System.out.println("entered NumberOfMatchesPlayed from 2003 to 2015 yearwise");
		int[] MatchNos={5,10,12,11,2,4,3,9,8,6,7,5,14};
		Sports.HockeyTeamMembersNoOfMatches(MatchNos);
		
		System.out.println("enter country code of koko players");
		long[] CountryCode={93,355,213,684,376,264,880,1,86,809,1624,91};
		Sports.KokoTeamMembersCountryCode(CountryCode);
		
		System.out.println("entered status of lagori players");
		boolean[] Alive={true,false,false,false,true,true,false,true,false,true};
		Sports.LagoriTeamMembersAlive(Alive);
		
	}
}