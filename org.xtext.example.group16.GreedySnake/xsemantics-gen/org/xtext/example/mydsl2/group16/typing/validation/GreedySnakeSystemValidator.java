package org.xtext.example.mydsl2.group16.typing.validation;

import com.google.inject.Inject;
import org.eclipse.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl2.group16.greedySnake.FoodKind;
import org.xtext.example.mydsl2.group16.typing.GreedySnakeSystem;
import org.xtext.example.mydsl2.group16.validation.AbstractGreedySnakeValidator;

@SuppressWarnings("all")
public class GreedySnakeSystemValidator extends AbstractGreedySnakeValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected GreedySnakeSystem xsemanticsSystem;
  
  protected GreedySnakeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
  
  @Check
  public void checkFoodKind(final FoodKind fk) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkFoodKind(fk),
    		fk);
  }
}
