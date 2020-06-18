package com.example.drools;

import com.myspace.weatherrules.newp.Weather;

public class TDD {

	public static void main(String[] args) {

		RulesEngineClient engineClient = new RulesEngineClient();

		Weather weather = new Weather();
		weather.setHumidity(80.0f);
		weather.setHumidity_status("");
		weather.setPerticipation(80f);
		weather.setPerticipation_status("");
		weather.setTemprature(80.0f);
		weather.setTemprature_status("");
		weather.setWindSpeed(80f);
		weather.setWindSpeed_status("");
		engineClient.executeRules(weather);
		System.out.println("weather is " + weather.getClass().getSimpleName());

	}
}
