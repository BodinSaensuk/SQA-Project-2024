import pytest
from Gemini_Flash_R2_Prototype import Circle, Rectangle

def test_circle_clone():
    circle = Circle(10, 20, 5)
    clone = circle.clone()
    assert clone.x == circle.x
    assert clone.y == circle.y
    assert clone.radius == circle.radius

def test_rectangle_clone():
    rectangle = Rectangle(30, 40, 6, 8)
    clone = rectangle.clone()
    assert clone.x == rectangle.x
    assert clone.y == rectangle.y
    assert clone.width == rectangle.width
    assert clone.height == rectangle.height

def test_circle_draw():
    circle = Circle(50, 60, 10)
    circle.draw()

def test_rectangle_draw():
    rectangle = Rectangle(70, 80, 12, 14)
    rectangle.draw()