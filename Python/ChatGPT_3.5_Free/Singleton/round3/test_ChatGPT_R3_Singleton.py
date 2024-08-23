import pytest
from ChatGPT_R3_Singleton import Singleton

@pytest.fixture(scope='function', autouse=True)
def reset_singleton():
    # Reset the Singleton instance before each test
    Singleton._instances.clear()

def test_singleton_creation():
    # Arrange
    singleton1 = Singleton()
    singleton2 = Singleton()

    # Act
    singleton1.set_value('test_value')
    
    # Assert
    assert singleton1 is singleton2, "Singleton instances should be the same"
    assert singleton1.get_value() == singleton2.get_value(), "Singleton values should be the same"

def test_singleton_set_value():
    # Arrange
    singleton = Singleton()
    
    # Act
    singleton.set_value('new_value')
    
    # Assert
    assert singleton.get_value() == 'new_value', "Singleton value should be 'new_value'"

def test_singleton_initial_value():
    # Arrange
    singleton = Singleton()
    
    # Act
    initial_value = singleton.get_value()
    
    # Assert
    assert initial_value is None, "Initial value of Singleton should be None"
