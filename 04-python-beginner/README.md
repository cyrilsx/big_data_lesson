
Installation python
===
http://www.python.org/Download

Launch the interpreter
===
```
$ python
```

Basic operation in python
===
Arithmetic operator (+, -, /, %, *, //, **)
---
```
>>> 1 + 1
2
>>> 10 - 1
9
>>> 2 * 2
4
>>> 20 / 7
2
>>> 20 % 7
6
>>> 20 / 7
2.857142857142857
>>> 20.0 // 7
2.0
>>> 2**3
8
```
Logicals/bitwise operators (and, or, xor, not, shift)
---
```
>>> True & True
True
>>> True & False
False
>>> True | False
True
>>> ~True
False
>>> 60 & 13
12 
>>> 4 << 2
16
>>> 4 >> 2
1
```
Assignment operators
---
```
>>> a = 3
>>> a
3
>>> a += 3
>>> a
6
```
Idem with all arithmetic operators

Membership operators
---
```
>>> 'a' not in 'abcdef'
False
>>> 'a' in 'abcdef'
True
```

Operators precedence
---

| No. | Operator                                                                       |
|-----|--------------------------------------------------------------------------------|
| 1   | **                                                                             |
| 2   | ~ + -                                                                          |
|     | Complement, unary plus and minus (method names for the last two are +@ and -@) |
| 3   | * / % //                                                                       |
|     | + -                                                                            |
| 4   | >> <<                                                                          |
| 5   | &                                                                              |
| 6   | ^ |                                                                            |
| 7   | <= < > >=                                                                      |
| 8   | == !=                                                                       |
| 9   | = %= /= //= -= += *= **=                                                       |
| 9   | is is not                                                                      |


Conditions
---
```
from random import randint
limit = 18
age = random(0, 100)
if age < 18:
    print("you're too young for anything")
elif age >= 18 and age < 100:
    print("you're good to go")
else:
    print("you're too old for anything...")
```

Loops
---
for allows to loop with predefine collection size
```
for i in range(0, 10):
    print(i, end='')
    
# output
# 123456789
```
while allows to loop without knowing how much we are going to iterate
```
n = 0
while n < 10
    print(i, end='')
    n += 1
```
do while does not exist in python

Types in python
---
 - Dictionnary
 - List
 - Tuple
 - String
 - Int
```
>>> type([]) is list
True
>>> type({}) is dict
True
>>> type('') is str
True
>>> type(1) is int
True
>>> type(("cyril", 1)) is tuple
True
```