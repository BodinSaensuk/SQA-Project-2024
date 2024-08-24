class Singleton:
    _instance = None

    def __new__(cls):
        if not cls._instance:
            cls._instance = super().__new__(cls)
        return cls._instance

    def some_method(self, value):
        # Implement your method here
        result = value * 2
        return result