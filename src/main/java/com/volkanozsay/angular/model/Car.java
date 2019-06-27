package com.volkanozsay.angular.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAR_ID")
    private Long id;
    @Column(name = "MARKA", length = 25)
    private String marka;
    @Column(name = "MODEL", length = 20)
    private String model;
    @Column(name = "MODEL_YILI",length = 8)
    @Temporal(TemporalType.DATE)
    private Date modelYili;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getModelYili() {
        return modelYili;
    }

    public void setModelYili(Date modelYili) {
        this.modelYili = modelYili;
    }
}
