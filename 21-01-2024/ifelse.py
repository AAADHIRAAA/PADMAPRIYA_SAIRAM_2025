#!/bin/python3
#if-else

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    if(n%2==0 and n>=6 and n<=20 or n%2!=0 ):   print("Weird")
    else:   print("Not Weird")
