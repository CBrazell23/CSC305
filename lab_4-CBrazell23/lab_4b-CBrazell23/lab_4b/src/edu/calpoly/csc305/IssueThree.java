package lab4b;

import java.util.List;

public class IssueThree {

  private final IssueThreeData data;

  public IssueThree(IssueThreeData data) {
    this.data = data;
  }

  public int count() {
    List<? super String> strings = (List<? super String>)data.strings();

    strings.add("zoinks");
    strings.set(0, "nope");

    return strings.size();
  }
}
