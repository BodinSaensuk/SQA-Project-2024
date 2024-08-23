import pytest
from GeminiF_R3_Singleton import Singleton
def test_singleton_instance():
    # Arrange
    singleton_1 = Singleton()
    singleton_2 = Singleton()

    # Act
    singleton_1.add_data("key1", "value1")

    # Assert
    assert singleton_1 is singleton_2
    assert singleton_2.get_data("key1") == "value1"