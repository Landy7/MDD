/*
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl2.group16.greedySnake.GreedySnake

@ExtendWith(InjectionExtension)
@InjectWith(GreedySnakeInjectorProvider)
class GreedySnakeParsingTest {
	@Inject
	ParseHelper<GreedySnake> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}