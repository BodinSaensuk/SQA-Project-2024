import pytest
from ChatGPT_R1_Prototype import Shape

def test_shape_clone():
    # Arrange
    original_circle = Shape(1, "circle")
    original_square = Shape(2, "square")
    original_unknown = Shape(3, "triangle")

    # Act
    cloned_circle = original_circle.clone()
    cloned_square = original_square.clone()
    cloned_unknown = original_unknown.clone()

    # Assert
    assert cloned_circle.get_id() == 1
    assert cloned_circle.get_type() == "circle"
    assert cloned_circle.draw() == "Drawing a circle"

    assert cloned_square.get_id() == 2
    assert cloned_square.get_type() == "square"
    assert cloned_square.draw() == "Drawing a square"

    assert cloned_unknown.get_id() == 3
    assert cloned_unknown.get_type() == "triangle"
    assert cloned_unknown.draw() == "Unknown shape"

def test_shape_draw():
    # Arrange
    circle = Shape(1, "circle")
    square = Shape(2, "square")
    unknown = Shape(3, "triangle")

    # Act & Assert
    assert circle.draw() == "Drawing a circle"
    assert square.draw() == "Drawing a square"
    assert unknown.draw() == "Unknown shape"
