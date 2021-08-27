import pytest

#Sum of two numbers
def test_add():
    #initialize numbers
    num1 = 35
    num2 = 10

    #addtion
    sum = num1 + num2

    #assertion
    assert sum == 45

#Difference of two numbers
def test_minus():
    #initialize numbers
    num1 = 35
    num2 = 10

    #subtract
    diff = num1 - num2

    #assertion
    assert diff == 20

#Product of two numbers
def test_multiply():
    #initialize numbers
    num1 = 35
    num2 = 10

    #multiply
    prod = num1 * num2

    #assertion
    assert prod == 350

#Quotient of two numbers
def test_divide():
    #initialize numbers
    num1 = 30
    num2 = 10

    #divide
    quot = num1 / num2

    #assertion
    assert quot == 3
