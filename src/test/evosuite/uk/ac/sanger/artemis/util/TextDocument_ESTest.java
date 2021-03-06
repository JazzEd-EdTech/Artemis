/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 08 20:23:18 GMT 2018
 */

package uk.ac.sanger.artemis.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.util.Document;
import uk.ac.sanger.artemis.util.TextDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TextDocument_ESTest extends TextDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextDocument textDocument0 = new TextDocument();
      String string0 = textDocument0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TextDocument textDocument0 = new TextDocument();
      Document document0 = textDocument0.append("(F");
      assertNull(document0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TextDocument textDocument0 = new TextDocument();
      boolean boolean0 = textDocument0.writable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TextDocument textDocument0 = new TextDocument();
      Document document0 = textDocument0.getParent();
      assertNull(document0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TextDocument textDocument0 = new TextDocument();
      // Undeclared exception!
      try { 
        textDocument0.getOutputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TextDocument textDocument0 = new TextDocument();
      boolean boolean0 = textDocument0.readable();
      assertTrue(boolean0);
  }
}
