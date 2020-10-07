package com.gzy.leeboo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gzy.leeboo.entity.Department;
import com.gzy.leeboo.entity.Position;
import com.gzy.leeboo.entity.Rank;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 高级搜索条件对象
 */
public class SearchEmployee implements Serializable {
    private static final long serialVersionUID = 5221925098112956442L;

    private String name;
    private String workID;
    private String phone;
    private Department department;
    private Rank rank;
    private Position position;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private LocalDate beginContract;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private LocalDate endContract;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDate getBeginContract() {
        return beginContract;
    }

    public void setBeginContract(LocalDate beginContract) {
        this.beginContract = beginContract;
    }

    public LocalDate getEndContract() {
        return endContract;
    }

    public void setEndContract(LocalDate endContract) {
        this.endContract = endContract;
    }
}
