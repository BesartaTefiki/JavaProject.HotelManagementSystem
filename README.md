Hotel Mangament system
Hotel Room Booking System

A Java-based system for booking rooms at a hotel. The system checks the availability of rooms in the database and returns a confirmation message of `true` or `false` for the room booking request. The project is built using Gradle in the Spring Boot framework and executed in Insomnia. 

Setup

These instructions will help you set up the project on your local machine for development and testing purposes.

### Prerequisites

You will need the following software and libraries installed on your machine:

- Java 8 or later
- Gradle
- Spring Boot framework
- IntelliJ IDEA
- Insomnia (or a similar API testing tool)

### Installing

1. Clone the repository
```
 git clone: https://github.com/username/hotel-room-booking-system.git
```

2. Open the project in IntelliJ IDEA

3. Build the project using Gradle
```
Gradle build
```
4. Run the project
```
gradle bootRun
```
## Usage

To use the system, simply run the API request in Insomnia (or a similar tool) with the room number you want to book.
The system will return a message of either `true` or `false`, indicating whether the room is available for booking.


## License

This project is licensed under the [MIT](https://opensource.org/licenses/MIT) License.

### Usage

To use the system, simply run the API request in Insomnia (or a similar tool) with the room number you want to book. The system will return a message of either `true` or `false`, indicating whether the room is available for booking.

## Endpoint
GET http://localhost:8080/api/rooms/test/1

 The part that is needed to be added at Insomnia is:
 {
	 	room_number: 10,
	 	room_type: "suite",
		is_available: true
}


