package me.vasylkov.cruddemo.entity;

public class EmployeeDeletionResponse
{
    private Long id;
    private Long timeStamp;

    public EmployeeDeletionResponse(Long id, Long timeStamp)
    {
        this.id = id;
        this.timeStamp = timeStamp;
    }

    public Long getId()
    {
        return id;
    }

    public Long getTimeStamp()
    {
        return timeStamp;
    }
}
