import copy

class Prototype:
    def clone(self):
        return copy.deepcopy(self)

class Shape(Prototype):
    def __init__(self, id, type):
        self.id = id
        self.type = type

    def draw(self):
        if self.type == "circle":
            return "Drawing a circle"
        elif self.type == "square":
            return "Drawing a square"
        else:
            return "Unknown shape"

    def get_type(self):
        return self.type

    def get_id(self):
        return self.id

# Client code
if __name__ == "__main__":
    original_circle = Shape(1, "circle")
    cloned_circle = original_circle.clone()

    print(original_circle.draw())  # Output: Drawing a circle
    print(cloned_circle.draw())    # Output: Drawing a circle
