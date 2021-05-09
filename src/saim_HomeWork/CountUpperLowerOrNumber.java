package saim_HomeWork;

public class CountUpperLowerOrNumber {
    public static void main(String[] args) {
        String str ="ajuMp41EEkd4s4";
        int upperCase=0,lowerCase=0,numbers=0;
        for(int i = 0;i<str.length();i++){
            char eachLetterVariable = (str.charAt(i));
            if(eachLetterVariable>='A'&&eachLetterVariable<='Z'){
               upperCase++;
            }else if(eachLetterVariable>='a'&&eachLetterVariable<='z'){
                lowerCase++;
            }else if(eachLetterVariable>='0'&&eachLetterVariable<='9'){
                numbers++;
            }
        }
        System.out.println("upperCAse "+upperCase);
        System.out.println("loweCase "+lowerCase);
        System.out.println("numbers "+numbers);
    }
}
