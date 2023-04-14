package com.example.demo;

public class College{
    
    public College(){
    }

    public College(Integer sn, String Collname , String Coursename, Double coursefee, Integer DOF ,String AC , Double fee ){
        super();
        this.sn = sn;
        this.Collname = Collname;
        this.Coursename = Coursename;
        this.Coursefee =  coursefee;
        this.DOF = DOF;
        this.AC = AC;
        this.fee = fee;

    }
    private Integer sn;
    private String Collname;
    private String Coursename;
    private Double Coursefee;
    private Integer DOF;
    private String AC;
    private Double fee;

    @Override
    public String toString(){
        return "Details [Sn : "+sn+" College Name : "+Collname+"  Course Name :  "+Coursename+" Course Fee : "+Coursefee+" Duration of Course : "+DOF+" Accommodation AC/Non-AC : "+AC+" Accommodation Fee : "+fee+" ]";
    }
    //getter and setter of the properties
    public Integer getSn(){
        return sn;
    }
    public void setSn(Integer sn){
        this.sn = sn;
    }
    public String getCname(){
        return Collname;
    }
    public void setCname(String Collname){
        this.Collname = Collname;
    }
    public String getCouname(){
        return Coursename;
    }
    public void setCouname(String Coursename){
        this.Coursename = Coursename;
    }
    public Double getCoursefee(){
        return Coursefee;
    }
    public void setCoursefee(Double Coursefee){
        this.Coursefee = Coursefee;
    }
    public Integer getDuration(){
        return DOF;
    }
    public void setDuration(Integer DOF){
        this.DOF = DOF;
    }
    public String getAcnon(){
        return AC;
    }
    public void setAcnon(String AC){
        this.AC = AC;
    }
    public Double getAccfee(){
        return fee;
    }
    public void setAccfee(Double fee){
        this.fee = fee;
    }

}
