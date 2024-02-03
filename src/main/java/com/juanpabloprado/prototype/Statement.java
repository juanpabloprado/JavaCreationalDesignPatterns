package com.juanpabloprado.prototype;

import java.util.List;

public class Statement implements Cloneable {
    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    @Override
    public Statement clone() {
        try {
            Statement cloned = (Statement) super.clone();
            cloned.setRecord(this.record.clone());
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecord() {
        return record;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}
