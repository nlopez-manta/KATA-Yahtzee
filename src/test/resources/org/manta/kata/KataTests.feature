Feature: Game of yahtzee

Scenario: make sure we have 5 dice

Given the game of yahtzee is initiated
Then make sure we have 5 dizes

When the dices are rolled
Then count the number of dices that are the same
