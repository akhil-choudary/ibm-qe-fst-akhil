public class Activity2 {
    public static void main(String[] args) {
        int arr[]= {10, 77, 10, 54, -11, 10};
        int Count=0;
        boolean Result = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==10){
                Count+=1;
            }
        }
        if(Count==3){
            Result= true;
        }
        System.out.println(Result);
        


    }
    
}
