import pytest
from Copilot_R1_Singleton import Singleton

# Pytest code with 100% branch coverage

def test_singleton_instance():
    # Arrange
    instance1 = Singleton.get_instance()
    instance2 = Singleton.get_instance()

    # Act
    result = instance1 is instance2

    # Assert
    assert result is True

def test_singleton_exception():
    # Arrange
    with pytest.raises(Exception) as excinfo:
        # Act
        Singleton()

    # Assert
    assert str(excinfo.value) == "Singleton instance already exists!"