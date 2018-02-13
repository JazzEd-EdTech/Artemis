/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:39:21 GMT 2018
 */

package uk.ac.sanger.artemis.components.variant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.datatransfer.Clipboard;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.components.variant.CDSFeature;
import uk.ac.sanger.artemis.components.variant.VCFRecord;
import uk.ac.sanger.artemis.components.variant.VariantBase;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RangeVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VCFRecord_ESTest extends VCFRecord_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Selection selection0 = new Selection((Clipboard) null);
      RangeVector rangeVector0 = selection0.getSelectionRanges();
      Range range0 = new Range(0);
      rangeVector0.add(range0);
      CDSFeature cDSFeature0 = new CDSFeature(false, rangeVector0, 8, 2692, "x#S");
      short short0 = VCFRecord.checkSyn(cDSFeature0, 58, 'H');
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Selection selection0 = new Selection((Clipboard) null);
      RangeVector rangeVector0 = selection0.getSelectionRanges();
      CDSFeature cDSFeature0 = new CDSFeature(false, rangeVector0, 55, 4468, "k]~h]8wj^S@");
      short short0 = VCFRecord.checkSyn(cDSFeature0, 4468, 'G');
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("U]");
      Selection selection0 = new Selection(clipboard0);
      RangeVector rangeVector0 = selection0.getSelectionRanges();
      CDSFeature cDSFeature0 = new CDSFeature(true, rangeVector0, 0, 0, "P");
      short short0 = VCFRecord.checkSyn(cDSFeature0, 0, '9');
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        VCFRecord.parse("d{G|As\\9\"V0", 2686);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setAlt("Failed to read sequence file");
      // Undeclared exception!
      try { 
        vCFRecord0.getSynFlag((List<CDSFeature>) null, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setAlt("C[f)D]`");
      String string0 = vCFRecord0.toString();
      assertEquals("null\t0\tnull\tnull\tC[f)D]`\t0.0\tnull\tnull\tnull\t", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setMarkAsNewStop(true);
      boolean boolean0 = vCFRecord0.isMarkAsNewStop();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setRef("r}Pxr!n$FH");
      String string0 = vCFRecord0.getRef();
      assertEquals("r}Pxr!n$FH", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setQuality(0.106F);
      float float0 = vCFRecord0.getQuality();
      assertEquals(0.106F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setPos(5);
      int int0 = vCFRecord0.getPos();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setPos((-35));
      int int0 = vCFRecord0.getPos();
      assertEquals((-35), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setInfo("iNx`m!ZR.");
      String string0 = vCFRecord0.getInfo();
      assertEquals("iNx`m!ZR.", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setInfo("");
      String string0 = vCFRecord0.getInfo();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String string0 = vCFRecord0.getFormat();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setFormat("File already exists named ");
      String string0 = vCFRecord0.getFormat();
      assertEquals("File already exists named ", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String string0 = vCFRecord0.getFilter();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setFilter(" ");
      String string0 = vCFRecord0.getFilter();
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setFilter("");
      String string0 = vCFRecord0.getFilter();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setChrom("wwwcache");
      String string0 = vCFRecord0.getChrom();
      assertEquals("wwwcache", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setAlt("C[f)D]`");
      VariantBase variantBase0 = vCFRecord0.getAlt();
      assertEquals("C[f)D]`", variantBase0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        VCFRecord.split((String) null, (String) null, 58);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        VCFRecord.split("", "", (-1255));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        VCFRecord.parse((String) null, 61);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        VCFRecord.parse("", (-206));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setFormat("fB{y[e4Z%x}RV;m&");
      String[][] stringArray0 = new String[4][5];
      vCFRecord0.setGenoTypeData(stringArray0);
      // Undeclared exception!
      try { 
        vCFRecord0.getFormatValueForSample(5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        VCFRecord.countOccurrences((String) null, 'b');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      // Undeclared exception!
      try { 
        vCFRecord0.containsInfoFlag("The ontology may not be null");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Selection selection0 = new Selection((Clipboard) null);
      RangeVector rangeVector0 = selection0.getSelectionRanges();
      Range range0 = new Range(17, 1825);
      rangeVector0.add(range0);
      CDSFeature cDSFeature0 = new CDSFeature(false, rangeVector0, 8, 2692, "x#S");
      short short0 = VCFRecord.checkSyn(cDSFeature0, 58, 'H');
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Selection selection0 = new Selection((Clipboard) null);
      RangeVector rangeVector0 = selection0.getSelectionRanges();
      Range range0 = new Range(74, 1825);
      rangeVector0.add(range0);
      CDSFeature cDSFeature0 = new CDSFeature(false, rangeVector0, 8, 2692, "x#S");
      rangeVector0.add(range0);
      short short0 = VCFRecord.checkSyn(cDSFeature0, 58, 'H');
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Selection selection0 = new Selection((Clipboard) null);
      RangeVector rangeVector0 = selection0.getSelectionRanges();
      Range range0 = new Range(74, 1825);
      rangeVector0.add(range0);
      CDSFeature cDSFeature0 = new CDSFeature(false, rangeVector0, 8, 2692, "x#S");
      short short0 = VCFRecord.checkSyn(cDSFeature0, 1825, 'H');
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector();
      CDSFeature cDSFeature0 = new CDSFeature(false, rangeVector0, (-655), (-655), (String) null);
      short short0 = VCFRecord.checkSyn(cDSFeature0, 396, '5');
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = new Range((-3441), 21);
      RangeVector rangeVector0 = new RangeVector(range0);
      CDSFeature cDSFeature0 = new CDSFeature(true, rangeVector0, 1048576, 0, "bi");
      short short0 = VCFRecord.checkSyn(cDSFeature0, 0, 'G');
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      // Undeclared exception!
      try { 
        vCFRecord0.getSynFlag((FeatureVector) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setFilter("");
      vCFRecord0.appendFilter((String) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setFilter("z_X+|");
      vCFRecord0.appendFilter("z_X+|");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String string0 = vCFRecord0.getSampleDataString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String[][] stringArray0 = new String[3][0];
      vCFRecord0.setGenoTypeData(stringArray0);
      String string0 = vCFRecord0.getSampleDataString();
      assertEquals("\t\t", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setFormat("iNx`m!ZR.");
      String string0 = vCFRecord0.getFormatValueForSample("U1JSv<?iXLNF}nAN8", (-4293));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setFormat("(azKu6e@hi{z*;OM");
      // Undeclared exception!
      try { 
        vCFRecord0.getFormatValueForSample("(azKu6e@hi{z*;OM", (-211));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String string0 = vCFRecord0.getFormatValueForSample("", 58);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String string0 = vCFRecord0.getFormatValueForSample(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setFormat("fB{y[e4Z%x}RV;m&");
      // Undeclared exception!
      try { 
        vCFRecord0.getFormatValueForSample(5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setInfo("");
      boolean boolean0 = vCFRecord0.containsInfoFlag("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      // Undeclared exception!
      try { 
        vCFRecord0.getInfoValue("..");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = VCFRecord.split("\t", "\t", 2686);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        VCFRecord.split("Could not find field while serializing", "vp>hwwQE4L@?c", 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = VCFRecord.countOccurrences("rootVisible", 'l');
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int int0 = VCFRecord.countOccurrences("&tJ", 'v');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      boolean boolean0 = vCFRecord0.isMarkAsNewStop();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String[] stringArray0 = vCFRecord0.getFormatValues("T-\"v7i?C");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setInfo("PASS");
      vCFRecord0.containsInfoFlag("");
      String string0 = vCFRecord0.getInfoValue("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String string0 = vCFRecord0.getID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String string0 = vCFRecord0.getRef();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setID("");
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      float float0 = vCFRecord0.getQuality();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      VariantBase variantBase0 = vCFRecord0.getAlt();
      assertNull(variantBase0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      int int0 = vCFRecord0.getPos();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setAlt("c?Dd4pL[tLM4|38^");
      // Undeclared exception!
      try { 
        vCFRecord0.getSynFlag((FeatureVector) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String[][] stringArray0 = vCFRecord0.getGenoTypeData();
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String string0 = vCFRecord0.getInfo();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      // Undeclared exception!
      try { 
        vCFRecord0.appendFilter("z_X+|");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String[][] stringArray0 = new String[8][6];
      vCFRecord0.setGenoTypeData(stringArray0);
      String[][] stringArray1 = vCFRecord0.getGenoTypeData();
      assertSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      // Undeclared exception!
      try { 
        vCFRecord0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      String string0 = vCFRecord0.getChrom();
      assertNull(string0);
  }
}