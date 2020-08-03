package com.dxc.ams2.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.dxc.ams2.entity.Agent;
import com.dxc.ams2.entity.Appointment;
import com.dxc.ams2.entity.Branch;
import com.dxc.ams2.entity.CustPolicy;
import com.dxc.ams2.entity.Customer;
import com.dxc.ams2.entity.Manager;
import com.dxc.ams2.entity.ZonalManager;
import com.dxc.ams2.impl.AgentImpl;
import com.dxc.ams2.impl.CustomerImpl;
import com.dxc.ams2.impl.ManagerImpl;
import com.dxc.ams2.impl.ZonalManagerImpl;

public class AmsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Activity management system.");
		System.out.println("press 1 for login as Zonam Manager");
		System.out.println("press 2 for login as Manager");
		System.out.println("press 3 for login as Agent");
		System.out.println("press 4 for login as customer");

		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			System.out.println("enter username : ");
			String loginname = sc.next();
			System.out.println("enter password : ");
			String password = sc.next();

			ZonalManagerImpl zobj = new ZonalManagerImpl();
			ArrayList<ZonalManager> alz = zobj.login(loginname, password);
			if (!alz.isEmpty()) {
				for (ZonalManager zonalManager : alz) {
					System.out.println("logged in as: " + zonalManager.getFname() + zonalManager.getLname());
				}

				System.out.println("press");
				System.out.println("1.	Zonal Manager List.\r\n" + "2.	Managers List.\r\n" + "3.	Add New Branch.\r\n"
						+ "4.	Add Manager\r\n" + "5.	Agent List.\r\n" + "6.	Replace Manager.\r\n"
						+ "7.	Policy Details.\r\n" + "8.	Logout.\r\n" + "");
			} else {
				System.out.println("no record found try again");
				main(args);
				break;
			}

			int ch1 = sc.nextInt();
			switch (ch1) {

			case 1:/* ZonalManagerImpl zobj=new ZonalManagerImpl(); */
				ArrayList<ZonalManager> alz1 = zobj.listZonalManagers();
				if (!alz1.isEmpty()) {
					for (ZonalManager zonalManager : alz1) {
						System.out.println(zonalManager);
					}
				} else {
					System.out.println("no record found try again");
					break;
				}
				break;
			case 2:
				ArrayList<Manager> alm = zobj.listManagers();
				if (!alm.isEmpty()) {
					for (Manager manager : alm) {
						System.out.println(manager);
					}
				} else {
					System.out.println("no record found try again");
					break;
				}
				break;

			case 3:
				System.out.println("enter BRNO :");
				String BRNO = sc.next();
				System.out.println("enter brName :");
				String brName = sc.next();
				System.out.println("enter brAddress :");
				String brAddress = sc.next();
				System.out.println("enter zMGNO :");
				String zMGNO = sc.next();
				System.out.println("enter manager :");
				String manager = sc.next();
				Branch br = new Branch(BRNO, brName, brAddress, zMGNO, manager);
				zobj.addBranch(br);
				break;
			case 4:
				System.out.println("enter mgno :");
				String mgno = sc.next();
				System.out.println("enter firstname :");
				String firstname = sc.next();
				System.out.println("enter lastname :");
				String lastname = sc.next();
				System.out.println("enter loginname :");
				loginname = sc.next();
				System.out.println("enter password :");
				password = sc.next();
				System.out.println("enter emailID :");
				String emailID = sc.next();

				Manager m = new Manager(mgno, firstname, lastname, loginname, password, emailID);
				zobj.addManager(m);
				break;

			case 5:
				ArrayList<Agent> ala = zobj.listAgents();
				if (!ala.isEmpty()) {
					for (Agent agent : ala) {
						System.out.println(agent);
					}
				} else {
					System.out.println("no record find");
					break;
				}
				break;

			case 6:
				System.out.println("enter BRNO1 :");
				BRNO = sc.next();
				System.out.println("enter manager1 :");
				manager = sc.next();
				boolean b6 = zobj.replaceManager(BRNO, manager);
				if (b6) {
					System.out.println("manager changed");
				} else {
					System.out.println("something went wrong");
					break;
				}
				break;
			case 7:
				ArrayList<CustPolicy> alcp = zobj.policyDetail();
				if (!alcp.isEmpty()) {
					for (CustPolicy custPolicy : alcp) {
						System.out.println(custPolicy);
					}
				} else {
					System.out.println("no record found try again");
					break;
				}
				break;

			case 8:
				zobj.logOut();
			}
			break;
		case 2:
			System.out.println("enter username : ");
			loginname = sc.next();
			System.out.println("enter password : ");
			password = sc.next();

			ManagerImpl mobj = new ManagerImpl();
			ArrayList<Manager> alm = mobj.login(loginname, password);
			if (!alm.isEmpty()) {
				for (Manager Manager : alm) {
					System.out.println("logged in as: " + Manager.getFirstname() + Manager.getLastname());
				}
				System.out.println("press : ");
				System.out.println("1.	Managers List.\r\n" + "2.	Agent List.\r\n" + "3.	Add New Agent.\r\n"
						+ "4.	Agent Performance.\r\n" + "5.	Set Target.\r\n" + "6.	Policy Details\r\n"
						+ "7.	Logout.\r\n" + "");
			} else {
				System.out.println("no record found try again");
				main(args);
				break;
			}

			ch1 = sc.nextInt();

			switch (ch1) {

			case 1:
				alm = mobj.listManagers();
				if (!alm.isEmpty()) {
					for (Manager manager : alm) {
						System.out.println(manager);
					}
				} else {
					System.out.println("no record found try again");
					break;
				}
				break;
			case 2:
				ArrayList<Agent> ala = mobj.listAgents();
				if (!ala.isEmpty()) {
					for (Agent agent : ala) {
						System.out.println(agent);
					}
				} else {
					System.out.println("no record found try again");
					break;
				}
				break;
			case 3:
				System.out.println("enter AGNO :");
				String aGNO = sc.next();
				System.out.println("enter fname :");
				String fname = sc.next();
				System.out.println("enter lastname :");
				String lname = sc.next();
				System.out.println("enter loginname :");
				loginname = sc.next();
				System.out.println("enter password :");
				password = sc.next();
				System.out.println("enter pType :");
				String pType = sc.next();
				System.out.println("enter BRNO :");
				String bRNO = sc.next();
				System.out.println("enter email :");
				String email = sc.next();
				System.out.println("enter address :");
				String address = sc.next();
				System.out.println("enter phoneNo :");
				String phoneNo = sc.next();
				System.out.println("enter target :");
				int target = sc.nextInt();
				System.out.println("enter targetDate :");
				String targetDate = sc.next();
				System.out.println("enter pSold :");
				int pSold = sc.nextInt();
				Agent ag = new Agent(aGNO, fname, lname, loginname, password, pType, bRNO, email, address, phoneNo,
						target, targetDate, pSold);
				mobj.addAgent(ag);
				break;
			case 4:
				System.out.println("enter AGNO :");
				String AGNO = sc.next();
				String s = mobj.agentPerformance(AGNO);
				System.out.println("performance of agentno : " + AGNO + " is " + s);
				break;
			case 6:
				ArrayList<CustPolicy> alcp = mobj.policyDetail();
				if (!alcp.isEmpty()) {
					for (CustPolicy custPolicy : alcp) {
						System.out.println(custPolicy);
					}
				} else {
					System.out.println("no record find");
					break;
				}
				break;
			case 5:
				System.out.println("enter AGNO :");
				AGNO = sc.next();
				System.out.println("enter AGNO :");
				target = sc.nextInt();
				mobj.setTarget(AGNO, target);
				System.out.println("target set");
				break;
			case 7:
				ArrayList<CustPolicy> alcp1 = mobj.policyDetail();
				if (!alcp1.isEmpty()) {
					for (CustPolicy custPolicy : alcp1) {
						System.out.println(custPolicy);
					}
				} else {
					System.out.println("no record found try again");
					break;
				}
				break;

			case 8:
				mobj.logOut();
			}
			break;

		case 3:
			System.out.println("enter username : ");
			loginname = sc.next();
			System.out.println("enter password : ");
			password = sc.next();
			AgentImpl aobj = new AgentImpl();
			ArrayList<Agent> ala = aobj.listAgents();
			if (!ala.isEmpty()) {
				for (Agent agent : ala) {
					System.out.println("logged in as: " + agent.getFname() + agent.getLname());
				}

				System.out.println("1.	Agent List.\r\n" + "2.	Make New Appointment.\r\n"
						+ "3.	Delete Appointment.\r\n" + "4.	Add New Customer.\r\n" + "5.	Policy Details.\r\n"
						+ "6.	View Report.\r\n" + "a.	View Appointment Info.\r\n" + "b.	Customer Details.\r\n"
						+ "7.	Logout.\r\n" + "");
			} else {
				System.out.println("no record found try again");
				main(args);
				break;
			}
			ch1 = sc.nextInt();
			switch (ch1) {

			case 1:
				ala = aobj.listAgents();
				if (!ala.isEmpty()) {
					for (Agent agent : ala) {
						System.out.println(agent);
					}
				} else {
					System.out.println("no record found try again");
					break;
				}
				break;
			case 2:
				System.out.println("enter APID :");
				String aPID = sc.next();
				System.out.println("enter aptDate 'formet: yyyy/mm/dd' :");
				String aptDate = sc.next();
				System.out.println("enter aptTime :");
				String aptTime = sc.next();
				System.out.println("enter cstName :");
				String cstName = sc.next();
				Appointment ap = new Appointment(aPID, aptDate, aptTime, cstName);
				aobj.newAppointment(ap);
				break;
			case 3:
				System.out.println("enter APID : ");
				String APID = sc.next();
				boolean b3 = aobj.deleteAppointment(APID);
				if (b3) {
					System.out.println("deleted successfully");
				} else {
					System.out.println("something went wrong");
					break;
				}
				break;
			case 4:
				System.out.println("enter CSNO :");
				String cSNO = sc.next();
				System.out.println("enter fname :");
				String fname = sc.next();
				System.out.println("enter lastname :");
				String lname = sc.next();
				System.out.println("enter loginname :");
				loginname = sc.next();
				System.out.println("enter password :");
				password = sc.next();
				System.out.println("enter emailID :");
				String emailID = sc.next();
				System.out.println("enter address :");
				String address = sc.next();
				System.out.println("enter phone :");
				String phone = sc.next();
				Customer cst = new Customer(cSNO, fname, lname, loginname, password, emailID, address, phone);
				aobj.addCustomer(cst);
				break;
			case 5:
				ArrayList<CustPolicy> alcp = aobj.policyDetail();

				if (!alcp.isEmpty()) {
					for (CustPolicy custPolicy : alcp) {
						System.out.println(custPolicy);
					}
				} else {
					System.out.println("no record found try again");
					break;
				}
				break;
			case 6:
				int ch2 = sc.nextInt();
				switch (ch2) {
				case 1:
					ArrayList<Appointment> apli = aobj.appointmentDetails();
					if (!apli.isEmpty()) {
						for (Appointment appointment : apli) {

							System.out.println(appointment);

						}
					} else {
						System.out.println("no record found try again");
						break;
					}
					break;
				case 2:
					System.out.println("enter CSNO : ");
					String CSNO = sc.next();
					ArrayList<Customer> cstli = aobj.customertDetails(CSNO);
					if (!cstli.isEmpty()) {
						for (Customer customer : cstli) {
							System.out.println(customer);
						}
					} else {
						System.out.println("no record found try again");
						break;
					}
					break;
				}
			case 7:
				aobj.logOut();

			}
			break;
		case 4:

			System.out.println("enter username : ");
			loginname = sc.next();
			System.out.println("enter password : ");
			password = sc.next();
			CustomerImpl cobj = new CustomerImpl();
			ArrayList<Customer> cstli = cobj.login(loginname, password);
			if (!cstli.isEmpty()) {
				for (Customer customer : cstli) {
					System.out.println("logged in as: " + customer.getFname() + customer.getLname());
				}
				System.out.println("\r\n" + "1.	Customer Info.\r\n" + "2.	Change Password.\r\n"
						+ "3.	Policy Details.\r\n" + "4.   Logout.\r\n" + "");
			} else {
				System.out.println("no record found try again");
				main(args);
				break;
			}
			ch1 = sc.nextInt();
			switch (ch1) {
			case 1:
				System.out.println("enter your CSNO :");
				String CSNO = sc.next();
				cstli = cobj.customertInfo(CSNO);
				if (!cstli.isEmpty()) {
					for (Customer customer : cstli) {
						System.out.println(customer);
					}
				} else {
					System.out.println("no record found try again");
					break;
				}
				break;
			case 2:
				System.out.println("enter old password : ");
				String oldPassword = sc.next();
				System.out.println("enter new password : ");
				String newPassword = sc.next();
				System.out.println("enter your CSNO : ");
				CSNO = sc.next();
				boolean b2 = cobj.changePassword(CSNO, oldPassword, newPassword);
				if (b2) {
					System.out.println("changed successfully");
				} else {
					System.out.println("something went wrong");
				}
				break;
			case 3:
				ArrayList<CustPolicy> alcp = cobj.policyDetail();
				if (!alcp.isEmpty()) {
					for (CustPolicy custPolicy : alcp) {
						System.out.println(custPolicy);
					}
				} else {
					System.out.println("no record found try again");
					break;
				}
				break;
			case 4:
				cobj.logOut();
			}
		}
	}

	// TODO Auto-generated method stub

//ZonalManagerImpl zobj=new ZonalManagerImpl();
//ArrayList<ZonalManager> alz= zobj.listZonalManagers();
//for (ZonalManager zonalManager : alz) {
//	System.out.println(zonalManager);
//}
}
