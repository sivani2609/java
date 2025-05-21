class string_count{
    public static void main(String[] args){
            String s = "engin&eering c;oll145ege is was!57te";
            int vowels =0;
            int consonants=0;
            int numbers=0;
            int special_characters =0;
            for(int in=0;in< s.length() ;in++){
                char i = s.charAt(in);
                if(i >= 'a' && i <= 'z' || i >= 'A' && i <= 'Z'){
                    if(i == 'a' || i == 'e' ||i == 'i' ||i == 'o' ||i == 'u' ||i == 'A' ||i == 'E' ||i == 'I' ||i == 'O' ||i == 'U' ){
                        vowels++;
                    }
                    else{
                        consonants++;
                    }
                }else if(i == '0' || i == '1' ||i == '2' ||i == '3' ||i == '4' ||i == '5' ||i == '6' ||i == '7' ||i == '8' ||i == '9' ){
                    numbers++;
                }
                else{
                    special_characters++;
                }
                }
            System.out.println("the no of vowels are:"+vowels);
            System.out.println("the no of consonants are:"+consonants);
            System.out.println("the no of numbers are:"+numbers);
            System.out.println("the no of special characters are:"+special_characters);
            
    }
}