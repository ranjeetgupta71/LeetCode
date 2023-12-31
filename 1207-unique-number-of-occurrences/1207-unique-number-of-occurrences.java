class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        HashSet<Integer> seen = new HashSet<>();
        
        for(int num: hm.values()){
            if(!seen.add(num)){
                return false;
            }
        }
        
        
        
        return true;
    }
}