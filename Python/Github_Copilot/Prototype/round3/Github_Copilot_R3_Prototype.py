from abc import ABC, abstractmethod
import copy

class Prototype(ABC):
    @abstractmethod
    def clone(self):
        pass

class ConcretePrototype1(Prototype):
    def __init__(self, value):
        self.value = value

    def clone(self):
        return copy.deepcopy(self)

class ConcretePrototype2(Prototype):
    def __init__(self, value):
        self.value = value

    def clone(self):
        return copy.deepcopy(self)

# Example usage
if __name__ == "__main__":
    prototype1 = ConcretePrototype1(10)
    prototype2 = ConcretePrototype2(20)

    clone1 = prototype1.clone()
    clone2 = prototype2.clone()

    print(f"Prototype1 value: {prototype1.value}, Clone1 value: {clone1.value}")
    print(f"Prototype2 value: {prototype2.value}, Clone2 value: {clone2.value}")