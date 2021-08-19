package edu.sustech.zxc.roommatezxcbackend.enums;

public enum Province {

    Anhui("安徽","Anhui"),
    Aomen("澳门","Macao"),
    Beijing("北京","Beijing"),
    Chongqing("重庆","Chongqing"),
    Fujian("福建","Fujian"),
    Gansu("甘肃","Gansu"),
    Guangdong("广东","Guangdong"),
    Guangxi("广西壮族自治区","Guangxi"),
    Guizhou("贵州","Guizhou"),
    Hainan("海南","Hainan"),
    Hebei("河北","Hebei"),
    Heilongjiang("黑龙江","Heilongjiang"),
    Henan("河南","Henan"),
    Hubei("湖北","Hubei"),
    Hunan("湖南","Hunan"),
    Jiangsu("江苏","Jiangsu"),
    Jiangxi("江西","Jiangxi"),
    Jilin("吉林","Jilin"),
    Liaoning("辽宁","Liaoning"),
    Neimenggu("内蒙古自治区","Inner Mongolia"),
    Ningxia("宁夏回族自治区","Ningxia"),
    Qinghai("青海","Qinghai"),
    Shaanxi("陕西","Shaanxi"),
    Shandong("山东","Shandong"),
    Shanghai("上海","Shanghai"),
    Shanxi("山西","Shanxi"),
    Sichuan("四川","Sichuan"),
    Taiwan("台湾","Taiwan"),
    Tianjin("天津","Tianjin"),
    Xinjiang("新疆维吾尔自治区","Xinjiang"),
    Xianggang("香港","Hong Kong"),
    Xizang("西藏自治区","Tibet"),
    Yunnan("云南","Yunnan"),
    Zhejiang("浙江","Zhejiang"),
    Haiwai("海外","overseas");

    public final String CN_NAME;
    public final String EN_NAME;

    Province(String CN_NAME, String EN_NAME) {
        this.CN_NAME = CN_NAME;
        this.EN_NAME = EN_NAME;
    }
}
