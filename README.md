# Java 8 Practice
Git is Awesome
![Stream API](https://github.com/dhan-profile/java-8/assets/29054766/790555fa-222a-4dd2-a63a-2cfb0f8652c6)


## Intermediate Operations
- **filter()** - Returns a stream consisting of the elements of this stream **that match the given predicate**.
- **map()** - Returns a stream consisting of the **results of applying the given function** to the elements of this stream. (_It modifies the actual data_)
- **flapMap()** - Returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
- **distinct()** - Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.
- **sorted()** - Returns a stream consisting of the elements of this stream, sorted according to natural order.
- **limit()** - Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.
- **peek()** - Returns a stream consisting of the elements of this stream, additionally performing the provided action on each element as elements are consumed from the resulting stream.
- **skip()** - Returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream.
- **mapToInt()** - Returns an IntStream consisting of the results of applying the given function to the elements of this stream.
- **mapToLong()** - Returns a LongStream consisting of the results of applying the given function to the elements of this stream.
- **mapToDouble()** - Returns a DoubleStream consisting of the results of applying the given function to the elements of this stream.
- **flatMapToInt()** - Returns an IntStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
- **flatMapToLong()** - Returns an LongStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
- **flatMapToDouble()** - Returns an DoubleStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.

## Terminal Operations
- forEach() - 
- forEachOrdered() - 
- toArray() - 
- reduce() - 
- count() - 
- collect() - 
- anyMatch() - 
- allMatch() - 
- noneMatch() - 
- findFirst() - 
- findAny() - 
- min() - 
- max() - 
