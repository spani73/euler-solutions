import math
i = 3
count = 1
prime = 2

while count < 10001:

    for x in range(3, (int)(math.sqrt(i))+1):
        if i % x == 0:
            break
    else:  
        prime = i
        count += 1

    i =i+ 2

print(prime)