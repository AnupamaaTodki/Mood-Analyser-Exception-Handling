package com.exceptionhandling;

@SuppressWarnings("serial")
public class MoodAnalysisException extends Exception {
	 public exceptionType type;

	    public MoodAnalysisException(exceptionType type, String message) {
	        super(message);
	        this.type = type;
	    }

	    public enum exceptionType {
	        EMPTY, NULL
	    }
	}
