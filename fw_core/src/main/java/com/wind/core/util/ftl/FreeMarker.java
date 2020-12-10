package com.wind.core.util.ftl;

import java.util.Map;

/**
 * @package com.wind.core.model.freemarker
 * @className FreeMarker
 * @note freeMarker实体类描述
 * @author wind
 * @date 2020/12/9 22:00
 */
public class FreeMarker {

    /**
     * 模板文件目录
     */
    private String cfgDir;
    /**
     * 模板文件名
     */
    private String cfgName;
    /**
     * 数据
     */
    private Object data;
    /**
     * 生成文件目录
     */
    private String fileDir;
    /**
     * 生成文件名
     */
    private String fileName;

    public String getCfgDir() {
        return cfgDir;
    }

    public void setCfgDir(String cfgDir) {
        this.cfgDir = cfgDir;
    }

    public String getCfgName() {
        return cfgName;
    }

    public void setCfgName(String cfgName) {
        this.cfgName = cfgName;
    }

    public String getFileDir() {
        return fileDir;
    }

    public void setFileDir(String fileDir) {
        this.fileDir = fileDir;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
