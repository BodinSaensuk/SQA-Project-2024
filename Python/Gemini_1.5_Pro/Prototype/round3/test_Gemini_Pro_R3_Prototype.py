import pytest
from Gemini_Pro_R3_Prototype import ConcretePrototypeA

def test_clone_concrete_prototype_a():
    # Arrange
    prototype = ConcretePrototypeA()

    # Act
    clone = prototype.clone()

    # Assert
    assert clone.property1 == prototype.property1
    assert clone.property2 == prototype.property2