import pytest
from Github_Copilot_R1_Prototype import ConcretePrototype1, ConcretePrototype2

def test_concrete_prototype1_clone():
    # Arrange
    original = ConcretePrototype1(10)
    
    # Act
    clone = original.clone()
    
    # Assert
    assert clone is not original
    assert clone.value == original.value

def test_concrete_prototype2_clone():
    # Arrange
    original = ConcretePrototype2(20)
    
    # Act
    clone = original.clone()
    
    # Assert
    assert clone is not original
    assert clone.value == original.value