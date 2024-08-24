import pytest
from GeminiP_R2_Singleton import MySingleton
def test_singleton_creation():
    # Arrange
    instance1 = MySingleton()
    instance2 = MySingleton()

    # Act
    # No explicit action needed

    # Assert
    assert instance1 is instance2, "Both instances should refer to the same object"


def test_singleton_attributes():
    # Arrange
    instance = MySingleton()
    instance.attribute = "test_value"

    # Act
    another_instance = MySingleton()

    # Assert
    assert another_instance.attribute == "test_value", "Attributes should be shared across instances"


# Additional Pytest tests can be added here to achieve 100% branch coverage
# For example, test edge cases, error handling, or interactions with other parts of your code.