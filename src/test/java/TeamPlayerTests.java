import Helper.PlayerConditionHelper;
import org.testng.annotations.Test;
import resources.IPLCricketTeam;

public class TeamPlayerTests extends TestBase {

    @Test
    public void verifyPlayersTemplateContainsForeignPlayerTest() {
        IPLCricketTeam iplCricketTeam = IPLCricketTeam.getInstance();
        int foreignPlayers = PlayerConditionHelper.getTotalForeignPlayer(iplCricketTeam, "India");
        assertion.assertTrue(foreignPlayers == 4, "The foreign player are more then 4");
    }

    @Test
    public void verifyPlayersTemplateAtLeastOneWicketKeeperTest() {
        IPLCricketTeam iplCricketTeam = IPLCricketTeam.getInstance();
        int wicketKeepers = PlayerConditionHelper.getTotalWicketKeeper(iplCricketTeam);
        assertion.assertTrue(wicketKeepers >= 1, "The wicket keeper are not present in the team");
    }
}
