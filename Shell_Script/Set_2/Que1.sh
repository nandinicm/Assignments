#!/bin/bash
PathFile="$1"
mkdir $(date +%Y%m%d%H%M%S) && cd $_
count=`wc -l < $1`
for i in $(seq "$count"); do
SinglePath=`sed -n "$[i]p" $PathFile`
cp -pr --parents $SinglePath `pwd`
done
myDir=`pwd`
tar -czf my_directory.tar.gz $myDir
