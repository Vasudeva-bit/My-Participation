class A:
    def bio(self):
        print("Bio")
class B(A):
    def hobbies(self):
        print("Hobbies")
class C(B):
    def marks(self):
        print("The marks is 100")
ob = C()
ob.marks()
ob.hobbies()
ob.bio()