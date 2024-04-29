# Five-card-draw

## Problem Statement:
[Five-card draw](https://en.wikipedia.org/wiki/Five-card_draw) is a variant of poker where each player receives a hand of 5 cards, is then
allowed to swap any number of those cards for new ones, and then competes against each
other based on the [standard 5 card poker hand strength](https://en.wikipedia.org/wiki/List_of_poker_hands). You need to design and develop
a console-based application which will deal and evaluate poker hands for a simplified
version of the five-card draw variant. Like the five-card draw variant, the application will
have to deal a hand of 5 cards, but unlike the five-card draw variant, no swapping will be
allowed.

The application will be required to provide the following functionality:
* Simulate shuffling a [standard deck of 52 cards](https://en.wikipedia.org/wiki/Standard_52-card_deck).
* Deal a single hand of 5 cards to the player.
* Evaluate the player�s hand, informing them of the highest ranked poker hand that
matches their hand of 5 cards.

The [standard 5 card poker hand strength](https://en.wikipedia.org/wiki/List_of_poker_hands) applies. Listed in decreasing rank, these hands
are:
1. Straight Flush
2. Four of a Kind
3. Full House
4. Flush
5. Straight
6. Three of a Kind
7. Two Pair
8. One Pair
9. High Cards

## Installation:
 Download the Zip of the code from repository or clone the repository. <br />
 Once downloaded or cloned, open the folder directory in your bash terminal and run:

 ``` bash
 sudo apt update && sudo apt install openjdk-11-jdk-headless -y
 ```
## How To Test:
In your bash terminal, run the shell script to compile and execute the program.

```bash
./run.sh
Shuffling ... Shuffling ... Shuffling ...
Your hand: 5♢ 5♡ 2♤ 3♧ 4♤ 
You have: Two Pair

Do you wish to draw again? Y/N >
```

To run the Unit tests run the shell script with the "test".

```bash
./run.sh test

Running Tests ...
Tests ran: 17
Failed: 0

OR in case of any failure;

Running Tests ...
Tests ran: 17
Failed: 1
Reason for failure: testSortHand(PokerOpsTest): expected:<[3]> but was:<[2]>
```