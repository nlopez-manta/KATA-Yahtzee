Feature: bubble sort

Scenario: make sure it works

Given the game of yahtzee is initiated
When we give the numbers "2 3 2 3 5"
Then we should get "2 2 3 3 5"
