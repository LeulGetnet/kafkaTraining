package com.example.consumer;

public class UserActivity {
    private String userId;
    private String activity;
    private long timestamp;

    // Getters and setters


    public String getUserId() {
        return userId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserActivity{" +
                "userId='" + userId + '\'' +
                ", activity='" + activity + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
