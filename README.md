# Code for Cause
<img alt="insecure" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/insecure.png" />

### PROJECT DESCRIPTION

A swing application built to connect non-profit organizations to serve the underprivileged members of the society. We have designed a system that allows Food Banks, Hospitals, and Food Pantries to communicate effectively to monitor food insecurity and health issues in a community. In this system, we have brought three different entities into the ecosystem model to establish hierarchy and leveraged workflows as a means for effective communication. Now, food pantries can communicate directly with doctors and nutritionists to put a check on the community's health problems.

---

### ARCHITECTURE

<img alt="architecture" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/architecture.png" />

---

### APPLICATION FEATURES AND USE CASES

1. A common login screen for all users
    <img alt="home" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/home.png" />
1. Each Food Bank can add multiple soup kitchens under them
2. A Food Bank Administrator can manage their inventory and this list of food items present in the inventory is visible to all the soup kitchens tied with them
    <img alt="inventory" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/inventory.png" />
3. A Food Pantry Administrator can place an order of food items with their respective food banks
    <img alt="cart" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/cart.png" />
4. A Food Pantry Administrator can raise a health screening request for their community members with the hospitals in the same network
    <img alt="health" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/health.png" />
5. A Food Pantry Administrator can keep track of requests using the dashboard
    <img alt="track" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/track.png" />
6. A Food packing department can view the pending order requests and once packed they can inform the logistics team to deliver the same
    <img alt="orderRequest" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/packer1.png" />
    <img alt="forward" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/packer2.png" />
7. Logistics Team can confirm the estimated date and time of order delivery, that triggers an email to the food pantry administrator informing the date and time of order delivery
    <img alt="logistic" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/logistic.png" />
8.  Email received by a food pantry administrator on food delivery
    <img alt="emailOrder" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/emailOrder.png" />
9. Email received by a food pantry administrator on nutritionist appointment approval
    <img alt="nutrition" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/nutritionist.png" />
10. A doctor can raise laboratory test request for patients and track the requests using the dashboard
    <img alt="doctor" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/doctor.png" />
11. A doctor can accept and set appointments for health screening, that triggers an email to the food pantry administrator informing the date and time of health screening
    <img alt="docApt" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/docApt.png" />
12.  Email received by a food pantry administrator on health screening appointment approval
    <img alt="health" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/healthScreening.png" />    
13. Lab Assistants team can view and work on pending lab tests and can later update the reports for the same
    <img alt="lab" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/lab.png" /> 
14. A Food Pantry Administrator can keep track of number of meals served each day and later draw insights on economic condition of the community
    <img alt="graph" src="https://github.com/v-abhishek/code-for-cause/blob/master/images/graph.png" />        

### LANGUAGE AND TOOLS

- Java
- Db4o
- Java Swing

### TEAM INFORMATION

NAME | GIT ID
------------ | -------------
AELINA DAS | [aelinadas](https://github.com/aelinadas)
ABHISHEK VISHWANATH | [v-abhishek](https://github.com/v-abhishek)

### INSTALL AND RUN

- Ensure that you have installed Java (Java 8 or above) on your machine
- Clone or download this repository on to your machine
- Install NetBeans IDE, if not present
- Import the cloned or downloaded project
- Click on run and the application is ready for use 
- Enter Username and Password as `admin` to add new enterprises and user accounts