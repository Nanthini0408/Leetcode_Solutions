class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int sign=1,i=0;
        long num=0l;
        if(s.length()==0)
            return 0;
        if(s.charAt(0)=='-'){
            sign=-1;
            i++;
        }
        if(s.charAt(0)=='+')
           i++;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            num=num*10+(s.charAt(i)-'0');
            if(num*sign<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            else if(num*sign>Integer.MAX_VALUE)
                 return Integer.MAX_VALUE;
            i++;
            
        }
        return sign*(int)num;
    }
}