[ $# -eq 0 ] && { echo "Usage: $0 class_name"; exit 1; }

echo "package hfj.r03;" >> $1.java
echo "class "$1"{" >> $1.java
echo "	// code" >> $1.java
echo "}" >> $1.java
