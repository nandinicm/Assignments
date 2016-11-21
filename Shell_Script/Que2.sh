#!/bin/bash
echo "Enter File name <space> Directory path";
read file1 path1;
echo "Enter Directory path";
file2=$path1/$file1;
if [ -e "$file2" ]
then
	rm $file2;
	echo "File found and deleted the file"
else 
	tar -cf test_archive.tar $path1;
	echo "File not found.. Archieved given directory"
fi
