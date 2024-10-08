import pytest
from Copilot_R2_Singleton import Singleton

# Pytest test case

def test_singleton():
    # Arrange
    instance1 = Singleton.get_instance()
    instance2 = Singleton.get_instance()

    # Act
    result = instance1 is instance2

    # Assert
    assert result is True