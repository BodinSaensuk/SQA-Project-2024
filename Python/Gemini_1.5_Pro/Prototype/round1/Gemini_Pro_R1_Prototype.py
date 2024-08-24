class Vehicle:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year

    def get_description(self):
        return f"{self.year}{self.make} {self.model}"


def calculate_vehicle_age(vehicle):
    current_year = 2024  # Replace with actual logic to get current year
    return current_year - vehicle.year