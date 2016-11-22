#!/bin/bash
PathFile="$1"
cat $PathFile
mkdir $(date +%Y%m%d%H%M%S) && cd $_
pwd
count=`wc -l < $1`
echo $count
for i in $(seq "$count"); do
SinglePath=`sed -n "$[i]p" $PathFile`
echo $SinglePath
ParentPath=`dirname $SinglePath | sed 's,^\(.*/\)\?\(*\),\2,'`
mkdir -p $ParentPath | cp -ap /$SinglePath $ParentPath
echo $ParentPath
done
myDir=`pwd`
echo $myDir
tar -czf my_directory.tar.gz $myDir
# vvip sed 's,^\(.*/\)\?\(*\),\2,'
