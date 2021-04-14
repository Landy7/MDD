package org.xtext.example.mydsl2.group16.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl2.group16.greedySnake.GreedySnake;

@SuppressWarnings("all")
public class ModelPreprocessor {
  private final GreedySnake gs;
  
  public ModelPreprocessor(final Resource resource) {
    this.gs = IteratorExtensions.<GreedySnake>head(Iterators.<GreedySnake>filter(resource.getAllContents(), GreedySnake.class));
  }
  
  public GreedySnake getGreedySnake() {
    return this.gs;
  }
}
