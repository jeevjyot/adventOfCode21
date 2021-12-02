import util.Utils;

import java.util.ArrayList;

public class Day2 {

    public void day2Part1Dive()throws Exception {
        try {
            ArrayList<String> lines = Utils.readInput("diveInput.txt", String.class);
            int forward = 0;
            int depth = 0;
            for (String s : lines) {
                String[] parsedLine = s.split(" ");
                String direction = parsedLine[0];
                if (direction.equals("forward")) {
                    forward += Integer.parseInt(parsedLine[1]);
                } else if (direction.equals("down")) {
                    depth += Integer.parseInt(parsedLine[1]);
                } else {
                    depth -= Integer.parseInt(parsedLine[1]);
                }
            }
            System.out.println("Result=" + forward * Math.abs(depth));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

        public void day2Part2Dive()throws Exception{
            try{
                ArrayList<String>  lines = Utils.readInput("diveInput.txt",String.class);
                int forward=0;
                int depth =0;
                int aim=0;
                for(String s: lines){
                    String[] parsedLine = s.split(" ");
                    String direction = parsedLine[0];
                    int X = Integer.parseInt(parsedLine[1]);
                    if(direction.equals("forward")){
                        forward += X;
                        depth += aim*X;
                    }
                    else if(direction.equals("down")){
                        aim += X;
                    }else{
                        aim -= X;
                    }
                }
                System.out.println("Result="+forward*Math.abs(depth));
            }catch(Exception e){
                System.out.println(e);
            }
    }
}
