import pytest
from ChatGPT_R2_Singleton import Singleton

def test_singleton_instance_creation():
    # Arrange
    instance1 = Singleton()
    instance2 = Singleton()

    # Act & Assert
    assert instance1 is instance2  # Both should be the same instance

def test_singleton_value_setting():
    # Arrange
    instance = Singleton()
    value = 10

    # Act
    instance.set_value(value)

    # Assert
    assert instance.get_value() == value

def test_singleton_reset():
    # Arrange
    instance1 = Singleton()
    instance1.set_value(20)

    # Act
    instance1.reset()
    instance2 = Singleton()

    # Assert
    assert instance1 is not instance2  # New instance after reset
    assert instance2.get_value() is None  # Ensure the new instance has reset value
