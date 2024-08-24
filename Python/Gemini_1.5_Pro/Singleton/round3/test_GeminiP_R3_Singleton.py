import pytest
from GeminiP_R3_Singleton import Singleton
def test_singleton_instance():
    # Arrange
    s1 = Singleton.get_instance()
    s2 = Singleton.get_instance()

    # Act
    # No action needed for this test

    # Assert
    assert s1 is s2


def test_singleton_exception():
    # Arrange
    Singleton.get_instance()  # Create the first instance

    # Act & Assert
    with pytest.raises(Exception):
        Singleton()  # Attempting to create another instance should raise an exception


# Additional tests for 100% branch coverage
# - Test any methods or properties of the Singleton class
# - Consider edge cases or error scenarios