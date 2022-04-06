import java.util.HashMap;

class Solution05 {
    public String replaceSpace(String s) {
        StringBuilder sb=new StringBuilder();
        int index;
        int count;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==' '){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
            i++;
        }

        return sb.toString();
    }
}