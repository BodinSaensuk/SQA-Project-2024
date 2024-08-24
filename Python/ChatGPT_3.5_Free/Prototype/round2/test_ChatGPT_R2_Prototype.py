import pytest
from ChatGPT_R2_Prototype import Car

def test_car_clone():
    # Arrange
    original_electric = Car("Model S", "Red", "electric")
    original_gasoline = Car("Mustang", "Blue", "gasoline")
    original_unknown = Car("X500", "Green", "unknown")

    # Act
    cloned_electric = original_electric.clone()
    cloned_gasoline = original_gasoline.clone()
    cloned_unknown = original_unknown.clone()

    # Assert
    assert cloned_electric.get_details() == "Model: Model S, Color: Red, Engine Type: electric"
    assert cloned_gasoline.get_details() == "Model: Mustang, Color: Blue, Engine Type: gasoline"
    assert cloned_unknown.get_details() == "Model: X500, Color: Green, Engine Type: unknown"

    assert cloned_electric.start_engine() == "Whirr... the electric engine is running silently!"
    assert cloned_gasoline.start_engine() == "Vroom... the gasoline engine roars to life!"
    assert cloned_unknown.start_engine() == "Unknown engine type, cannot start."

def test_car_start_engine():
    # Arrange
    electric_car = Car("Model S", "Red", "electric")
    gasoline_car = Car("Mustang", "Blue", "gasoline")
    unknown_car = Car("X500", "Green", "unknown")

    # Act & Assert
    assert electric_car.start_engine() == "Whirr... the electric engine is running silently!"
    assert gasoline_car.start_engine() == "Vroom... the gasoline engine roars to life!"
    assert unknown_car.start_engine() == "Unknown engine type, cannot start."
