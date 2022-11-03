# Enter your code here. Read input from STDIN. Print output to STDOUT
import numpy

numpy.set_printoptions(sign=' ')

a = numpy.array(input().split(),float)

print(numpy.floor(a))
print(numpy.ceil(a))
print(numpy.rint(a))