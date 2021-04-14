package org.xtext.example.mydsl2.group16.typing;

import com.google.common.collect.Iterables;
import com.google.inject.Provider;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xsemantics.runtime.ErrorInformation;
import org.eclipse.xsemantics.runtime.Result;
import org.eclipse.xsemantics.runtime.RuleApplicationTrace;
import org.eclipse.xsemantics.runtime.RuleEnvironment;
import org.eclipse.xsemantics.runtime.RuleFailedException;
import org.eclipse.xsemantics.runtime.XsemanticsProvider;
import org.eclipse.xsemantics.runtime.XsemanticsRuntimeSystem;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl2.group16.greedySnake.Addition;
import org.xtext.example.mydsl2.group16.greedySnake.Expression;
import org.xtext.example.mydsl2.group16.greedySnake.FoodKind;
import org.xtext.example.mydsl2.group16.greedySnake.IntLiteral;
import org.xtext.example.mydsl2.group16.greedySnake.Multiplication;
import org.xtext.example.mydsl2.group16.greedySnake.RealLiteral;
import org.xtext.example.mydsl2.group16.greedySnake.StringVal;

@SuppressWarnings("all")
public class GreedySnakeSystem extends XsemanticsRuntimeSystem {
  public static final String TYPEEXPRESSION = "org.xtext.example.mydsl2.group16.typing.TypeExpression";
  
  public static final String TINTLIT = "org.xtext.example.mydsl2.group16.typing.TIntLit";
  
  public static final String TREALLIT = "org.xtext.example.mydsl2.group16.typing.TRealLit";
  
  public static final String TSTRINGLIT = "org.xtext.example.mydsl2.group16.typing.TStringLit";
  
  public static final String TMULTIPLICATION = "org.xtext.example.mydsl2.group16.typing.TMultiplication";
  
  public static final String SUBTYPING = "org.xtext.example.mydsl2.group16.typing.SubTyping";
  
  public static final String TADDITION = "org.xtext.example.mydsl2.group16.typing.TAddition";
  
  private PolymorphicDispatcher<GreedySnakeTypes> typeExpressionDispatcher;
  
  private PolymorphicDispatcher<Result<GreedySnakeTypes>> typeDispatcher;
  
  private PolymorphicDispatcher<Result<Boolean>> subTypeDispatcher;
  
  public GreedySnakeSystem() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
    subTypeDispatcher = buildPolymorphicDispatcher1(
    	"subTypeImpl", 4, "|-", "<:");
    typeExpressionDispatcher = buildPolymorphicDispatcher(
    	"typeExpressionImpl", 2);
  }
  
  public GreedySnakeTypes typeExpression(final Iterable<Expression> exps) throws RuleFailedException {
    return typeExpression(null, exps);
  }
  
  public GreedySnakeTypes typeExpression(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    try {
    	return typeExpressionInternal(_trace_, exps);
    } catch (Exception _e_typeExpression) {
    	throw extractRuleFailedException(_e_typeExpression);
    }
  }
  
  public Result<GreedySnakeTypes> type(final EObject exp) {
    return type(new RuleEnvironment(), null, exp);
  }
  
  public Result<GreedySnakeTypes> type(final RuleEnvironment _environment_, final EObject exp) {
    return type(_environment_, null, exp);
  }
  
  public Result<GreedySnakeTypes> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final EObject exp) {
    return getFromCache("type", _environment_, _trace_,
    	new XsemanticsProvider<Result<GreedySnakeTypes>>(_environment_, _trace_) {
    		public Result<GreedySnakeTypes> doGet() {
    			try {
    				return typeInternal(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				return resultForFailure(_e_type);
    			}
    		}
    	}, exp);
  }
  
  public Result<Boolean> subType(final GreedySnakeTypes left, final GreedySnakeTypes right) {
    return subType(new RuleEnvironment(), null, left, right);
  }
  
  public Result<Boolean> subType(final RuleEnvironment _environment_, final GreedySnakeTypes left, final GreedySnakeTypes right) {
    return subType(_environment_, null, left, right);
  }
  
  public Result<Boolean> subType(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final GreedySnakeTypes left, final GreedySnakeTypes right) {
    try {
    	return subTypeInternal(_environment_, _trace_, left, right);
    } catch (Exception _e_subType) {
    	return resultForFailure(_e_subType);
    }
  }
  
  public Boolean subTypeSucceeded(final GreedySnakeTypes left, final GreedySnakeTypes right) {
    return subTypeSucceeded(new RuleEnvironment(), null, left, right);
  }
  
  public Boolean subTypeSucceeded(final RuleEnvironment _environment_, final GreedySnakeTypes left, final GreedySnakeTypes right) {
    return subTypeSucceeded(_environment_, null, left, right);
  }
  
  public Boolean subTypeSucceeded(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final GreedySnakeTypes left, final GreedySnakeTypes right) {
    try {
    	subTypeInternal(_environment_, _trace_, left, right);
    	return true;
    } catch (Exception _e_subType) {
    	return false;
    }
  }
  
  public Result<Boolean> checkFoodKind(final FoodKind fk) {
    return checkFoodKind(null, fk);
  }
  
  public Result<Boolean> checkFoodKind(final RuleApplicationTrace _trace_, final FoodKind fk) {
    try {
    	return checkFoodKindInternal(_trace_, fk);
    } catch (Exception _e_CheckFoodKind) {
    	return resultForFailure(_e_CheckFoodKind);
    }
  }
  
  protected Result<Boolean> checkFoodKindInternal(final RuleApplicationTrace _trace_, final FoodKind fk) throws RuleFailedException {
    /* empty |- fk.point : var GreedySnakeTypes pointTypes */
    Expression _point = fk.getPoint();
    GreedySnakeTypes pointTypes = null;
    Result<GreedySnakeTypes> result = typeInternal(emptyEnvironment(), _trace_, _point);
    checkAssignableTo(result.getFirst(), GreedySnakeTypes.class);
    pointTypes = (GreedySnakeTypes) result.getFirst();
    
    /* empty |- pointTypes <: GreedySnakeTypes.REAL */
    subTypeInternal(emptyEnvironment(), _trace_, pointTypes, GreedySnakeTypes.REAL);
    return new Result<Boolean>(true);
  }
  
  protected GreedySnakeTypes typeExpressionInternal(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) {
    return getFromCache("typeExpressionInternal", (RuleEnvironment)null, _trace_,
    	new XsemanticsProvider<GreedySnakeTypes>(null, _trace_) {
    		public GreedySnakeTypes doGet() {
    			try {
    				checkParamsNotNull(exps);
    				return typeExpressionDispatcher.invoke(_trace_, exps);
    			} catch (Exception _e_typeExpression) {
    				sneakyThrowRuleFailedException(_e_typeExpression);
    				return null;
    			}
    		}
    	}, exps);
  }
  
  protected void typeExpressionThrowException(final String _error, final String _issue, final Exception _ex, final Iterable<Expression> exps, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    throwRuleFailedException(_error, _issue, _ex, _errorInformations);
  }
  
  protected Result<GreedySnakeTypes> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final EObject exp) {
    return getFromCache("typeInternal", _environment_, _trace_,
    	new XsemanticsProvider<Result<GreedySnakeTypes>>(_environment_, _trace_) {
    		public Result<GreedySnakeTypes> doGet() {
    			try {
    				checkParamsNotNull(exp);
    				return typeDispatcher.invoke(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				sneakyThrowRuleFailedException(_e_type);
    				return null;
    			}
    		}
    	}, exp);
  }
  
  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final EObject exp, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(exp);
    String _plus = ("Cannot type" + _stringRep);
    String error = _plus;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<Boolean> subTypeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final GreedySnakeTypes left, final GreedySnakeTypes right) {
    try {
    	checkParamsNotNull(left, right);
    	return subTypeDispatcher.invoke(_environment_, _trace_, left, right);
    } catch (Exception _e_subType) {
    	sneakyThrowRuleFailedException(_e_subType);
    	return null;
    }
  }
  
  protected void subTypeThrowException(final String _error, final String _issue, final Exception _ex, final GreedySnakeTypes left, final GreedySnakeTypes right, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(left);
    String _plus = (_stringRep + "is not a subtype of ");
    String _stringRep_1 = this.stringRep(right);
    String _plus_1 = (_plus + _stringRep_1);
    String error = _plus_1;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected GreedySnakeTypes typeExpressionImpl(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final GreedySnakeTypes _result_ = applyAuxFunTypeExpression(_subtrace_, exps);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return auxFunName("typeExpression") + "(" + stringRep(exps)+ ")" + " = " + stringRep(_result_);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyAuxFunTypeExpression) {
    	typeExpressionThrowException(auxFunName("typeExpression") + "(" + stringRep(exps)+ ")",
    		TYPEEXPRESSION,
    		e_applyAuxFunTypeExpression, exps, new ErrorInformation[] {});
    	return null;
    }
  }
  
  protected GreedySnakeTypes applyAuxFunTypeExpression(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    final Function1<Expression, Boolean> _function = (Expression exp) -> {
      boolean _xblockexpression = false;
      {
        /* empty |- exp: var GreedySnakeTypes type */
        GreedySnakeTypes type = null;
        Result<GreedySnakeTypes> result = typeInternal(emptyEnvironment(), _trace_, exp);
        checkAssignableTo(result.getFirst(), GreedySnakeTypes.class);
        type = (GreedySnakeTypes) result.getFirst();
        
        _xblockexpression = (type == GreedySnakeTypes.INT);
      }
      return Boolean.valueOf(_xblockexpression);
    };
    boolean _forall = IterableExtensions.<Expression>forall(exps, _function);
    if (_forall) {
      return GreedySnakeTypes.INT;
    } else {
      return GreedySnakeTypes.REAL;
    }
  }
  
  protected Result<GreedySnakeTypes> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntLiteral exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<GreedySnakeTypes> _result_ = applyRuleTIntLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTIntLit) {
    	typeThrowException(ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "GreedySnakeTypes",
    		TINTLIT,
    		e_applyRuleTIntLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<GreedySnakeTypes> applyRuleTIntLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntLiteral exp) throws RuleFailedException {
    
    return new Result<GreedySnakeTypes>(_applyRuleTIntLit_1(G, exp));
  }
  
  private GreedySnakeTypes _applyRuleTIntLit_1(final RuleEnvironment G, final IntLiteral exp) throws RuleFailedException {
    return GreedySnakeTypes.INT;
  }
  
  protected Result<GreedySnakeTypes> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealLiteral exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<GreedySnakeTypes> _result_ = applyRuleTRealLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTRealLit) {
    	typeThrowException(ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "GreedySnakeTypes",
    		TREALLIT,
    		e_applyRuleTRealLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<GreedySnakeTypes> applyRuleTRealLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealLiteral exp) throws RuleFailedException {
    
    return new Result<GreedySnakeTypes>(_applyRuleTRealLit_1(G, exp));
  }
  
  private GreedySnakeTypes _applyRuleTRealLit_1(final RuleEnvironment G, final RealLiteral exp) throws RuleFailedException {
    return GreedySnakeTypes.REAL;
  }
  
  protected Result<GreedySnakeTypes> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringVal sv) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<GreedySnakeTypes> _result_ = applyRuleTStringLit(G, _subtrace_, sv);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TStringLit") + stringRepForEnv(G) + " |- " + stringRep(sv) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTStringLit) {
    	typeThrowException(ruleName("TStringLit") + stringRepForEnv(G) + " |- " + stringRep(sv) + " : " + "GreedySnakeTypes",
    		TSTRINGLIT,
    		e_applyRuleTStringLit, sv, new ErrorInformation[] {new ErrorInformation(sv)});
    	return null;
    }
  }
  
  protected Result<GreedySnakeTypes> applyRuleTStringLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringVal sv) throws RuleFailedException {
    
    return new Result<GreedySnakeTypes>(_applyRuleTStringLit_1(G, sv));
  }
  
  private GreedySnakeTypes _applyRuleTStringLit_1(final RuleEnvironment G, final StringVal sv) throws RuleFailedException {
    return GreedySnakeTypes.STRING;
  }
  
  protected Result<GreedySnakeTypes> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<GreedySnakeTypes> _result_ = applyRuleTMultiplication(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTMultiplication) {
    	typeThrowException(ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "GreedySnakeTypes",
    		TMULTIPLICATION,
    		e_applyRuleTMultiplication, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<GreedySnakeTypes> applyRuleTMultiplication(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    GreedySnakeTypes t = null; // output parameter
    Expression _left = exp.getLeft();
    EList<Expression> _right = exp.getRight();
    t = this.typeExpressionInternal(_trace_, Iterables.<Expression>concat(Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_left)), _right));
    return new Result<GreedySnakeTypes>(t);
  }
  
  protected Result<Boolean> subTypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final GreedySnakeTypes left, final GreedySnakeTypes right) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<Boolean> _result_ = applyRuleSubTyping(G, _subtrace_, left, right);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("SubTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleSubTyping) {
    	subTypeThrowException(ruleName("SubTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right),
    		SUBTYPING,
    		e_applyRuleSubTyping, left, right, new ErrorInformation[] {});
    	return null;
    }
  }
  
  protected Result<Boolean> applyRuleSubTyping(final RuleEnvironment G, final RuleApplicationTrace _trace_, final GreedySnakeTypes left, final GreedySnakeTypes right) throws RuleFailedException {
    /* right === GreedySnakeTypes.INT or left === right */
    {
      RuleFailedException previousFailure = null;
      try {
        /* right === GreedySnakeTypes.INT */
        if (!(right == GreedySnakeTypes.INT)) {
          sneakyThrowRuleFailedException("right === GreedySnakeTypes.INT");
        }
      } catch (Exception e) {
        previousFailure = extractRuleFailedException(e);
        /* left === right */
        if (!(left == right)) {
          sneakyThrowRuleFailedException("left === right");
        }
      }
    }
    return new Result<Boolean>(true);
  }
  
  protected Result<GreedySnakeTypes> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<GreedySnakeTypes> _result_ = applyRuleTAddition(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTAddition) {
    	typeThrowException(ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "GreedySnakeTypes",
    		TADDITION,
    		e_applyRuleTAddition, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<GreedySnakeTypes> applyRuleTAddition(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    GreedySnakeTypes t = null; // output parameter
    Expression _left = exp.getLeft();
    EList<Expression> _right = exp.getRight();
    t = this.typeExpressionInternal(_trace_, Iterables.<Expression>concat(Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_left)), _right));
    return new Result<GreedySnakeTypes>(t);
  }
}
