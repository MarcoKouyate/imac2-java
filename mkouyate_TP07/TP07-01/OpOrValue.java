//package fr.umlv.calc;
import java.util.Scanner;

public class OpOrValue {
  public static final int OP_NONE = 0;
  public static final int OP_ADD = 1;
  public static final int OP_SUB = 2;
  
  private final int operator;
  private final int value;
  private final OpOrValue left;
  private final OpOrValue right;
  
  private OpOrValue(int operator, int value, OpOrValue left, OpOrValue right) {
    this.operator = operator;
    this.value = value;
    this.left = left;
    this.right = right;
  }
  public OpOrValue(int value) {
    this(OP_NONE, value, null, null);
  }
  public OpOrValue(int operator, OpOrValue left, OpOrValue right) {
    // a bug lies here
    this(operator, 0, left, right); 
  }
  
  public int eval() {
    switch(operator) {
    case OP_ADD:
      return left.eval() + right.eval();
    case OP_SUB:
      return left.eval() - right.eval();
    default: // case OP_NONE:
      return value;
    }
  }
  
  static public OpOrValue parse (Scanner scanner) {
    if (!scanner.hasNext()){ 
      //throw IllegalArgumentException("Le scanner ne devrait pas être vide !");
      System.out.println("Money");
    }
    return recursiveParse(scanner);
  }

  static private OpOrValue recursiveParse(Scanner scanner){
    var token = scanner.next();
    try {
      int i = Integer.parseInt(token);
      return new OpOrValue(i);
    } catch (NumberFormatException e) {
      var left = recursiveParse(scanner);
      var right = recursiveParse(scanner);

      switch (token){
        case "+" : return new OpOrValue(OP_ADD, left, right);
        case "-" : return new OpOrValue(OP_SUB, left, right);
        default : throw new IllegalArgumentException("Ce n'est pas un operateur valide !");
      }
    }
  }
  
  public static void main(String[] args) {
    OpOrValue expression = new OpOrValue(OP_ADD,
        new OpOrValue(2),
        new OpOrValue(3)
        );
    System.out.println(expression.eval());

    String input = "- + 4 5 2";
    Scanner operation = new Scanner(input);
    OpOrValue result = parse(operation);

    System.out.println(result.eval());
  }
}