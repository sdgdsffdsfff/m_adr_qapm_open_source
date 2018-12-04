package com.mqunar.domain;
/**
 * Created by pengchengpc.liu on 2018/11/22.
 */
public class CParam implements BaseData {

    private static final long serialVersionUID = 1L;

    public String vid;
    public String pid;
    public String cid;
    public String uid;
    public String loc;
    public String mno;
    public String osVersion;
    public String model;
    public String key;

    @Override
    public String toString() {
        return "CParam{" + "vid='" + vid + '\'' +
                ", pid='" + pid + '\'' + ", cid='" + cid + '\'' +
                ", uid='" + uid + '\'' + ", loc='" + loc + '\'' +
                ", mno='" + mno + '\'' + ", osVersion='" + osVersion + '\'' +
                ", model='" + model + '\'' + ", key='" + key + '\'' + '}';
    }
}
