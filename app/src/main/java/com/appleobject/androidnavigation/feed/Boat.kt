package com.appleobject.androidnavigation.feed

import com.appleobject.androidnavigation.R

class Boat(
    val id: Int,
    val name: String,
    val location: String,
    val picture: Int,
    val price: String
)

val BOATS = listOf(
    Boat(
        id = 1,
        name = "Canoe",
        location = "Tenerife",
        picture = R.drawable.ic_speed_boat_blue,
        price = "45 EUR"

    ),
    Boat(
        id = 2,
        name = "Sailboat",
        location = "Costa Brava",
        picture = R.drawable.ic_speed_boat_blue,
        price = "99 EUR"

    ),
    Boat(
        id = 3,
        name = "Kayak",
        location = "Mallorca",
        picture = R.drawable.ic_speed_boat_blue,
        price = "120 EUR"
    )
)

fun List<Boat>.getBoat(id: Int) = find { it.id == id } ?: error("Boat Not Found")