import pytest
from Gemini_Pro_R1_Prototype import Vehicle, calculate_vehicle_age

@pytest.fixture
def sample_vehicle():
    return Vehicle("Toyota", "Camry", 2015)

def test_vehicle_description(sample_vehicle):
    # Arrange (Fixture provides the vehicle)

    # Act
    description = sample_vehicle.get_description()

    # Assert
    assert description == "2015 Toyota Camry"

def test_calculate_vehicle_age(sample_vehicle):
    # Arrange (Fixture provides the vehicle)

    # Act
    age = calculate_vehicle_age(sample_vehicle)

    # Assert
    assert age == 9  # Assuming current year is 2024