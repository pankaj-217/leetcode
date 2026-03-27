class Solution {

public void print(int cur,int n,List<Integer>list){
    if(cur>n) return;
    list.add(cur);
    for(int i=0;i<=9;i++){
        print(cur*10+i,n,list);
    }
}

    public List<Integer> lexicalOrder(int n) {
        List<Integer> list =new ArrayList<>();
        for(int i=1;i<=9;i++){
            print(i,n,list) ;

        }
        return list;
    }
}