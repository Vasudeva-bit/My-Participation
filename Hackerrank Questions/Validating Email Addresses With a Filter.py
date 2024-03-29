def fun(email):
    #using try block
    try:
        # splitting the name and url of the email adress
        username, url = email.split('@')
        website, extension = url.split('.')
        
   # raise error if the email is not valied     
    except ValueError:
        return False

    # we are not replacing the - and _ 
    if username.replace('-', '').replace('_', '').isalnum() is False:
        return False
    
    # checking if all characters are alphabets and numerics
    elif website.isalnum() is False:
        return False
    
    # checking if the length is less than 3
    elif len(extension) > 3:
        return False
    else:
        return True