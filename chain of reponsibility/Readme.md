Chain of responsibility pattern is used to achieve loose coupling in software design where a request from client is passed to a chain of objects to process them.
One of the great example of Chain of Responsibility pattern is ATM Dispense machine. The user enters the amount to be dispensed and the machine dispense amount in terms of defined currency bills such as 50$, 20$, 10$ etc.

If the user enters an amount that is not multiples of 10, it throws error.
Then the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.

Source: https://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java
