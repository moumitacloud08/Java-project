package org.java.version.jdk17.nonsealed;

abstract sealed class Shape permits Circle, OpenShape{
    abstract String name();

}
