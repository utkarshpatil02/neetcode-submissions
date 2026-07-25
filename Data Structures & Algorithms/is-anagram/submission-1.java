class Solution {
    public boolean isAnagram(String s, String t) {
        // using 2 hash
        //  HashMap<Character,Integer> map1=new HashMap<>();
        //  for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     map1.put(ch,map1.getOrDefault(ch,0)+1); 
        //  }
        // HashMap<Character,Integer> map2=new HashMap<>();
        // for(int i=0;i<t.length();i++){
        //     char ch=t.charAt(i);
        //     map2.put(ch,map2.getOrDefault(ch,0)+1); 
        // }
        // if(map1.equals(map2)){
        //     return true;
        // }else{
        //     return false;
        // }
        // can also do this using only one hash

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}
