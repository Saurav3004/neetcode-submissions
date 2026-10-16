class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return Character.toString((char)258);
        }
        StringBuilder sb = new StringBuilder();
        String seperator = Character.toString((char)257);
        for(String s:strs){
            sb.append(s);
            sb.append(seperator);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.equals(Character.toString((char)258))){
            return new ArrayList();
        }
        String seperator = Character.toString((char)257);
        return Arrays.asList(str.split(seperator,-1));
    }
}
