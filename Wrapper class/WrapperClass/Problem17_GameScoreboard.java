public class Problem17_GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {100, null, 80, 50, null, 120};

        int notPlayed = 0;
        int totalScore = 0;

        for (Integer score : scores) {
            if (score == null) {
                notPlayed++;
            } else {
                totalScore += score;
            }
        }

        System.out.println("Players who have not played: " + notPlayed);
        System.out.println("Total score of active players: " + totalScore);
    }
}
