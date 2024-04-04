package me.vasylkov.RestDemo.errors;

public class ErrorResponse
{
    private String message;
    private int state;
    private long timeStamp;

    public ErrorResponse(String message, int state, long timeStamp)
    {
        this.message = message;
        this.state = state;
        this.timeStamp = timeStamp;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public int getState()
    {
        return state;
    }

    public void setState(int state)
    {
        this.state = state;
    }

    public long getTimeStamp()
    {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp)
    {
        this.timeStamp = timeStamp;
    }
}
