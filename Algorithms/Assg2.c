#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int c,i,a,ii=0,j,temp,x[10000],y[10000],max,n,Nearest_Distance[100];
double Dis[1000], Dis_Copy[1000];
double getDistance(int i, int j);

void main() {
  time_t t;
  int i1,j1,k;
printf("Enter the number of random numbers you want\n");
 scanf("%d", &c);
 
printf("Enter the maximum value of random number\n");
 scanf("%d", &max);
srand((unsigned) time(&t));
printf("%d coordinates generated\n",c);
  for (i=0; i<c; i++) {
    x[i] = rand() % max;
    y[i] = rand() % max;
    printf("%d:%d\n",x[i], y[i]);
  }
printf("enter number of nearest points to the coordinate that you need\n");
 scanf("%d",&n);
printf("enter the index of desired coordinate\n");
 scanf("%d",&j);
printf("you have selected %d:%d coordinate\n",x[j],y[j]);
for(i=0; i<c ; i++) {
   if (i==j)
   continue;
   Dis[i]=getDistance(i,j);
   printf("Distance between %d and %d indices: %lf\n",i,j,Dis[i]);
   }
for (i1 = 0; i1 < c; i1++) {
      Dis_Copy[i1] = Dis[i1];
   }
for (i1 = 0; i1 < c; ++i1)
    {
        for (j1 = i1 + 1; j1 < c; ++j1)
        {
            if (Dis_Copy[i1] > Dis_Copy[j1])
            {
                a =  Dis_Copy[i1];
                Dis_Copy[i1] = Dis_Copy[j1];
                Dis_Copy[j1] = a;
            }
        }
    }
for(i1=1;i1<=n;i1++) {
for (j1=0;j1<c;j1++) {
if(Dis_Copy[i1]==Dis[j1])
printf("%d:%d\n",x[j1],y[j1]);
}}}
double getDistance(int i, int j)
{
    double distance;
    distance = sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i]-y[j]) *(y[i]-y[j]));
    return distance;
}
