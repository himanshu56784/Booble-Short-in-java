#include<stdio.h>
void bubble2(int x[],int j);
void display(int x[]);
int j=0;
void show(int x[],int j,int n)
{
if(j==n)return;	
int t=0;
if(x[j]<x[j+1])
{
t=x[j];
x[j]=x[j+1];
x[j+1]=t;
display(x);
}
j++;
show(x,j,n);
}
void bubble(int x[],int n)
{
if(n==0)return;
show(x,j,n);
j=0;
bubble(x,n-1);
}
void display(int x[])
{
	for(int i=0;i<6;i++)
	printf("%-4d",x[i]);
	printf("\n\n");
   
}
void main()
{
	int x[]={65,4,3,43,2,8};
	int n=6;
	bubble(x,n-1);
}