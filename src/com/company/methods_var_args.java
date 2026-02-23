package com.company;

public class methods_var_args {
    static int sum(int ...arrs){
        //here ...arrs is store all values like array store numbers, int [] arr;
        int result =0;
        for(int i=0;i<arrs.length;i++) {
            result=result+arrs[i];
        }
//        for (int e:arrs){
//
//            result=result+e;
//        }
        return result;
        }
    public static void main(String[] args) {
        System.out.println("sum of 1,2&3: "+sum(1,2,3) );
    }


}
