public class palindromicAnagram {
    public static void main(String[] args) {
        System.out.println(solve("carrace"));
        System.out.println(solve("nathan"));
        System.out.println(solve("anagrammang"));

    }
    public static boolean solve(String s) {
        int uniqueOdds=0;
        int numChar=0;
        for (char alphabet = 'a';alphabet <='z';alphabet++){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==alphabet){
                    numChar++;
                }
            }
            if(numChar%2==1){
                uniqueOdds++;
            }
            numChar=0;
        }
        if(uniqueOdds<=1){
            return true;
        }else{
            return false;
        }

    }
}
