import calendar
import datetime

def day_finder(date) :
    day = datetime.datetime.strptime(date, "%m %d %Y").weekday()
    print((calendar.day_name[day]).upper())
date = input()
day_finder(date)