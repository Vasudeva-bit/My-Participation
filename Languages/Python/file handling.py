x = 99
f = open("file.txt", "w")
f.write(str(x))
f.write(str([1, 2, 3]))
f.write(str(56.4))
f.close()
f = open("file.txt", "r")
print(f.read())
f.close()
# pickling

import pickle
f = open("test.txt", "wb")
pickle.dump([1,2,3], f)
pickle.dump(99.6, f)
f.close()
f = open("test.txt", "rb")
x = pickle.load(f)
print(x)
x = pickle.load(f)
print(x)
f.close()