package jpamvcexam.model.vo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EMP")
public class Emp {
    @Id
    private int EMPNO;
    private String ENAME;
    private String JOB;
    private int MGR;
    private Date HIREDATE;
    private int SAL;
    private int COMM;
    @Column(insertable = false, updatable = false)
    private int DEPTNO;

    @ManyToOne
    @JoinColumn(name = "DEPTNO")
    private Dept dept;

    public int getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(int EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public int getMGR() {
        return MGR;
    }

    public void setMGR(int MGR) {
        this.MGR = MGR;
    }

    public Date getHIREDATE() {
        return HIREDATE;
    }

    public void setHIREDATE(Date HIREDATE) {
        this.HIREDATE = HIREDATE;
    }

    public int getSAL() {
        return SAL;
    }

    public void setSAL(int SAL) {
        this.SAL = SAL;
    }

    public int getCOMM() {
        return COMM;
    }

    public void setCOMM(int COMM) {
        this.COMM = COMM;
    }

    public int getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(int DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    @Override
    public String toString() {
        return ENAME + "\n";

    }
}
