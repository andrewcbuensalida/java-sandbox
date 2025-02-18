/*
Implement a ‘RunningAverage’ class in Java to calculate the running average of integer values added. The class should support concurrent additions and allow retrieval of the current running average using Java's concurrency features.

**Example 1:**

```java
RunningAverage ra = new RunningAverage();
ra.add(1);
ra.add(2);
ra.add(3);
System.out.println(ra.getAverage()); // Output: 2.0

```

**Output:** 2.0

**Explanation:** The running average after adding 1, 2, and 3 is (1+2+3)/3=2.0(1 + 2 + 3) / 3 = 2.0.

**Example 2:**

```java
RunningAverage ra = new RunningAverage();
ra.add(5);
ra.add(10);
System.out.println(ra.getAverage()); // Output: 7.5
ra.add(15);
System.out.println(ra.getAverage()); // Output: 10.0

```

**Output:** 7.5, 10.0

**Explanation:**

- After adding 5 and 10, the running average is .
    
    (5+10)/2=7.5(5 + 10) / 2 = 7.5
    
- After adding 15, it is .
    
    (5+10+15)/3=10.0(5 + 10 + 15) / 3 = 10.0
    

**Example 3:**

```java
RunningAverage ra = new RunningAverage();
System.out.println(ra.getAverage()); // Output: 0.0

```

**Output:** 0.0

**Explanation:** The initial running average is 0.0 before any values are added.

**Constraints:**

1. The `add` method should be thread-safe.
2. The `getAverage` method should return a `double` representing the running average.
3. The class should handle a large number of additions efficiently.
4. The implementation should leverage Java's concurrency primitives.

### Instructions:

1. Implement the `RunningAverage` class in Java.
2. Ensure that all operations on the running average are thread-safe.
3. Optimize the class for handling high-concurrency scenarios efficiently.
*/

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

class Main {
  public static void main(String[] args) {
    System.out.println("starting... ");

    RunningAverage ra = new RunningAverage();
    ra.add(5);
    ra.add(10);
    System.out.println(ra.getAverage()); // Output: 7.5
    ra.add(15);
    System.out.println(ra.getAverage()); // Output: 10.0
  }
}

class RunningAverage {
  private final AtomicLong sum;
  private final AtomicInteger count;

  RunningAverage() {
    this.sum = new AtomicLong(0);
    this.count = new AtomicInteger(0);
  }

  void add(int num) {
    sum.addAndGet(num);
    count.incrementAndGet();
  }

  double getAverage() {
    int currentCount = count.get();
    if (currentCount == 0) {
      return 0.0;
    }
    return sum.get() / (double) currentCount;
  }
}
