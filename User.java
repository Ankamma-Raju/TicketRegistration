package org;

import java.util.ArrayList;
import java.util.ListIterator;

public class User 
{
	 private String userName;
     private long mobileNo;
     private int age;
     private Ticket t;
     //getters and setters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Ticket getT() {
		return t;
	}
	public void setT(Ticket t) {
		this.t = t;
	}
	ArrayList<Ticket> ticket=new ArrayList<Ticket>();
	
	//book ticket
	public void bookTicket(Ticket t)
	{
		ticket.add(t);
		System.out.println("ticket booked successfully");
	}
	// display ticket
	public void displayTicket()
		{
			if(ticket.isEmpty())
			{
			   throw new noTicketException();
			}
			else
			{
				for(Ticket t:ticket)
				{
					t.ticketDetails();
				}
			}
		}
	// change boarding point
			public void changeBoardingPoint(String boardingPoint)
			{
					boolean isFound=false;
					if(ticket.isEmpty())
					{
						throw new noTicketException();
					}
					else
					{
						for(Ticket t:ticket)
						{
							if(t.getBoardingPoint().equals(boardingPoint))
							{
								t.setBoardingPoint("anakapalli");
								System.out.println("boarding point changed");
								isFound=true;
							}
						}
					}
					if(isFound==false)
					{
						throw new invalidBoardingPointException(); 
					}
				}

//change destination point
public void changeDestinationPoint(String destinationPoint)
{
	boolean isFound=false;
	if(ticket.isEmpty())
	{
		throw new noTicketException();
	}
	else
	{
		for(Ticket t:ticket)
		{
			if(t.getDestinationPoint().equals(destinationPoint))
			{
				t.setDestinationPoint("medhak");
				System.out.println("destination point changed");
				isFound=true;
			}
		}
	}
	if(isFound==false)
	{
		throw new invalidDestinationPointException();
	}
}
//change journey date
			public void changeJourneyDate(int date)
			{
				boolean isFound=false;
				if(ticket.isEmpty())
				{
					throw new noTicketException();
				}
				else
				{
					for(Ticket t:ticket)
					{
						if(t.getDate()==date)
						{
							t.setDate(12-03-22);
							System.out.println("journey date changed");
							isFound=true;
						}
					}
				}
				if(isFound==false)
				{
					throw new noJourneyDateException(); 
				}
			}
			//cancel ticket based on ticket number
			public void cancelTicket(String ticketNo)
			{
				ListIterator<Ticket> i=ticket.listIterator();
				boolean isCancelled=false;
				if(ticket.isEmpty())
				{
					throw new noTicketException();
				}
				else
				{
					while(i.hasNext())
					{
						Ticket t1=i.next();
						{
							if(t1.getTicketNo().equals(ticketNo))
							{
								i.remove();
								System.out.println("ticket cancelled");
								isCancelled=true;
							}
						}
					}
					if(isCancelled==false)
					{
						throw new invalidTicketNoException();
					}
				}
			}
}

