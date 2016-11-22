#!/bin/bash
echo "Enter username file <space> password file";
read user password
wc -l < ~/$user >uc
wc -l < ~/$password >pc
declare -a myUser
myUser=( `cat $user`)
declare -a myPasswd
myPasswd=( `cat $password`)
if [ `cat uc` == `cat pc` ]
then 
	echo "Number of user and number of password matches"
	length=${#myUser[@]}
	for ((i=0;i<$length;i++)); do
	sudo useradd ${myUser[$i]}
	echo -e "${myPasswd[$i]}\n${myPasswd[$i]}" | sudo passwd -q ${myUser[$i]}
        echo -e "${myUser[$i]} : ${myPasswd[$i]}"
	done
else
	echo "Does not match number of users and number of passwords"
	exit
fi
