package cn.addapp.pickers.entity;

import java.io.Serializable;
import java.util.List;

public class City implements Serializable {

    /**
     * id : 1
     * city_id : 110100
     * city : 市辖区
     * father : 110000
     */

    private String id;
    private String city_id;
    private String city;
    private String father;
    private List<Area> counties;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public List<Area> getCounties() {
        return counties;
    }

    public void setCounties(List<Area> counties) {
        this.counties = counties;
    }

}
