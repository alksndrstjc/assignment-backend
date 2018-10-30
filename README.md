# assignment-backend

This is a console app so it should preferably be started via your favorite IDE.

This app simulates making a purchase with a discount card.

There are three discount card types - Bronze, Silver, Gold - with each of them having respective initial discount rate.
Similar features of all three types are abstracted away with an abstract class 'DiscountCard'.
It has a single abstract method used for calculating discount rate based on the actual card type and the previous month turnover.

After determining the actual card type, and whether or not there is any turnover, the card is ready for making purchases with.
'Purchasing' is actually suppliyng a static method with actual card and purchase value.
The method calculates all of the desired output (purchase value, discount rate, discount value, total purchase value) and prints it out.


flow illustration:
create a 'blank' card with an actual type for a user (constructor makes a call to a method which determines initial discount rate 
in the background) 
->
(optional) set the cards previous month turnover (it recalculates the discount rate in the background) 
->
'purchase', that is calculate all the output and print it out.
