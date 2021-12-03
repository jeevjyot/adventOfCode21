import util.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day3 {

    public void part1()throws Exception{
            List<String> binaryLines = Utils.readInput("binaryInput.txt",String.class);
            int lengthOfString = binaryLines.get(0).length();
            StringBuilder gamma = new StringBuilder();
            StringBuilder epsilon = new StringBuilder();
            for(int i=0;i<lengthOfString;i++){
                int ones=0,zeros=0;
                for(String s: binaryLines){
                    int digit = Character.getNumericValue(s.charAt(i));
                    if(digit==1){
                       ones++;
                    }else{
                        zeros++;
                    }
                }
                if(ones>zeros){
                    gamma.append(1);epsilon.append(0);
                }else{
                    gamma.append(0);epsilon.append(1);
                }
            }
            System.out.println(Integer.parseInt(epsilon.toString(), 2)*Integer.parseInt(gamma.toString(),2));
    }
}
