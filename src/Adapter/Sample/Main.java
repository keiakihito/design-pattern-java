// When you run the program with Package name, it should run it on the root directory.
// This case is src/Adapter/out, then
// ~/Dropbox/Programming/GitHub/DesignPattern/design-pattern-java/src/Adapter/out main*
// ❯ java Adapter.Sample.Main
// (Hello)
// *Hello*

package Adapter.Sample;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}

/*
Sample Run 

(Hello)
*Hello*
*/ 
