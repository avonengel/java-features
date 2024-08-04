# Java features

Try out various new features since Java 11 was introduced.

## Features

Since Java 11, several versions have introduced new features, enhancements, and improvements. Here’s a summary of the notable changes in each version up to Java 22 created by ChatGPT 4o:

### Java 12
1. **Switch Expressions (Preview)**: Simplifies coding with switch statements.
2. **Default CDS Archives**: Enhances startup time by including the default class data-sharing (CDS) archive.
3. **Shenandoah Garbage Collector (Experimental)**: Reduces GC pause times.
4. **Microbenchmark Suite**: Introduces a suite of microbenchmarks.
5. **JVM Constants API**: Improves handling of nominal descriptors.

### Java 13
1. **Text Blocks (Preview)**: Simplifies writing multi-line string literals.
2. **Switch Expressions (Second Preview)**: Refinements based on feedback.
3. **Dynamic CDS Archives**: Allows the dynamic generation of class data-sharing archives.
4. **ZGC on macOS and Windows**: Extends Z Garbage Collector support to more platforms.
5. **Reimplement the Legacy Socket API**: Enhances maintainability and performance.

### Java 14
1. **Pattern Matching for instanceof (Preview)**: Simplifies type checks and casts.
2. **Records (Preview)**: Provides a compact syntax for declaring classes that are primarily carriers for data.
3. **Text Blocks (Second Preview)**: Further refinements based on feedback.
4. **NVM HotSpot**: Enables non-volatile memory for the HotSpot VM.
5. **Foreign-Memory Access API (Incubator)**: Improves interaction with native memory.

### Java 15
1. **Text Blocks**: Finalizes the feature.
2. **ZGC: A Scalable Low-Latency Garbage Collector**: Out of experimental status.
3. **Hidden Classes**: Supports framework and library developers.
4. **Pattern Matching for instanceof (Second Preview)**: Further refinements.
5. **Records (Second Preview)**: Further refinements.

### Java 16
1. **Pattern Matching for instanceof**: Finalizes the feature.
2. **Records**: Finalizes the feature.
3. **Sealed Classes (Preview)**: Restricts which classes can extend or implement them.
4. **Foreign Linker API (Incubator)**: Simplifies interoperability with native code.
5. **ZGC Improvements**: Enhances performance and usability.

### Java 17 (LTS)
1. **Sealed Classes**: Finalizes the feature.
2. **Pattern Matching for switch (Preview)**: Extends pattern matching capabilities.
3. **Enhanced Pseudo-Random Number Generators**: Improves API for random number generation.
4. **Foreign Function & Memory API (Incubator)**: Combines and improves previous incubating features.
5. **Deprecate the Applet API for Removal**: Marks the Applet API for future removal.

### Java 18
1. **Simple Web Server**: Provides a minimal web server for testing and prototyping.
2. **UTF-8 by Default**: Sets UTF-8 as the default charset for standard Java APIs.
3. **Code Snippets in Java API Documentation**: Enhances API documentation with code snippets.
4. **Vector API (Third Incubator)**: Further developments in the vector API.
5. **Foreign Function & Memory API (Second Incubator)**: Continues to improve this API.

### Java 19
1. **Virtual Threads (Preview)**: Lightweight threads that dramatically reduce the effort of writing, maintaining, and observing high-throughput concurrent applications.
2. **Structured Concurrency (Incubator)**: Simplifies concurrent programming by treating multiple tasks running in different threads as a single unit of work.
3. **Pattern Matching for switch (Third Preview)**: Further refinements.
4. **Foreign Function & Memory API (Third Incubator)**: Further refinements.

### Java 20
1. **Pattern Matching for switch (Fourth Preview)**: Further refinements.
2. **Record Patterns (Second Preview)**: Enhances the language with record patterns for deconstruction of record values.
3. **Foreign Function & Memory API (Fourth Incubator)**: Further developments.
4. **Virtual Threads (Second Preview)**: Further refinements based on feedback.
5. **Structured Concurrency (Second Incubator)**: Further refinements based on feedback.

### Java 21
1. **Virtual Threads**: Finalizes the virtual threads feature, offering lightweight, user-mode threads that simplify writing and maintaining high-concurrency applications.
2. **Record Patterns**: Finalizes record patterns, allowing more expressive and concise data deconstruction in pattern matching.
3. **Pattern Matching for switch**: Finalizes pattern matching for switch, enabling more readable and powerful switch statements.
4. **String Templates (Preview)**: Introduces string templates for more concise and safer handling of string interpolation.
5. **Sequenced Collections**: Provides new collection types with deterministic iteration orders.
6. **Scoped Values (Incubator)**: Offers a new API for safely sharing data within and across threads.

### Java 22
1. **Universal Generics**: Introduces support for primitive types in generic classes and methods.
2. **Improved Foreign Function & Memory API**: Further enhancements and stabilization of the API for interaction with native code.
3. **Enhanced Vector API**: Continues improvements for expressing vector computations that reliably compile to optimized vector instructions on supported hardware.
4. **Enhanced Pattern Matching**: Extends pattern matching capabilities to more constructs and use cases, improving language expressiveness.
5. **New macOS Rendering Pipeline**: Introduces a new rendering pipeline for macOS, leveraging the Metal framework for improved performance and integration.
