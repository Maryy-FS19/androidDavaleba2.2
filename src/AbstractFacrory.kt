val cars = listOf("Audi", "Maserati", " ")
val aircrafts = listOf("Boeing737", "Boeing777", " ")

fun rCar(): Car? {
    return CarFactory().create(cars.random())
}

fun rAircraft(): Aircraft? {
    return AircraftFactory().create(aircrafts.random())
}
