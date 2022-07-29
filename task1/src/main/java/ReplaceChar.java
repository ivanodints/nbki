import java.util.Arrays;

public class ReplaceChar {

    public String doReplace(String str, char checkChar, char replaceChar){

        System.out.println("Word before replace - " + str);

        char[] tempArray = str.toCharArray();

        for (int i = 0; i < tempArray.length; i++){
            if (tempArray[i] == checkChar){
                tempArray[i] = replaceChar;
            }
        }

        String newString = new String(tempArray);

        System.out.println("Word after replace - " + newString);

        return newString;
    }
}
