import pytest
from ChatGPT_R1_Singleton import Singleton  # หรือจากที่อยู่ที่ถูกต้องของคลาส Singleton

def test_singleton_instance():
    # Arrange
    singleton1 = Singleton()
    singleton2 = Singleton()

    # Act
    # No specific action required, as we're just testing the instance

    # Assert
    assert singleton1 is singleton2, "Singleton instances should be the same"

def test_singleton_business_logic():
    # Arrange
    singleton = Singleton()

    # Act
    result = singleton.some_business_logic()

    # Assert
    assert result == "Business logic executed", "Business logic should execute correctly"
