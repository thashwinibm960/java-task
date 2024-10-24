public class Sport {
    public enum SportType {
        TEAM, INDIVIDUAL, RACQUET, WATER, COMBAT
    }

    static String organization;
    static int playersPerTeam;
    static String equipment;

    int matchDuration; 
    String name;
    SportType type;
    boolean isOlympicSport;

    static {
        organization = "International Sports Federation";
        playersPerTeam = 11; 
        equipment = "Generic Equipment"; 
    }

    public Sport(int matchDuration, String name, SportType type, boolean isOlympicSport) {
        this.matchDuration = matchDuration;
        this.name = name;
        this.type = type;
        this.isOlympicSport = isOlympicSport;
    }

    public void printDetails() {
        System.out.println("Organization: " + organization);
        System.out.println("Players per Team: " + playersPerTeam);
        System.out.println("Equipment: " + equipment);
        System.out.println("Match Duration: " + matchDuration + " mins");
        System.out.println("Sport Name: " + name);
        System.out.println("Sport Type: " + type);
        System.out.println("Is Olympic Sport: " + isOlympicSport);
        System.out.println(); 
    }
}


