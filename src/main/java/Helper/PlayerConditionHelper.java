package Helper;

import resources.IPLCricketTeam;

import java.util.ArrayList;

public class PlayerConditionHelper {

    public static int getTotalForeignPlayer(IPLCricketTeam iplCricketTeam, String country) {
        int count = 0;
        for(int i = 0; i < iplCricketTeam.getPlayer().size(); i++) {
            if(iplCricketTeam.getPlayer().get(i).getCountry().equalsIgnoreCase(country)) {
                count = count;
            } else  {
                count = count + 1;
            }
        }
        return count;
    }

    public static int getTotalWicketKeeper(IPLCricketTeam iplCricketTeam) {
        int count = 0;
        for(int i = 0; i < iplCricketTeam.getPlayer().size(); i++) {
            if(iplCricketTeam.getPlayer().get(i).getRole().equalsIgnoreCase("Wicket-keeper")) {
                count = count + 1;
            }
        }
        return count;
    }

}
