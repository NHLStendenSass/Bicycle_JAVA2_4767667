# StartDocoument

## Description:

The NS Group wants new software to track the rental of their bicycles. The software should track how many **bicycles** are still available for rental. There are  three types of bikes: a regular one, mountain bike and electrical bike. A  customer can **rent** a bicycle for a certain amount of time. *The end time will be registered when the customer returns the bike*. In every bicycle is a **GPStracker**. The tracker tracks the distance the customer has travelled with the bicycle. *When the customers starts renting he has to pay deposit from €20*,-.  The customer has to pay money per kilometre. This is: > €0,20 for a regular bike; > €0,25 for a mountain bike; > €0,50 for a electrical bike. Per hour the customer has to pay €2,-. *When the customer returns the bike,  the customer has to pay*. For maintenance purposes the company wants to  know the total distance the bike has been used.

## Classes:

1. Bicycle
2. ReqularBike
3. MountainBike
4. ElectricalBike
5. Rent
6. Tracker
7. Dashboard

## UML:



## Input

| Case                  | Type   | Conditions    |      |
| --------------------- | ------ | ------------- | ---- |
| Bicycle type          | String | !isEmpty()    |      |
| Bicycle               |        |               |      |
|                       |        |               |      |
| Rent bicycle          |        |               |      |
|                       |        |               |      |
| Rent return bicycle   |        |               |      |
| Tracker track bicycle | double | bicycle > 0.0 |      |



## Output

| Case                                      | Type    |
| ----------------------------------------- | ------- |
| List of available bicycles for rental     | HashSet |
| The total distance the bike has been used | double  |
|                                           |         |

## Calculator

| Case                                                        | Calculation                               |
| ----------------------------------------------------------- | ----------------------------------------- |
| Tracker tracks distance of bicycle                          | The sum of travelled distance by customer |
| The customer pays money per kilometer based on bicycle type | Regular: kilometer * 0.2                  |
|                                                             | Mountain: kilometer * 0.25                |
|                                                             | Electrical: kilometer * 0.5               |
| The customer pay per hour                                   | hour * 2                                  |

