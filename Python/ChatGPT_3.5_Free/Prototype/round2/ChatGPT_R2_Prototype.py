import copy

class CarPrototype:
    def clone(self):
        return copy.deepcopy(self)

class Car(CarPrototype):
    def __init__(self, model, color, engine_type):
        self.model = model
        self.color = color
        self.engine_type = engine_type

    def start_engine(self):
        if self.engine_type == "electric":
            return "Whirr... the electric engine is running silently!"
        elif self.engine_type == "gasoline":
            return "Vroom... the gasoline engine roars to life!"
        else:
            return "Unknown engine type, cannot start."

    def get_details(self):
        return f"Model: {self.model}, Color: {self.color}, Engine Type: {self.engine_type}"
