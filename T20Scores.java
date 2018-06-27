package T20;

import java.util.ArrayList;
import java.util.List;

public class T20Scores {
    void getOriginalScores(int matchesPlayed , int playerScore[]){
        List<Integer>  l = new ArrayList<Integer>();
        for(int i = 0;i<playerScore.length;i++){
            l.add(playerScore[i]);
        }
          for (int i = l.size() - 1; i >= 2; i--)
            {
                int num = l.get(i);
                if ((l.get(i - 1) == num - 1 && l.get(i - 2) == num - 2) || (l.get(i - 1) == num + 1 && l.get(i - 2) == num + 2))
                {
                    l.remove(i);
                    l.remove(i - 2);
                  
                    i = l.size();
                }
            }

          int a[] = new int[l.size()];
            for (int i = 0; i < l.size(); i++)
            {
                a[i] = l.get(i);
            }
            for (int i = 0; i < l.size(); i++)
            {
                System.out.println(a[i]);
            }
            
    }
    
}
