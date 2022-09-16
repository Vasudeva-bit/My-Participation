def wrap(string, max_width):
    l = 0
    out = ""
    while(l < len(string)) :
        out += string[l:min(len(string), l+max_width)]+"\n"
        l += max_width
    return out