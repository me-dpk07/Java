public class toreplaces02 {
    public static void main(String[] args) {
        String letter = "Dear <|name|> , Trans a lot " ;
        letter = letter.replace("<|name|>", "Deepak");
        System.out.println(letter);
    }
    
}
