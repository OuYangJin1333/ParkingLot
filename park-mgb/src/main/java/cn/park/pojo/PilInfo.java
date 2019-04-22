package cn.park.pojo;

import java.io.Serializable;

public class PilInfo implements Serializable {
    private Integer id;

    /**
     * 停车场名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 区域id
     *
     * @mbggenerated
     */
    private Integer aid;

    /**
     * 小车收费标准id
     *
     * @mbggenerated
     */
    private Integer sid;

    /**
     * 打车收费标准id
     *
     * @mbggenerated
     */
    private Integer bid;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * 停车场类型
     *
     * @mbggenerated
     */
    private String type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", aid=").append(aid);
        sb.append(", sid=").append(sid);
        sb.append(", bid=").append(bid);
        sb.append(", desc=").append(desc);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}