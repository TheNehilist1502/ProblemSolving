import java.io.*;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    
    
    
    StringBuilder string= new StringBuilder();
    s.chars().forEach(
        letter -> {
             if(letter >='A' && letter <='Z'){
                letter = ((letter-'A'+k)%26)+'A';
            }
            else if(letter>='a' && letter <= 'z'){
                letter = ((letter-'a'+k)%26)+'a';
            }
                 string.append((char)letter);    
        }
    );
    
    return string.toString();
 

    }

}

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

