package resources;

import lombok.Getter;
import lombok.Setter;
import utils.FileReader;
import utils.ResourceName;

import java.util.ArrayList;

@Getter
@Setter
public class IPLCricketTeam {

    private String name;
    private String location;
    private ArrayList<player> player;

    @Getter
    @Setter
    public static class player {
       private String name;
       private String country;
       private String role;
       private String price;
    }

    public static IPLCricketTeam getInstance() {
       IPLCricketTeam iplCricketTeam =  (IPLCricketTeam) FileReader.loadTemplate(ResourceName.ROYAL_CHALLENGERS, IPLCricketTeam.class);
       return iplCricketTeam;
    }
}
