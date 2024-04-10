# Student-Management-System-using-Java
Student management system using Java and NetBeans IDE

## Description:
Student Management System is created using java and Apache NetBeans IDE. The main objective of the project is to introduce you all with the database connectivity with mySQL using jdbc (Java Database Connectivity) driver.

## Features:
* For Admin---
  1. Add new admin
  2. Modify admin details
  3. Delete admin details
  4. Search for admin details
  5. View all admin records
* For Students---
  1. Add new student 
  2. Modify student details
  3. Delete student details
  4. Search for student details
  5. View all student records


## Installations:
1. Install Apache netBeans IDE (https://netbeans.apache.org/front/main/download/index.html)
2. Install Xamp (https://www.apachefriends.org/download.html)
3. Install jdbc drive for sql connections (https://dev.mysql.com/downloads/connector/j/)
   * Note :- Select "Platform Independent"
5. Install rs2xml driver (https://sourceforge.net/projects/finalangelsanddemons/files/rs2xml.jar/download)




## 1. Procedure (xampp): creating database and starting mySQL server.
1. open the xampp control panel.
2. start the "**_Apache_**" module and wait for it to start.
3. start the "**_MySQL_**" module and wait for it to start.
![x1](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/5059c644-d6fd-44ed-b92c-2e41f1f85d39)
4. now click on "_Admin_" button of "**_MySQL_**".
![x2](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/cd12d6bb-79c1-40a1-b096-c3441e57b6c1)
5. now you will be redirected to the web browser page form this we will create our database.
6. click on "New" on left hand side.
7. now, Enter the name of database "**_student_**".
> Note:-
>  * Database name should be as it is "**Student**".
>  * table1 name should be as it is "**admin**".
>  * table2 name should be as it is "**student**".
8. now, hit the "create" button.
![x3](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/e3aa595e-4da8-4a27-8a8c-8cfc0b27df83)
9. now follow the GUI instructions.
![x4](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/7339ecfe-7534-400b-92bb-c91b5a2df851)

![x5](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/47ae1a48-f8e3-4d51-bc0d-a0656156cc7c)

![x6](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/f166fda5-16b6-410c-b3e1-88eb76fb8df4)

![x7](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/50a6c368-0f77-4be0-bbb6-b9836536ce23)

![x8](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/2f740de1-3bf2-4388-9fed-6289a823a064)

![x9](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/61b63d33-497d-42d7-9032-0bd0fd652a06)

![x10](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/92b6a22f-6232-4608-916e-37148582770a)

![x11](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/cdf80ec6-8249-470c-b3cc-cf2594a362b6)

![x12](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/19d441c2-e0e2-4627-b472-d9f618f47b3d)

22. now add the admin data in the admin table
23. id= "1", mail= "admin@gmail.com", password= "admin" name= ""admin




## 2. procedure (Apache NetBeans IDE):
1. Create the new project and select "Java with Ant" in Category section.
2. select "Java Application" in Projects section.
3. now, hit the "Next" button.
![1](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/f0e7b2f6-b7a3-4b89-8d76-b6667d035798)
4. Give the project name in my case it is "student_management_system_using_java".
5. now, hit the "Finish" button.
![2](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/61aa668a-c417-4322-a33c-fd0dbf2f2e77)
6. now navigate to the  "student_management_system_using_java > Source Packages" and right click on the "Source Packages > New > Java Package".
![3](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/5481cfe2-99f1-43f5-9f6d-5cf20c5cc480)
7. set the name for the package "login"
   * Note :- Package Name Should be "login" only.
8. now, click on "Finish" button.
![4](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/a633ec29-a02b-46b0-a8ee-79e403fdc4d7)
9. now open the project in file explorer by default it will be in the "Documents" folder in my case it is in (C:\Users\Bharat\Documents\NetBeansProjects\student_management_system_using_java\src).
10. now delete the "login" folder and past the new login folder from "github > ...src > login".
![5](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/79b10025-5bc6-42cb-935d-6fd298db9c3d)
11. now reopen the IDE and add the Libraries to the project which was downloaded
    * Note :- If you did'nt find then you can take it from "github > Libraries.
12. navigate to the "student_management_system_using_java > Source Packages > Libraries" folder
13. right click on it and click on "Add JAR/Folder"
![6](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/63530394-fe95-48f0-a344-36c5fb565739)
14. Now navigate to the folder were "rs2xml and mysql-connecter" is stored.
15. select both of them.
16. now click on "Open" button.
![7](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/0fe73d05-1ab1-4f4f-9857-11736a592ab2)
17. now navigate to the "login.java" file in Source Packages > login > login.java. and click on "Source"
![8](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/2ff1ca3c-7f0a-47a9-8ba4-edeb3493a4b8)
18. now right click on any were and click on "Run File"
    * Note :- Make sure your Xampp (Apace and mysql) server is running.
![9](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/4b640211-5b8a-406b-8324-61507a401b6a)

19. E- mail: "admin@gmail.com"
20. password: "admin"
21.  click on **login** button 
![10](https://github.com/the-zoomeee/Student-Management-System-using-java/assets/154297263/989c5361-50e2-4356-a1a7-809ce43aa22d)
