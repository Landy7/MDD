/*
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.group16.GreedySnake.ui.internal.GreedySnakeActivator;

public class GreedySnakeUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GreedySnakeActivator.getInstance().getInjector("org.xtext.example.mydsl2.group16.GreedySnake");
	}

}
