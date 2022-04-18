package fifa;

public class Main {
    public static void main(String[] args) {
        FanClient fanOne = new FanClient();
        FanClient fanTwo = new FanClient();
        Team teamOne = new Team("Team one");
        Team teamTwo = new Team("Team two");
        Team teamThree = new Team("Team three");
        fanOne.subscribeOnTeam(teamOne);
        fanTwo.subscribeOnTeam(teamTwo);
        FifaGamesManager.getInstance().onTeamsWillPlay(teamOne,teamTwo);
        FifaGamesManager.getInstance().onTeamsWillPlay(teamOne,teamThree);
        FifaGamesManager.getInstance().onTeamsWillPlay(teamTwo,teamThree);
    }
}
