package simulator.factories;

import org.json.JSONObject;

import simulator.model.LightSwitchingStrategy;
import simulator.model.RoundRobinStrategy;

public class RoundRobinStrategyBuilder extends Builder<LightSwitchingStrategy> {

	RoundRobinStrategyBuilder() {
		super("round_robin_lss");
		
	}

	@Override
	protected LightSwitchingStrategy createTheInstance(JSONObject data) {
		int time = data.getInt("timeslot");
		return new RoundRobinStrategy(time);
	}

}
