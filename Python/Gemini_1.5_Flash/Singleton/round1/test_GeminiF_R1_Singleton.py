import pytest
from GeminiF_R1_Singleton import Singleton

# Pytest tests for 100% branch coverage
def test_singleton_instance():
    singleton1 = Singleton()
    singleton2 = Singleton()
    assert singleton1 is singleton2

def test_my_method_positive():
    singleton = Singleton()
    result = singleton.my_method(5)
    assert result == 10

def test_my_method_negative():
    singleton = Singleton()
    result = singleton.my_method(-3)
    assert result == -6

def test_my_method_zero():
    singleton = Singleton()
    result = singleton.my_method(0)
    assert result == 0