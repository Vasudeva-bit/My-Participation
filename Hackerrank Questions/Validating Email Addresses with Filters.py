import re

def fun(s):
    return bool(re.match(r"^[a-zA-Z0-9\-_]{1,}\@[a-zA-Z0-9]{1,}\.[a-zA-Z]{1,3}$", s))