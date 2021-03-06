/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 14:20:13 GMT 2018
 */

package uk.ac.sanger.artemis.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.postgresql.largeobject.LargeObject;
import uk.ac.sanger.artemis.util.Document;
import uk.ac.sanger.artemis.util.LargeObjectDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class LargeObjectDocument_ESTest extends LargeObjectDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("", (String) null, largeObject0);
      String string0 = largeObjectDocument0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("", "", (LargeObject) null);
      String string0 = largeObjectDocument0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn((-1985)).when(inputStream0).read();
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      doReturn(inputStream0, (InputStream) null, (InputStream) null).when(largeObject0).getInputStream();
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("yHsIw3", "yHsIw3", largeObject0);
      largeObjectDocument0.getInputStream();
      // Undeclared exception!
      try { 
        largeObjectDocument0.getInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LargeObjectDocument largeObjectDocument0 = null;
      try {
        largeObjectDocument0 = new LargeObjectDocument((String) null, (String) null, (LargeObject) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - created a null Document
         //
         verifyException("uk.ac.sanger.artemis.util.Document", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(21, 21).when(inputStream0).read();
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn("org.postgresql.largembject.BlobInputtreal").when(inputStream1).toString();
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      doReturn(inputStream0, inputStream1).when(largeObject0).getInputStream();
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("org.postgresql.largembject.BlobInputtreal", "org.postgresql.largembject.BlobInputtreal", largeObject0);
      InputStream inputStream2 = largeObjectDocument0.getInputStream();
      assertFalse(inputStream2.equals((Object)inputStream0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("org.postgresql.largembject.BlobInputtreal", "org.postgresql.largembject.BlobInputtreal", largeObject0);
      String string0 = largeObjectDocument0.getName();
      assertEquals("org.postgresql.largembject.BlobInputtreal", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("org.postgresql.largembject.BlobInputtreal", "org.postgresql.largembject.BlobInputtreal", largeObject0);
      boolean boolean0 = largeObjectDocument0.writable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("org.postgresql.largembject.BlobInputtreal", "org.postgresql.largembject.BlobInputtreal", largeObject0);
      Document document0 = largeObjectDocument0.getParent();
      assertNull(document0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("org.postgresql.largembject.BlobInputtreal", "org.postgresql.largembject.BlobInputtreal", largeObject0);
      Document document0 = largeObjectDocument0.append("org.postgresql.largembject.BlobInputtreal");
      assertNull(document0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("org.postgresql.largembject.BlobInputtreal", "org.postgresql.largembject.BlobInputtreal", largeObject0);
      boolean boolean0 = largeObjectDocument0.readable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LargeObject largeObject0 = mock(LargeObject.class, new ViolatedAssumptionAnswer());
      LargeObjectDocument largeObjectDocument0 = new LargeObjectDocument("org.postgresql.largembject.BlobInputtreal", "org.postgresql.largembject.BlobInputtreal", largeObject0);
      OutputStream outputStream0 = largeObjectDocument0.getOutputStream();
      assertNull(outputStream0);
  }
}
