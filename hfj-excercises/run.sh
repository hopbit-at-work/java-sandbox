#Run script for the demo console app

#cd into the home directory - so you can run the script from vim or anywhere else
cd ~/dev/workspace/java/sandbox/hfj-excercises/

#Notice that the DEX version of the .jar is used with java
java -jar ./dist/$1.dex.jar hfj.r03.$1

