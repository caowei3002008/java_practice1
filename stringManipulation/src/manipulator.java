public class manipulator {
    public String trimAndConcat(String a, String b){
        String c = a + b;
        return c;
    }
    public Integer getIndexOrNull(String a, char b){
        int index;
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) == b){
                index = i;
                return index;
            }
        }
        return null;
    }
    public String concatSubstring(String a, int b, int c, String d){
        String subStr = "";
        for(int i = b; i<c; i++){
            subStr += a.charAt(i);
        }
        String str = subStr + d;
        return str;
    }
}
