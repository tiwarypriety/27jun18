package T20;

public class T20Main {
    public static void main(String a[]){
        T20Scores t = new T20Scores();
        
        int playerScore[] = {55,99,99,100,101,101,34,35,36,5,28,7,50,50,51,52,52,24,13,14,15,5,6,7,37,31,37,38,39,36,40};
        t.getOriginalScores(7, playerScore);
    }
}
