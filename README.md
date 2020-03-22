# FacilityMgmt373p1

UML : https://drive.google.com/file/d/16qiCV_rr_7OG1IcVqGFHXxoYjdXtMZWz/view?usp=sharing

CLIENT LAYER: 
For Project 1, we decided to create one client class that will encompass all customer-interactive parts of our facility software. 

BUSINESS LOGIC LAYER:
The business layer utilizes a factory design pattern to create facilities. Then, the parts of the software pertaining to maintenance and inspection pull information from the factory interface to get factory objects to maintain/inspect. The maintenance section of the software has an interface to separate request scheduling from request creation. Finally, inspections only take up one class and takes information from the data access layer and from the facility interface. 

DATA ACCESS LAYER: 
The data access layer pulls data concening the facilities (FacilityDAO), the maintenance requests (MaintenanceDAO), scheduling (ScheduleDAO), and inspections that have been done (InspectionDAO). 
