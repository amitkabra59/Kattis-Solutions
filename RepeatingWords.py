def repeatTest(l):
    res=[]
    if len(inp)<=80:
        for item in l[0]:
            if item in res:
                message='no'
                break
            else:
                res.append(item)
                message='yes'
    return message

inp = input() #User input is stored here
l = list() 
l.append(inp.split(' '))
message=''
print(repeatTest(l))
