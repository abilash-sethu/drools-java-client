package com.example.drools;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.command.BatchExecutionCommand;
import org.kie.api.command.Command;
import org.kie.api.command.KieCommands;
import org.kie.api.runtime.ExecutionResults;
import org.kie.internal.command.CommandFactory;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.RuleServicesClient;

import com.myspace.weatherrules.newp.Weather;

public class RulesEngineClient {

	private static final String URL = "http://url:8080/kie-server/services/rest/server";
	private static final String USER = "kieserver";
	private static final String PASSWORD = "kieserver1!";

	private static final MarshallingFormat FORMAT = MarshallingFormat.JSON;

	private static final String CONTAINERID = "WeatherRules_1.0.0-SNAPSHOT";
	private static final String CLASS_NAME = "Weather";

	public <T> void executeRules(T request) {

		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(URL, USER, PASSWORD);
		config.setMarshallingFormat(FORMAT);

		RuleServicesClient client = KieServicesFactory.newKieServicesClient(config)
				.getServicesClient(RuleServicesClient.class);
		List<Command<?>> cmds = new ArrayList<Command<?>>();
		KieCommands commands = KieServices.Factory.get().getCommands();

		cmds.add(commands.newInsert(request, CLASS_NAME));
		cmds.add(commands.newFireAllRules());

		BatchExecutionCommand myCommands = CommandFactory.newBatchExecution(cmds);

		ServiceResponse<ExecutionResults> response = client.executeCommandsWithResults(CONTAINERID, myCommands);

		if (response.getType() == ServiceResponse.ResponseType.SUCCESS) {
			System.out.println("Command executed with sucess! response: ");
			System.out.println(response.getResult());
			Weather result = (Weather) response.getResult().getValue(CLASS_NAME);
			System.out.println(result.toString());

		} else {
			System.out.println("Error executin the rules: Message:");
			System.out.println(response.getMsg());
		}

	}
}
