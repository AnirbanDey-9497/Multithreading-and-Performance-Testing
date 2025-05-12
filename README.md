# Multithreading Examples and Performance Testing

This repository contains various Java examples demonstrating different aspects of multithreading, concurrency, and performance testing. The project includes implementations of thread management, deadlock scenarios, HTTP server throughput testing, and image processing using multiple threads.

## Project Structure

```
.
├── src/                    # Source code directory
│   ├── Main.java          # Basic thread metrics example
│   ├── ThroughputHttpServer.java  # HTTP server for word search
│   ├── Thread_Image_Processing.java  # Image processing with threads
│   ├── Train_Deadlock.java  # Deadlock demonstration
│   └── Various thread examples:
│       ├── Thread_test.java
│       ├── Thread_Interrupt.java
│       ├── Thread_Join.java
│       ├── Thread_Runnable.java
│       └── Thread_ThreadClass.java
├── search_words.csv       # Test data for word search
├── Summary Report.jmx     # JMeter test configuration
└── war_and_peace.txt     # Sample text for word search testing
```

## Key Components

### 1. Thread Metrics Example (Main.java)
Demonstrates basic thread synchronization and metrics collection:
- Uses multiple business logic threads
- Implements thread-safe metrics collection
- Shows real-time average calculation

### 2. HTTP Server Throughput Testing (ThroughputHttpServer.java)
A multi-threaded HTTP server that:
- Serves word search functionality
- Uses a thread pool for handling requests
- Processes text file content for word counting
- Runs on port 8000

### 3. Thread Examples
Various implementations showing different threading concepts:
- Thread creation and management
- Thread interruption
- Thread joining
- Runnable interface implementation
- Thread class extension

### 4. Performance Testing
- JMeter test configuration for load testing
- CSV data for word search testing
- Sample text file (war_and_peace.txt) for testing

## Running the Examples

### Basic Thread Metrics
```bash
javac src/Main.java
java src.Main
```

### HTTP Server
```bash
javac src/ThroughputHttpServer.java
java src.ThroughputHttpServer
```
The server will start on port 8000. You can test it using:
```
http://localhost:8000/search?word=your_search_term
```

### JMeter Testing
1. Open `Summary Report.jmx` in JMeter
2. Configure the test parameters
3. Run the test plan

## Requirements
- Java Development Kit (JDK)
- Apache JMeter (for performance testing)
- Basic understanding of Java multithreading concepts

## Notes
- The HTTP server uses a fixed thread pool of 8 threads
- Performance testing results are logged in `jmeter.log`
- Sample data is provided in `search_words.csv` and `war_and_peace.txt`

## Contributing
Feel free to submit issues and enhancement requests!
