# little-fog-1256
Human Resource Management System
<h1>Human Resource Management System</h1>
 
<h1>Project Logo:</h1>

![logo](https://user-images.githubusercontent.com/51885478/201520124-0fb27c8a-8527-4dc8-90a4-63801f81615a.png)


# The Basic Prerequisites of this Applications are.
- [x] Should Have a MySQL Server and a Database Created.
- [x] Should have created folllowing tables into the database WITH SAME DATATYPES.


- [X] TABLE DEPARTMENT


| Field     | Type        | Null | Key | Default | Extra          |
|-----------|-------------|------|-----|---------|----------------|
| dept_id   | int         | NO   | PRI | NULL    | auto_increment |
| dept_name | varchar(20) | NO   | UNI | NULL    |                |



<hr />

- [X] TABLE ADMIN


| Field         | Type        | Null | Key | Default | Extra          |
|---------------|-------------|------|-----|---------|----------------|
| admin_id      | int         | NO   | PRI | NULL    | auto_increment |
| admin_name    | varchar(30) | NO   |     | NULL    |                |
| admin_pass    | varchar(8)  | NO   | UNI | NULL    |                |
| admin_dept_id | int         | NO   |     | NULL    |                |




<hr />

- [x] TABLE EMPLOYEE


| Field       | Type        | Null | Key | Default           | Extra             |
|-------------|-------------|------|-----|-------------------|-------------------|
| emp_id      | int         | NO   | PRI | NULL              | auto_increment    |
| emp_name    | varchar(30) | NO   |     | NULL              |                   |
| emp_pass    | varchar(8)  | NO   | UNI | NULL              |                   |
| emp_dept_id | int         | YES  | MUL | NULL              |                   |
| emp_login   | datetime    | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |




<hr />

- [x] TABLE LEAVEAPPLICATION


| Field     | Type        | Null | Key | Default | Extra |
|-----------|-------------|------|-----|---------|-------|
| emp_id    | int         | YES  | UNI | NULL    |       |
| leave_day | varchar(10) | YES  |     | NULL    |       |
| status    | varchar(10) | YES  |     | Pending |       |



<hr />



# Description :-
Software To Monitor Your Employees details, Productive Time, Leave Status & Department Details.



<h3>Admin Roles are:</h3>

•	Admin can add new Departments.
•	Admin can view and update the Departments.
•	Admin can register new Employees and give them their password.
•	Admin can also transfer them to other departments.
•	Admin can grant or deny employee leave request.



<h3Employee Roles are:</h3>

•	Employee can view and update his profile.
•	Employee can also change his password.
•	Employee can also request for leaves.


# Tech stack and Tools used 

- Java
- MySQL
- Git & GitHub




# Flow of Application

<h3>Database Schema:</h3>

![Schema](https://user-images.githubusercontent.com/51885478/201520671-537af205-4563-4ed6-aa17-ed2d3eae3acb.PNG)



## **Application Start** 
*Start View Of Application*
</br>

## **ADMIN ACCESSIBLE FUNCTIONS** 
![Admin portal](https://user-images.githubusercontent.com/51885478/201520883-1c891de3-7a59-4af2-853a-f0dfab02aa94.PNG)

</br>

## ****EMPLOYEE ACCESSIBLE FUNCTIONS** 
![Employee portal](https://user-images.githubusercontent.com/51885478/201520879-a5315409-2757-449b-ae90-a23abd3eb2b3.PNG)


</br>

-*User can go back to the previous option*
</br>


# Thank you for reading..
