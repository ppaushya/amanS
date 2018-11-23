import java.util.Scanner;

public class NextLeast3 {
  public void  bubbleSortArray(int[] arr) {
    //a=new int[size];
    int temp1=0;
    for(int i=0;i<arr.length;i++)
    {
    for(int j=i+1;j<arr.length;j++)
    {
    if(arr[j]<arr[i])
      {
    temp1=arr[i];
    arr[i]=arr[j];
    arr[j]=temp1;
      }
   
    }
   
    }
    }
public int findSmallestElement(int[] ar2,int r1)
    {
    int min=0,flag=0;
    bubbleSortArray(ar2);
    /* for(int i=0;i<r1;i++)
    {
    System.out.println(ar2[i]);
    }*/
    for( int i=0;i<r1-1;i++)
    {
    if(ar2[i+1]-ar2[i]>1)
   
    {
    min=ar2[i]+1;
    flag=1;
    break;
    }
    }
    if(flag==0)
    {
    min=ar2[r1-1]+1;
    }
   
    return min;
    }

public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
NextLeast3  ex=new NextLeast3 ();
System.out.println("Enter the no.of rows and cols for Array ");
int r1=scan.nextInt();
int c1=scan.nextInt();
 
int[][] arr1=new int[r1][c1];
System.out.println("Enter the elements of Array");

for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
arr1[i][j]=scan.nextInt();
}
}
int[] arr3=new int[r1];
for(int i=0;i<r1;i++)
{
int[] arr2=new int[c1];
for(int j=0;j<c1;j++)
{
arr2[j]=arr1[i][j];
 
}
 
    arr3[i]=ex.findSmallestElement(arr2,r1);
 
 
}
System.out.println("Smallest Min of columns");
for(int l=0;l<r1;l++)
{
System.out.println(arr3[l]);
}
 
}

}
