import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        
        int positiveCounter=0;
        int negativeCounter=0;
        int zeroCounter=0;
        double size= arr.size();
        for(int number: arr){
            if(number>0){
                positiveCounter++;
            }
            else if(number<0 ){
                negativeCounter++;
            }
            else{
                zeroCounter++;
            }
        }

        BigDecimal positiveRatio = BigDecimal.valueOf(positiveCounter / size)
        .setScale(6, RoundingMode.HALF_UP);
    BigDecimal negativeRatio = BigDecimal.valueOf(negativeCounter / size)
        .setScale(6, RoundingMode.HALF_UP);
    BigDecimal zeroRatio = BigDecimal.valueOf(zeroCounter / size)
        .setScale(6, RoundingMode.HALF_UP);
        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroRatio);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}


