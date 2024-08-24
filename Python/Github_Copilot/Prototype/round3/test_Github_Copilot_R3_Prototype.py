import pytest
from Github_Copilot_R3_Prototype import ConcretePrototype1, ConcretePrototype2

def test_concrete_prototype1_clone():
    # Arrange
    prototype = ConcretePrototype1(10)
    
    # Act
    clone = prototype.clone()
    
    # Assert
    assert clone is not prototype
    assert clone.value == prototype.value

def test_concrete_prototype2_clone():
    # Arrange
    prototype = ConcretePrototype2(20)
    
    # Act
    clone = prototype.clone()
    
    # Assert
    assert clone is not prototype
    assert clone.value == prototype.value

def test_concrete_prototype1_clone_with_different_value():
    # Arrange
    prototype = ConcretePrototype1(30)
    
    # Act
    clone = prototype.clone()
    
    # Assert
    assert clone is not prototype
    assert clone.value == prototype.value

def test_concrete_prototype2_clone_with_different_value():
    # Arrange
    prototype = ConcretePrototype2(40)
    
    # Act
    clone = prototype.clone()
    
    # Assert
    assert clone is not prototype
    assert clone.value == prototype.value