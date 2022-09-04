package teachmeskills.Training;

import java.util.Arrays;
import java.util.Stack;

public class Training {
  public static void main(String[] args) {
    UberStack<Integer> myStack = new UberStack<>();
    Integer last = myStack.getMin();
  }
}

class UberStack<T extends Number>{
  private Stack<T> stack = new Stack<>();

  public Stack<T> getStack() {
    return stack;
  }

  public T getMin(){
    return stack.peek();
  }
}











class ViewModel{
  public static void main(String[] args) {
  //  String num = new Repository().getLastNum();
  }
}


interface Repository{
  String getLastNum();
}


class RepositoryImpl implements Repository{

  @Override
  public String getLastNum(){

    return null;
  }
}

