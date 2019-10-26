import java.util.*;
import java.lang.*;
import java.io.*;
public class Inversion {
	public static void main (String[] args) {
                            
		Scanner sc=new Scanner(System.in);
System.out.println("enter the no. of pids");
		int n=sc.nextInt();
		int a[]=new int[n];
System.out.println("Enter the pids");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println("total no of inversions is "+divide(a,0,a.length-1));
	}
	static int divide(int a[],int l,int r){
	    int count=0;
	    if(l<r){
	        int mid=(l+r)/2;
	        count+=divide(a,l,mid);
	        count+=divide(a,mid+1,r);
	        count+=merge(a,l,mid,r);
	    }
	    return count;
	}
	static int merge(int a[],int l,int m,int r){
                  int n1=m-l+1;   int n2=r-m;
	    int L[]=new int[n1];    int R[]=new int[n2];
	    int i=0,j=0,count=0,k=l;
	    for(i=0;i<n1;i++){
	        L[i]=a[l+i];
	    }
	    for(j=0;j<n2;j++){
	        R[j]=a[m+1+j];
	    }
	    i=0;j=0;
	    while(i<n1&&j<n2){
	        if(L[i]>R[j])
	        {
	            a[k++]=R[j++];
	            count+=n1-i; 
	    }
	    else{
	        a[k++]=L[i++];  
	    }}
	    while(i<n1){
	        a[k++]=L[i];
	        i++;
	    }
	    while(j<n2){
	        a[k++]=R[j++];
	    }
	    return count;}}
