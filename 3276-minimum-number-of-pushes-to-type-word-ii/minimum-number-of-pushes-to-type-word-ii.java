
class Solution {
    public int minimumPushes(String word) {
      HashMap<Character,Integer>map=new HashMap<>();
      for(int i=0;i<word.length();i++){
        if(map.containsKey(word.charAt(i))){
            map.put(word.charAt(i),map.get(word.charAt(i))+1);
        }else{
            map.put(word.charAt(i),1);
        }
      }
      ArrayList<Integer>list=new ArrayList<>();
      for (Integer value : map.values()) {
            list.add(value);
        }
        Collections.sort(list,Collections.reverseOrder());
        int count=0;
        for(int j=0;j<list.size();j++){
            if(j>=0 && j<8){
                count+=list.get(j);
            }else if(j>=8 && j<16){
                count+=list.get(j)*2;
            }else if(j>=16 && j<24){
                count+=list.get(j)*3;
            }else if(j>=24){
                count+=list.get(j)*4;
            }
        }
        return count;
    }
}