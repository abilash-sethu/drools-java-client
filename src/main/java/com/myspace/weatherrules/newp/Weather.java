package com.myspace.weatherrules.newp;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Weather implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private float temprature;
	@Override
	public String toString() {
		return "Weather [temprature=" + temprature + ", humidity=" + humidity + ", perticipation=" + perticipation
				+ ", windSpeed=" + windSpeed + ", temprature_status=" + temprature_status + ", humidity_status="
				+ humidity_status + ", perticipation_status=" + perticipation_status + ", windSpeed_status="
				+ windSpeed_status + "]";
	}

	private java.lang.Float humidity;
	private java.lang.Float perticipation;
	private java.lang.Float windSpeed;
	private java.lang.String temprature_status;
	private java.lang.String humidity_status;
	private java.lang.String perticipation_status;
	private java.lang.String windSpeed_status;

	public Weather() {
	}

	public float getTemprature() {
		return this.temprature;
	}

	public void setTemprature(float temprature) {
		this.temprature = temprature;
	}

	public java.lang.Float getHumidity() {
		return this.humidity;
	}

	public void setHumidity(java.lang.Float humidity) {
		this.humidity = humidity;
	}

	public java.lang.Float getPerticipation() {
		return this.perticipation;
	}

	public void setPerticipation(java.lang.Float perticipation) {
		this.perticipation = perticipation;
	}

	public java.lang.Float getWindSpeed() {
		return this.windSpeed;
	}

	public void setWindSpeed(java.lang.Float windSpeed) {
		this.windSpeed = windSpeed;
	}

	public java.lang.String getTemprature_status() {
		return this.temprature_status;
	}

	public void setTemprature_status(java.lang.String temprature_status) {
		this.temprature_status = temprature_status;
	}

	public java.lang.String getHumidity_status() {
		return this.humidity_status;
	}

	public void setHumidity_status(java.lang.String humidity_status) {
		this.humidity_status = humidity_status;
	}

	public java.lang.String getPerticipation_status() {
		return this.perticipation_status;
	}

	public void setPerticipation_status(java.lang.String perticipation_status) {
		this.perticipation_status = perticipation_status;
	}

	public java.lang.String getWindSpeed_status() {
		return this.windSpeed_status;
	}

	public void setWindSpeed_status(java.lang.String windSpeed_status) {
		this.windSpeed_status = windSpeed_status;
	}

	public Weather(float temprature, java.lang.Float humidity,
			java.lang.Float perticipation, java.lang.Float windSpeed,
			java.lang.String temprature_status,
			java.lang.String humidity_status,
			java.lang.String perticipation_status,
			java.lang.String windSpeed_status) {
		this.temprature = temprature;
		this.humidity = humidity;
		this.perticipation = perticipation;
		this.windSpeed = windSpeed;
		this.temprature_status = temprature_status;
		this.humidity_status = humidity_status;
		this.perticipation_status = perticipation_status;
		this.windSpeed_status = windSpeed_status;
	}

}