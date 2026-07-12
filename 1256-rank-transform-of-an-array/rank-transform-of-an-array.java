class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int copy[]=new int[arr.length];
        int temp=0;
        for(int i=0;i<copy.length;i++)
        {
            copy[i]=arr[i];
        }
        Arrays.sort(copy);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<copy.length;i++)
        {
            if(map.containsKey(copy[i]))
            {
                temp=map.get(copy[i]);
                continue;
            }
            map.put(copy[i],++temp);
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}