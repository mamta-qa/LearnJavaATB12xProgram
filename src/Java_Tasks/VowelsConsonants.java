package Java_Tasks;

public class VowelsConsonants {
    public static void main(String[] args) {
        String str = " mamta rani";
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if ("a,i,o,u,e".indexOf(ch) != -1) {

                    vowels++;
                } else {

                }
                consonants++;
            }

        }

        System.out.println("vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}