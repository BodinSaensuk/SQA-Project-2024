import pytest
from Gemini_Flash_R1_Prototype import function_prototype, class_prototype

def test_function_code():
    # Arrange
    expected_output = "def my_function():\n  pass"

    # Act
    new_function_code = function_prototype.clone()
    actual_output = new_function_code.code_string

    # Assert
    assert expected_output == actual_output

def test_class_code():
    # Arrange
    expected_output = "class MyClass:\n  pass"

    # Act
    new_class_code = class_prototype.clone()
    actual_output = new_class_code.code_string

    # Assert
    assert expected_output == actual_output