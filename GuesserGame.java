import java.util.Scanner;

class Player{
    int playerNumber;
    public int playerNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey player Bro, Guess the number: ");
        playerNumber = sc.nextInt();
        return playerNumber;
    }

}
class Guesser{
    int guesserNumber;
    public int guessNumber() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Hey Guesser Bro, Guess the number: ");
       guesserNumber = sc.nextInt();
       return guesserNumber;
    }

}
class Umpire{
    int guesserNumber;
    int p1Number;
    int p2Number;
    int p3Number;

    public void getNumberFromGuesser() {
        Guesser guesser = new Guesser();
        guesserNumber = guesser.guessNumber();
    }

    public void collectNumberFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        p1Number = p1.playerNumber();
        p2Number = p2.playerNumber();
        p3Number = p3.playerNumber();
    }

    public void result() {
        System.out.println(guesserNumber+"    "+p1Number+"    "+p2Number+"    "+p3Number);
        if(guesserNumber == p1Number){
            if(guesserNumber == p2Number && guesserNumber == p3Number){
                System.out.println("All are the winners");
            }else if(guesserNumber == p2Number){
                System.out.println("Player 1 and 2 are the winners");
            }else if(guesserNumber == p3Number){
                System.out.println("Player 1 and 3 are the winners");
            }else{
                System.out.println("Only player 1 is the winner");
            }
        }else if(guesserNumber == p2Number){
            if(guesserNumber == p3Number){
                System.out.println("Player 2 and 3 are the winners");
            }else{
                System.out.println("Only Player 2 is the winner");
            }
        }else if(guesserNumber == p3Number){
            System.out.println("Only player 3 is the winner");
        }else{
            System.out.println("Looser....");
        }
    }

}
class GuesserGame{
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.collectNumberFromPlayer();
        umpire.result();        
    }
}