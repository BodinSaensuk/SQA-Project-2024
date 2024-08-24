import pytest
from Copilot_R3_Singleton import Singleton

# Pytest test case

@pytest.fixture(scope="module")
def singleton_instance():
    return Singleton.get_instance()

def test_singleton_instance(singleton_instance):
    assert isinstance(singleton_instance, Singleton)

def test_singleton_multiple_instances():
    with pytest.raises(Exception):
        Singleton()