import pytest
from Gemini_Pro_R2_Prototype import Circle, Rectangle

def test_circle_clone():
    circle = Circle(5)
    cloned_circle = circle.clone()

    assert isinstance(cloned_circle, Circle)
    assert cloned_circle.radius == circle.radius

def test_rectangle_clone():
    rectangle = Rectangle(4, 3)
    cloned_rectangle = rectangle.clone()

    assert isinstance(cloned_rectangle, Rectangle)
    assert cloned_rectangle.width == rectangle.width
    assert cloned_rectangle.height == rectangle.height