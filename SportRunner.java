public class SportRunner {
    public static void main(String[] args) {
        Sport football = new Sport(90, "Football", Sport.SportType.TEAM, true);
        Sport tennis = new Sport(120, "Tennis", Sport.SportType.RACQUET, true);
        Sport swimming = new Sport(60, "Swimming", Sport.SportType.WATER, true);
        Sport boxing = new Sport(36, "Boxing", Sport.SportType.COMBAT, true);
        Sport cricket = new Sport(300, "Cricket", Sport.SportType.TEAM, true);

        football.printDetails();
        tennis.printDetails();
        swimming.printDetails();
        boxing.printDetails();
        cricket.printDetails();
    }
}