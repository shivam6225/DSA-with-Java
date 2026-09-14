## Input a year and find whether it is a leap year or not.

Start
Input year
if year % 100 == 0:
    if year % 400 == 0:
       output "leap year"
    else:
       output "not a leap year"
else if year%4 == 0:
    output "leap year"
else
    output "not a leap year"
Stop
