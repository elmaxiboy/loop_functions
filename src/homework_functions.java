public class homework_functions {
    public static String duplicate(String s, Character c){

        int lengthOfString= s.length();
        String duplicateCharString ="";

        for(int i=0;i<=lengthOfString-1;i++){

            Character currentChar= s.charAt(i);

            if(currentChar==c){
                for(int j=0;j<=1;j++){
                    duplicateCharString+=c;
                }
            }
            else{
                duplicateCharString+=currentChar;
                }
            }
        return  duplicateCharString;
        }
        public static String switchAdjacent(String s){
        String switchedString="";
        int stringLength=s.length();
        if (stringLength%2==0){ //even length
            for (int i = 0; i < stringLength; i=i+2) {
                switchedString+=s.charAt(i+1);
                switchedString+=s.charAt(i);
            }

        }
        else{// odd length
            String evenPartString="";
            String oddPartString="";
            for (int i = 0; i < stringLength-3; i=i+2) {
                evenPartString+=s.charAt(i+1);
                evenPartString+=s.charAt(i);
            }

            int j=stringLength-1;
            oddPartString+=s.charAt(j);
            oddPartString+=s.charAt(j-1);
            oddPartString+=s.charAt(j-2);

            switchedString=evenPartString+oddPartString;
        }
        return switchedString;
        }
    public static String compress(String s){

        String compressedString="";
        int stringLength= s.length();
        int charCount=1;

        for (int i = 0; i <stringLength ; i++) {

            if(i+1==stringLength){
                compressedString+=s.charAt(i);
                compressedString+=charCount;
            }

            else if(s.charAt(i+1)==s.charAt(i)){
                charCount+=1;
            }

            else{
                compressedString+=s.charAt(i);
                compressedString+=charCount;
                charCount=1;
            }

        }

        return compressedString;




    }








}

