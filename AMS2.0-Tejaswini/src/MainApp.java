
import java.util.Scanner;

import com.dxc.ams2.agent.impl.AgentImpl;
import com.dxc.ams2.customer.impl.CustomerImpl;
import com.dxc.ams2.entity.Branch;
import com.dxc.ams2.entity.Customer;
import com.dxc.ams2.entity.Manager;
import com.dxc.ams2.manager.impl.ManagerImpl;
import com.dxc.ams2.zonal.impl.*;
import com.dxc.ams2.entity.Agent;
import com.dxc.ams2.entity.Appointment;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
ZonalImpl zobj=new ZonalImpl();

//---METHOD 1---List of zonal managers
zobj.viewZonalManager();

//---METHOD 2--adding managers
Manager m=new Manager("MG01","Tejas","shekar","tejas","te","tejas@gmail.com","Bangalore","9988226633","BR07");
Manager m1=new Manager("MG02","Ramu","sheina","ramu","re","ramu@gmail.com","Hyderabad","9988226786","BR02");
Manager m2=new Manager("MG03","ravali","shekandar","ravali","re","ravali@gmail.com","Chennai","9988566633","BR01");
zobj.addManager(m);
zobj.addManager(m1);
zobj.addManager(m2);

//---METHOD 3--view manager list
zobj.viewManager();

//---METHOD 4--adding new branch
Branch b=new Branch("BR001","Shadhnagar","Shadhnagar","ZM001");
Branch b1=new Branch("BR002","Siddipet","Sdpt town","ZM001");
zobj.addBranch(b);
zobj.addBranch(b1);

//---METHOD 5--view agent list
zobj.viewAgent();

//---METHOD 6--view policy details of a specific customer(customer ID should be known)
System.out.println("enter the customer id to view his policy details:");
zobj.viewPolicyDetails(sc.next());

//---METHOD 7--replace manager to new branch(provide branch no and manager no)
System.out.println("Enter the manager ID who need to be replaced:");
String mn=sc.next();
System.out.println("Enter the branch ID to shift to that branch:");
String br=sc.next();
zobj.replaceManager(mn, br);

//---METHOD 8--logout and close connection
zobj.logout();

//***********END OF ZONAL MANAGER FUNCTIONS****************

ManagerImpl mobj=new ManagerImpl();

//---METHOD 1--view list of managers
mobj.viewManager(); 

//---METHOD 2--adding agents by manager
Agent a=new Agent("AG01","rajesh","rakshi","raj","rj","BR001","LIC","Hyderabad","9876543214","rajesh@gmail.com",2,1,"2020-7-12 6:56:00","2020-8-19 7:34:00");
Agent a1=new Agent("AG06","piyush","rao","piyush","rj","BR002","LIC","Chennai","9876573214","piyush@gmail.com",7,5,"2020-7-24 6:05:00","2020-8-24 7:40:00");
Agent a2=new Agent("AG02","prema","kamatkar","prema","rj","BR003","LIC","Hyderabad","9876543214","rajesh@gmail.com",2,1,"2020-7-12 6:56:00","2020-8-19 7:34:00");
Agent a3=new Agent("AG03","pandu","rao","raj","pandu","BR001","JSK","Noida","9876543214","rajesh@gmail.com",2,1,"2020-7-12 6:56:00","2020-8-19 7:34:00");
Agent a4=new Agent("AG04","shreni","palak","shreni","rj","BR003","JSK","Bhopal","9876543214","rajesh@gmail.com",2,1,"2020-7-12 6:56:00","2020-8-19 7:34:00");
Agent a5=new Agent("AG05","ravi","ranish","ravi","ri","BR002","JSK","Hyderabad","9876543564","ravi@gmail.com",6,3,"2020-7-28 6:30:00","2020-8-30 7:30:00");
mobj.addAgent(a);
mobj.addAgent(a1);
mobj.addAgent(a2);
mobj.addAgent(a3);
mobj.addAgent(a4);
mobj.addAgent(a5);

//---METHOD 3-- view the list of agents in database
mobj.viewAgent();

//---METHOD 4-- view the  performance of particular agent
System.out.println("Enter the agent ID to know his/her performance: ");
mobj.viewAgentPerformance(sc.next());

//---METHOD 5-- set target for particular agent
System.out.println("Enter the agent ID who need to be set target:");
String agno=sc.next();
System.out.println("Enter the target number:");
int tar=sc.nextInt();
mobj.setTarget(agno, tar);

//---METHOD 6--view policy details of a specific customer(customer ID should be known)
System.out.println("enter the customer id to view his policy details:");
mobj.viewPolicyDetails(sc.next());

//---METHOD 7--logout
mobj.logout();

//***********END OF MANAGER FUNCTIONS****************


AgentImpl aobj=new AgentImpl();

//---METHOD 1-- view the list of agents in database
mobj.viewAgent();

//---METHOD 2-- make new appointment  
Appointment ap=new Appointment("AP001","AG01","2020-8-1 6:56:00","9:00","revanth");
Appointment ap1=new Appointment("AP002","AG02","2020-8-1 8:56:00","10:00","krithi");
Appointment ap2=new Appointment("AP003","AG03","2020-8-1 7:56:00","9:00","praveen");
Appointment ap3=new Appointment("AP004","AG04","2020-8-1 9:56:00","11:00","satya");
Appointment ap4=new Appointment("AP005","AG05","2020-8-1 10:56:00","1:00","preethi");
aobj.addAppointment(ap);
aobj.addAppointment(ap1);
aobj.addAppointment(ap2);
aobj.addAppointment(ap3);
aobj.addAppointment(ap4);


//---METHOD 3-- delete an appointment
System.out.println("enter appointment number to be deleted:");
aobj.deleteApointment(sc.next());

//---METHOD 4-- add customer to the database
Customer cs=new Customer("CST001",",mahesh","raj","mahesh","mh","mahesh@gmail.com","Hyderabad","9012345676","AG01");
Customer cs1=new Customer("CST002","revanth","rao","revanth","mh","revanth@gmail.com","Chennai","9012345676","AG02");
Customer cs2=new Customer("CST003","kamala","revsah","kamala","mh","kamala@gmail.com","Hyderabad","9012345676","AG03");
Customer cs3=new Customer("CST004","preethi","nilka","mahesh","mh","preethi@gmail.com","Chennai","9012345676","AG04");
Customer cs4=new Customer("CST005","kavya","singh","kavya","mh","kavya@gmail.com","Hyderabad","9012345676","AG05");
Customer cs5=new Customer("CST006","krithi","sanon","krithi","mh","krithi@gmail.com","Chennai","9012345676","AG06");
Customer cs6=new Customer("CST007","praveen","akkal","praveen","mh","praveen@gmail.com","Hyderabad","9012345676","AG06");
Customer cs7=new Customer("CST008","sreeja","kadav","sreeja","mh","sreeja@gmail.com","Chennai","9012345676","AG05");
Customer cs8=new Customer("CST009","madhuri","kali","madhuri","mh","madhuri@gmail.com","Hyderabad","9012345676","AG04");
Customer cs9=new Customer("CST010","kiran","krish","kiran","mh","kiran1@gmail.com","Chennai","9012345676","AG03");
Customer cs10=new Customer("CST011","sathya","rajam","sathya","mh","sathya@gmail.com","Hyderabad","9012345676","AG02");
Customer cs11=new Customer("CST012","kiran","sair","kiran","mh","kiran@gmail.com","Chennai","9012345676","AG01");
aobj.addCustomer(cs);
aobj.addCustomer(cs1);
aobj.addCustomer(cs2);
aobj.addCustomer(cs3);
aobj.addCustomer(cs4);
aobj.addCustomer(cs5);
aobj.addCustomer(cs6);
aobj.addCustomer(cs7);
aobj.addCustomer(cs8);
aobj.addCustomer(cs9);
aobj.addCustomer(cs10);
aobj.addCustomer(cs11);

//---METHOD 5-- view policy details of a specific customer(customer ID should be known)
System.out.println("enter the customer id to view his policy details:");
aobj.viewPolicyDetails(sc.next());

//---METHOD 6-- view appointment information 
System.out.println("Enter appointment number to view the appointment:");
aobj.viewAppointmentInfo(sc.next());

//---METHOD 7-- view customer details
System.out.println("Enter the customer ID to view his details: ");
aobj.viewCustomerDetails(sc.next());



//---METHOD 8--logout
aobj.logout();

//***********END OF AGENT FUNCTIONS****************

CustomerImpl cobj=new CustomerImpl();

//---METHOD 1-- display the details of customer
System.out.println("enter customer id to view your details:");
cobj.viewSelfDetails(sc.next());

//---METHOD 2-- change password
System.out.println("enter your customer id:");
String cid=sc.next();
System.out.println("enter your new pwd:");
String p=sc.next();
cobj.changePassword(cid, p);

//---METHOD 3--view policy details
System.out.println("enter the customer id to view his policy details:");
cobj.policyDetails(sc.next());

//---METHOD 4--logout
aobj.logout();

//***********END OF CUSTOMER FUNCTIONS****************

sc.close();

	}

}
