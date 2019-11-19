/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 08 16:42:51 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.AlignMatch;
import uk.ac.sanger.artemis.io.Range;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AlignMatch_ESTest extends AlignMatch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Range range0 = new Range(0, 0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, (-482));
      alignMatch0.setRange(1, 0, false, false);
      boolean boolean0 = alignMatch0.isSelfMatch();
      assertEquals(1, alignMatch0.getQuerySequenceEnd());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range range0 = new Range(0, 0);
      Range range1 = new Range(1024);
      AlignMatch alignMatch0 = new AlignMatch(range0, range1, false, 0, 0);
      boolean boolean0 = alignMatch0.isSelfMatch();
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(0, alignMatch0.getScore());
      assertEquals(0, alignMatch0.getPercentID());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 1, 1);
      alignMatch0.setRange(0, 0, true, false);
      assertEquals(1, alignMatch0.getScore());
      assertTrue(alignMatch0.isRevMatch());
      assertTrue(alignMatch0.isSelfMatch());
      assertEquals(1, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 1, 1);
      alignMatch0.setRange(0, 861, true, true);
      boolean boolean0 = alignMatch0.isRevMatch();
      assertFalse(alignMatch0.isSelfMatch());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 1, 1);
      alignMatch0.getSubjectSequenceStart();
      assertEquals(1, alignMatch0.getScore());
      assertEquals(1, alignMatch0.getPercentID());
      assertFalse(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Range range0 = new Range((-1782));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-97), (-1782));
      alignMatch0.getSubjectSequenceStart();
      assertEquals((-97), alignMatch0.getScore());
      assertEquals((-1782), alignMatch0.getPercentID());
      assertEquals(0, alignMatch0.getLength());
      assertTrue(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 1, 1);
      alignMatch0.getSubjectSequenceRange();
      assertEquals(1, alignMatch0.getScore());
      assertEquals(1, alignMatch0.getPercentID());
      assertFalse(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range range0 = new Range((-2187));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-2187), (-2187));
      alignMatch0.getSubjectSequenceRange();
      assertEquals((-2187), alignMatch0.getScore());
      assertEquals(0, alignMatch0.getLength());
      assertFalse(alignMatch0.isRevMatch());
      assertEquals((-2187), alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 290);
      alignMatch0.getSubjectSequenceEnd();
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(0, alignMatch0.getScore());
      assertEquals(290, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = new Range(0, 2604);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 0);
      alignMatch0.getSubjectSequenceEnd();
      assertEquals(2604, alignMatch0.getLength());
      assertEquals(0, alignMatch0.getPercentID());
      assertEquals(2604, alignMatch0.getQuerySequenceEnd());
      assertEquals(0, alignMatch0.getScore());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range range0 = new Range(0, 0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, (-482));
      int int0 = alignMatch0.getScore();
      assertEquals(0, int0);
      assertFalse(alignMatch0.isRevMatch());
      assertEquals((-482), alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = new Range((-1), (-1));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1), (-1));
      int int0 = alignMatch0.getScore();
      assertEquals((-1), alignMatch0.getPercentID());
      assertEquals((-1), int0);
      assertTrue(alignMatch0.isRevMatch());
      assertEquals(0, alignMatch0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range range0 = new Range(0, 0);
      Range range1 = new Range(1024);
      AlignMatch alignMatch0 = new AlignMatch(range0, range1, false, 0, 0);
      int int0 = alignMatch0.getQuerySequenceStart();
      assertEquals(0, alignMatch0.getPercentID());
      assertEquals(1024, int0);
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(0, alignMatch0.getScore());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, (Range) null, true, 0, 0);
      Range range1 = alignMatch0.getQuerySequenceRange();
      assertEquals(0, alignMatch0.getScore());
      assertNull(range1);
      assertTrue(alignMatch0.isRevMatch());
      assertEquals(0, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 0);
      alignMatch0.getQuerySequenceRange();
      assertEquals(0, alignMatch0.getScore());
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(0, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Range range0 = new Range(672);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-1491), 672);
      alignMatch0.getQuerySequenceRange();
      assertEquals((-1491), alignMatch0.getScore());
      assertEquals(0, alignMatch0.getLength());
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(672, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range range0 = new Range(0, 0);
      Range range1 = new Range(1024);
      AlignMatch alignMatch0 = new AlignMatch(range0, range1, false, 0, 0);
      int int0 = alignMatch0.getQuerySequenceEnd();
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(1024, int0);
      assertEquals(0, alignMatch0.getPercentID());
      assertEquals(0, alignMatch0.getScore());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range range0 = new Range(0, 0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 0);
      int int0 = alignMatch0.getPercentID();
      assertEquals(0, alignMatch0.getScore());
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 1, 1);
      int int0 = alignMatch0.getPercentID();
      assertEquals(1, int0);
      assertTrue(alignMatch0.isRevMatch());
      assertEquals(1, alignMatch0.getScore());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Range range0 = new Range((-3521), 1635);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-3521), 0);
      int int0 = alignMatch0.getLength();
      assertEquals((-3521), alignMatch0.getScore());
      assertEquals(0, alignMatch0.getPercentID());
      assertEquals(5156, int0);
      assertFalse(alignMatch0.isSelfMatch());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range range0 = new Range(1, 1);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 1, (-1));
      AlignMatch alignMatch1 = AlignMatch.copy(alignMatch0);
      assertEquals(1, alignMatch0.getScore());
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(1, alignMatch1.getScore());
      assertEquals((-1), alignMatch1.getPercentID());
      assertEquals(0, alignMatch1.getLength());
      assertEquals((-1), alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Range range0 = new Range((-2187));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-2187), (-2187));
      AlignMatch alignMatch1 = AlignMatch.copy(alignMatch0);
      assertFalse(alignMatch0.isRevMatch());
      assertEquals((-2187), alignMatch1.getPercentID());
      assertEquals((-2187), alignMatch0.getPercentID());
      assertEquals(0, alignMatch1.getLength());
      assertEquals((-2187), alignMatch1.getScore());
      assertEquals((-2187), alignMatch0.getScore());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range range0 = new Range(0, 0);
      Range range1 = new Range(1024);
      AlignMatch alignMatch0 = new AlignMatch(range0, range1, false, 0, 0);
      AlignMatch alignMatch1 = AlignMatch.copy(alignMatch0);
      assertEquals(0, alignMatch1.getScore());
      assertEquals(0, alignMatch1.getPercentID());
      assertEquals(1024, alignMatch1.getQuerySequenceEnd());
      assertFalse(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 1, 1);
      alignMatch0.setRange((-1), 1, false, false);
      AlignMatch alignMatch1 = AlignMatch.copy(alignMatch0);
      assertFalse(alignMatch0.isSelfMatch());
      assertEquals(1, alignMatch1.getScore());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 290);
      AlignMatch alignMatch1 = AlignMatch.copy(alignMatch0);
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(290, alignMatch1.getPercentID());
      assertEquals(290, alignMatch0.getPercentID());
      assertEquals(0, alignMatch1.getScore());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Range range0 = new Range((-1715), (-1715));
      AlignMatch alignMatch0 = new AlignMatch(range0, (Range) null, true, 1086, (-1715));
      AlignMatch alignMatch1 = AlignMatch.copy(alignMatch0);
      assertEquals((-1715), alignMatch0.getPercentID());
      assertEquals(1086, alignMatch0.getScore());
      assertEquals(1086, alignMatch1.getScore());
      assertTrue(alignMatch0.isRevMatch());
      assertEquals((-1715), alignMatch1.getPercentID());
      assertEquals(0, alignMatch1.getLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Range range0 = new Range((-1101), (-1101));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 366, 0);
      alignMatch0.setRange(0, 366, true, true);
      AlignMatch.copy(alignMatch0);
      assertFalse(alignMatch0.isSelfMatch());
      assertFalse(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range range0 = new Range((-1715), (-1715));
      AlignMatch alignMatch0 = new AlignMatch(range0, (Range) null, true, 1086, (-1715));
      // Undeclared exception!
      try { 
        alignMatch0.isSelfMatch();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.AlignMatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, (Range) null, false, 0, 0);
      // Undeclared exception!
      try { 
        alignMatch0.getQuerySequenceStart();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.AlignMatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Range range0 = new Range(448);
      AlignMatch alignMatch0 = new AlignMatch(range0, (Range) null, false, 448, (-1179));
      // Undeclared exception!
      try { 
        alignMatch0.getQuerySequenceEnd();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.AlignMatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = new Range(0, 0);
      AlignMatch alignMatch0 = null;
      try {
        alignMatch0 = new AlignMatch((Range) null, range0, false, 1, (-602));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.AlignMatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 0, 0);
      alignMatch0.getQuerySequenceEnd();
      assertEquals(0, alignMatch0.getPercentID());
      assertTrue(alignMatch0.isRevMatch());
      assertEquals(0, alignMatch0.getScore());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Range range0 = new Range((-2187));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-2187), (-2187));
      alignMatch0.getQuerySequenceEnd();
      assertFalse(alignMatch0.isRevMatch());
      assertEquals((-2187), alignMatch0.getScore());
      assertEquals((-2187), alignMatch0.getPercentID());
      assertEquals(0, alignMatch0.getLength());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 1, 0);
      alignMatch0.getQuerySequenceStart();
      assertEquals(1, alignMatch0.getScore());
      assertEquals(0, alignMatch0.getPercentID());
      assertTrue(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range range0 = new Range((-1101), (-1101));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 366, 0);
      alignMatch0.setRange(0, 366, true, true);
      int int0 = alignMatch0.getQuerySequenceStart();
      assertEquals(0, alignMatch0.getSubjectSequenceStart());
      assertEquals((-1101), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Range range0 = new Range((-2475), (-2475));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-2475), 0);
      alignMatch0.getSubjectSequenceEnd();
      assertEquals((-2475), alignMatch0.getScore());
      assertEquals(0, alignMatch0.getPercentID());
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(0, alignMatch0.getLength());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Range range0 = new Range(448);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 448, 448);
      alignMatch0.getSubjectSequenceStart();
      assertTrue(alignMatch0.isRevMatch());
      assertEquals(448, alignMatch0.getPercentID());
      assertEquals(448, alignMatch0.getScore());
      assertEquals(0, alignMatch0.getLength());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Range range0 = new Range(1509);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 1509, 3);
      alignMatch0.setRange(3, 1509, false, false);
      boolean boolean0 = alignMatch0.isSelfMatch();
      assertEquals(3, alignMatch0.getQuerySequenceStart());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Range range0 = new Range((-1780), (-1780));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1780), (-1780));
      alignMatch0.setRange(0, (-1780), true, true);
      alignMatch0.setRange((-1780), (-1780), false, true);
      assertFalse(alignMatch0.isSelfMatch());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Range range0 = new Range(242, 242);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 1041, 242);
      boolean boolean0 = alignMatch0.isSelfMatch();
      assertEquals(0, alignMatch0.getLength());
      assertTrue(boolean0);
      assertEquals(242, alignMatch0.getPercentID());
      assertEquals(1041, alignMatch0.getScore());
      assertTrue(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Range range0 = new Range((-1780), (-1780));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1780), (-1780));
      alignMatch0.setRange(0, (-1780), true, true);
      boolean boolean0 = alignMatch0.isSelfMatch();
      assertFalse(alignMatch0.isRevMatch());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Range range0 = new Range(242, 242);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 1041, 242);
      boolean boolean0 = alignMatch0.isRevMatch();
      assertEquals(1041, alignMatch0.getScore());
      assertEquals(0, alignMatch0.getLength());
      assertTrue(boolean0);
      assertEquals(242, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Range range0 = new Range((-1780), (-1780));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1780), (-1780));
      int int0 = alignMatch0.getPercentID();
      assertTrue(alignMatch0.isRevMatch());
      assertEquals((-1780), int0);
      assertEquals((-1780), alignMatch0.getScore());
      assertEquals(0, alignMatch0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Range range0 = new Range((-1780), (-1780));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1780), (-1780));
      int int0 = alignMatch0.getLength();
      assertTrue(alignMatch0.isRevMatch());
      assertEquals(0, int0);
      assertEquals((-1780), alignMatch0.getScore());
      assertEquals((-1780), alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Range range0 = new Range(448);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 448, 448);
      alignMatch0.getSubjectSequenceRange();
      assertEquals(448, alignMatch0.getPercentID());
      assertTrue(alignMatch0.isRevMatch());
      assertEquals(448, alignMatch0.getScore());
      assertEquals(0, alignMatch0.getLength());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Range range0 = new Range((-1780), (-1780));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1780), (-1780));
      alignMatch0.getQuerySequenceRange();
      assertEquals((-1780), alignMatch0.getPercentID());
      assertTrue(alignMatch0.isRevMatch());
      assertEquals((-1780), alignMatch0.getScore());
      assertEquals(0, alignMatch0.getLength());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Range range0 = new Range(448);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 448, 448);
      int int0 = alignMatch0.getScore();
      assertEquals(0, alignMatch0.getLength());
      assertEquals(448, alignMatch0.getPercentID());
      assertEquals(448, int0);
      assertTrue(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        AlignMatch.copy((AlignMatch) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.AlignMatch", e);
      }
  }
}