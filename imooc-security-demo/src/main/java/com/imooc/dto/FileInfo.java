package com.imooc.dto;

/**
 * Created by Jingchao Zhang
 * Date: 2020-06-27
 * Time: 9:12 PM
 */
public class FileInfo {

    private String path;

    public FileInfo(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
