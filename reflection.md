# Reflection

In this assignment, I worked on improving the `TrainLine` class by implementing several new methods and modifying existing ones for performance and code clarity. The task required adding methods like `add`, `indexOf`, and `contains`, while ensuring efficiency and adherence to the Programmer’s Pact. 

## What I Got Right

I successfully implemented the `add(String)` method using a `Station last` pointer, which eliminates the need for traversing the entire list when adding a new station. This change significantly improves performance, as discussed in class. I also added the `numberOfStations` counter to track the size of the train line efficiently. My `indexOf` and `contains` methods are both written using a **single return statement**, as required. The `indexOf` method correctly uses a guard clause, a cursor for traversal, and a boolean flag to avoid unnecessary looping - all following the programmer's pact.

## What I Missed or Got Close

Early in the process, I had forgotten to introduce the `last` pointer in the `TrainLine` class, which caused my `add` method to rely on full traversal. After reviewing Leo’s solution, I realized how unnecessary that was and how the `last` pointer avoids redundant iteration. Another area of initial struggle was writing `indexOf` with only one return. I had to refactor it to comply with the Pact, which helped me better understand clean control flow.

## What I Learned

Comparing my code with Leo’s helped me see the importance of writing methods that are both readable and efficient. I also learned the importance of using proper guard statements and limiting return statements for better debugging and maintenance. The lesson about pointer management (`last`) is something I’ll apply in future data structure work.

## How I’ll Improve

Going forward, I will spend more time reading through my professor's solution code before and after coding. I also plan to start assignments earlier, so I have time to debug thoughtfully and reflect on my implementation choices. If I hit a wall, I’ll reach out for help sooner instead of waiting. These steps should help me stay more aligned with expectations and improve my coding discipline.

