package com.Xplusz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int array[] = new int[10];
        for(int i=0;i<10;i++)
        {
            array[i] = (int)(Math.random()*10+10);

        }
        int temp =0;
        for(int i=0;i<array.length;i++){
            for(int j=array.length-1;j>i;j--){
                if(array[j-1]>array[j]){
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println( array[i] );
        }
    }
}
