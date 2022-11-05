public class subStringInString {
    static int countFreq(String pat, String txt)
    {
        int m= pat.length();
        int n = txt.length();
        int res = 0;
        for (int i =0; i<= n -m; i++){
            int j;
            for (j = 0; j <m; j++){
                if(txt.charAt(i+j) != pat.charAt(j)){
                    break;
                }

            }
            if (j==m){
                res++;
                j=0;
            }
        }
        return res;
    }
    static public void main(String[] args)
    {
        System.out.println("initial string is  ");
        String txt ="alexlexhdthdghhlexjddholex";
        String pat ="lex";
        System.out.println(txt);
        System.out.println("sub string is");
        System.out.println(pat);
        System.out.println(" occurs");
        System.out.println(countFreq(pat,txt));
        System.out.println("time/s");
    }
}
