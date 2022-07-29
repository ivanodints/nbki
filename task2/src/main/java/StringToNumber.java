import com.sun.jdi.Value;

public class StringToNumber {

    public Double toDouble1(String str){
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException " + e.getMessage());
            return null;
        }
    }

    public Double toDouble2(String str){

        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException " + e.getMessage());
            return null;
        }
    }

    public Double toDouble3(String str){

        try {
            return new Double(str);
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException " + e.getMessage());
            return null;
        }
    }
}



