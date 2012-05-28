#Build script

#cd into the home directory - so you can run the script from vim or anywhere else
cd ~/dev/workspace/java/sandbox/hfj-excercises/ 

#Clean up
rm -rf build/*
rm -rf dist/*

#First cd into the src dir
cd src

#Now compile - note the use of a seperate lib (in non-dex format!)
echo Compile the java code
javac -verbose -d ../build/ hfj/r02/$1.java 

#Back out
cd ..

#Now into build dir
cd build

#Now convert to dex format (need no-strict)
echo Now convert to dex format
dx --dex --verbose --no-strict --output=../dist/$1.dex.jar hfj

#Back out
cd ..

