# main idea: Validation of the data collected before adding into the main data pipelin!
import re
txt = "The rain in Spain"
print(re.search("ai", txt))
x = re.findall("ai", txt)
print(x)
data = "Python"
print("*", end='\n')
print(re.search("P. n", data))