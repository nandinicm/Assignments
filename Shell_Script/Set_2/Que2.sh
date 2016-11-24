#!/bin/bash
if [ $# -eq 0 ]
  then
    echo "No directory specified. Using current directory as default"
  else
    cd "$1"
fi
myDir=razorthink`pwd | replace / _`
ls -a1rRS
mv $2 $myDir
for f in *
do
    if [ -d "$f" ]
    then
        for ff in $f/*
        do      
            actualsize=$(du -k "$ff" | cut -f 1)
    if [ $actualsize -eq 0 ]
	then
	  rm -i $ff
    fi
        done
    else
        actualsize=$(du -k "$f" | cut -f 1)
    if [ $actualsize -eq 0 ]
	then
	  rm -i $f
    fi
    fi
done
rename 's/'$2'//g' *.*
rename 's/'$2'//g' ./*/*
