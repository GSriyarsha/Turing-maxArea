# Turing-maxArea
You are again the owner of a coworking space like WeWork and your office building is rectangular. You team just created many wall partitions to create mini offices for startups. Your office campus is represented by a 2D array of 1s (floor spaces) and 0s (walls). Each point on this array is a one foot by one foot square. Before renting to tenants, you want to reserve an office for yourself. You wish to fit the largest possible rectangular table in your office, and you will select the office that fits this table. The table sides will always be parallel to the boundaries of the office building. What is the area of the biggest table that can fit in your office?



Functions

biggestTable() has one parameter:

grid: a 2D grid/array of 1s and 0s


Input Format

For some of our templates, we have handled parsing for you. If we do not provide you a parsing function, you will need to parse the input directly. In this problem, our input format is as follows:

The first line is the number of rows in the 2D array
The second line is the number of columns in the 2D array
The rest of the input contains the data to be processed

Here is an example of the raw input:

4
5
11110
11010
11000
00000



Expected Output

Return the area of the biggest right-angled parallelogram made of 1s in the grid. Assume the grid is surrounded by 0s (walls).



Constraints
Assume that the bounds of the array are the following:
The total amount of elements in the array: width x height <= 10^6


Example

Example biggestTable() Input

grid: 
	[[1, 0, 1, 1, 1],
	 [1, 0, 1, 1, 1],
	 [1, 1, 1, 1, 1],
	 [1, 0, 0, 1, 0]]


Example Output

9


Solution

The top right of the grid consists of a rectangle with nine 1s in it, the biggest possible space for our table.
