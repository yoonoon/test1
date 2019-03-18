package listtest;



import sun.security.util.Length;

import javax.sound.sampled.Line;
import java.awt.print.Book;
import java.util.*;

public class NBAStar {
    public static void main(String[] args) {
        List<NBAStarTest> NBAList = new ArrayList<>();
        System.out.println("球员  绰号  得分  篮板  助攻");
        NBAList.add(new NBAStarTest("乔丹","飞人","30.1", "6.2","5.3"));
        for (int i = 0 ; i< NBAList.size(); i++){
            System.out.println(NBAList.get(i).getName()+"  "+NBAList.get(i).getNickname()+"  "+NBAList.get(i).getScore()
            +"   "+NBAList.get(i).getBackboard()+"  "+NBAList.get(i).getAssists());
        }
    }
}
