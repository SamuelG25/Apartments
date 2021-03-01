# Apartments
Uses OOP to create objects which will be used to determine what fits the user criteria

To start this repositories has to different files (Apartments.java & TestApartments.java)

To begin we will first talk about the Apartments.java file. This file uses obeject-oriented-programming.
In the code we began by creating the varibles (Apartment Number(Anum), Bathroom amount (Bathnum), 
Bedroom (Bednum)), Rent(Rent) that we would need throught out the code we made those
varibles private to no out side source could alter them. After we create the varibles we created the 
constructor which takes the values given when the object is used in the TestApartments.java file and assigns
them to the correct varible. After we create the constructor and all the correct varibles are assigned we then
go on to create get methods for each of the varibles. The get method for each varible simply uses the reutrn 
fuction when called it simply returns which varible was called.

Next we have TestApartments.java in the program we the utliize the Apartments.java file. In the TestApartment we use the 
we use the Java.util.Scanner Package which allows to get information from the user. We create the scanner object called input device.
We create five different objects from the Apartments.java file.each of the newly created objects has their own
Apartment number, Bedroom amount, Bathroom amount , rent amount. After the objects are created we then go to ask the 
user the what is their maximum rent amount, their minimum bathroom amount and bedroom amount. We then use the information 
given and put it through if statements to decide if each apartment meets the user criteria. If the apartment does meet the user
criteria the program will then give the information for the apartment to the user ,and if the apartment does not meet the criteria 
the program will give the apartment and says it does meet what they are looking for. 

Below is a example of the output.![Screenshot (36)](https://user-images.githubusercontent.com/74160231/109454797-ad4a5400-7a1a-11eb-98ed-89ef719ab943.png)
