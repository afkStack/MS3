# MS3
MS3 coding challenge


Data for the project is included in the sample CSV file, attached. Please create a Github or Bitbucket repository for the project
and push all code there; please email the link to the repository when you submit your project.

Customer X just informed us that we need to churn out a code enhancement ASAP for a new project.  Here is what they need:

1. We need a Java application that will consume a CSV file, parse the data and insert to a SQLite In-Memory database.  
  a. Table X has 10 columns A, B, C, D, E, F, G, H, I, J which correspond with the CSV file column header names.
  b. Include all DDL in submitted repository        //this is in the project code
  c. Create your own SQLite DB                      //created in memory 

2. The data sets can be extremely large so be sure the processing is optimized with efficiency in mind.  

3. Each record needs to be verified to contain the right number of data elements to match the columns.  
  a. Records that do not match the column count must be written to the bad-data-<timestamp>.csv file
  b. Elements with commas will be double quoted

4. At the end of the process write statistics to a log file
  a. # of records received
  b. # of records successful
  c. # of records failed

--------------------------------------------------------------------------------------------------------------------------------

Assumptions
1. I assumed that all ten columns must be filled with data to be valid
2. I created the database in memory for the project instead of a file based
3. I assume no error checking or handling 
4. Scalable within rules and assumptions

--------------------------------------------------------------------------------------------------------------------------------

How to compile and run
1. Navigate to the destination in cmd and run javac on the files
  a. C:\Destination\src>javac Main.java SQLIteUtil.java
2. run java with class path specified for resource use
  a. The file can be specified in the GUI but the default path in in the src folder
  b. C:\Destination\src>java -cp "C:\CLASS_PATH;C:\Destination\src\sqlite-jdbc-3.27.2.1.jar;" Main
  c. All output files are created in the src folder. 
  
--------------------------------------------------------------------------------------------------------------------------------
  
My approach to solving this chalange was first to determin how I was going to split and verify each line in the CSV file. 
I decided  to loop throug the line and split at each comma checking for quotes in order to set a flag for columns that contain commas.
During the seperation is when I check for blank columns(assumption #1) and if there are more than the correct amount of columns.
Once I determined how to seperate the line I simply decided that it could be stored in an array until the SQL was prepared that way I could call each index of the array.
I created the database in memory this can be changed to create the db file on disk but I went with the challenge outline.
I created a GUI just to simplify the project. You can type the file name and click a button.
I decided not to do error checking or handling due to time restrictions but simple GUI popups or cli outputs could be added.

--------------------------------------------------------------------------------------------------------------------------------

SQL DDL

INSERT INTO interviewData(A,B,C,D,E,F,G,H,I,j) VALUES(?,?,?,?,?,?,?,?,?,?)
CREATE TABLE interviewData(A string,B string,C string,D string,E string,F string,G string,H string,I string,J string)
     



