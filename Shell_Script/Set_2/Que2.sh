#!/bin/bash
if [ $# -eq 0 ]
  then
    echo "No directory specified. Now using current directory as default"
else
    cd "$1"
fi
myDir=`pwd` 
ls -a1rRS
for file in *
do
    actualsize=$(du -k "$file" | cut -f 1)
    if [ $actualsize -eq 0 ]
	then
	  rm -i $file
    fi
done
rename 's/.txt//g' *.*
rename 's/.txt/razorthink/g' .*
