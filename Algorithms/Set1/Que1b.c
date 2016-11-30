#include<stdio.h>
int main()
{
 int x,i,n,j;
 int s[50];
 printf("enter number of elemets\n");
 scanf("%d",&n);
 printf("enter the set of real numbers in sorted order\n");
 for(i=0;i<n;i++)
  scanf("%d", &s[i]);
 printf("enter the value of x\n");
 scanf("%d",&x);
 i=0;
 j=n-1;
while(i<j)
 {
   if((s[i]+s[j])==x)
    {
      printf("the sum of %d and %d is equal to %d\n",s[i],s[j],x);
      return 1;
    }
   else if((s[i]+s[j])<x)
        i++;
   else
        j--;
}
if(i==n-1 || j==0)
  printf(" there are no two numbers whose sum is equal to %d\n",x);
return 0;
}
