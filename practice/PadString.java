public class PadString {
    
    public static void main(String[] args) {
        String[] array = {"one", "fine", "evening"};
        pad(array);
    }
    
    public static void pad(String[] array) {
        int longIndex = 0, longest = array[0].length();
        for (int i=1; i<array.length; i++) {
            if (array[i].length() > longest) {
                longIndex = i;
                longest = array[i].length();
            }
        }
        int spaces = 0;
        for (int i=0; i<array.length; i++) {
            spaces = longest - array[i].length();
            for (int j=0; j<spaces; j++) {
                array[i] += ' ';
            }
            System.out.println(array[i]+";");
        }
    }
}