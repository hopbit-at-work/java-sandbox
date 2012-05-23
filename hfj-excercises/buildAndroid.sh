#Simple Build Script

echo $1

#Clean up
echo Clean up
if [ -f $1.class ]; then
	rm $1.class
fi

if [ -f $1.jar ];then
	rm $1.jar
fi

#First compile hello.java
echo First compile the java 
javac -verbose $1.java

#Now convert to dex file
echo Now convert to dex format
dx --dex --verbose --output=$1.jar ./$1.class


