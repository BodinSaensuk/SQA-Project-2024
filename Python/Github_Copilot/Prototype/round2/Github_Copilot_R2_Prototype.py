import copy
from abc import ABC, abstractmethod

class Prototype(ABC):
    @abstractmethod
    def clone(self):
        pass

class ConcretePrototype(Prototype):
    def __init__(self, value):
        self.value = value

    def clone(self):
        return copy.deepcopy(self)

# Example usage
if __name__ == "__main__":
    original = ConcretePrototype(42)
    clone = original.clone()
    print(f"Original: {original.value}, Clone: {clone.value}")