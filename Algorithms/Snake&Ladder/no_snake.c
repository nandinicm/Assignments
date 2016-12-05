#include<stdio.h>
int i,j,ladder=0,snake=0,start=0,end=29,max=0,move=0,move_count=0;
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
for(i=(start+1);i<(start+7);i++)
{
if((board[i]>max) && ((start+(i-start)+board[i])<end))
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
if((start+move+board[start+move])<end)
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
printf("Number of minimum moves: %d\n",no_of_moves(start,end));
}
