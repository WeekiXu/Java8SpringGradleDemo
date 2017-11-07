package com.weeki.serviceimpl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Car {
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collide " + car.toString());
    }

    public void follow(Car anotherCar) {
        System.out.println("Follow another" + anotherCar.toString());
    }

    public void repair() {
        System.out.println("Reair " + this.toString());
    }

    public static void main(String[] args) {
        Car car = Car.create(Car::new);
        Car car2 = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car,car2);
        cars.forEach(Car::collide);
        cars.forEach(Car::repair);
        cars.forEach(Car.create( Car::new )::follow);
    }
}
