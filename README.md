# TASK:
Step 1: Implement height-weighted Quick Union with Path Compression. Check for all the unit test cases
Step 2: Using the implementation of UF_HWQUPC, develop a UF ("union-find") client that takes an integer value n from the command line to determine the number of "sites." Generates random pairs of integers between 0 and n-1, calling connected() to determine if they are connected and union() if not. Loop until all sites are connected then print the number of connections generated. Package the program as a static method count() that takes n as the argument and returns the number of connections; and a main() that takes n from the command line, calls count() and prints the returned value or create a main program that doesn't require any input and runs the experiment for a fixed set of n values. Show evidence of the run(s).
Step 3: Determine the relationship between the number of objects (n) and the number of pairs (m)

# Relationship Conclusion:
Based on the data produced,  it is evident that the number of pairs(m) created is proportional to the number of objects(n) supplied as input:
m ~ 5*n
