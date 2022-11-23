public class New {

    public static void main(String[] args) {
        System.out.println(stringLongerThenTwenty("testString"));
        System.out.println(stringFancy("testString"));

    }
    public static boolean stringLongerThenTwenty(String testString){
        int stringSize= testString.length();
        System.out.println(stringSize);
        boolean result = stringSize>20 ;
        return result ;
    }
    public static boolean stringFancy(String testString){
        boolean result = testString.contains("Fancy");
        return result;
    }
}