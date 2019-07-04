# MS3
MS3 coding challenge


Data for the project is included in the sample CSV file, attached. Please create a Github or Bitbucket repository for the project
and push all code there; please email the link to the repository when you submit your project.

Customer X just informed us that we need to churn out a code enhancement ASAP for a new project.  Here is what they need:

1. We need a Java application that will consume a CSV file, parse the data and insert to a SQLite In-Memory database.  
  a. Table X has 10 columns A, B, C, D, E, F, G, H, I, J which correspond with the CSV file column header names.
  b. Include all DDL in submitted repository //this is in the project code
  c. Create your own SQLite DB //created in memory 

2. The data sets can be extremely large so be sure the processing is optimized with efficiency in mind.  

3. Each record needs to be verified to contain the right number of data elements to match the columns.  
  a. Records that do not match the column count must be written to the bad-data-<timestamp>.csv file
  b. Elements with commas will be double quoted

4. At the end of the process write statistics to a log file
  a. # of records received
  b. # of records successful
  c. # of records failed



Assumptions
1. I assumed that all ten columns must be filled with data to be valid
2. I created the database in memory for the project instead of a file based
3. I assume no error checking or handling 
4. Scalable within rules and assumptions





