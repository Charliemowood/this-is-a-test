package com.facebook.swift.generator.template;

import org.junit.Assert;
import static org.junit.Assert.*; // For older tests
import org.junit.rules.ExpectedException;
import org.junit.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.diffblue.java_testcase.CompareWithFieldList;
import com.diffblue.java_testcase.FieldList;
import com.diffblue.java_testcase.IterAnswer;
import com.diffblue.java_testcase.Reflector;

public class TemplateContextGenerator_Test {

  @org.junit.Rule
  public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: com/facebook/swift/generator/template/TemplateContextGenerator.java */
  /*
   * This test case covers:
   * conditional line 267 branch to line 270
   * conditional line 270 branch to line 270
   * conditional line 270 branch to line 271
   */

  @org.junit.Test
  public void test_nameStartsWithAcronym_6b660d252b2b90ac_001() throws Throwable {

    boolean retval;
    {
      /* initialize test parameters */
      String param_1 = "BA";
      String name = param_1;

      /* call function under test */
      Class<?> c = Reflector.forName("com.facebook.swift.generator.template.TemplateContextGenerator");
      Method m = c.getDeclaredMethod("nameStartsWithAcronym", Reflector.forName("java.lang.String"));
      m.setAccessible(true);
      retval = (boolean) m.invoke(null, name);
    }
    {
      /* check return value */
      Assert.assertEquals(true, retval);
    }
  }
}
