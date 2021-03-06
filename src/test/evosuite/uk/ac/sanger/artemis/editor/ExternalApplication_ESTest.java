/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 21:39:13 GMT 2018
 */

package uk.ac.sanger.artemis.editor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.editor.ExternalApplication;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ExternalApplication_ESTest extends ExternalApplication_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ExternalApplication externalApplication0 = new ExternalApplication(stringArray0, stringArray0, (File) null);
      // Undeclared exception!
      try { 
        externalApplication0.getProcessStdout();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[10];
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      ExternalApplication externalApplication0 = new ExternalApplication(stringArray0, stringArray0, file0);
      // Undeclared exception!
      try { 
        externalApplication0.getProcessStderr();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      ExternalApplication externalApplication0 = null;
      try {
        externalApplication0 = new ExternalApplication((String[]) null, (String[]) null, file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[17];
      ExternalApplication externalApplication0 = new ExternalApplication(stringArray0, stringArray0, (File) null);
      ExternalApplication.StderrHandler externalApplication_StderrHandler0 = externalApplication0.new StderrHandler(externalApplication0);
      // Undeclared exception!
      try { 
        externalApplication_StderrHandler0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      ExternalApplication externalApplication0 = new ExternalApplication(stringArray0, stringArray0, file0);
      ExternalApplication.StdoutHandler externalApplication_StdoutHandler0 = externalApplication0.new StdoutHandler(externalApplication0);
      // Undeclared exception!
      try { 
        externalApplication_StdoutHandler0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[9];
      ExternalApplication externalApplication0 = new ExternalApplication(stringArray0, stringArray0, file0);
      // Undeclared exception!
      try { 
        externalApplication0.waitFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[9];
      ExternalApplication externalApplication0 = new ExternalApplication(stringArray0, stringArray0, file0);
      String string0 = externalApplication0.getStatus();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[1];
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      ExternalApplication externalApplication0 = new ExternalApplication(stringArray0, stringArray0, file0);
      externalApplication0.getProcess();
      assertEquals("1", externalApplication0.getStatus());
  }
}
