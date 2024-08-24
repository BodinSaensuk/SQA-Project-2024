import threading

class SingletonMeta(type):
    _instance = None
    _lock = threading.Lock()

    def __call__(cls, *args, **kwargs):
        if not cls._instance:
            with cls._lock:
                if not cls._instance:
                    cls._instance = super().__call__(*args, **kwargs)
        return cls._instance

class Singleton(metaclass=SingletonMeta):
    def __init__(self):
        self.data = {}

    def add_data(self, key, value):
        self.data[key] = value

    def get_data(self, key):
        return self.data.get(key)