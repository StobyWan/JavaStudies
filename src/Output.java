/**
 * Created by bbstober on 4/22/17.
 */

import java.util.*;

public class Output {


    public void outputFormat(String string, Integer num){

        System.out.println("================================");

        for(int i=0;i<3;i++){

            String[] splitArray = string.split("\\s+");

            for (String word : splitArray){

                int count = 16 - word.length();

                StringBuilder result = new StringBuilder();

                for (int j = 0; j < count; j++) {
                    if (j > 0) {
                        result.append(" ");
                    }
                }

                String p = String.format("%03d", num);

                System.out.println(word + result + p);
            }
        }
        System.out.println("================================");
    }

}
