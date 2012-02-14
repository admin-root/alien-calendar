package org.calendarsandal.publicobject;

public class Event {
	private String EventName;
	private TimeInterval timeinter;
	private String discription;
	private Location location;
	private boolean iscircle;
	private boolean isalarm;

	//-----------------Geter and seter-------------------------
	public String getEventName() {
		return EventName;
	}

	public void setEventName(String eventName) {
		EventName = eventName;
	}

	public boolean isIscircle() {
		return iscircle;
	}

	public void setIscircle(boolean iscircle) {
		this.iscircle = iscircle;
	}

	public TimeInterval getTimeinter() {
		return timeinter;
	}

	public void setTimeinter(TimeInterval timeinter) {
		this.timeinter = timeinter;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public boolean isIsalarm() {
		return isalarm;
	}

	public void setIsalarm(boolean isalarm) {
		this.isalarm = isalarm;
	}
   //-----------------------------------------------------------
}
