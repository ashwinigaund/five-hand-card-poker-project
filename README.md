# Five-card-draw

## Installation:
 Download the Zip containing the code. <br />
 Once downloaded, open up the folder directory in your bash terminal and run:

 ``` bash
 sudo apt update && sudo apt install openjdk-11-jdk-headless -y
 ```
## Usage:
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