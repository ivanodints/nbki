public class Main {

    public static void main(String[] args) {
        System.out.println("-= TASK 1 =-");
        new ReplaceChar().doReplace("Henno World!", 'n', 'l');
        System.out.println("-= TASK 2  method 1=-");
        System.out.println(new StringToNumber().toDouble1("notNumber1"));
        System.out.println(new StringToNumber().toDouble1("10.33"));
        System.out.println("-= TASK 2  method 2=-");
        System.out.println(new StringToNumber().toDouble1("notNumber2"));
        System.out.println(new StringToNumber().toDouble1("22.3"));
        System.out.println("-= TASK 2  method 3=-");
        System.out.println(new StringToNumber().toDouble1("notNumber3"));
        System.out.println(new StringToNumber().toDouble1("20"));
        System.out.println("-= TASK 3  =-");
        new CVSsort().sort();

    }
}
