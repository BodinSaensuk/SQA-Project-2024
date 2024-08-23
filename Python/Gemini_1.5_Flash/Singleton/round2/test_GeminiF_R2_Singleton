import pytest
from GeminiF_R2_Singleton import Singleton

# Pytest Tests
def test_singleton_instance():
    # Arrange
    instance1 = Singleton()
    instance2 = Singleton()

    # Act and Assert
    assert instance1 is instance2

def test_some_method():
    # Arrange
    singleton = Singleton()
    value = 5

    # Act
    result = singleton.some_method(value)

    # Assert
    assert result == 10