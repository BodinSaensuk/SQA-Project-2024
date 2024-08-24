class CodePrototype:
    def __init__(self, code_string):
        self.code_string = code_string

    def clone(self):
        return CodePrototype(self.code_string)

# Example prototypes
function_prototype = CodePrototype("def my_function():\n  pass")
class_prototype = CodePrototype("class MyClass:\n  pass")