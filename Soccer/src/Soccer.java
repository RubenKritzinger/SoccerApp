public class Soccer{
    public static void main(String[] args) {
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\User\\Desktop\\SoccerAppJavaMaster\\Soccer\\src\\SoccerApp.txt");
        Scanner sc = null;
        String match, team1, team2, score1, score2, left, right, l1, l2;
        String [] sides;

        try {
        sc = new Scanner(file);
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            match = sc.nextLine();
            sides = match.split(",");
            left = sides[0];
            right = sides[1];

            System.out.println(left + " VS " + right);


        }
}

//            l1 = left.split(" ");
//            team1 = l1[0];
//            score1 = l1[1];
//            l2 = left.split("  ");
//            team2 = l2[0];
//            score2 = l2[1];
//            System.out.println(team1);
//            System.out.println(score1);
//            System.out.println(team2);
//            System.out.println(score2);