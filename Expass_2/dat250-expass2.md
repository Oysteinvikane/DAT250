## Experiment Assignment 2

### Experiment 1
### Technical problems that i've encountered during installation and use of JPA and how to resolve
I didn't have any technical problems with the JPA, but i had problems with the derby database.
I downloaded derby and tried to connect with a changed connection string:\
`                      
<property name="javax.persistence.jdbc.url"value="jdbc:derby:C:\Users\hvika\Desktop\DAT250Code\expass2\todoDB;create=true"/>
`
and local database in the repo, but for some reason i could not connect to the database, i tried to resolve it with whatever information i could find on the net, but nothing worked for me.

### How to inspect the database tables and what tables were created
When i ran the main method i could see in the console that elements were put in the tables but when i was gonna inspect them i couldn't since i could not connect to it in the data source explorer.\
To inspect the database if everything would have worked i would connect with the data source explorer and do a simple sql statement where i got everything in the table.\
e.g\
`                      
select * from todo;
`

### Experiment 2
##### Domain model
![bilde](https://github.com/Oysteinvikane/DAT250/blob/main/Pictures/Domain%20Model.png)

### Problems with the database
Because of the problems i had on the first part, i didn't get to inspect or use the new database, the code should be right, but i wasn't able to inspect or get any screenshots from the database because of the connection issues.

### Pending issues with the assignment that i've not yet solved
- Connection issues with derby
- because of the connection issues i couldn't really get to test that everything worked as supposed to.

#### Link to code repositories
Expass2 code:
https://github.com/Oysteinvikane/DAT250/tree/main/DAT250Code
