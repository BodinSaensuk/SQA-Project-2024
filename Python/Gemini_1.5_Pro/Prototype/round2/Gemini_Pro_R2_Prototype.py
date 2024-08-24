class Shape:
    def clone(self):
        raise NotImplementedError

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def clone(self):
        return Circle(self.radius)

class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def clone(self):
        return Rectangle(self.width, self.height)

# Client code
def main():
    circle = Circle(5)
    cloned_circle = circle.clone()

    rectangle = Rectangle(4, 3)
    cloned_rectangle = rectangle.clone()

    # ... use the cloned shapes as needed

if __name__ == "__main__":
    main()