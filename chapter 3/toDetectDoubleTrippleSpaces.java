public class toDetectDoubleTrippleSpaces {
    public static void main(String[] args) {
        String name = "my name is,  deepak    ";
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));
        
    }
}
