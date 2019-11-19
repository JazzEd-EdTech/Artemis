/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 19:04:05 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.KeyVector;
import uk.ac.sanger.artemis.io.QualifierInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class QualifierInfo_ESTest extends QualifierInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("", (-193), (KeyVector) null, (KeyVector) null, true);
      boolean boolean0 = qualifierInfo0.isOnceOnly();
      assertTrue(boolean0);
      assertEquals((-193), qualifierInfo0.getType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo(",}h1!X//,/1t", 750, (KeyVector) null, (KeyVector) null, false);
      int int0 = qualifierInfo0.getType();
      assertFalse(qualifierInfo0.isOnceOnly());
      assertEquals(750, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("list", (-1203), (KeyVector) null, (KeyVector) null, false);
      int int0 = qualifierInfo0.getType();
      assertEquals((-1203), int0);
      assertFalse(qualifierInfo0.isOnceOnly());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo((String) null, 103, (KeyVector) null, (KeyVector) null, false);
      qualifierInfo0.getName();
      assertFalse(qualifierInfo0.isOnceOnly());
      assertEquals(103, qualifierInfo0.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("none", (-469), (KeyVector) null, (KeyVector) null, false);
      qualifierInfo0.getName();
      assertEquals((-469), qualifierInfo0.getType());
      assertFalse(qualifierInfo0.isOnceOnly());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = QualifierInfo.getQualifierTypeID("\"opt\"");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = QualifierInfo.getQualifierTypeID("list");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = QualifierInfo.getQualifierTypeID("text");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = QualifierInfo.getQualifierTypeID("\"list\"");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = QualifierInfo.getQualifierTypeID("\"text\"");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = QualifierInfo.getQualifierTypeID("none");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        QualifierInfo.getQualifierTypeID("");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // unknown type string: 
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("\"opt\"", 1, (KeyVector) null, (KeyVector) null, true);
      Key key0 = mock(Key.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = qualifierInfo0.isRequiredFor(key0);
      assertEquals(1, qualifierInfo0.getType());
      assertFalse(boolean0);
      assertTrue(qualifierInfo0.isOnceOnly());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, false);
      Key key0 = mock(Key.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = qualifierInfo0.isValidFor(key0);
      assertEquals(0, qualifierInfo0.getType());
      assertFalse(qualifierInfo0.isOnceOnly());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, false);
      qualifierInfo0.getRequiredKeys();
      assertFalse(qualifierInfo0.isOnceOnly());
      assertEquals(0, qualifierInfo0.getType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, false);
      qualifierInfo0.getName();
      assertFalse(qualifierInfo0.isOnceOnly());
      assertEquals(0, qualifierInfo0.getType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, false);
      int int0 = qualifierInfo0.getType();
      assertFalse(qualifierInfo0.isOnceOnly());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, false);
      boolean boolean0 = qualifierInfo0.isOnceOnly();
      assertFalse(boolean0);
      assertEquals(0, qualifierInfo0.getType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, false);
      qualifierInfo0.getValidKeys();
      assertEquals(0, qualifierInfo0.getType());
      assertFalse(qualifierInfo0.isOnceOnly());
  }
}