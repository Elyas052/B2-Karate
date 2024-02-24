package io.loopcamp.examples;

import com.intuit.karate.junit5.Karate;

class ExamplesTest {

    // This will run all *.feature files that exist in subdirectories
    // see https://github.com/intuit/karate#naming-conventions
    @Karate.Test
    Karate testAll() {
        return new Karate().relativeTo(getClass());
    }

}
