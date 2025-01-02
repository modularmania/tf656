package unitinfo.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "career")
public class Career {

    @Id
    private String id;

    @Column (name = "name", nullable = false)
    private String name;

    @JoinColumn(name = "branch", nullable = false)
    @OneToOne
    private Branch branch;

    @Column (name = "bio", length = 5000)
    private String bio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
