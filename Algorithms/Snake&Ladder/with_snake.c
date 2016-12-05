#include<stdio.h>
int i,j,ladder=0,snake=0,start,end,max=0,move=0,move_count=0;
int k=0,snake_pos[10],a[10],b[10],x[10],var,move_snake=10;
int board[30] = 
{
	0, 0, 19,  0,   3,  0,
	0, 0,  0,  0,  15,  0,
	0, 0,  0,  0, -13,  0,
      -12, 9,-12,  0,   0,  0,
	0, 0,-26,  0,   0,  0
};

int no_of_moves(int start, int end)
{
while(start<=end)
{
if((end-start)==0)
return move_count;
else if(end-start<=6)
{
++move_count;
return move_count;
}
for(i=(start+1);i<=end;i++)
{
if((board[i]>max) && ((start+(i-start)+board[i])<=end))
{
max=(int)board[i];
move=(i-start);
}
else if(max==0)
{
move=6;
if(board[start+move]<0)
move=5;
}
}
move_count++;
if((start+move+board[start+move])<=end)
start=start+move+board[start+move];
else
start=start+move;
max=0;
move=0;
}
}

void main()
{
for(i=0;i<30;i++)
{
	if(board[i]>0)
	ladder++;
	else if(board[i]<0)
	snake++;
}
printf("Number of ladders: %d\nNumber of snakes: %d\n",ladder,snake);
for(i=0;i<30;i++)
{
	if(board[i]<0)
	{
	snake_pos[k]=i;
	k++;
	}
}
for(k=0;k<snake;k++)
{
a[k]=no_of_moves(0,snake_pos[k]);
move_count=0;
var=snake_pos[k]+board[snake_pos[k]];
b[k]=no_of_moves(var,29);
move_count=0;
x[k]=a[k]+b[k];
}
for(k=0;k<snake;k++)
{
if(x[k]<move_snake)
move_snake=x[k];
}
printf("Number of minimum moves after encountering snake: %d\n",move_snake);
}
