1. The function fits the graph of n^2.
2. Analyzing the code the function is O(n^2) because it has a nested for loop that is 0(n^2) the other loops are 0(n).
3. The anaylsis mathces up with the graph because the graph is a parabola which is n^2.
4. The data structures I used were a HashSet for keeping track of the visited. The time complexity of the flood function can be better
because it is 0(n^2) but it because I'm searching using brute force.
5. The alternative implemenation's time complexity as seen on the graph is 0(n) but its actually 0(n^2). O(n^2) will only be achieved if the
worst senario is reached. The worst senario is when the flood function is called on the entire grid.