import junit.framework.Test;
import junit.framework.TestSuite;

public class MGC_Suite {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(MGC_01.class);
    suite.addTestSuite(MGC_02.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
