package cn.addapp.pickers.listeners;

import cn.addapp.pickers.entity.Area;
import cn.addapp.pickers.entity.City;
import cn.addapp.pickers.entity.Province;

/**
 * @author matt
 * blog: addapp.cn
 */

public interface OnLinkageListener {
    /**
     * 选择地址
     *
     * @param province the province
     * @param city    the city
     * @param county   the county ，if {@code hideCounty} is true，this is null
     */
    void onAddressPicked(Province province, City city, Area county);
}
