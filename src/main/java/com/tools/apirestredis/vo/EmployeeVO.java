package com.tools.apirestredis.vo;

public class EmployeeVO {
    private boolean active;

    public EmployeeVO() {
    }

    public EmployeeVO(boolean active) {
        this.active = active;
    }


    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder()//
                .append("EmployeeVO [")//
                .append("active=")//
                .append(active)//
                .append("]");
        return builder.toString();
    }
}
