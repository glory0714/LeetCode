public class Solution58 {
    public static String reverseLeftWords(String s, int n) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.substring(n,s.length()+2-n));
        sb.append(s.substring(0,n));
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        reverseLeftWords("lrloseumgh",6);
    }
}
