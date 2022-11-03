# Enter your code here. Read input from STDIN. Print output to STDOUT
import numpy

n,m = map(int,input().split())
arr =  numpy.array([list(map(int,input().split())) for _ in range(n)])
print("{}\n{}\n{}\n".format(numpy.mean(arr,axis=1), numpy.var(arr,axis=0), round(numpy.std(arr),11)))