-- DemoOne-----------------------------------------------------------------------

package suiteExample;

import org.testng.annotations.Test;

public class DemoOne 
{
  @Test
  public void firstTest() 
  {
	  System.out.println("Inside first test of DemoOne");
  }
  
  @Test
  public void secondTest() 
  {
	  System.out.println("Inside second test of DemoOne");
  }
}

--DemoTwo----------------------------------------------------------------------
package suiteExample;

import org.testng.annotations.Test;

public class DemoTwo {
  @Test
  public void Test() 
  
  {
	  System.out.println("Inside test of DemoTwo");
  }
}

--testng.xml-------------------------------------------------------------------------
<?xml version="1.0" encoding="UTF-8"?>
<suite name="ExampleSuite" >
    <test name="SuiteTests" >
        <classes>
            <class name="suiteExample.DemoOne"/>
            <class name="suiteExample.DemoTwo"/>
        </classes>
    </test>
</suite>
