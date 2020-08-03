/**
 * Program to demonstrate the use of packages 
 * 
 * To run this program:
 * `cd java-programs`
 * `javac myPackage/Package.java myPackage/Test.java`
 * `java myPackage.Test`
 */
package myPackage;

public class Test {
    public static void main(String[] args) {
        Package obj = new Package();
        obj.display();
    }
}