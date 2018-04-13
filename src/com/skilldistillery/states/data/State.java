package com.skilldistillery.states.data;

public class State {
  private String abbrev;
  private String name;
  private String capital;
  private String latitude;
  private String longitude;
  private String capPop;

  public State() {
  }
  
  public State(String abbreviation, String name, String capital, String latitude, String longitude, String capPop) {
    this.abbrev = abbreviation;
    this.name = name;
    this.capital = capital;
    this.latitude = latitude;
    this.longitude = longitude;
    this.capPop = capPop;
  }

  public State(String string, String string2, String string3, String string4, String string5) {
	// TODO Auto-generated constructor stub
}

public String getCapPop() {
	return capPop;
}

public void setCapPop(String capPop) {
	this.capPop = capPop;
}

public String getAbbreviation() {
    return abbrev;
  }
  public String getName() {
    return name;
  }
  public String getCapital() {
    return capital;
  }
  public String getLatitude() {
    return latitude;
  }
  public String getLongitude() {
    return longitude;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbrev = abbreviation;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setCapital(String capital) {
    this.capital = capital;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("State [abbrev=");
	builder.append(abbrev);
	builder.append(", name=");
	builder.append(name);
	builder.append(", capital=");
	builder.append(capital);
	builder.append(", latitude=");
	builder.append(latitude);
	builder.append(", longitude=");
	builder.append(longitude);
	builder.append(", capPop=");
	builder.append(capPop);
	builder.append("]");
	return builder.toString();
}



}
