public class Decrypt {
    public static String caesarDecrypt(String textInput, int number){
        String encryptText = "";
        int length = textInput.length();
        for (int i=0; i<length;i++){
            char letter = textInput.charAt(i);
            if (Character.isLetter(letter)){
                if (Character.isLowerCase(letter)){
                    char newLetter = (char)(letter-number);
                    if(newLetter<'a'){
                        encryptText += (char)(letter + (26-number));
                    }else {
                        encryptText += newLetter;
                    }
                }else if (Character.isUpperCase(letter)){
                    char newLetter = (char)(letter-number);
                    if(newLetter<'A'){
                        encryptText += (char)(letter + (26-number));
                    }else {
                        encryptText += newLetter;
                    }
                }
            }else{
                encryptText += letter;
            }
        }
        return encryptText;
    }
}
