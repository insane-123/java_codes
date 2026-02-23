public class maxValueRiya {
    public static void main(String[]args){
        int arr[]={10,20,30,40};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum value is: "+max);
    }
}
