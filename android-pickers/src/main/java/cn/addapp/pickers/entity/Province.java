package cn.addapp.pickers.entity;

import java.io.Serializable;
import java.util.List;

public class Province implements Serializable {
    /**
     * id : 1
     * province_id : 110000
     * province : 北京市
     */

    private String id;
    private String province_id;
    private String province;
    private List<City> cities;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvince_id() {
        return province_id;
    }

    public void setProvince_id(String province_id) {
        this.province_id = province_id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

}
