## Take 2 numbers as inputs and find their HCF and LCM.

Start
Input X, Y
a = X
b = Y

While b != 0:
    temp = b
    b = a % b
    a = temp

HCF = a
LCM = (X * Y) / HCF

Output "HCF: " + HCF
Output "LCM: " + LCM
Stop

# Logic
Start
Input X, Y
Find prime factorizations of X and Y
Output "HCF: " + product of lowest power of common prime factors
Output "LCM: " + product of highest power of all prime factors
Stop