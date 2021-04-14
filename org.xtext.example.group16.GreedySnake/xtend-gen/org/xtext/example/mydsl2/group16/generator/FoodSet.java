package org.xtext.example.mydsl2.group16.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.xtext.example.mydsl2.group16.greedySnake.Addition;
import org.xtext.example.mydsl2.group16.greedySnake.Expression;
import org.xtext.example.mydsl2.group16.greedySnake.FoodKind;
import org.xtext.example.mydsl2.group16.greedySnake.GlobalMap;
import org.xtext.example.mydsl2.group16.greedySnake.IconTag;
import org.xtext.example.mydsl2.group16.greedySnake.InitialFoodSpecificatin;
import org.xtext.example.mydsl2.group16.greedySnake.IntLiteral;
import org.xtext.example.mydsl2.group16.greedySnake.Multiplication;
import org.xtext.example.mydsl2.group16.greedySnake.RealLiteral;

@SuppressWarnings("all")
public class FoodSet extends GeneralGenerator {
  public FoodSet(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateFoodSetClassFileName = this.generateFoodSetClassFileName();
    _builder.append(_generateFoodSetClassFileName);
    fsa.generateFile(_builder.toString(), this.generateFoodSet());
  }
  
  public CharSequence generateFoodSet() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateGamePackage = this.generateGamePackage();
    _builder.append(_generateGamePackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.awt.Image;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.Iterator;");
    _builder.newLine();
    _builder.append("import java.util.LinkedList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.Random;");
    _builder.newLine();
    _builder.append("import javax.swing.ImageIcon;");
    _builder.newLine();
    _builder.append("import javax.swing.JLabel;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Foodset {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    final Function1<InitialFoodSpecificatin, CharSequence> _function = (InitialFoodSpecificatin fd) -> {
      return this.generatefoodset(fd);
    };
    String _join = IterableExtensions.<InitialFoodSpecificatin>join(this.gs.getFoods(), "", _function);
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void AutoMoveThread(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("run = new Thread() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void run() {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("while (!quit) ");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("Thread.sleep(time);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("} catch (InterruptedException e) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("if(!GameUI.getPause() && GameUI.getIsrun())");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("removeAll();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("produceFood();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("Write2file.PrintMap(GameUI.getMap(),");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\"");
    final Function1<GlobalMap, CharSequence> _function_1 = (GlobalMap o) -> {
      return o.getMap();
    };
    String _join_1 = IterableExtensions.<GlobalMap>join(this.gs.getMap(), "", _function_1);
    String _plus = (_builder_1.toString() + _join_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\"");
    String _plus_1 = (_plus + _builder_2);
    _builder.append(_plus_1, "\t\t\t\t\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("if(quit)");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("show();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("System.out.println(\"Food thread exit...\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("run.start();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//the data structure of food");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class Food {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int kind;//the food kind");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JLabel label; ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Coordinate coor;//coordinate");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Food(int kind,int x,int y,ImageIcon icon){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.kind = kind;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("label = new JLabel(icon);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("coor = new Coordinate(x,y);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Food(int kind,Coordinate coor,ImageIcon icon){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.kind = kind;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("label = new JLabel(icon);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.coor = coor;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generatefoodset(final InitialFoodSpecificatin ifs) {
    CharSequence _xblockexpression = null;
    {
      int kind = 0;
      kind = ((Object[])Conversions.unwrapArray(ifs.getMembers().getFood().getFoodKind(), Object.class)).length;
      final ArrayList<IconTag> FIcon = new ArrayList<IconTag>();
      final String foodsize = ifs.getMembers().getFood().getIconsize();
      final Consumer<IconTag> _function = (IconTag bi) -> {
        FIcon.add(bi);
      };
      ifs.getMembers().getFood().getFoodIcon().forEach(_function);
      final ArrayList<String> foodIcon = new ArrayList<String>();
      final ArrayList<Integer> foodIconTag = new ArrayList<Integer>();
      final ArrayList<String> locatefood = new ArrayList<String>();
      final Consumer<IconTag> _function_1 = (IconTag i) -> {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\"");
        String _value = i.getValue();
        String _plus = (_builder.toString() + _value);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\"");
        String _plus_1 = (_plus + _builder_1);
        foodIcon.add(_plus_1);
      };
      FIcon.forEach(_function_1);
      final Consumer<IconTag> _function_2 = (IconTag i) -> {
        foodIconTag.add(Integer.valueOf(i.getTag()));
      };
      FIcon.forEach(_function_2);
      final Consumer<IconTag> _function_3 = (IconTag o) -> {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\"");
        String _locate = o.getLocate();
        String _plus = (_builder.toString() + _locate);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\"");
        String _plus_1 = (_plus + _builder_1);
        locatefood.add(_plus_1);
      };
      FIcon.forEach(_function_3);
      int tag = 0;
      tag = ifs.getMembers().getFood().getFoodTag();
      final ArrayList<CharSequence> point = new ArrayList<CharSequence>();
      final Function1<FoodKind, CharSequence> _function_4 = (FoodKind it) -> {
        return this.generateExp(it);
      };
      final Consumer<CharSequence> _function_5 = (CharSequence o) -> {
        point.add(o);
      };
      ListExtensions.<FoodKind, CharSequence>map(ifs.getMembers().getFood().getFoodKind(), _function_4).forEach(_function_5);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("private MainWindow GameUI;");
      _builder.newLine();
      _builder.append("private List<Food> food = new LinkedList<Food>();");
      _builder.newLine();
      _builder.append("private static final int MAXSIZE = ");
      int _maxsize = ifs.getMembers().getFood().getProduce().getMaxsize();
      _builder.append(_maxsize);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("private static final int MINSIZE = ");
      int _minsize = ifs.getMembers().getFood().getProduce().getMinsize();
      _builder.append(_minsize);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("private static final int FOODKIND = ");
      _builder.append(kind, "\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("private double[] point = new double[FOODKIND];");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("private ImageIcon[] foodIcon = new ImageIcon[FOODKIND];");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("private Thread run;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("//modify");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("private int time = 10000;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("private boolean quit = false;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("public Foodset(MainWindow GameUI){");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("this.GameUI = GameUI;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("//the point for each food");
      _builder.newLine();
      {
        IntegerRange _upTo = new IntegerRange(0, (kind - 1));
        for(final Integer idx : _upTo) {
          _builder.append("\t\t\t\t");
          _builder.append("point[");
          _builder.append(idx, "\t\t\t\t");
          _builder.append("] = ");
          CharSequence _get = point.get((idx).intValue());
          _builder.append(_get, "\t\t\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t\t    ");
      _builder.newLine();
      {
        IntegerRange _upTo_1 = new IntegerRange(0, (kind - 1));
        for(final Integer idx_1 : _upTo_1) {
          _builder.append("\t\t\t    ");
          _builder.newLine();
          _builder.append("\t\t\t    ");
          _builder.append("foodIcon[");
          _builder.append(idx_1, "\t\t\t    ");
          _builder.append("] = new ImageIcon(");
          String _get_1 = locatefood.get((idx_1).intValue());
          _builder.append(_get_1, "\t\t\t    ");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t    ");
          _builder.append("foodIcon[");
          _builder.append(idx_1, "\t\t\t    ");
          _builder.append("].setImage(foodIcon[");
          _builder.append(idx_1, "\t\t\t    ");
          _builder.append("].getImage().getScaledInstance(");
          _builder.append(foodsize, "\t\t\t    ");
          _builder.append(",");
          _builder.append(foodsize, "\t\t\t    ");
          _builder.append(",Image.SCALE_SMOOTH));");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t    ");
          _builder.newLine();
        }
      }
      _builder.append("\t\t\t    ");
      _builder.newLine();
      _builder.append("\t\t\t    ");
      _builder.append("produceFood();");
      _builder.newLine();
      _builder.append("\t\t\t    ");
      _builder.append("show();");
      _builder.newLine();
      _builder.append("\t\t\t    ");
      _builder.append("AutoMoveThread();");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("public void quit(){");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("quit = true;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("public synchronized double getFoodPoint(Coordinate coor){");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("for (Iterator<Food> iter = food.iterator(); iter.hasNext();) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Food node = iter.next();");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("if(node.coor.x == coor.x && node.coor.y == coor.y)");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("node.label.setVisible(false);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("GameUI.remove(node.label);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("iter.remove();");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("produceFood();");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("GameUI.getAmountLabel().setText(\"\" + food.size());");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("return point[node.kind];");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("return -1;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("public void produceFood(){");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Random rand = new Random();");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int amount = rand.nextInt(MINSIZE);//[0,MINSIZE-1]");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("double prob;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int foodtag = ");
      _builder.append(tag, "\t\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("Food newfood;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("//P();");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("if(food.size() == 0)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("amount = MINSIZE;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("else");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("while(amount + food.size() < MINSIZE || amount + food.size() > MAXSIZE)");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("amount = rand.nextInt(MINSIZE);//[0,MINSIZE-1];");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("//V();");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("for(int i = 0;i < amount;i++)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Coordinate coor = GameUI.produceRandomCoordinate();");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Coordinate _coor = new Coordinate(coor.y,coor.x);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("prob = rand.nextDouble();");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("if(prob >= 0 && prob <0.1) \t\t    foodtag = ");
      Integer _get_2 = foodIconTag.get(0);
      _builder.append(_get_2, "\t\t\t\t\t");
      _builder.append(";//10%");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t");
      _builder.append("else if(prob >= 0.1  && prob <0.25) foodtag = ");
      Integer _get_3 = foodIconTag.get(4);
      _builder.append(_get_3, "\t\t\t\t\t");
      _builder.append(";//15%");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t");
      _builder.append("else if(prob >= 0.25 && prob <0.5)  foodtag = ");
      Integer _get_4 = foodIconTag.get(3);
      _builder.append(_get_4, "\t\t\t\t\t");
      _builder.append(";//25%");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t");
      _builder.append("else if(prob >= 0.5  && prob <0.8)  foodtag = ");
      Integer _get_5 = foodIconTag.get(2);
      _builder.append(_get_5, "\t\t\t\t\t");
      _builder.append(";//30%");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t");
      _builder.append("else if(prob >= 0.8 && prob <0.95)  foodtag = ");
      Integer _get_6 = foodIconTag.get(1);
      _builder.append(_get_6, "\t\t\t\t\t");
      _builder.append(";//15%");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t");
      _builder.append("else if(prob >= 0.95 && prob <1) \tfoodtag = ");
      Integer _get_7 = foodIconTag.get(5);
      _builder.append(_get_7, "\t\t\t\t\t");
      _builder.append(";//5%");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("//GameUI.P();");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("GameUI.setMap(coor.x, coor.y, ");
      _builder.append(tag, "\t\t\t\t\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t");
      _builder.append("//GameUI.V();");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("newfood = new Food(foodtag,_coor,foodIcon[foodtag]);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("food.add(newfood);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("GameUI.add(newfood.label);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("//\t\t\tnewfood.label.setBounds(IndexToPixel.getXPixel(newfood.coor.y), ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("GameUI.getAmountLabel().setText(\"\" + food.size());");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("show();");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("System.out.print(\"produce\" + amount + \"food\\t\");");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("String Time = SysTime.getSysTime();");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("System.out.println(Time);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("public synchronized void show(){");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("for (Iterator<Food> iter = food.iterator(); iter.hasNext();) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Food node = iter.next();");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("node.label.setBounds(IndexToPixel.getXPixel(node.coor.x), ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.append("IndexToPixel.getYPixel(node.coor.y), 20, 20);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("node.label.setVisible(true);");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("public synchronized void removeAll(){//remove all picture of foods");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("for (Iterator<Food> iter = food.iterator(); iter.hasNext();) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Food node = iter.next();");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("GameUI.setMap(node.coor.y, node.coor.x, 0);//relabel 0");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("node.label.setVisible(false);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("GameUI.remove(node.label);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("node.label = null;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("food.clear();");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateExp(final FoodKind kind) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateJavaExpression = this.generateJavaExpression(kind.getPoint());
    _builder.append(_generateJavaExpression);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String generateJavaExpression(final Expression exp) {
    return this.translateToJavaString(this.evaluate(exp));
  }
  
  protected Number _evaluate(final Expression exp) {
    return null;
  }
  
  protected Number _evaluate(final Addition exp) {
    Number _xblockexpression = null;
    {
      Number _evaluate = this.evaluate(exp.getLeft());
      final Function1<Expression, Number> _function = (Expression it) -> {
        return this.evaluate(it);
      };
      List<Number> _map = ListExtensions.<Expression, Number>map(exp.getRight(), _function);
      final Iterable<Number> evaluatedChildren = Iterables.<Number>concat(Collections.<Number>unmodifiableList(CollectionLiterals.<Number>newArrayList(_evaluate)), _map);
      final Number[] result = { null };
      final Procedure2<Number, Integer> _function_1 = (Number ec, Integer idx) -> {
        Number _xifexpression = null;
        if (((idx).intValue() > 0)) {
          Number _xifexpression_1 = null;
          String _get = exp.getOperator().get(((idx).intValue() - 1));
          boolean _equals = Objects.equal(_get, "+");
          if (_equals) {
            _xifexpression_1 = this.add(result[0], ec);
          } else {
            _xifexpression_1 = this.subtract(result[0], ec);
          }
          _xifexpression = _xifexpression_1;
        } else {
          _xifexpression = ec;
        }
        result[0] = _xifexpression;
      };
      IterableExtensions.<Number>forEach(evaluatedChildren, _function_1);
      _xblockexpression = result[0];
    }
    return _xblockexpression;
  }
  
  protected Number _evaluate(final Multiplication exp) {
    Number _xblockexpression = null;
    {
      Number _evaluate = this.evaluate(exp.getLeft());
      final Function1<Expression, Number> _function = (Expression it) -> {
        return this.evaluate(it);
      };
      List<Number> _map = ListExtensions.<Expression, Number>map(exp.getRight(), _function);
      final Iterable<Number> evaluatedChildren = Iterables.<Number>concat(Collections.<Number>unmodifiableList(CollectionLiterals.<Number>newArrayList(_evaluate)), _map);
      final Number[] result = { null };
      final Procedure2<Number, Integer> _function_1 = (Number ec, Integer idx) -> {
        Number _xifexpression = null;
        if (((idx).intValue() > 0)) {
          Number _xifexpression_1 = null;
          String _get = exp.getOperator().get(((idx).intValue() - 1));
          boolean _equals = Objects.equal(_get, "*");
          if (_equals) {
            _xifexpression_1 = this.multiply(result[0], ec);
          } else {
            _xifexpression_1 = this.divide(result[0], ec);
          }
          _xifexpression = _xifexpression_1;
        } else {
          _xifexpression = ec;
        }
        result[0] = _xifexpression;
      };
      IterableExtensions.<Number>forEach(evaluatedChildren, _function_1);
      _xblockexpression = result[0];
    }
    return _xblockexpression;
  }
  
  protected Number _evaluate(final IntLiteral exp) {
    return Integer.valueOf(exp.getVal());
  }
  
  protected Number _evaluate(final RealLiteral exp) {
    return Float.valueOf(exp.getVal());
  }
  
  protected Number _add(final Integer a, final Number b) {
    Number _xifexpression = null;
    if ((b instanceof Integer)) {
      int _intValue = a.intValue();
      int _intValue_1 = ((Integer)b).intValue();
      int _plus = (_intValue + _intValue_1);
      _xifexpression = Integer.valueOf(_plus);
    } else {
      float _floatValue = a.floatValue();
      float _floatValue_1 = ((Float) b).floatValue();
      _xifexpression = Float.valueOf((_floatValue + _floatValue_1));
    }
    return ((Number)_xifexpression);
  }
  
  protected Number _add(final Float a, final Number b) {
    float _xifexpression = (float) 0;
    if ((b instanceof Integer)) {
      float _floatValue = a.floatValue();
      float _floatValue_1 = ((Integer)b).floatValue();
      _xifexpression = (_floatValue + _floatValue_1);
    } else {
      float _floatValue_2 = a.floatValue();
      float _floatValue_3 = ((Float) b).floatValue();
      _xifexpression = (_floatValue_2 + _floatValue_3);
    }
    return Float.valueOf(_xifexpression);
  }
  
  protected Number _subtract(final Integer a, final Number b) {
    Number _xifexpression = null;
    if ((b instanceof Integer)) {
      int _intValue = a.intValue();
      int _intValue_1 = ((Integer)b).intValue();
      int _minus = (_intValue - _intValue_1);
      _xifexpression = Integer.valueOf(_minus);
    } else {
      float _floatValue = a.floatValue();
      float _floatValue_1 = ((Float) b).floatValue();
      _xifexpression = Float.valueOf((_floatValue - _floatValue_1));
    }
    return ((Number)_xifexpression);
  }
  
  protected Number _subtract(final Float a, final Number b) {
    float _xifexpression = (float) 0;
    if ((b instanceof Integer)) {
      float _floatValue = a.floatValue();
      float _floatValue_1 = ((Integer)b).floatValue();
      _xifexpression = (_floatValue - _floatValue_1);
    } else {
      float _floatValue_2 = a.floatValue();
      float _floatValue_3 = ((Float) b).floatValue();
      _xifexpression = (_floatValue_2 - _floatValue_3);
    }
    return Float.valueOf(_xifexpression);
  }
  
  protected Number _multiply(final Integer a, final Number b) {
    Number _xifexpression = null;
    if ((b instanceof Integer)) {
      int _intValue = a.intValue();
      int _intValue_1 = ((Integer)b).intValue();
      int _multiply = (_intValue * _intValue_1);
      _xifexpression = Integer.valueOf(_multiply);
    } else {
      float _floatValue = a.floatValue();
      float _floatValue_1 = ((Float) b).floatValue();
      _xifexpression = Float.valueOf((_floatValue * _floatValue_1));
    }
    return ((Number)_xifexpression);
  }
  
  protected Number _multiply(final Float a, final Number b) {
    float _xifexpression = (float) 0;
    if ((b instanceof Integer)) {
      float _floatValue = a.floatValue();
      float _floatValue_1 = ((Integer)b).floatValue();
      _xifexpression = (_floatValue * _floatValue_1);
    } else {
      float _floatValue_2 = a.floatValue();
      float _floatValue_3 = ((Float) b).floatValue();
      _xifexpression = (_floatValue_2 * _floatValue_3);
    }
    return Float.valueOf(_xifexpression);
  }
  
  protected Number _divide(final Integer a, final Number b) {
    Number _xifexpression = null;
    if ((b instanceof Integer)) {
      int _intValue = a.intValue();
      int _intValue_1 = ((Integer)b).intValue();
      int _divide = (_intValue / _intValue_1);
      _xifexpression = Integer.valueOf(_divide);
    } else {
      float _floatValue = a.floatValue();
      float _floatValue_1 = ((Float) b).floatValue();
      _xifexpression = Float.valueOf((_floatValue / _floatValue_1));
    }
    return ((Number)_xifexpression);
  }
  
  protected Number _divide(final Float a, final Number b) {
    float _xifexpression = (float) 0;
    if ((b instanceof Integer)) {
      float _floatValue = a.floatValue();
      float _floatValue_1 = ((Integer)b).floatValue();
      _xifexpression = (_floatValue / _floatValue_1);
    } else {
      float _floatValue_2 = a.floatValue();
      float _floatValue_3 = ((Float) b).floatValue();
      _xifexpression = (_floatValue_2 / _floatValue_3);
    }
    return Float.valueOf(_xifexpression);
  }
  
  protected String _translateToJavaString(final Number n) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = n.toString();
    _builder.append(_string);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _translateToJavaString(final Float f) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = f.toString();
    _builder.append(_string);
    _builder.append(";");
    return _builder.toString();
  }
  
  public Number evaluate(final Expression exp) {
    if (exp instanceof Addition) {
      return _evaluate((Addition)exp);
    } else if (exp instanceof IntLiteral) {
      return _evaluate((IntLiteral)exp);
    } else if (exp instanceof Multiplication) {
      return _evaluate((Multiplication)exp);
    } else if (exp instanceof RealLiteral) {
      return _evaluate((RealLiteral)exp);
    } else if (exp != null) {
      return _evaluate(exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public Number add(final Number a, final Number b) {
    if (a instanceof Float) {
      return _add((Float)a, b);
    } else if (a instanceof Integer) {
      return _add((Integer)a, b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a, b).toString());
    }
  }
  
  public Number subtract(final Number a, final Number b) {
    if (a instanceof Float) {
      return _subtract((Float)a, b);
    } else if (a instanceof Integer) {
      return _subtract((Integer)a, b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a, b).toString());
    }
  }
  
  public Number multiply(final Number a, final Number b) {
    if (a instanceof Float) {
      return _multiply((Float)a, b);
    } else if (a instanceof Integer) {
      return _multiply((Integer)a, b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a, b).toString());
    }
  }
  
  public Number divide(final Number a, final Number b) {
    if (a instanceof Float) {
      return _divide((Float)a, b);
    } else if (a instanceof Integer) {
      return _divide((Integer)a, b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a, b).toString());
    }
  }
  
  public String translateToJavaString(final Number f) {
    if (f instanceof Float) {
      return _translateToJavaString((Float)f);
    } else if (f != null) {
      return _translateToJavaString(f);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(f).toString());
    }
  }
}
