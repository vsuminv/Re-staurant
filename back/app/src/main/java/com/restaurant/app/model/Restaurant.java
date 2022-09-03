package com.restaurant.app.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="restaurant_index")
    private Long restaurantIndex; //레스토랑 아이디

    @Column(name="restaurant_name")
    private String restaurantName;


    @Column(name="restaurant_category")
    private String restaurantCategory; //레스토랑 카테고리

//    @Column(name="restaurant_profile_restaurant_profile_index")
//    private int restaurant_profile_restaurant_profile_index;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "restaurant")
    private RestaurantProfile restaurantProfile;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant")
    private List<Options> options;

}
