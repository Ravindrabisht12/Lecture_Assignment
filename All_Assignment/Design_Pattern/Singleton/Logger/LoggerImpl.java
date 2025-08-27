// package com.assignment.question;

import org.springframework.boot.logging.LogLevel;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerImpl implements Logger {
    private static LoggerImpl INSTANCE = null;
    private String logFile;
    private PrintWriter writer;

    public LoggerImpl(){
        super();
    }

    public static LoggerImpl getInstance(){
        if(INSTANCE == null){
            synchronized(LoggerImpl.class){
                if(INSTANCE == null){
                    INSTANCE = new LoggerImpl();
                }
            }
        }

        return INSTANCE;
    }

    public void resetInstance(){
        if (INSTANCE != null) {
            INSTANCE.close();
            INSTANCE = null;
        }
    }

    @Override
    public void log(LogLevel level, String message) {
        if (writer == null) {
            throw new IllegalStateException("Logger not initialised. Call setLogFile() first.");
        }
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        writer.printf("%s [%s] %s%n", timestamp, level, message);
    }

    @Override
    public void setLogFile(String filePath) {
       try {
           logFile = filePath;
           writer = new PrintWriter(new FileWriter(logFile, true));
       } catch (IOException e) {
            throw new RuntimeException("Failed to open log file: " + filePath, e);
       }
    }

    @Override
    public String getLogFile() {
        return logFile;
    }

    @Override
    public void flush() {
        if (writer != null) {
            writer.flush();
        }
    }

    @Override
    public void close() {
        if (writer != null) {
            writer.close();
            writer = null;
        }
    }
}