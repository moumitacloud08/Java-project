package org.java.version.jdk15.sealed;

/**
 * 
 * sealed class Shape permits Circle, Rectangle
 * Only Circle and Rectangle are allowed to extend Shape
 */
sealed class Shape permits Circle,Rectangle{

}
