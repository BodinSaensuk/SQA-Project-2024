import copy

class Prototype:
    def clone(self):
        return copy.deepcopy(self)

class Animal(Prototype):
    def __init__(self, name, sound):
        self.name = name
        self.sound = sound

    def make_sound(self):
        if self.sound:
            return f"{self.name} says {self.sound}"
        else:
            return f"{self.name} is silent"

    def get_name(self):
        return self.name

    def get_sound(self):
        return self.sound

# Example animals
class Dog(Animal):
    def __init__(self):
        super().__init__(name="Dog", sound="Woof")

class Cat(Animal):
    def __init__(self):
        super().__init__(name="Cat", sound="Meow")

class SilentFish(Animal):
    def __init__(self):
        super().__init__(name="Fish", sound=None)
