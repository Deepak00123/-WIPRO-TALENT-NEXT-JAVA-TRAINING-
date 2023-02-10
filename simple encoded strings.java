import java.util.Scanner;
class SimpleEncodedArray {
public class Result
{
public final int OUTPUT1;
public final int OUTPUT2;
public Result(int out1,int out2)
{
 OUTPUT1=out1;
 OUTPUT2=out2;
}
}
public Result findOriginalFirstAndSum(int input1[],int
input2){
int array[]=new int[input2];//6
 array[input2-1]=input1[input2-1];
int sum=array[input2-1];
for(int i=input2-2;i>=0;i--){
 array[i]=input1[i]-array[i+1];
 sum+=array[i];
}
Result r=new Result(array[0], sum);
return r;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int array[]={7,6,8,16,12,3};//6
SimpleEncodedArray s=new SimpleEncodedArray();
Result r=s.findOriginalFirstAndSum(array,
array.length);
 System.out.println(r.OUTPUT1);
 System.out.println(r.OUTPUT2);
}
