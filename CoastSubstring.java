public class CoastSubstring {
    public int equalSubstring(String s, String t, int maxCost) {
        int index=0;
        int length = 0;
        int tmp;
        while(maxCost >= 0 && index < s.length()){
            tmp = maxCost;
            maxCost -= Math.abs((int) s.charAt(index) - (int) t.charAt(index));
            if(maxCost < 0){
                maxCost = tmp;
            }
            else {
                length += 1;
            }
            index += 1;
        }
        return length;
    }
}
