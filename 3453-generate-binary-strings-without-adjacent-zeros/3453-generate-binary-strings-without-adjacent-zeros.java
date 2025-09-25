class Solution {
       public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        validStrings(n,ans,"");
        return ans;
    }

    private void validStrings(int n, List<String> ans,String processing) {
        if(processing.length()==n){
            ans.add(processing);
            return;
        }
        if(processing.length()==0 || processing.charAt(processing.length()-1)!='0'){
            validStrings(n,ans,processing+'0');
        }
        validStrings(n,ans,processing+'1');
    }
}