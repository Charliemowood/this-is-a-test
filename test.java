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

import com.facebook.swift.generator.template.FieldContext;

public class FieldContext_Test {

  @org.junit.Rule
  public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: com/facebook/swift/generator/template/FieldContext.java */
  /*
   * This test case covers:
   * conditional line 127 branch to line 127
   * conditional line 128 branch to line 128
   * conditional line 129 branch to line 129
   * conditional line 130 branch to line 130
   * conditional line 131 branch to line 131
   * conditional line 132 branch to line 132
   */

  @org.junit.Test
  public void com_facebook_swift_generator_template_FieldContext_hashCode_72e2fcda87d1e9e_006() throws Throwable {

    int retval;
    {
      /* initialize test parameters */
      String param_1 = "\u0000.";
      String param_3 = "\u0000\u0000\u0000*";
      String param_5 = "!";
      String param_7 = "";
      String param_9 = "~";
      FieldContext param_10 = (FieldContext) Reflector.getInstance("com.facebook.swift.generator.template.FieldContext");
      Reflector.setField(param_10, "name", param_9);
      Reflector.setField(param_10, "annotations", null);
      Reflector.setField(param_10, "requiredness", null);
      Reflector.setField(param_10, "isRecursive", false);
      Reflector.setField(param_10, "id", (short)10261);
      Reflector.setField(param_10, "javaType", param_7);
      Reflector.setField(param_10, "javaName", null);
      Reflector.setField(param_10, "javaGetterName", param_5);
      Reflector.setField(param_10, "javaSetterName", param_3);
      Reflector.setField(param_10, "javaTestPresenceName", param_1);

      /* call function under test */
      retval = param_10.hashCode();
    }
    {
      /* check return value */
      Assert.assertEquals(-2132308421, retval);
    }
  }
