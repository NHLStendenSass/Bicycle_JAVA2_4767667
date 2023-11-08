# StartDocoument

## Description:

The NS Group wants new software to track the rental of their bicycles. The software should track how many **bicycles** are still available for rental. There are  three types of bikes: a regular one, mountain bike and electrical bike. A  customer can **rent** a bicycle for a certain amount of time. *The end time will be registered when the customer returns the bike*. In every bicycle is a **GPStracker**. The tracker tracks the distance the customer has travelled with the bicycle. *When the customers starts renting he has to pay deposit from €20*,-.  The customer has to pay money per kilometre. This is: > €0,20 for a regular bike; > €0,25 for a mountain bike; > €0,50 for a electrical bike. Per hour the customer has to pay €2,-. *When the customer returns the bike,  the customer has to pay*. For maintenance purposes the company wants to  know the total distance the bike has been used.

Functionalities:

* Track how many **bicycles** are still available for rental - availableBicycles(): HashSet<Bicycle>
* Customer rents bicycle - rentBicycle(startTime): void
  * check if the bicycle is available
  * use time type (example 14:00)
* Customer returns bicycle -returnBicycle(endTime, kilometer): void
  * register end time
  * use time type (example 17:00)
  * kilometer is distance
* Track bicycles to track distance, return list of bicycle with total distance
* Check if customer paid after returning the bicycle checkCustomerPaid()
* Customer pays after returning pay()

Type:

* Regular Bicycle
* Mountain Bicycle
* Electrical Bycycle

Calculations:

* The customer starts renting he/she has to pay deposit from €20
* The customer has to pay money per kilometre
  * more then €0,20 for a regular bike
  * more then €0,25 for a mountain bike
  * more then €0,50 for a electrical bike
* Per hour the customer has to pay €2

## Classes:

1. Bicycle
2. ReqularBike
3. MountainBike
4. ElectricalBike
5. Rent

- ### Input & Output

  In this section, the input and output of the application will be described.

  #### Input

  In the table below all the input (that the user has to input in order to make the application work) are described.

  | Case              | Type     | Conditions   |
  | ----------------- | -------- | ------------ |
  | Bicycle bicycle   | Object   | not empty    |
  | Start time        | `String` | not empty    |
  | End time          | `String` | not empty    |
  | Distance traveled | `double` | `number` > 0 |

  #### Output

  | Case                 | Type               |
  | -------------------- | ------------------ |
  | Bicycle availability | `HashSet<Bicycle>` |
  | Rent status          | `String`           |
  | Return status        | `String`           |
  | Payment status       | `String`           |
  | Total distance       | `double`           |

  #### Calculations

  | Case           | Calculation                                         |
  | -------------- | --------------------------------------------------- |
  | Total distance | The sum of all the distances traveled by a bicycle. |

  #### Remarks

  - Input will be validated.
  - Only the Main class will contain `System.out.println`.
  - Unit Tests will be provided.

## UML:

![](uml.png)

## Testplan

In this section, the test cases will be described to test the application.

### Test Cases

In this section, the test cases will be described. Every test case should be executed with the test data as a starting point.

#### #1 Rental and Return of Regular Bicycle

Verifying the functionality of renting and returning a regular bicycle.

| Step | Input  | Action                                      | Expected output               |
| ---- | ------ | ------------------------------------------- | ----------------------------- |
| 1    | `rent` | `rentBicycle("10:00", regularBike)`         | Bicycle is available for rent |
| 2    | `rent` | `returnBicycle("12:00", 10.0, regularBike)` | Bicycle is returned           |

#### #2 Rental and Return of Electrical Bicycle

Verifying the functionality of renting and returning an electrical bicycle.

| Step | Input  | Action                                         | Expected output               |
| ---- | ------ | ---------------------------------------------- | ----------------------------- |
| 1    | `rent` | `rentBicycle("10:00", electricalBike)`         | Bicycle is available for rent |
| 2    | `rent` | `returnBicycle("12:00", 10.0, electricalBike)` | Bicycle is returned           |

#### #3 Check Rental Payment Status

Verifying the payment status after the rental.

| Step | Input  | Action                           | Expected output                          |
| ---- | ------ | -------------------------------- | ---------------------------------------- |
| 1    | `rent` | `pay(regularBike, 15.0, 2.5)`    | The total amount to be paid is: [amount] |
| 2    | `rent` | `pay(electricalBike, 15.0, 2.5)` | The total amount to be paid is: [amount] |

#### #4 Display Available Bicycles

Testing the method to display available bicycles after rentals.

| Step | Input  | Action                | Expected output                       |
| ---- | ------ | --------------------- | ------------------------------------- |
| 1    | `rent` | `availableBicycles()` | HashSet containing available bicycles |

#### #5 Display Total Distance of Bicycles

Testing the method to display the total distance traveled by each bicycle.

| Step | Input  | Action                   | Expected output             |
| ---- | ------ | ------------------------ | --------------------------- |
| 1    | `rent` | `displayTotalDistance()` | Total distances of bicycles |
