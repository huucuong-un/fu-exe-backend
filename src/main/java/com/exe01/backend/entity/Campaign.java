package com.exe01.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "campaign_tbl")
public class Campaign extends BaseEntity {

    @NotBlank(message = "This field must not be blank")
    @NotNull(message = "This field must not be null")
    @Size(max = 200, message = "Name must be less than or equal to 100 characters")
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull(message = "This field must not be null")
    @Column(name = "start_date")
    private Date startDate;

    @NotNull(message = "This field must not be null")
    @Column(name = "end_date")
    private Date endDate;

    @NotNull(message = "This field must not be null")
    @Column(name = "company_apply_start_date")
    private Date companyApplyStartDate;

    @NotNull(message = "This field must not be null")
    @Column(name = "company_apply_end_date")
    private Date companyApplyEndDate;

    @NotNull(message = "This field must not be null")
    @Column(name = "mentee_apply_start_date")
    private Date menteeApplyStartDate;

    @NotNull(message = "This field must not be null")
    @Column(name = "mentee_apply_end_date")
    private Date menteeApplyEndDate;

    @NotNull(message = "This field must not be null")
    @Column(name = "training_start_date")
    private Date trainingStartDate;

    @NotNull(message = "This field must not be null")
    @Column(name = "training_end_date")
    private Date trainingEndDate;

    @NotNull(message = "This field must not be null")
    @Column(name = "number_of_session")
    private Integer numberOfSession;

    @NotNull(message = "This field must not be null")
    @Column(name = "min_offline_session")
    private Integer minOfflineSession;

    @NotNull(message = "This field must not be null")
    @Column(name = "min_online_session")
    private Integer minOnlineSession;

    @NotNull(message = "This field must not be null")
    @Column(name = "min_session_duration")
    private Integer minSessionDuration;

    @NotNull(message = "This field must not be null")
    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

}
