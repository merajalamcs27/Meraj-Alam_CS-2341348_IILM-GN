import java.util.*;
class a1twosum{

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,6};
        Scanner sc  = new Scanner(System.in);
        
        // for(int i =0;i<arr.length;i++){
            //     arr[i] = (int)(Math.random()*10);
            // }
            for(int i = 0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        System.out.println("Enter the target");
        int target = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],i );
        }
        for(int i = 1;i<arr.length;i++){
            int need = target - arr[i];
            if(map.containsKey(need)){
                if(i!= map.get(need)){
                System.out.println(i+ " " +map.get(need));
                break;

                }
            }


        }
       
    

    }
}