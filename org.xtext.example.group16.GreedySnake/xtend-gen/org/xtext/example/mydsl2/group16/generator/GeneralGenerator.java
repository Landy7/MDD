package org.xtext.example.mydsl2.group16.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.mydsl2.group16.greedySnake.GreedySnake;

@SuppressWarnings("all")
public class GeneralGenerator {
  protected ModelPreprocessor mpp;
  
  protected final GreedySnake gs;
  
  public GeneralGenerator(final ModelPreprocessor mpp) {
    this.mpp = mpp;
    this.gs = mpp.getGreedySnake();
  }
  
  public CharSequence generateGamePackage() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.gs.getName();
    _builder.append(_name);
    _builder.append(".game");
    return _builder;
  }
  
  public CharSequence generateGamePackageFolder() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.gs.getName();
    _builder.append(_name);
    _builder.append("/game");
    return _builder;
  }
  
  public CharSequence generateSnakePackage() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.gs.getName();
    _builder.append(_name);
    _builder.append(".snake");
    return _builder;
  }
  
  public CharSequence generateSnakePackageFolder() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.gs.getName();
    _builder.append(_name);
    _builder.append("/snake");
    return _builder;
  }
  
  public CharSequence generateAboutClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateGamePackageFolder = this.generateGamePackageFolder();
    _builder.append(_generateGamePackageFolder);
    _builder.append("/About.java");
    return _builder;
  }
  
  public CharSequence generateCoordinateClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateGamePackageFolder = this.generateGamePackageFolder();
    _builder.append(_generateGamePackageFolder);
    _builder.append("/Coordinate.java");
    return _builder;
  }
  
  public CharSequence generateDirectionClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateGamePackageFolder = this.generateGamePackageFolder();
    _builder.append(_generateGamePackageFolder);
    _builder.append("/Direction.java");
    return _builder;
  }
  
  public CharSequence generateFoodSetClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateGamePackageFolder = this.generateGamePackageFolder();
    _builder.append(_generateGamePackageFolder);
    _builder.append("/Foodset.java");
    return _builder;
  }
  
  public CharSequence generateHelpClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateGamePackageFolder = this.generateGamePackageFolder();
    _builder.append(_generateGamePackageFolder);
    _builder.append("/Help.java");
    return _builder;
  }
  
  public CharSequence generateIndexToPixelClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateGamePackageFolder = this.generateGamePackageFolder();
    _builder.append(_generateGamePackageFolder);
    _builder.append("/IndexToPixel.java");
    return _builder;
  }
  
  public CharSequence generateMainWindowClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateGamePackageFolder = this.generateGamePackageFolder();
    _builder.append(_generateGamePackageFolder);
    _builder.append("/MainWindow.java");
    return _builder;
  }
  
  public CharSequence generateMusicClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateGamePackageFolder = this.generateGamePackageFolder();
    _builder.append(_generateGamePackageFolder);
    _builder.append("/Music.java");
    return _builder;
  }
  
  public CharSequence generateObstacleClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateGamePackageFolder = this.generateGamePackageFolder();
    _builder.append(_generateGamePackageFolder);
    _builder.append("/Obstacle.java");
    return _builder;
  }
  
  public CharSequence generateSysTimeClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateGamePackageFolder = this.generateGamePackageFolder();
    _builder.append(_generateGamePackageFolder);
    _builder.append("/SysTime.java");
    return _builder;
  }
  
  public CharSequence generateWrite2fileClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateGamePackageFolder = this.generateGamePackageFolder();
    _builder.append(_generateGamePackageFolder);
    _builder.append("/Write2file.java");
    return _builder;
  }
  
  public CharSequence generateBodyClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateSnakePackageFolder = this.generateSnakePackageFolder();
    _builder.append(_generateSnakePackageFolder);
    _builder.append("/Body.java");
    return _builder;
  }
  
  public CharSequence generatePlayerSnakeClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateSnakePackageFolder = this.generateSnakePackageFolder();
    _builder.append(_generateSnakePackageFolder);
    _builder.append("/PlayerSnake.java");
    return _builder;
  }
  
  public CharSequence generateBodyClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("Body");
    return _builder;
  }
  
  public CharSequence generatePlayerSnakeClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("PlayerSnake");
    return _builder;
  }
  
  public CharSequence generateAboutClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("About");
    return _builder;
  }
  
  public CharSequence generateCoordinateClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("Coordinate");
    return _builder;
  }
  
  public CharSequence generateDirectionClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("Direction");
    return _builder;
  }
  
  public CharSequence generateFoodSetClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("Foodset");
    return _builder;
  }
  
  public CharSequence generateHelpClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("Help");
    return _builder;
  }
  
  public CharSequence generateIndexToPixelClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("IndexToPixel");
    return _builder;
  }
  
  public CharSequence generateMainWindowClassName() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("MainWindow");
    return _builder;
  }
  
  public CharSequence generateMusicClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("Music");
    return _builder;
  }
  
  public CharSequence generateObstacleClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("Obstacle");
    return _builder;
  }
  
  public CharSequence generateSysTimeClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("SysTime");
    return _builder;
  }
  
  public CharSequence generateWrite2fileClassName(final String b) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(b);
    _builder.append(_firstUpper);
    _builder.append("Write2file");
    return _builder;
  }
}
