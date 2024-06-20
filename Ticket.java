package org;

public class Ticket 
{
	 private String ticketNo;
     private int seatNo;
     private String destinationPoint;
     private String boardingPoint;
     private int date;
     
     //empty constructor
     public Ticket()
     {
    	 
     }
     //parametarized constructor

	public Ticket(String ticketNo, int seatNo, String destinationPoint, String boardingPoint, int date) 
	{
		this.ticketNo = ticketNo;
		this.seatNo = seatNo;
		this.destinationPoint = destinationPoint;
		this.boardingPoint = boardingPoint;
		this.date = date;
	}
   //getters and setters
	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	//print ticket details
	public void ticketDetails()
	{

	       System.out.println("enter the ticket number:"+ ticketNo);
		   System.out.println("enter the seat number:"+ seatNo);
		   System.out.println("enter the destination:"+ destinationPoint);
		   System.out.println("enter the boarding point:"+ boardingPoint);
		   System.out.println("enter th4e date "+date);
		}
}

	
     



