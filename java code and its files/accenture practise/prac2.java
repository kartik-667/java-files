import java.util.*;


class pair{
    char val;
    int freq;

    pair(char v, int f){
        val=v;
        freq=f;
    }
}

public class prac2 {


    static void solve(int n,ArrayList<Integer> arr, Integer idx,
         ArrayList<Integer> ans
    ){
        if(idx>=arr.size()){
            return;
        }

        if(arr.get(idx)==n){
            ans.add(idx);
        }
        solve(n,arr,idx+1,ans);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(freq.get(curr)==null){
                freq.put(curr,1);

            }else{
                freq.put(curr,freq.get(curr)+1);
            }
        }

        ArrayList<pair> arr=new ArrayList<>();

        for(Character c:freq.keySet()){
            int val=freq.get(c);
            arr.add(new pair(c,val));
        }

        Collections.sort(arr,(a,b) -> {
            if(a.freq != b.freq){
                return b.freq - a.freq;
            }else{
                return Character.compare(a.val, b.val);
            }
        });

        for(pair p:arr){
            System.out.println(p.val);
        }

        System.out.println(arr);
        



        // String curr="123";
        // curr.
        // System.out.println(123);
        // int n=sc.nextInt();
        // ArrayList<Integer> arr=new ArrayList<>();
        // ArrayList<Integer> ans=new ArrayList<>();
        // arr.add(1);
        // arr.add(1);
        // arr.add(1);
        // arr.add(1);
        // arr.add(1);
        // solve(1,arr,0,ans);
        // System.out.println(ans);



        // if(n>=1 && n<=26){
        //     System.out.println(n);
        // }else{
        //     int sum=n;
        //     while(sum>26){
        //         int temp=0;
        //         int t=sum;
        //         while(t>0){
        //             int last=t%10;
        //             temp+=last;
        //             t/=10;
        //         }
        //         sum=temp;
        //     }
        //     System.out.println(sum);
        // }

    }
}
