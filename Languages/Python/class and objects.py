# class show:
#     x = 50
#     def s(self):
#         y = 90
#         print("Local Variable")
#         print("Instance Variable van be called using self ", self.x)
# ob1 = show()
# ob1.s()


# class get:
#     def show(self):
#         print("Address of self = ", id(self))
# ob = get()
# ob.show()


class get:
    def __init__(self):
        print("Address of self = ", id(self))
ob = get()