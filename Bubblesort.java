import java.util.*;
class Bubblesort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size : ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements : ")
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Before sorting : ");
show(a);
bubble(a,n);
System.out.println();
System.out.println("After sorting : ");
show(a);
}
static void bubble(int a[],int n)
{
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1;j++)
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
}
static void show(int a[])
{
for(int i:a)
System.out.print(i+" ");
}
}

output:

Enter array size : 
9
Enter array elements : 
14 11 13 8 10 12 8 2 6
Before sorting : 
14 11 13 8 10 12 8 2 6 
After sorting : 
2 6 8 8 10 11 12 13 14 