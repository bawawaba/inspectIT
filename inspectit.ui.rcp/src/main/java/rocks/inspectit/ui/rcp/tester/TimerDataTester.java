package rocks.inspectit.ui.rcp.tester;

import org.eclipse.core.expressions.PropertyTester;

import rocks.inspectit.shared.all.communication.data.TimerData;

/**
 * Tester for charting possibilities of {@link TimerData}.
 *
 * @author Ivan Senic
 *
 */
public class TimerDataTester extends PropertyTester {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof TimerData) {
			TimerData timerData = (TimerData) receiver;

			if ("canChart".equals(property)) {
				if (expectedValue instanceof Boolean) {
					return ((Boolean) expectedValue).booleanValue() == timerData.isCharting();
				} else {
					return false;
				}
			}
		}
		return false;
	}

}
