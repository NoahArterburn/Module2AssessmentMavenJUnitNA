package GL;


public class GamingLeague {
	public  String TeamName;
	public  String PlayerName;
    private double kdr;
    private int Rank;
    
    
    public GamingLeague() {
    }
    
    public GamingLeague(String TeamName,String PlayerName, double kdr, int Rank) {
        this.TeamName = TeamName;
        this.PlayerName = PlayerName;
        this.kdr = kdr;
        this.Rank = Rank;
        
    }
    public String printTeam() {
    	return TeamName;
    	}
    public String printPlayerName() {
    	return PlayerName;
    	}
    public int returnPlayerNameLength() {
		return PlayerName.length();
		}
    
    public double calculatekdr(GamingLeague Example2) {
		double example = 3;
		if (Example2.getKdr() > 2.5) {
			example = 3.5;
		} else {
			example = 1;
		}
		return example;
		}
    
    public boolean GamingRank(GamingLeague Example2) {
		boolean holdAge;
		if (Example2.getRank() < 3){
			holdAge = false;}
			else {
			holdAge = true;
			}
		return holdAge;
		}
    
	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public double getKdr() {
		return kdr;
	}

	public void setKdr(double kdr) {
		this.kdr = kdr;
	}

	public int getRank() {
		return Rank;
	}

	public void setRank(int rank) {
		Rank = rank;
	}
}
