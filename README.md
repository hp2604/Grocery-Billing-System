# Grocery Billing System - README

This Java program is a simple grocery billing system that allows users to input the items they want to purchase along with their quantities. It then calculates the total cost and generates a bill for the user. The program utilizes a class named `Grocery` to manage the grocery store items, prices, and user interactions.

## Features

- Users can enter the number of items they want to purchase.
- Users can input the item code and quantity for each item.
- The program calculates the total cost based on the entered items and quantities.
- A formatted bill is generated, displaying the item details, quantity, and total amount.
- The program includes a set of predefined items and their corresponding codes and prices.

## How to Use

1. Compile and run the `Main` class to execute the program.
2. Upon execution, the program will prompt you to enter the number of items you want to purchase.
3. For each item, you will be asked to input the item code and quantity.
4. After entering all the items, the program will display a formatted bill with the item details, quantity, and total cost.
5. The program will also show the total price of all items and a "THANK YOU" message.

## Code Structure

- The `Main` class contains the `main` method to initiate the program and interact with the user.
- The `Grocery` class manages the grocery store items, prices, and user interactions.
- The `add` method initializes the item codes and their corresponding names.
- The `userProduct` method takes user input for items and quantities and triggers the bill generation.
- The `printBill` method calculates the total cost and prints a formatted bill.

## Customization

- You can modify the predefined items and their prices by editing the `item` map and the `price` list in the `add` method of the `Grocery` class.

