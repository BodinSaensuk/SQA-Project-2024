class Prototype:
    def clone(self):
        raise NotImplementedError
class ConcretePrototypeA(Prototype):
    def __init__(self):
        self.property1 = "value1"
        self.property2 = "value2"

    def clone(self):
        return ConcretePrototypeA(self.property1, self.property2)

def main():
    prototype_a = ConcretePrototypeA()
    clone_a = prototype_a.clone()
    