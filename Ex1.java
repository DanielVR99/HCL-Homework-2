public class Ex1 {
    public static void main(String[] args) {
        String str = "haapy new year 2022";
        int count = 1;
        for (char letter : str.toCharArray()) {
            if (count % 3 == 0 && (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')){
                System.out.println("char: " + letter + " position: " + count);
            }
            count++;
        }
    }
}
