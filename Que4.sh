#!/bin/bash
echo "Enter username file <space> password file";
read user password
wc -l < ~/$user >uc
wc -l < ~/$password >pc
if [ `cat uc` == `cat pc` ]
then 
	echo "Number of user and number of password matches"
	for i in `more $user`
	do
	echo $i
	sudo adduser $i
	done
else
	echo "Does not match number of users and number of passwords"
	exit
fi


