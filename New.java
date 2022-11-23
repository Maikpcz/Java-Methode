public class New {

    public static void main(String[] args) {
        System.out.println(stringLongerThenTwenty("testString"));

    }
    public static boolean stringLongerThenTwenty(String testString){
        int stringSize= testString.length();
        System.out.println(stringSize);
        boolean result = stringSize>20 ;
        return result ;
    }
}