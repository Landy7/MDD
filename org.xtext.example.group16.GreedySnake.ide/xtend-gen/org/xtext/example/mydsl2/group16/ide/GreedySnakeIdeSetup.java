/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl2.group16.GreedySnakeRuntimeModule;
import org.xtext.example.mydsl2.group16.GreedySnakeStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class GreedySnakeIdeSetup extends GreedySnakeStandaloneSetup {
  @Override
  public Injector createInjector() {
    GreedySnakeRuntimeModule _greedySnakeRuntimeModule = new GreedySnakeRuntimeModule();
    GreedySnakeIdeModule _greedySnakeIdeModule = new GreedySnakeIdeModule();
    return Guice.createInjector(Modules2.mixin(_greedySnakeRuntimeModule, _greedySnakeIdeModule));
  }
}
