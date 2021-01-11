package com.example.api.Model;


public class CityTable {
    /**
     * {ID} 城市表id
     * {Name} 城市名
     * {CountryCode} 城市缩写
     * {District} 城市行政区
     * {Population} 区域编码
     * {flag} 是否有效
     */
    private int Id;
    private String Name;
    private String CountryCode;
    private String District;
    private int Population;
    private Boolean flag;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "CityTable{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                ", flag=" + flag +
                '}';
    }
}
