def count_substring(string, sub_string):
    count = 0
    for i in range(len(string)-len(sub_string)+1) :
        if(sub_string == string[i:i+len(sub_string)]) :
            count = count + 1
    return count