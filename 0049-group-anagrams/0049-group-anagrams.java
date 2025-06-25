// BruteForce
class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> ans =new ArrayList<>();
//         if (strs.length==0){
//             return ans;
//         }
//         int i=0;
       
//         for (int k = 0; k < strs.length; k++) {
//             int p=Anagramof(ans,strs[k]);
//             if(p==-1){
//                 ans.add(new ArrayList<>());
//                 ans.get(i).add(strs[k]);
//                 i++;
//             }
//             else{
//                 ans.get(p).add(strs[k]);
//             }
//         }
//         return ans;
//     }

//     private int Anagramof(List<List<String>> ans, String str) {
//         for (int i = 0; i < ans.size(); i++) {
//             if(isAnagram(ans.get(i).get(0),str)){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     private boolean isAnagram(String s, String str) {
//     if(s.length()!=str.length()){
//         return false;
//     }
//     HashMap<Character,Integer> map=new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             if(map.containsKey(s.charAt(i))){
//                 int old=map.get(s.charAt(i));
//                 map.replace(s.charAt(i),old,old+1);
//             }else{
//                 map.put(s.charAt(i),1);
//             }
//         }
//         for (int i = 0; i < str.length(); i++) {
//             if(map.containsKey(str.charAt(i))){
//                 int old=map.get(str.charAt(i));
//                 map.replace(str.charAt(i),old,old-1);
//                 if(map.get(str.charAt(i))==0){
//                     map.remove(str.charAt(i));
//                 }
//             }
//             else{
//                 return false;
//             }
//         }
//         return true;
//     }
// }
public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> map=new HashMap<>();
       for(String str:strs){
           char[] c=str.toCharArray();
           Arrays.sort(c);
           String s=new String(c);
           if(map.containsKey(s)){map.get(s).add(str);}
           else{
               map.put(s,new ArrayList<>());
               map.get(s).add(str);
           }
       }
       return new ArrayList<>(map.values());
    }
    }