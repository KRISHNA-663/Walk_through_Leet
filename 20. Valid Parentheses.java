class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
         for(char a : s.toCharArray()){
            switch(a){
            case '{':
            stack.push(a);
            break;
            case '(':
            stack.push(a);
            break;
            case '[':
            stack.push(a);
            break;
            case '}':
            if(stack.isEmpty()){
                return false;
            }
            if(stack.pop()!='{'){
                return false;
            }
            break;
            case ')':
            if(stack.isEmpty()){
                return false;
            }
            if(stack.pop()!='('){
                return false;
            }
            break;
            case ']':
            if(stack.isEmpty()){
                return false;
            }
            if(stack.pop()!='['){
                return false;
            }
            break;
         }
         }
         if(stack.isEmpty()){
             return true;
         }
         return false;
    }

}