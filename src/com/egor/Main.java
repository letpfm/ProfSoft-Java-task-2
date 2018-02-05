package com.egor;

public class Main {

    public static void main(String[] args) {
        String input = "A. The white-breasted nuthatch\nis a small songbird that breeds in old-growth woodland across much of temperate North America.";
//        String input = "SGGggGgk \nfgkdfbnlknboid fbn\nqqqqcgfxfe rsfasxcsdvsdcsdc";
//        String input = "JhwtuYKOkSKKDCKhlcprziMCftPHzu\nBCcePDJiqlojstMGqlcNvjFBigLrLU";
        String str = input.toLowerCase();
        int[] sum = new int[26];
        int max=0;

        for (char c = 'a'; c<='z';c++){
            sum[c-97]=0;
            for (int i = 0;i<str.length();i++) {
                char a = str.charAt(i);
                if (c == a){
                    sum[c-97]++;
                }
                if (i == str.length()-1 & max<sum[c-97]){
                    max = sum[c-97];
                }
            }
        }
        for(int i = 0; i < sum.length; i++){
            if(sum[i]==max){
                System.out.println("Символ \"" + (char)(i + 97) + "\" один из повторившихся в строке наибольшее кол-во раз.");
            }
        }
    }
}
