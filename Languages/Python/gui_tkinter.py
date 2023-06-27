from tkinter import *# module import
root = Tk()
root.geometry('600x400+50+50') # +50 and +50 is the pixel distance from the x and y axes of the screen
root.resizable(False, False)
Label(root, text="I Love You XXXXX", bg="green", fg="blue").place(x=10, y=10)
root.mainloop()

# refer to all the widgets examples in ppt python