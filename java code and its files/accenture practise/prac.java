import java.util.*;

public class prac {

    static ArrayList<String> extract(String str){

        ArrayList<String> arr=new ArrayList<>();
        
        int i=0;
        int n=str.length();
        //find first non space
        while(i<n && str.charAt(i)==' '){
            i++;
        }

        while(i<n){
            String word="";

            //skip space
            while(i<n && str.charAt(i)==' '){
                i++;
            }
            if(i>=n) break;
            while(i<n && str.charAt(i)!=' '){
                word=word + str.charAt(i);
                i++;
            }

            arr.add(word);
            

        }

        return arr;



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        ArrayList<String> res=extract(str);
        // System.out.println(res);
        ArrayList<String> temp=new ArrayList<>();

        for(String s:res){
            String news="";
            news=news+s.charAt(0) + s.charAt(s.length()-1);
            temp.add(news);

        }

        System.out.println(temp);

        int maxfreq=0;
        HashMap<String,Integer> freq=new HashMap<>();
        for(String s:temp){
            if(freq.get(s)==null){
                freq.put(s,1);
            }else{
                freq.put(s,freq.get(s)+1);
            }
            maxfreq=Math.max(maxfreq,freq.get(s));
        }

        // Set<String> ans=new Set<>();
        HashSet<String> ans=new HashSet<String>(); 
            
        
        for(String s:temp){
            if(freq.get(s) == maxfreq){
                ans.add(s);
            }
        }

        ArrayList<String> ans2=new ArrayList<>();
        for(String s:temp){
            if(ans.contains(s)){
                ans2.add(s);
                ans.remove(s);
            }
        }

        System.out.println(ans2);

    }
}
