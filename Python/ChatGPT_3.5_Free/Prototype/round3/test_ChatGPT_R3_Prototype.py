import pytest
from ChatGPT_R3_Prototype import Dog, Cat, SilentFish

def test_animal_clone():
    # Arrange
    dog = Dog()
    cat = Cat()
    silent_fish = SilentFish()

    # Act
    cloned_dog = dog.clone()
    cloned_cat = cat.clone()
    cloned_fish = silent_fish.clone()

    # Assert
    assert cloned_dog.get_name() == "Dog"
    assert cloned_dog.get_sound() == "Woof"
    assert cloned_dog.make_sound() == "Dog says Woof"

    assert cloned_cat.get_name() == "Cat"
    assert cloned_cat.get_sound() == "Meow"
    assert cloned_cat.make_sound() == "Cat says Meow"

    assert cloned_fish.get_name() == "Fish"
    assert cloned_fish.get_sound() is None
    assert cloned_fish.make_sound() == "Fish is silent"

def test_animal_make_sound():
    # Arrange
    dog = Dog()
    cat = Cat()
    silent_fish = SilentFish()

    # Act & Assert
    assert dog.make_sound() == "Dog says Woof"
    assert cat.make_sound() == "Cat says Meow"
    assert silent_fish.make_sound() == "Fish is silent"
