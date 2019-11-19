/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:51:08 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.components.genebuilder.ReferencesPanel;
import uk.ac.sanger.artemis.io.Qualifier;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ReferencesPanel_ESTest extends ReferencesPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier();
      // Undeclared exception!
      try { 
        ReferencesPanel.isReferenceTag(qualifier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("Dbxref");
      boolean boolean0 = ReferencesPanel.isReferenceTag(qualifier0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("aiterature", "Dbxref");
      boolean boolean0 = ReferencesPanel.isReferenceTag(qualifier0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("literature");
      boolean boolean0 = ReferencesPanel.isReferenceTag(qualifier0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ReferencesPanel referencesPanel0 = null;
      try {
        referencesPanel0 = new ReferencesPanel((Feature) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.text.JTextComponent", e);
      }
  }
}