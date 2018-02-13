/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:57:17 GMT 2018
 */

package uk.ac.sanger.artemis.editor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.editor.PlafMacros;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlafMacros_ESTest extends PlafMacros_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = PlafMacros.breakupLines("\n_U/%*grsb");
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = PlafMacros.breakupLines("\n\n");
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        PlafMacros.breakupLines((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.PlafMacros", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = PlafMacros.breakupLines("\n");
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = PlafMacros.breakupLines("");
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = PlafMacros.breakupLines("GPH@ ");
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = PlafMacros.getLineSeparator();
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PlafMacros plafMacros0 = new PlafMacros();
      assertEquals("\n", plafMacros0.getLineSeparator());
  }
}