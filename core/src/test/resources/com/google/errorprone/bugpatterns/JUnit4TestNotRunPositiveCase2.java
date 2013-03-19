/*
 * Copyright 2013 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.errorprone.bugpatterns;

import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Custom test runner that uses JUnit 4.
 * 
 * @author eaftan@google.com (Eddie Aftandilian)
 */
@RunWith(MyJUnit4TestRunner.class)
public class JUnit4TestNotRunPositiveCase2 {
  //BUG: Suggestion includes "@Test"
  public void testThisIsATest() {}
  
  //BUG: Suggestion includes "@Test"
  public static void testThisIsAStaticTest() {}
}

private class MyJUnit4TestRunner extends BlockJUnit4ClassRunner {}