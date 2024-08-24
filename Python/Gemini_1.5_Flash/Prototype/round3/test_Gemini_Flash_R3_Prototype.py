import pytest
from Gemini_Flash_R3_Prototype import Book

def test_book_creation():
    # Arrange
    original_book = Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic")

    # Act
    cloned_book = original_book.clone()

    # Assert
    assert cloned_book.title == original_book.title
    assert cloned_book.author == original_book.author
    assert cloned_book.genre == original_book.genre