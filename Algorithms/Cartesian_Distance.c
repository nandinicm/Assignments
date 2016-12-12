#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int c,i,j,num,x[10000],y[10000],max,n;
double Dis[10000],Dis1[10000],temp;

double getDistance(int i, int j)
{
    double distance;
    distance = sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i]-y[j]) *(y[i]-y[j]));
    return distance;
}

void main() 
{
time_t t;
printf("Enter the number of random numbers and maximum value of random number\n");
scanf("%d %d", &c, &max);
srand((unsigned) time(&t));
printf("%d coordinates generated\n",c);
for (i=0; i<c; i++) 
{
    x[i] = rand() % max;
    y[i] = rand() % max;
    printf("%d %d:%d\n",i,x[i], y[i]);
}
printf("enter the index of desired coordinate\n");
scanf("%d",&j);
printf("you have selected %d:%d coordinate\n",x[j],y[j]);
printf("Enter number of nearest points\n");
scanf("%d",&num);
for(i=0; i<c ; i++) 
{
   if (i==j)
   continue;
   Dis[i]=Dis1[i]=getDistance(i,j);
}
for(j=0;j<num;j++) 
{
temp=max;
for(i=0;i<c;i++) 
{
if((Dis1[i]<temp) && (Dis1[i]!=0)) 
{
temp=Dis1[i];
n=i;
}
}
Dis1[n]=0;
printf("nearest points are %d:%d with distance of %lf\n",x[n],y[n],Dis[n]);
}
}
