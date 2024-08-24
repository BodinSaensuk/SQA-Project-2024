class Book:
    def __init__(self, title, author, genre):
        self.title = title
        self.author = author
        self.genre = genre

    def clone(self):
        return Book(self.title, self.author, self.genre)