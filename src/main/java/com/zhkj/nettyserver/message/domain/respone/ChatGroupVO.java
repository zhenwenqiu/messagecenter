package com.zhkj.nettyserver.message.domain.respone;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhkj.nettyserver.message.domain.ChatGroupUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(value = "ChatGroupVO", description = "群VO")
public class ChatGroupVO {
    /**
     * 群Uuid
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long cgroUuid;

    /**
     * 群会话Uuid
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long cgroChatUuid;

    /**
     * 群名字64
     */
    private String cgroName;

    /**
     * 群创建者Uuid
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long cgroCsuseUuid;

    /**
     * 群创建者名片
     */
    private String cgroCsuseName;

    /**
     * 群是否公开 0：公开 1：不公开
     */
    private Integer cgroPublic;

    /**
     * 群成员数最多256
     */
    private Integer cgroCount;

    /**
     * 群成员列表
     */
    List<ChatGroupUser> chatGroupUserList;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 群修改之前的名字
     */
    private String oldCgroName;

    public String getOldCgroName() {
        return oldCgroName;
    }

    public void setOldCgroName(String oldCgroName) {
        this.oldCgroName = oldCgroName;
    }

    public Long getCgroUuid() {
        return cgroUuid;
    }

    public void setCgroUuid(Long cgroUuid) {
        this.cgroUuid = cgroUuid;
    }

    public Long getCgroChatUuid() {
        return cgroChatUuid;
    }

    public void setCgroChatUuid(Long cgroChatUuid) {
        this.cgroChatUuid = cgroChatUuid;
    }

    public String getCgroName() {
        return cgroName;
    }

    public void setCgroName(String cgroName) {
        this.cgroName = cgroName;
    }

    public Long getCgroCsuseUuid() {
        return cgroCsuseUuid;
    }

    public void setCgroCsuseUuid(Long cgroCsuseUuid) {
        this.cgroCsuseUuid = cgroCsuseUuid;
    }

    public String getCgroCsuseName() {
        return cgroCsuseName;
    }

    public void setCgroCsuseName(String cgroCsuseName) {
        this.cgroCsuseName = cgroCsuseName;
    }

    public Integer getCgroPublic() {
        return cgroPublic;
    }

    public void setCgroPublic(Integer cgroPublic) {
        this.cgroPublic = cgroPublic;
    }

    public Integer getCgroCount() {
        return cgroCount;
    }

    public void setCgroCount(Integer cgroCount) {
        this.cgroCount = cgroCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<ChatGroupUser> getChatGroupUserList() {
        return chatGroupUserList;
    }

    public void setChatGroupUserList(List<ChatGroupUser> chatGroupUserList) {
        this.chatGroupUserList = chatGroupUserList;
    }
}