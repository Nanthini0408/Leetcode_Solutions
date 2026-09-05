class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        char top;
        Stack<Character> m=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' ||ch=='{')
                m.push(ch);
            else{
                if(m.isEmpty())
                   return false;
                top=m.pop();
                if((ch==')' && top!='(') || (ch==']' && top!='[') || (ch=='}' && top!='{'))
                    return false;
            }
        }
        return m.isEmpty();
    }
}