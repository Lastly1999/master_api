package com.example.api.Model;


public class TreeMenuCol {

    /**
     * {COLUMN_NAME} 导航菜单字段
     * {COLUMN_COMMENT} 导航菜单字段注释
     */
    private String COLUMN_NAME;
    private String COLUMN_COMMENT;

    public String getCOLUMN_NAME() {
        return COLUMN_NAME;
    }

    public void setCOLUMN_NAME(String COLUMN_NAME) {
        this.COLUMN_NAME = COLUMN_NAME;
    }

    public String getCOLUMN_COMMENT() {
        return COLUMN_COMMENT;
    }

    public void setCOLUMN_COMMENT(String COLUMN_COMMENT) {
        this.COLUMN_COMMENT = COLUMN_COMMENT;
    }

    @Override
    public String toString() {
        return "TreeMenuCol{" +
                "COLUMN_NAME='" + COLUMN_NAME + '\'' +
                ", COLUMN_COMMENT='" + COLUMN_COMMENT + '\'' +
                '}';
    }
}
