package cn.addapp.pickers.entity;

import java.io.Serializable;

public class Area implements Serializable {

    /**
     * id : 1
     * area_id : 110101
     * area : 东城区
     * father : 110100
     */

    private String id;
    private String area_id;
    private String area;
    private String father;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

}
