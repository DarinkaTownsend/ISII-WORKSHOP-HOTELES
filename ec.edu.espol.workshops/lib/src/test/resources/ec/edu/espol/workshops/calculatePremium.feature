Feature: As a user I want to know if I can apply for car insurance
 

Scenario: The user has more than 80 years old 

When: Calculate the insurance 

 

Scenario Outline: The user has less than 80 years old "<age>" 

when I ask if the user applies for car insurance "<answer>"

 

Examples: 

| Age	| answer | 

|  80	| Sorry you are not allowed to have a car insurance | 

|  80	| Sorry you are not allowed to have a car insurance | 

| anything else! | The program have to validate more things | 