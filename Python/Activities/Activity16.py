class Car:
    'This class represents a car'
 
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " "+self.model + " is moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")

car1 = Car("Toyota", "Innova", "2019", "Manual", "Red")
car2 = Car("Hyundai", "City", "2020", "Automatic", "Black")
car3 = Car("Maruti", "Dzire", "2021", "Hybrid", "White")

car1.accelerate()
car1.stop()