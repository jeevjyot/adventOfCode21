import java.util.ArrayList;

import static util.Utils.readInput;

public class Day1 {
    public void partOneCountNumberOfIncreases() {
        try {
            ArrayList<Integer> listOfLines = readInput("sonarSweepInput.txt", Integer.class);

            int count=0;
            int previous = listOfLines.get(0);
            for(int i=1;i<listOfLines.size();i++){
                int current = listOfLines.get(i);
                if(current>previous){
                    count++;
                }
                previous = listOfLines.get(i);
            }
            System.out.println(count);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void partTwoCountNumberOfIncreases() {
        try {
            ArrayList<Integer> listOfLines = readInput("sonarSweepInput.txt",Integer.class);
            int count=0;
            int previous = listOfLines.get(0)+listOfLines.get(1)+listOfLines.get(2);
            for(int i=1;i<listOfLines.size()-2;i++){
                int current = listOfLines.get(i)+listOfLines.get(i+1)+listOfLines.get(i+2);
                if(current>previous){
                    count++;
                }
                previous = current;
            }
            System.out.println(count);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
