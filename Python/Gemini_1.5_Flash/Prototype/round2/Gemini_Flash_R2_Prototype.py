class Shape:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def clone(self):
        return type(self)(self.x, self.y)

    def draw(self):
        raise NotImplementedError()
    
class Circle(Shape):
    def __init__(self, x, y, radius):
        super().__init__(x, y)
        self.radius = radius

    def draw(self):
        print(f"Drawing a circle at ({self.x}, {self.y}) with radius {self.radius}")

class Rectangle(Shape):
    def __init__(self, x, y, width, height):
        super().__init__(x, y)
        self.width = width
        self.height = height

    def draw(self):
        print(f"Drawing   
 a rectangle at ({self.x}, {self.y}) with width {self.width} and height {self.height}")