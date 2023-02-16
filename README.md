This code provides a SoldierFactory class that creates and manages different types of soldiers in a OnGame.game.

Every Castle is able to hold and create troops (creatATroop) by providing an int as a parameter.

The SoldierFactory class is a singleton class that ensures there is only one instance of the factory. 
It has a private constructor and a static method getInstance() that returns the single instance of the class.
It is made to use less resources and make a cleaner code.

The SoldierFactory class has a list of different types of soldiers (listOfSoldiers), and a method to get a random soldier from the list, getRandomSoldier(). 
This method returns a new instance of a randomly selected soldier by making a copy of the chosen soldier from the list.

The class also has a method to create a troop of random soldiers of a specified size (getTroopOfRandomSoldiers(troopSize)). 
This method first checks if the troop size is less than the number of soldier types available, and selects a random subset of the soldier types to add to the troop. It then fills the remaining spots in the troop with randomly selected soldiers. The method returns a list of soldiers that make up the troop.

The returnListOfSoldiers() method returns a list of all soldier types available in the SoldierFactory.

This code is intended to be used in a OnGame.game where different types of soldiers are required. 
The Soldier interface is assumed to be implemented by Archer, Swordsman, and Spearman classes.

To use the SoldierFactory, call the getInstance() method to get the instance of the class, then call getRandomSoldier() or getTroopOfRandomSoldiers(troopSize) to get a random soldier or a troop of random soldiers, respectively.

**UPDATE**

Added an O(1) version so it takes less resources for a faster working code.