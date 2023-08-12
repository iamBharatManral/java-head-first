public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;


        int target = new java.util.Random().nextInt(10);
        System.out.println("I am thinking of a number between 0 and 9");

        while(true){
            System.out.println("The number to guess is " + target);
            guess1 = p1.guess();
            System.out.println("Player1 guessed " + guess1);
            guess2 = p2.guess();
            System.out.println("Player1 guessed " + guess2);
            guess3 = p3.guess();
            System.out.println("Player1 guessed " + guess3);
            boolean p1IsRight = guess1 == target;
            boolean p2IsRight = guess2 == target;
            boolean p3IsRight = guess3 == target;

            if(p1IsRight || p2IsRight || p3IsRight){
                System.out.println("We have a winner! 🏆");
                System.out.println("Player1 guessed it right?: " + p1IsRight);
                System.out.println("Player2 guessed it right?: " + p2IsRight);
                System.out.println("Player3 guessed it right?: " + p3IsRight);
                System.out.println("Game is over! Thanks for Playing 🙏");
                break;
            }else{
                System.out.println("Nobody guessed it right. Players will try again now!");
            }
        }
    }
}
