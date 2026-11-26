/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanager;

import java.util.Date;
import java.util.Objects;


/**
 *
 * @author m2003375
 */
public class Contract {

    private Date contractDate;
    public int packageSize;
    private int dataBundle;
    private int contractLength;
    private String allowInternatinalCalls;
    private String referenceNumber;
    private double monthlyCharge;
    private String clientName;

    public Contract() {    }    
        
    public Contract(Date contractDate, int packageSize, int dataBundle, int contractLength, String allowInternatinalCalls, String referenceNumber, double monthlyCharge, String clientName) {
        this.contractDate = contractDate;
        this.packageSize = packageSize;
        this.dataBundle = dataBundle;
        this.contractLength = contractLength;
        this.allowInternatinalCalls = allowInternatinalCalls;
        this.referenceNumber = referenceNumber;
        this.monthlyCharge = monthlyCharge;
        this.clientName = clientName;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public int getPackageSize() {
        return packageSize;
    }

    public int getDataBundle() {
        return dataBundle;
    }

    public int getContractLength() {
        return contractLength;
    }

    public String isAllowInternatinalCalls() {
        return allowInternatinalCalls;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public double getMonthlyCharge() {
        return monthlyCharge;
    }

    public String getClientName() {
        return clientName;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public void setPackageSize(int packageSize) {
        this.packageSize = packageSize;
    }

    public void setDataBundle(int dataBundle) {
        this.dataBundle = dataBundle;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

    public void setAllowInternatinalCalls(String allowInternatinalCalls) {
        this.allowInternatinalCalls = allowInternatinalCalls;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public void setMonthlyCharge(double monthlyCharge) {
        this.monthlyCharge = monthlyCharge;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.contractDate);
        hash = 79 * hash + this.packageSize;
        hash = 79 * hash + this.dataBundle;
        hash = 79 * hash + this.contractLength;
        hash = 79 * hash + Objects.hashCode(this.allowInternatinalCalls);
        hash = 79 * hash + Objects.hashCode(this.referenceNumber);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.monthlyCharge) ^ (Double.doubleToLongBits(this.monthlyCharge) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.clientName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contract other = (Contract) obj;
        if (this.packageSize != other.packageSize) {
            return false;
        }
        if (this.dataBundle != other.dataBundle) {
            return false;
        }
        if (this.contractLength != other.contractLength) {
            return false;
        }
        if (Double.doubleToLongBits(this.monthlyCharge) != Double.doubleToLongBits(other.monthlyCharge)) {
            return false;
        }
        if (!Objects.equals(this.allowInternatinalCalls, other.allowInternatinalCalls)) {
            return false;
        }
        if (!Objects.equals(this.referenceNumber, other.referenceNumber)) {
            return false;
        }
        if (!Objects.equals(this.clientName, other.clientName)) {
            return false;
        }
        return Objects.equals(this.contractDate, other.contractDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contract{");
        sb.append("contractDate=").append(contractDate);
        sb.append(", packageSize=").append(packageSize);
        sb.append(", dataBundle=").append(dataBundle);
        sb.append(", contractLength=").append(contractLength);
        sb.append(", allowInternatinalCalls=").append(allowInternatinalCalls);
        sb.append(", referenceNumber=").append(referenceNumber);
        sb.append(", monthlyCharge=").append(monthlyCharge);
        sb.append(", clientName=").append(clientName);
        sb.append('}');
        return sb.toString();
    }

    

    
    }

