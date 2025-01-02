package unitinfo.objects;

import impl.object.AbstractSyncedDomainObject;
import unitinfo.enums.AffiliationStatus;
import unitinfo.enums.UnitRank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "unit")
public class Unit extends AbstractSyncedDomainObject {

    @Column(name = "uid", nullable = false, length = 10)
    private String uid;

    @Column(name = "branch", nullable = false, length = 10)
    private Branch branch;

    @Column(name = "is_staff", nullable = false, length = 1)
    private boolean isStaff;

    @Column(name = "rank", nullable = false)
    @Enumerated(EnumType.STRING)
    private UnitRank rank;

    @Column(name = "career")
    private Career career;

    @Column(name = "medic", nullable = false)
    private boolean medic;

    @Column(name = "affiliation_status", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private AffiliationStatus affilitationStatus;

    @Column(name = "last_active", nullable = false)
    private String lastActive;

    @Column(name = "bio", nullable = false)
    private String bio;

    @Column (name = "pronouns")
    private String pronouns;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "pairedUnit")
    private MWD pairedMWD;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public boolean isStaff() {
        return isStaff;
    }

    public void setStaff(boolean isStaff) {
        this.isStaff = isStaff;
    }

    public UnitRank getRank() {
        return rank;
    }

    public void setRank(UnitRank rank) {
        this.rank = rank;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    public boolean isMedic() {
        return medic;
    }

    public void setMedic(boolean medic) {
        this.medic = medic;
    }

    public AffiliationStatus getAffiliationStatus() {
        return affilitationStatus;
    }

    public void setAffiliationStatus(AffiliationStatus affiliationStatus) {
        this.affilitationStatus = affiliationStatus;
    }
    
    public String getLastActive() {
        return lastActive;
    }

    public void setLastActive(String lastActive) {
        this.lastActive = lastActive;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public MWD getPairedMWD() {
        return pairedMWD;
    }

    public void setPairedMWD(MWD pairedMWD) {
        this.pairedMWD = pairedMWD;
    }
}