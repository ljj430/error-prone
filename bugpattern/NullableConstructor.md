---
title: NullableConstructor
summary: Constructors should not be annotated with @Nullable since they cannot return null
layout: bugpattern
tags: Style
severity: WARNING
---

<!--
*** AUTO-GENERATED, DO NOT MODIFY ***
To make changes, edit the @BugPattern annotation or the explanation in docs/bugpattern.
-->

## The problem
Constructors never return null.

## Suppression
Suppress false positives by adding an `@SuppressWarnings("NullableConstructor")` annotation to the enclosing element.