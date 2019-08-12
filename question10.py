
import math
i = 3

sum = 2

while i<2000000:

    for x in range(3, (int)(math.sqrt(i))+1):
        if i % x == 0:
            break
    else:
        sum=sum+i


    i =i+ 2

print(sum)