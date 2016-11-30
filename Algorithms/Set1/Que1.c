#include<stdio.h>
int s[50],b[50];

void merging(int low, int mid, int high) 
{
   int l1, l2, i;

   for(l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++) {
      if(s[l1] <= s[l2])
         b[i] = s[l1++];
      else
         b[i] = s[l2++];
   }
   
   while(l1 <= mid)    
      b[i++] = s[l1++];

   while(l2 <= high)   
      b[i++] = s[l2++];

   for(i = low; i <= high; i++)
      s[i] = b[i];
}

void sort(int low, int high) {
   int mid;
   
   if(low < high) {
      mid = (low + high) / 2;
      sort(low, mid);
      sort(mid+1, high);
      merging(low, mid, high);
   } else { 
      return;
   }   
}
int main()
{
 int x,i,n,j;
 
 printf("enter number of elemets\n");
 scanf("%d",&n);
 printf("enter the set of real numbers\n");
 for(i=0;i<n;i++)
  scanf("%d", &s[i]);
  sort(0,n);
 printf("enter the value of x\n");
 scanf("%d",&x);
 i=1;
 j=n;
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
if(i==n-1 || j==0 || i==j)
  printf(" there are no two numbers whose sum is equal to %d\n",x);
return 0;
}
