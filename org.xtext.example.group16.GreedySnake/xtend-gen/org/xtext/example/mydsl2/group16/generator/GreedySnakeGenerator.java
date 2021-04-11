/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class GreedySnakeGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final ModelPreprocessor processorModel = new ModelPreprocessor(resource);
    new MainWindowGenerator(processorModel).generate(fsa);
    new About(processorModel).generate(fsa);
    new Body(processorModel).generate(fsa);
    new Coordinate(processorModel).generate(fsa);
    new Direction(processorModel).generate(fsa);
    new FoodSet(processorModel).generate(fsa);
    new Help(processorModel).generate(fsa);
    new IndexToPixel(processorModel).generate(fsa);
    new Music(processorModel).generate(fsa);
    new Obstacle(processorModel).generate(fsa);
    new PlayerSnake(processorModel).generate(fsa);
    new SysTime(processorModel).generate(fsa);
    new Write2File(processorModel).generate(fsa);
  }
}